package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterBandInfoProperties extends StObject {
  
  /**
  		 * The maximum wavelength of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#maxWavelength)
  		 */
  var maxWavelength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum wavelength of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#minWavelength)
  		 */
  var minWavelength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The radiance bias of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#radianceBias)
  		 */
  var radianceBias: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The radiance gain of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#radianceGain)
  		 */
  var radianceGain: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The reflectance bias of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#reflectanceBias)
  		 */
  var reflectanceBias: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The reflectance gain of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#reflectanceGain)
  		 */
  var reflectanceGain: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The solar irradiance of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#solarIrradiance)
  		 */
  var solarIrradiance: js.UndefOr[Double] = js.undefined
}
object RasterBandInfoProperties {
  
  inline def apply(): RasterBandInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterBandInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterBandInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setMaxWavelength(value: Double): Self = StObject.set(x, "maxWavelength", value.asInstanceOf[js.Any])
    
    inline def setMaxWavelengthUndefined: Self = StObject.set(x, "maxWavelength", js.undefined)
    
    inline def setMinWavelength(value: Double): Self = StObject.set(x, "minWavelength", value.asInstanceOf[js.Any])
    
    inline def setMinWavelengthUndefined: Self = StObject.set(x, "minWavelength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRadianceBias(value: Double): Self = StObject.set(x, "radianceBias", value.asInstanceOf[js.Any])
    
    inline def setRadianceBiasUndefined: Self = StObject.set(x, "radianceBias", js.undefined)
    
    inline def setRadianceGain(value: Double): Self = StObject.set(x, "radianceGain", value.asInstanceOf[js.Any])
    
    inline def setRadianceGainUndefined: Self = StObject.set(x, "radianceGain", js.undefined)
    
    inline def setReflectanceBias(value: Double): Self = StObject.set(x, "reflectanceBias", value.asInstanceOf[js.Any])
    
    inline def setReflectanceBiasUndefined: Self = StObject.set(x, "reflectanceBias", js.undefined)
    
    inline def setReflectanceGain(value: Double): Self = StObject.set(x, "reflectanceGain", value.asInstanceOf[js.Any])
    
    inline def setReflectanceGainUndefined: Self = StObject.set(x, "reflectanceGain", js.undefined)
    
    inline def setSolarIrradiance(value: Double): Self = StObject.set(x, "solarIrradiance", value.asInstanceOf[js.Any])
    
    inline def setSolarIrradianceUndefined: Self = StObject.set(x, "solarIrradiance", js.undefined)
  }
}
