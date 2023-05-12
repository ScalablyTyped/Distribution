package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomLogSourceRequest extends StObject {
  
  /**
    * The custom source name for the custom log source.
    */
  var customSourceName: String
}
object DeleteCustomLogSourceRequest {
  
  inline def apply(customSourceName: String): DeleteCustomLogSourceRequest = {
    val __obj = js.Dynamic.literal(customSourceName = customSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomLogSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomLogSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomSourceName(value: String): Self = StObject.set(x, "customSourceName", value.asInstanceOf[js.Any])
  }
}
