package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MagnifierProperties extends StObject {
  
  /**
  		 * Controls the amount of magnification to display.
  		 *
  		 * @default 1.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#factor)
  		 */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the mask image is enabled.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#maskEnabled)
  		 */
  var maskEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The mask url points to an image that determines the visible area of the magnified image [(alpha channel)](https://developer.mozilla.org/en-US/docs/Glossary/Alpha).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#maskUrl)
  		 */
  var maskUrl: js.UndefOr[String] = js.undefined
  
  /**
  		 * The offset of the magnifier in pixels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#offset)
  		 */
  var offset: js.UndefOr[MagnifierScreenPoint] = js.undefined
  
  /**
  		 * Indicates whether the overlay image is enabled.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#overlayEnabled)
  		 */
  var overlayEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The overlay url points to an image that is displayed on top of the magnified image.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#overlayUrl)
  		 */
  var overlayUrl: js.UndefOr[String] = js.undefined
  
  /**
  		 * The position of the magnifier in pixels.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#position)
  		 */
  var position: js.UndefOr[MagnifierScreenPoint] = js.undefined
  
  /**
  		 * The size of the magnifier in pixels.
  		 *
  		 * @default 120
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#size)
  		 */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the magnifier is visible.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MagnifierProperties {
  
  inline def apply(): MagnifierProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagnifierProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MagnifierProperties] (val x: Self) extends AnyVal {
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setMaskEnabled(value: Boolean): Self = StObject.set(x, "maskEnabled", value.asInstanceOf[js.Any])
    
    inline def setMaskEnabledUndefined: Self = StObject.set(x, "maskEnabled", js.undefined)
    
    inline def setMaskUrl(value: String): Self = StObject.set(x, "maskUrl", value.asInstanceOf[js.Any])
    
    inline def setMaskUrlUndefined: Self = StObject.set(x, "maskUrl", js.undefined)
    
    inline def setOffset(value: MagnifierScreenPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOverlayEnabled(value: Boolean): Self = StObject.set(x, "overlayEnabled", value.asInstanceOf[js.Any])
    
    inline def setOverlayEnabledUndefined: Self = StObject.set(x, "overlayEnabled", js.undefined)
    
    inline def setOverlayUrl(value: String): Self = StObject.set(x, "overlayUrl", value.asInstanceOf[js.Any])
    
    inline def setOverlayUrlUndefined: Self = StObject.set(x, "overlayUrl", js.undefined)
    
    inline def setPosition(value: MagnifierScreenPoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
