package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveProfilePermissionRequest extends StObject {
  
  /**
    * A human-readable name for the signing profile with permissions to be removed.
    */
  var profileName: ProfileName
  
  /**
    * An identifier for the current revision of the signing profile permissions.
    */
  var revisionId: String
  
  /**
    * A unique identifier for the cross-account permissions statement.
    */
  var statementId: String
}
object RemoveProfilePermissionRequest {
  
  inline def apply(profileName: ProfileName, revisionId: String, statementId: String): RemoveProfilePermissionRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveProfilePermissionRequest]
  }
  
  extension [Self <: RemoveProfilePermissionRequest](x: Self) {
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setStatementId(value: String): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
  }
}
