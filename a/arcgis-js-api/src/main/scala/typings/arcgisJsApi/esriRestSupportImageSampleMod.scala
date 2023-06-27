package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageSample
import typings.arcgisJsApi.esri.ImageSampleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImageSampleMod {
  
  @JSImport("esri/rest/support/ImageSample", JSImport.Namespace)
  @js.native
  /**
  		 * The [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) returns [ImageSampleResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html) containing array of this class.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html)
  		 */
  open class ^ ()
    extends StObject
       with ImageSample {
    def this(properties: ImageSampleProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImageSample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageSample = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageSample]
}
