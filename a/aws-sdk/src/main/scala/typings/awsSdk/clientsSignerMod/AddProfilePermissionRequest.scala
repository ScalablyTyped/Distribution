package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProfilePermissionRequest extends StObject {
  
  /**
    * The AWS Signer action permitted as part of cross-account permissions.
    */
  var action: String
  
  /**
    * The AWS principal receiving cross-account permissions. This may be an IAM role or another AWS account ID.
    */
  var principal: String
  
  /**
    * The human-readable name of the signing profile.
    */
  var profileName: ProfileName
  
  /**
    * The version of the signing profile.
    */
  var profileVersion: js.UndefOr[ProfileVersion] = js.undefined
  
  /**
    * A unique identifier for the current profile revision.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the cross-account permission statement.
    */
  var statementId: String
}
object AddProfilePermissionRequest {
  
  inline def apply(action: String, principal: String, profileName: ProfileName, statementId: String): AddProfilePermissionRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProfilePermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddProfilePermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileVersion(value: ProfileVersion): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionUndefined: Self = StObject.set(x, "profileVersion", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setStatementId(value: String): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
  }
}
