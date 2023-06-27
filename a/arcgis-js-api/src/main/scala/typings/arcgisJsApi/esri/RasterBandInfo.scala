package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The maximum wavelength of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#maxWavelength)
  		 */
  var maxWavelength: Double = js.native
  
  /**
  		 * The minimum wavelength of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#minWavelength)
  		 */
  var minWavelength: Double = js.native
  
  /**
  		 * The name of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * The radiance bias of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#radianceBias)
  		 */
  var radianceBias: Double = js.native
  
  /**
  		 * The radiance gain of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#radianceGain)
  		 */
  var radianceGain: Double = js.native
  
  /**
  		 * The reflectance bias of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#reflectanceBias)
  		 */
  var reflectanceBias: Double = js.native
  
  /**
  		 * The reflectance gain of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#reflectanceGain)
  		 */
  var reflectanceGain: Double = js.native
  
  /**
  		 * The solar irradiance of the band.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html#solarIrradiance)
  		 */
  var solarIrradiance: Double = js.native
}
