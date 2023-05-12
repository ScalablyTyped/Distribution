package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSimulationOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[SimSpaceWeaverArn] = js.undefined
  
  /**
    * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the Unix epoch (0:0:0.000, January 1, 1970).
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the simulation.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.Description] = js.undefined
  
  /**
    * A universally unique identifier (UUID) for this simulation.
    */
  var ExecutionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * A collection of additional state information, such as domain and clock configuration.
    */
  var LiveSimulationState: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.LiveSimulationState] = js.undefined
  
  /**
    * Settings that control how SimSpace Weaver handles your simulation log data.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.LoggingConfiguration] = js.undefined
  
  /**
    * The maximum running time of the simulation, specified as a number of minutes (m or M), hours (h or H), or days (d or D). The simulation stops when it reaches this limit. The maximum value is 14D, or its equivalent in the other units. The default value is 14D. A value equivalent to 0 makes the simulation immediately transition to Stopping as soon as it reaches Started.
    */
  var MaximumDuration: js.UndefOr[TimeToLiveString] = js.undefined
  
  /**
    * The name of the simulation.
    */
  var Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to perform actions. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference. For more information about IAM roles, see IAM roles in the Identity and Access Management User Guide.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.RoleArn] = js.undefined
  
  /**
    * An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
    */
  var SchemaError: js.UndefOr[OptionalString] = js.undefined
  
  /**
    * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about Amazon S3, see the  Amazon Simple Storage Service User Guide .
    */
  var SchemaS3Location: js.UndefOr[S3Location] = js.undefined
  
  var SnapshotS3Location: js.UndefOr[S3Location] = js.undefined
  
  /**
    * An error message that SimSpace Weaver returns only if a problem occurs when the simulation is in the STARTING state.
    */
  var StartError: js.UndefOr[OptionalString] = js.undefined
  
  /**
    * The current lifecycle state of the simulation.
    */
  var Status: js.UndefOr[SimulationStatus] = js.undefined
  
  /**
    * The desired lifecycle state of the simulation.
    */
  var TargetStatus: js.UndefOr[SimulationTargetStatus] = js.undefined
}
object DescribeSimulationOutput {
  
  inline def apply(): DescribeSimulationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSimulationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSimulationOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SimSpaceWeaverArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExecutionId(value: UUID): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    inline def setLiveSimulationState(value: LiveSimulationState): Self = StObject.set(x, "LiveSimulationState", value.asInstanceOf[js.Any])
    
    inline def setLiveSimulationStateUndefined: Self = StObject.set(x, "LiveSimulationState", js.undefined)
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
    
    inline def setMaximumDuration(value: TimeToLiveString): Self = StObject.set(x, "MaximumDuration", value.asInstanceOf[js.Any])
    
    inline def setMaximumDurationUndefined: Self = StObject.set(x, "MaximumDuration", js.undefined)
    
    inline def setName(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchemaError(value: OptionalString): Self = StObject.set(x, "SchemaError", value.asInstanceOf[js.Any])
    
    inline def setSchemaErrorUndefined: Self = StObject.set(x, "SchemaError", js.undefined)
    
    inline def setSchemaS3Location(value: S3Location): Self = StObject.set(x, "SchemaS3Location", value.asInstanceOf[js.Any])
    
    inline def setSchemaS3LocationUndefined: Self = StObject.set(x, "SchemaS3Location", js.undefined)
    
    inline def setSnapshotS3Location(value: S3Location): Self = StObject.set(x, "SnapshotS3Location", value.asInstanceOf[js.Any])
    
    inline def setSnapshotS3LocationUndefined: Self = StObject.set(x, "SnapshotS3Location", js.undefined)
    
    inline def setStartError(value: OptionalString): Self = StObject.set(x, "StartError", value.asInstanceOf[js.Any])
    
    inline def setStartErrorUndefined: Self = StObject.set(x, "StartError", js.undefined)
    
    inline def setStatus(value: SimulationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetStatus(value: SimulationTargetStatus): Self = StObject.set(x, "TargetStatus", value.asInstanceOf[js.Any])
    
    inline def setTargetStatusUndefined: Self = StObject.set(x, "TargetStatus", js.undefined)
  }
}
