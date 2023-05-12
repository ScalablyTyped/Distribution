package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomLogSourceResponse extends StObject {
  
  /**
    * The location of the partition in the Amazon S3 bucket for Security Lake.
    */
  var customDataLocation: String
}
object DeleteCustomLogSourceResponse {
  
  inline def apply(customDataLocation: String): DeleteCustomLogSourceResponse = {
    val __obj = js.Dynamic.literal(customDataLocation = customDataLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomLogSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomLogSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomDataLocation(value: String): Self = StObject.set(x, "customDataLocation", value.asInstanceOf[js.Any])
  }
}
