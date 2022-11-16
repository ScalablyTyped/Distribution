package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageHistogramParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageHistogramParameters")
@js.native
/**
  * Input parameters for the [computeHistograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeHistograms) or [computeStatisticsHistograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeStatisticsHistograms) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html)
  */
open class ImageHistogramParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageHistogramParameters {
  def this(properties: ImageHistogramParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageHistogramParameters {
  
  @JSGlobal("__esri.ImageHistogramParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageHistogramParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageHistogramParameters]
}
