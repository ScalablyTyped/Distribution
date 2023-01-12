package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveProfilePermissionResponse extends StObject {
  
  /**
    * An identifier for the current revision of the profile permissions.
    */
  var revisionId: js.UndefOr[String] = js.undefined
}
object RemoveProfilePermissionResponse {
  
  inline def apply(): RemoveProfilePermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveProfilePermissionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveProfilePermissionResponse] (val x: Self) extends AnyVal {
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
