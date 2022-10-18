package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpConfiguration extends StObject {
  
  /**
    * The base URL for the source location host server. This string must include the protocol, such as https://.
    */
  var BaseUrl: string
}
object HttpConfiguration {
  
  inline def apply(BaseUrl: string): HttpConfiguration = {
    val __obj = js.Dynamic.literal(BaseUrl = BaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpConfiguration]
  }
  
  extension [Self <: HttpConfiguration](x: Self) {
    
    inline def setBaseUrl(value: string): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
  }
}
