package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFormationStackDetails extends StObject {
  
  /**
    * The capabilities allowed in the stack. 
    */
  var Capabilities: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The time at which the stack was created. 
    */
  var CreationTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A user-defined description associated with the stack. 
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Boolean to enable or disable rollback on stack creation failures. 
    */
  var DisableRollback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about whether a stack's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. 
    */
  var DriftInformation: js.UndefOr[AwsCloudFormationStackDriftInformationDetails] = js.undefined
  
  /**
    * Whether termination protection is enabled for the stack. 
    */
  var EnableTerminationProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time the nested stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published. 
    */
  var NotificationArns: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * A list of output structures. 
    */
  var Outputs: js.UndefOr[AwsCloudFormationStackOutputsList] = js.undefined
  
  /**
    * The ARN of an IAM role that's associated with the stack. 
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Unique identifier of the stack. 
    */
  var StackId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name associated with the stack. 
    */
  var StackName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Current status of the stack. 
    */
  var StackStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Success or failure message associated with the stack status. 
    */
  var StackStatusReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the CREATE_COMPLETE state. 
    */
  var TimeoutInMinutes: js.UndefOr[Integer] = js.undefined
}
object AwsCloudFormationStackDetails {
  
  inline def apply(): AwsCloudFormationStackDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFormationStackDetails]
  }
  
  extension [Self <: AwsCloudFormationStackDetails](x: Self) {
    
    inline def setCapabilities(value: NonEmptyStringList): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setCreationTime(value: NonEmptyString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisableRollback(value: Boolean): Self = StObject.set(x, "DisableRollback", value.asInstanceOf[js.Any])
    
    inline def setDisableRollbackUndefined: Self = StObject.set(x, "DisableRollback", js.undefined)
    
    inline def setDriftInformation(value: AwsCloudFormationStackDriftInformationDetails): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    inline def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    inline def setEnableTerminationProtection(value: Boolean): Self = StObject.set(x, "EnableTerminationProtection", value.asInstanceOf[js.Any])
    
    inline def setEnableTerminationProtectionUndefined: Self = StObject.set(x, "EnableTerminationProtection", js.undefined)
    
    inline def setLastUpdatedTime(value: NonEmptyString): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setNotificationArns(value: NonEmptyStringList): Self = StObject.set(x, "NotificationArns", value.asInstanceOf[js.Any])
    
    inline def setNotificationArnsUndefined: Self = StObject.set(x, "NotificationArns", js.undefined)
    
    inline def setNotificationArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "NotificationArns", js.Array(value*))
    
    inline def setOutputs(value: AwsCloudFormationStackOutputsList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: AwsCloudFormationStackOutputsDetails*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStackId(value: NonEmptyString): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackName(value: NonEmptyString): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    inline def setStackStatus(value: NonEmptyString): Self = StObject.set(x, "StackStatus", value.asInstanceOf[js.Any])
    
    inline def setStackStatusReason(value: NonEmptyString): Self = StObject.set(x, "StackStatusReason", value.asInstanceOf[js.Any])
    
    inline def setStackStatusReasonUndefined: Self = StObject.set(x, "StackStatusReason", js.undefined)
    
    inline def setStackStatusUndefined: Self = StObject.set(x, "StackStatus", js.undefined)
    
    inline def setTimeoutInMinutes(value: Integer): Self = StObject.set(x, "TimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "TimeoutInMinutes", js.undefined)
  }
}
