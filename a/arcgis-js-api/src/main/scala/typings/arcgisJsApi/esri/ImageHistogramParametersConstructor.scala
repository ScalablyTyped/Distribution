package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageHistogramParametersConstructor
  extends StObject
     with /**
  * Input parameters for the [computeHistograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeHistograms) or [computeStatisticsHistograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeStatisticsHistograms) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html)
  */
Instantiable0[ImageHistogramParameters]
     with Instantiable1[/* properties */ ImageHistogramParametersProperties, ImageHistogramParameters] {
  
  def fromJSON(json: Any): ImageHistogramParameters = js.native
}
