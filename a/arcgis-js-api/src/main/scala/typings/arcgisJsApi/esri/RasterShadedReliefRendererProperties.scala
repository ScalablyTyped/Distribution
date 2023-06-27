package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typings.arcgisJsApi.arcgisJsApiStrings.adjusted
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.traditional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterShadedReliefRendererProperties extends StObject {
  
  /**
  		 * The sun's angle of elevation above the horizon, ranging from 0 to 90 degrees.
  		 *
  		 * @default 45
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude)
  		 */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The sun's relative position along the horizon, ranging from 0 to 360 degrees.
  		 *
  		 * @default 315
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth)
  		 */
  var azimuth: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The color ramp to display the shaded relief.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#colorRamp)
  		 */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.undefined
  
  /**
  		 * The type of hillshading being applied on the elevation surface.
  		 *
  		 * @default "traditional"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#hillshadeType)
  		 */
  var hillshadeType: js.UndefOr[traditional | `multi-directional`] = js.undefined
  
  /**
  		 * Pixel size factor accounts for changes in scale as the viewer zooms in and out on the map display.
  		 *
  		 * @default 0.024
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor)
  		 */
  var pixelSizeFactor: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Pixel Size Power accounts for the altitude changes (or scale) as the viewer zooms in and out on the map display.
  		 *
  		 * @default 0.664
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower)
  		 */
  var pixelSizePower: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Applies a constant or adjusted z-factor based on resolution changes.
  		 *
  		 * @default none
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType)
  		 */
  var scalingType: js.UndefOr[none_ | adjusted] = js.undefined
  
  /**
  		 * A ratio of z unit / xy unit, with optional exaggeration factored in.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#zFactor)
  		 */
  var zFactor: js.UndefOr[Double] = js.undefined
}
object RasterShadedReliefRendererProperties {
  
  inline def apply(): RasterShadedReliefRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterShadedReliefRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterShadedReliefRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    inline def setColorRamp(value: ColorRampProperties): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setHillshadeType(value: traditional | `multi-directional`): Self = StObject.set(x, "hillshadeType", value.asInstanceOf[js.Any])
    
    inline def setHillshadeTypeUndefined: Self = StObject.set(x, "hillshadeType", js.undefined)
    
    inline def setPixelSizeFactor(value: Double): Self = StObject.set(x, "pixelSizeFactor", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeFactorUndefined: Self = StObject.set(x, "pixelSizeFactor", js.undefined)
    
    inline def setPixelSizePower(value: Double): Self = StObject.set(x, "pixelSizePower", value.asInstanceOf[js.Any])
    
    inline def setPixelSizePowerUndefined: Self = StObject.set(x, "pixelSizePower", js.undefined)
    
    inline def setScalingType(value: none_ | adjusted): Self = StObject.set(x, "scalingType", value.asInstanceOf[js.Any])
    
    inline def setScalingTypeUndefined: Self = StObject.set(x, "scalingType", js.undefined)
    
    inline def setZFactor(value: Double): Self = StObject.set(x, "zFactor", value.asInstanceOf[js.Any])
    
    inline def setZFactorUndefined: Self = StObject.set(x, "zFactor", js.undefined)
  }
}
