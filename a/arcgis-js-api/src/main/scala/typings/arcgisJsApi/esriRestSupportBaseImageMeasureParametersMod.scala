package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BaseImageMeasureParameters
import typings.arcgisJsApi.esri.MosaicRule
import typings.arcgisJsApi.esri.PixelSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportBaseImageMeasureParametersMod {
  
  @JSImport("esri/rest/support/BaseImageMeasureParameters", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BaseImageMeasureParameters {
    
    /**
    		 * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) on how individual images should be mosaicked when the measure is computed.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#mosaicRule)
    		 */
    /* CompleteClass */
    var mosaicRule: MosaicRule = js.native
    
    /**
    		 * Specifies the pixel size.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#pixelSize)
    		 */
    /* CompleteClass */
    var pixelSize: PixelSize = js.native
  }
}
