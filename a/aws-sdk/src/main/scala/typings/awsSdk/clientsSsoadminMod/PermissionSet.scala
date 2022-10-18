package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionSet extends StObject {
  
  /**
    * The date that the permission set was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the PermissionSet.
    */
  var Description: js.UndefOr[PermissionSetDescription] = js.undefined
  
  /**
    * The name of the permission set.
    */
  var Name: js.UndefOr[PermissionSetName] = js.undefined
  
  /**
    * The ARN of the permission set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PermissionSetArn: js.UndefOr[typings.awsSdk.clientsSsoadminMod.PermissionSetArn] = js.undefined
  
  /**
    * Used to redirect users within the application during the federation authentication process.
    */
  var RelayState: js.UndefOr[typings.awsSdk.clientsSsoadminMod.RelayState] = js.undefined
  
  /**
    * The length of time that the application user sessions are valid for in the ISO-8601 standard.
    */
  var SessionDuration: js.UndefOr[Duration] = js.undefined
}
object PermissionSet {
  
  inline def apply(): PermissionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionSet]
  }
  
  extension [Self <: PermissionSet](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDescription(value: PermissionSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: PermissionSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArnUndefined: Self = StObject.set(x, "PermissionSetArn", js.undefined)
    
    inline def setRelayState(value: RelayState): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
    
    inline def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
    
    inline def setSessionDuration(value: Duration): Self = StObject.set(x, "SessionDuration", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationUndefined: Self = StObject.set(x, "SessionDuration", js.undefined)
  }
}
