package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageHeightParameters
import typings.arcgisJsApi.esri.ImageHeightParametersProperties
import typings.arcgisJsApi.esri.MosaicRule
import typings.arcgisJsApi.esri.PixelSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImageHeightParametersMod {
  
  @JSImport("esri/rest/support/ImageHeightParameters", JSImport.Namespace)
  @js.native
  /**
  		 * Input parameters used by the [ImageryLayer.measureHeight()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureHeight) or [imageService.measureHeight()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureHeight) methods to perform imagery height mensuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with ImageHeightParameters {
    def this(properties: ImageHeightParametersProperties) = this()
    
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
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImageHeightParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageHeightParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageHeightParameters]
}
