package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSegmentDeliveryConfiguration extends StObject {
  
  /**
    * The hostname of the server that will be used to serve segments. This string must include the protocol, such as https://.
    */
  var BaseUrl: js.UndefOr[_String] = js.undefined
}
object DefaultSegmentDeliveryConfiguration {
  
  inline def apply(): DefaultSegmentDeliveryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSegmentDeliveryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSegmentDeliveryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: _String): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
  }
}
