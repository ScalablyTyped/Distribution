package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePermissionSetRequest extends StObject {
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.undefined
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.clientsSsoadminMod.InstanceArn
  
  /**
    * The name of the PermissionSet.
    */
  var Name: PermissionSetName
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typings.awsSdk.clientsSsoadminMod.RelayState] = js.undefined
  
  /**
    * The length of time that the application user sessions are valid in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The tags to attach to the new PermissionSet.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreatePermissionSetRequest {
  
  inline def apply(InstanceArn: InstanceArn, Name: PermissionSetName): CreatePermissionSetRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionSetRequest]
  }
  
  extension [Self <: CreatePermissionSetRequest](x: Self) {
    
    inline def setDescription(value: PermissionSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: PermissionSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRelayState(value: RelayState): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
    
    inline def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
    
    inline def setSessionDuration(value: Duration): Self = StObject.set(x, "SessionDuration", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationUndefined: Self = StObject.set(x, "SessionDuration", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
