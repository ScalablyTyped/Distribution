package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoboMaker
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RoboMaker: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Describes one or more simulation jobs.
    */
  def batchDescribeSimulationJob(): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDescribeSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more simulation jobs.
    */
  def batchDescribeSimulationJob(params: BatchDescribeSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDescribeSimulationJob(
    params: BatchDescribeSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the specified simulation job.
    */
  def cancelSimulationJob(): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the specified simulation job.
    */
  def cancelSimulationJob(params: CancelSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelSimulationJob(
    params: CancelSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version.   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createDeploymentJob(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeploymentJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version.   After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createDeploymentJob(params: CreateDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeploymentJob(
    params: CreateDeploymentJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a fleet, a logical group of robots running the same robot application.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a fleet, a logical group of robots running the same robot application.
    */
  def createFleet(params: CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a robot.
    */
  def createRobot(): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a robot.
    */
  def createRobot(params: CreateRobotRequest): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRobot(
    params: CreateRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a robot application. 
    */
  def createRobotApplication(): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a robot application. 
    */
  def createRobotApplication(params: CreateRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRobotApplication(
    params: CreateRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a robot application.
    */
  def createRobotApplicationVersion(): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRobotApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRobotApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a robot application.
    */
  def createRobotApplicationVersion(params: CreateRobotApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRobotApplicationVersion(
    params: CreateRobotApplicationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRobotApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a simulation application.
    */
  def createSimulationApplication(): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a simulation application.
    */
  def createSimulationApplication(params: CreateSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSimulationApplication(
    params: CreateSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a simulation application with a specific revision id.
    */
  def createSimulationApplicationVersion(): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSimulationApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSimulationApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a simulation application with a specific revision id.
    */
  def createSimulationApplicationVersion(params: CreateSimulationApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSimulationApplicationVersion(
    params: CreateSimulationApplicationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSimulationApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a simulation job.  After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createSimulationJob(): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a simulation job.  After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.  
    */
  def createSimulationJob(params: CreateSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSimulationJob(
    params: CreateSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a fleet.
    */
  def deleteFleet(): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a fleet.
    */
  def deleteFleet(params: DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a robot.
    */
  def deleteRobot(): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a robot.
    */
  def deleteRobot(params: DeleteRobotRequest): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRobot(
    params: DeleteRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a robot application.
    */
  def deleteRobotApplication(): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a robot application.
    */
  def deleteRobotApplication(params: DeleteRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRobotApplication(
    params: DeleteRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a simulation application.
    */
  def deleteSimulationApplication(): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a simulation application.
    */
  def deleteSimulationApplication(params: DeleteSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSimulationApplication(
    params: DeleteSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters a robot.
    */
  def deregisterRobot(): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters a robot.
    */
  def deregisterRobot(params: DeregisterRobotRequest): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterRobot(
    params: DeregisterRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
    */
  def describeDeploymentJob(): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDeploymentJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
    */
  def describeDeploymentJob(params: DescribeDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDeploymentJob(
    params: DescribeDeploymentJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a fleet.
    */
  def describeFleet(): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a fleet.
    */
  def describeFleet(params: DescribeFleetRequest): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFleet(
    params: DescribeFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a robot.
    */
  def describeRobot(): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a robot.
    */
  def describeRobot(params: DescribeRobotRequest): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRobot(
    params: DescribeRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a robot application.
    */
  def describeRobotApplication(): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a robot application.
    */
  def describeRobotApplication(params: DescribeRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRobotApplication(
    params: DescribeRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a simulation application.
    */
  def describeSimulationApplication(): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a simulation application.
    */
  def describeSimulationApplication(params: DescribeSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSimulationApplication(
    params: DescribeSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a simulation job.
    */
  def describeSimulationJob(): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a simulation job.
    */
  def describeSimulationJob(params: DescribeSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSimulationJob(
    params: DescribeSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs.     
    */
  def listDeploymentJobs(): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs.     
    */
  def listDeploymentJobs(params: ListDeploymentJobsRequest): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentJobs(
    params: ListDeploymentJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets. 
    */
  def listFleets(): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets. 
    */
  def listFleets(params: ListFleetsRequest): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFleets(
    params: ListFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
    */
  def listRobotApplications(): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRobotApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRobotApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
    */
  def listRobotApplications(params: ListRobotApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRobotApplications(
    params: ListRobotApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRobotApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
    */
  def listRobots(): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRobots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRobotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
    */
  def listRobots(params: ListRobotsRequest): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRobots(
    params: ListRobotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRobotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications. 
    */
  def listSimulationApplications(): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSimulationApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSimulationApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications. 
    */
  def listSimulationApplications(params: ListSimulationApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSimulationApplications(
    params: ListSimulationApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSimulationApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs. 
    */
  def listSimulationJobs(): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSimulationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSimulationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs. 
    */
  def listSimulationJobs(params: ListSimulationJobsRequest): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSimulationJobs(
    params: ListSimulationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSimulationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on a AWS RoboMaker resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on a AWS RoboMaker resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a robot with a fleet.
    */
  def registerRobot(): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerRobot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a robot with a fleet.
    */
  def registerRobot(params: RegisterRobotRequest): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerRobot(
    params: RegisterRobotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterRobotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restarts a running simulation job.
    */
  def restartSimulationJob(): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restartSimulationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestartSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Restarts a running simulation job.
    */
  def restartSimulationJob(params: RestartSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restartSimulationJob(
    params: RestartSimulationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestartSimulationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
    */
  def syncDeploymentJob(): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def syncDeploymentJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SyncDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
    */
  def syncDeploymentJob(params: SyncDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def syncDeploymentJob(
    params: SyncDeploymentJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SyncDeploymentJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a robot application.
    */
  def updateRobotApplication(): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRobotApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a robot application.
    */
  def updateRobotApplication(params: UpdateRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRobotApplication(
    params: UpdateRobotApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRobotApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a simulation application.
    */
  def updateSimulationApplication(): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSimulationApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a simulation application.
    */
  def updateSimulationApplication(params: UpdateSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSimulationApplication(
    params: UpdateSimulationApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSimulationApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

