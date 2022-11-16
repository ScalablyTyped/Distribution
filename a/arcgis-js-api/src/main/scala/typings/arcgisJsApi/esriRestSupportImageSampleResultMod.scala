package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageSampleResult
import typings.arcgisJsApi.esri.ImageSampleResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImageSampleResultMod {
  
  @JSImport("esri/rest/support/ImageSampleResult", JSImport.Namespace)
  @js.native
  /**
    * The result from the [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) containing array of [ImageSample](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html)
    */
  open class ^ ()
    extends StObject
       with ImageSampleResult {
    def this(properties: ImageSampleResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImageSampleResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageSampleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageSampleResult]
}
