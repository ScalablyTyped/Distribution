package typings.awsSdk.clientsSimspaceweaverMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimSpaceWeaver extends Service {
  
  @JSName("config")
  var config_SimSpaceWeaver: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a snapshot of the specified simulation. A snapshot is a file that contains simulation state data at a specific time. The state data saved in a snapshot includes entity data from the State Fabric, the simulation configuration specified in the schema, and the clock tick number. You can use the snapshot to initialize a new simulation. For more information about snapshots, see Snapshots in the SimSpace Weaver User Guide.  You specify a Destination when you create a snapshot. The Destination is the name of an Amazon S3 bucket and an optional ObjectKeyPrefix. The ObjectKeyPrefix is usually the name of a folder in the bucket. SimSpace Weaver creates a snapshot folder inside the Destination and places the snapshot file there. The snapshot file is an Amazon S3 object. It has an object key with the form:  object-key-prefix/snapshot/simulation-name-YYMMdd-HHmm-ss.zip, where:      YY  is the 2-digit year     MM  is the 2-digit month     dd  is the 2-digit day of the month     HH  is the 2-digit hour (24-hour clock)     mm  is the 2-digit minutes     ss  is the 2-digit seconds  
    */
  def createSnapshot(): Request[CreateSnapshotOutput, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotOutput, Unit]): Request[CreateSnapshotOutput, AWSError] = js.native
  /**
    * Creates a snapshot of the specified simulation. A snapshot is a file that contains simulation state data at a specific time. The state data saved in a snapshot includes entity data from the State Fabric, the simulation configuration specified in the schema, and the clock tick number. You can use the snapshot to initialize a new simulation. For more information about snapshots, see Snapshots in the SimSpace Weaver User Guide.  You specify a Destination when you create a snapshot. The Destination is the name of an Amazon S3 bucket and an optional ObjectKeyPrefix. The ObjectKeyPrefix is usually the name of a folder in the bucket. SimSpace Weaver creates a snapshot folder inside the Destination and places the snapshot file there. The snapshot file is an Amazon S3 object. It has an object key with the form:  object-key-prefix/snapshot/simulation-name-YYMMdd-HHmm-ss.zip, where:      YY  is the 2-digit year     MM  is the 2-digit month     dd  is the 2-digit day of the month     HH  is the 2-digit hour (24-hour clock)     mm  is the 2-digit minutes     ss  is the 2-digit seconds  
    */
  def createSnapshot(params: CreateSnapshotInput): Request[CreateSnapshotOutput, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotOutput, Unit]
  ): Request[CreateSnapshotOutput, AWSError] = js.native
  
  /**
    * Deletes the instance of the given custom app.
    */
  def deleteApp(): Request[DeleteAppOutput, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppOutput, Unit]): Request[DeleteAppOutput, AWSError] = js.native
  /**
    * Deletes the instance of the given custom app.
    */
  def deleteApp(params: DeleteAppInput): Request[DeleteAppOutput, AWSError] = js.native
  def deleteApp(
    params: DeleteAppInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppOutput, Unit]
  ): Request[DeleteAppOutput, AWSError] = js.native
  
  /**
    * Deletes all SimSpace Weaver resources assigned to the given simulation.  Your simulation uses resources in other Amazon Web Services. This API operation doesn't delete resources in other Amazon Web Services. 
    */
  def deleteSimulation(): Request[DeleteSimulationOutput, AWSError] = js.native
  def deleteSimulation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSimulationOutput, Unit]): Request[DeleteSimulationOutput, AWSError] = js.native
  /**
    * Deletes all SimSpace Weaver resources assigned to the given simulation.  Your simulation uses resources in other Amazon Web Services. This API operation doesn't delete resources in other Amazon Web Services. 
    */
  def deleteSimulation(params: DeleteSimulationInput): Request[DeleteSimulationOutput, AWSError] = js.native
  def deleteSimulation(
    params: DeleteSimulationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSimulationOutput, Unit]
  ): Request[DeleteSimulationOutput, AWSError] = js.native
  
  /**
    * Returns the state of the given custom app.
    */
  def describeApp(): Request[DescribeAppOutput, AWSError] = js.native
  def describeApp(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppOutput, Unit]): Request[DescribeAppOutput, AWSError] = js.native
  /**
    * Returns the state of the given custom app.
    */
  def describeApp(params: DescribeAppInput): Request[DescribeAppOutput, AWSError] = js.native
  def describeApp(
    params: DescribeAppInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppOutput, Unit]
  ): Request[DescribeAppOutput, AWSError] = js.native
  
  /**
    * Returns the current state of the given simulation.
    */
  def describeSimulation(): Request[DescribeSimulationOutput, AWSError] = js.native
  def describeSimulation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationOutput, Unit]): Request[DescribeSimulationOutput, AWSError] = js.native
  /**
    * Returns the current state of the given simulation.
    */
  def describeSimulation(params: DescribeSimulationInput): Request[DescribeSimulationOutput, AWSError] = js.native
  def describeSimulation(
    params: DescribeSimulationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSimulationOutput, Unit]
  ): Request[DescribeSimulationOutput, AWSError] = js.native
  
  /**
    * Lists all custom apps or service apps for the given simulation and domain.
    */
  def listApps(): Request[ListAppsOutput, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsOutput, Unit]): Request[ListAppsOutput, AWSError] = js.native
  /**
    * Lists all custom apps or service apps for the given simulation and domain.
    */
  def listApps(params: ListAppsInput): Request[ListAppsOutput, AWSError] = js.native
  def listApps(params: ListAppsInput, callback: js.Function2[/* err */ AWSError, /* data */ ListAppsOutput, Unit]): Request[ListAppsOutput, AWSError] = js.native
  
  /**
    * Lists the SimSpace Weaver simulations in the Amazon Web Services account used to make the API call.
    */
  def listSimulations(): Request[ListSimulationsOutput, AWSError] = js.native
  def listSimulations(callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationsOutput, Unit]): Request[ListSimulationsOutput, AWSError] = js.native
  /**
    * Lists the SimSpace Weaver simulations in the Amazon Web Services account used to make the API call.
    */
  def listSimulations(params: ListSimulationsInput): Request[ListSimulationsOutput, AWSError] = js.native
  def listSimulations(
    params: ListSimulationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSimulationsOutput, Unit]
  ): Request[ListSimulationsOutput, AWSError] = js.native
  
  /**
    * Lists all tags on a SimSpace Weaver resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists all tags on a SimSpace Weaver resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Starts a custom app with the configuration specified in the simulation schema.
    */
  def startApp(): Request[StartAppOutput, AWSError] = js.native
  def startApp(callback: js.Function2[/* err */ AWSError, /* data */ StartAppOutput, Unit]): Request[StartAppOutput, AWSError] = js.native
  /**
    * Starts a custom app with the configuration specified in the simulation schema.
    */
  def startApp(params: StartAppInput): Request[StartAppOutput, AWSError] = js.native
  def startApp(params: StartAppInput, callback: js.Function2[/* err */ AWSError, /* data */ StartAppOutput, Unit]): Request[StartAppOutput, AWSError] = js.native
  
  /**
    * Starts the simulation clock.
    */
  def startClock(): Request[StartClockOutput, AWSError] = js.native
  def startClock(callback: js.Function2[/* err */ AWSError, /* data */ StartClockOutput, Unit]): Request[StartClockOutput, AWSError] = js.native
  /**
    * Starts the simulation clock.
    */
  def startClock(params: StartClockInput): Request[StartClockOutput, AWSError] = js.native
  def startClock(
    params: StartClockInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartClockOutput, Unit]
  ): Request[StartClockOutput, AWSError] = js.native
  
  /**
    * Starts a simulation with the given name. You must choose to start your simulation from a schema or from a snapshot. For more information about the schema, see the schema reference in the SimSpace Weaver User Guide. For more information about snapshots, see Snapshots in the SimSpace Weaver User Guide.
    */
  def startSimulation(): Request[StartSimulationOutput, AWSError] = js.native
  def startSimulation(callback: js.Function2[/* err */ AWSError, /* data */ StartSimulationOutput, Unit]): Request[StartSimulationOutput, AWSError] = js.native
  /**
    * Starts a simulation with the given name. You must choose to start your simulation from a schema or from a snapshot. For more information about the schema, see the schema reference in the SimSpace Weaver User Guide. For more information about snapshots, see Snapshots in the SimSpace Weaver User Guide.
    */
  def startSimulation(params: StartSimulationInput): Request[StartSimulationOutput, AWSError] = js.native
  def startSimulation(
    params: StartSimulationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSimulationOutput, Unit]
  ): Request[StartSimulationOutput, AWSError] = js.native
  
  /**
    * Stops the given custom app and shuts down all of its allocated compute resources.
    */
  def stopApp(): Request[StopAppOutput, AWSError] = js.native
  def stopApp(callback: js.Function2[/* err */ AWSError, /* data */ StopAppOutput, Unit]): Request[StopAppOutput, AWSError] = js.native
  /**
    * Stops the given custom app and shuts down all of its allocated compute resources.
    */
  def stopApp(params: StopAppInput): Request[StopAppOutput, AWSError] = js.native
  def stopApp(params: StopAppInput, callback: js.Function2[/* err */ AWSError, /* data */ StopAppOutput, Unit]): Request[StopAppOutput, AWSError] = js.native
  
  /**
    * Stops the simulation clock.
    */
  def stopClock(): Request[StopClockOutput, AWSError] = js.native
  def stopClock(callback: js.Function2[/* err */ AWSError, /* data */ StopClockOutput, Unit]): Request[StopClockOutput, AWSError] = js.native
  /**
    * Stops the simulation clock.
    */
  def stopClock(params: StopClockInput): Request[StopClockOutput, AWSError] = js.native
  def stopClock(
    params: StopClockInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopClockOutput, Unit]
  ): Request[StopClockOutput, AWSError] = js.native
  
  /**
    * Stops the given simulation.  You can't restart a simulation after you stop it. If you want to restart a simulation, then you must stop it, delete it, and start a new instance of it. 
    */
  def stopSimulation(): Request[StopSimulationOutput, AWSError] = js.native
  def stopSimulation(callback: js.Function2[/* err */ AWSError, /* data */ StopSimulationOutput, Unit]): Request[StopSimulationOutput, AWSError] = js.native
  /**
    * Stops the given simulation.  You can't restart a simulation after you stop it. If you want to restart a simulation, then you must stop it, delete it, and start a new instance of it. 
    */
  def stopSimulation(params: StopSimulationInput): Request[StopSimulationOutput, AWSError] = js.native
  def stopSimulation(
    params: StopSimulationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopSimulationOutput, Unit]
  ): Request[StopSimulationOutput, AWSError] = js.native
  
  /**
    * Adds tags to a SimSpace Weaver resource. For more information about tags, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds tags to a SimSpace Weaver resource. For more information about tags, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes tags from a SimSpace Weaver resource. For more information about tags, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from a SimSpace Weaver resource. For more information about tags, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
}
