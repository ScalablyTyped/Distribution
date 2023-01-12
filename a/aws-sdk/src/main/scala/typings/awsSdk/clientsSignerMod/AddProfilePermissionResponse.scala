package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProfilePermissionResponse extends StObject {
  
  /**
    * A unique identifier for the current profile revision.
    */
  var revisionId: js.UndefOr[String] = js.undefined
}
object AddProfilePermissionResponse {
  
  inline def apply(): AddProfilePermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProfilePermissionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddProfilePermissionResponse] (val x: Self) extends AnyVal {
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
