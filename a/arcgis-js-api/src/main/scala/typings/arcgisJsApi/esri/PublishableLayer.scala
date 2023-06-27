package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishableLayer extends StObject {
  
  /**
  		 * Checks layer's publishing status while the layer is being published to the portal.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PublishableLayer.html#publishingInfo)
  		 */
  val publishingInfo: PublishingInfo
}
object PublishableLayer {
  
  inline def apply(publishingInfo: PublishingInfo): PublishableLayer = {
    val __obj = js.Dynamic.literal(publishingInfo = publishingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishableLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishableLayer] (val x: Self) extends AnyVal {
    
    inline def setPublishingInfo(value: PublishingInfo): Self = StObject.set(x, "publishingInfo", value.asInstanceOf[js.Any])
  }
}
