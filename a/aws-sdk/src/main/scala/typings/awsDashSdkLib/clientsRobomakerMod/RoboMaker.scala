package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoboMaker
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RoboMaker: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ClientConfiguration = js.native
  /**
    * Describes one or more simulation jobs.
    */
  def batchDescribeSimulationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDescribeSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more simulation jobs.
    */
  def batchDescribeSimulationJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDescribeSimulationJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.BatchDescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified simulation job.
    */
  def cancelSimulationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the specified simulation job.
    */
  def cancelSimulationJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSimulationJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CancelSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version. 
    */
  def createDeploymentJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDeploymentJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version. 
    */
  def createDeploymentJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDeploymentJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a fleet, a logical group of robots running the same robot application.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a fleet, a logical group of robots running the same robot application.
    */
  def createFleet(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a robot.
    */
  def createRobot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a robot.
    */
  def createRobot(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRobot(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a robot application. 
    */
  def createRobotApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a robot application. 
    */
  def createRobotApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRobotApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a version of a robot application.
    */
  def createRobotApplicationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRobotApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a version of a robot application.
    */
  def createRobotApplicationVersion(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRobotApplicationVersion(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateRobotApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a simulation application.
    */
  def createSimulationApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a simulation application.
    */
  def createSimulationApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSimulationApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a simulation application with a specific revision id.
    */
  def createSimulationApplicationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSimulationApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a simulation application with a specific revision id.
    */
  def createSimulationApplicationVersion(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSimulationApplicationVersion(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a simulation job.
    */
  def createSimulationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a simulation job.
    */
  def createSimulationJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSimulationJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.CreateSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a fleet.
    */
  def deleteFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a fleet.
    */
  def deleteFleet(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleet(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a robot.
    */
  def deleteRobot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a robot.
    */
  def deleteRobot(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRobot(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a robot application.
    */
  def deleteRobotApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a robot application.
    */
  def deleteRobotApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRobotApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a simulation application.
    */
  def deleteSimulationApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a simulation application.
    */
  def deleteSimulationApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSimulationApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeleteSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters a robot.
    */
  def deregisterRobot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters a robot.
    */
  def deregisterRobot(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterRobot(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DeregisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
    */
  def describeDeploymentJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDeploymentJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
    */
  def describeDeploymentJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDeploymentJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a fleet.
    */
  def describeFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a fleet.
    */
  def describeFleet(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleet(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a robot.
    */
  def describeRobot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a robot.
    */
  def describeRobot(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRobot(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a robot application.
    */
  def describeRobotApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a robot application.
    */
  def describeRobotApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRobotApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a simulation application.
    */
  def describeSimulationApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a simulation application.
    */
  def describeSimulationApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSimulationApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a simulation job.
    */
  def describeSimulationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a simulation job.
    */
  def describeSimulationJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSimulationJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.DescribeSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs.
    */
  def listDeploymentJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDeploymentJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs.
    */
  def listDeploymentJobs(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDeploymentJobs(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListDeploymentJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
    */
  def listFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
    */
  def listFleets(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFleets(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
    */
  def listRobotApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRobotApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
    */
  def listRobotApplications(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRobotApplications(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
    */
  def listRobots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRobots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
    */
  def listRobots(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listRobots(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListRobotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications.
    */
  def listSimulationApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSimulationApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications.
    */
  def listSimulationApplications(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSimulationApplications(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
    */
  def listSimulationJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSimulationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
    */
  def listSimulationJobs(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSimulationJobs(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListSimulationJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on a AWS RoboMaker resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags on a AWS RoboMaker resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers a robot with a fleet.
    */
  def registerRobot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers a robot with a fleet.
    */
  def registerRobot(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerRobot(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RegisterRobotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restarts a running simulation job.
    */
  def restartSimulationJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restartSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Restarts a running simulation job.
    */
  def restartSimulationJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restartSimulationJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.RestartSimulationJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
    */
  def syncDeploymentJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def syncDeploymentJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
    */
  def syncDeploymentJob(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def syncDeploymentJob(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.SyncDeploymentJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
    */
  def tagResource(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
    */
  def untagResource(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a robot application.
    */
  def updateRobotApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a robot application.
    */
  def updateRobotApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRobotApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateRobotApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a simulation application.
    */
  def updateSimulationApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a simulation application.
    */
  def updateSimulationApplication(params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSimulationApplication(
    params: awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRobomakerMod.RoboMakerNs.UpdateSimulationApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

