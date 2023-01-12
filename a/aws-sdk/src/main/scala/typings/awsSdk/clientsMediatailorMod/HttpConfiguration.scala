package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpConfiguration extends StObject {
  
  /**
    * The base URL for the source location host server. This string must include the protocol, such as https://.
    */
  var BaseUrl: _String
}
object HttpConfiguration {
  
  inline def apply(BaseUrl: _String): HttpConfiguration = {
    val __obj = js.Dynamic.literal(BaseUrl = BaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: _String): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
  }
}
