package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessKeyResponse extends StObject {
  
  /**
    * A structure with details about the access key.
    */
  var AccessKey: typings.awsSdk.clientsIamMod.AccessKey
}
object CreateAccessKeyResponse {
  
  inline def apply(AccessKey: AccessKey): CreateAccessKeyResponse = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessKey(value: AccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
  }
}
