package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideGround
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * Ground opacity
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
}
object SlideGround {
  
  inline def apply(): SlideGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideGround]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideGround] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
