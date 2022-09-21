package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSampleParametersConstructor
  extends StObject
     with /**
  * Input parameters for the [getSamples()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html)
  */
Instantiable0[ImageSampleParameters]
     with Instantiable1[/* properties */ ImageSampleParametersProperties, ImageSampleParameters] {
  
  def fromJSON(json: Any): ImageSampleParameters = js.native
}
