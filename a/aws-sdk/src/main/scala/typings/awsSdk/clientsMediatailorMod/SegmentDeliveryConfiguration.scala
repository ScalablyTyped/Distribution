package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDeliveryConfiguration extends StObject {
  
  /**
    * The base URL of the host or path of the segment delivery server that you're using to serve segments. This is typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL include the protocol, such as https://example.com/some/path. To use a relative URL specify the relative path, such as /some/path*.
    */
  var BaseUrl: js.UndefOr[_String] = js.undefined
  
  /**
    * A unique identifier used to distinguish between multiple segment delivery configurations in a source location.
    */
  var Name: js.UndefOr[_String] = js.undefined
}
object SegmentDeliveryConfiguration {
  
  inline def apply(): SegmentDeliveryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDeliveryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentDeliveryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: _String): Self = StObject.set(x, "BaseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "BaseUrl", js.undefined)
    
    inline def setName(value: _String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
