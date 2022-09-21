package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSampleResultConstructor
  extends StObject
     with /**
  * The result from the [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) containing array of [ImageSample](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html)
  */
Instantiable0[ImageSampleResult]
     with Instantiable1[/* properties */ ImageSampleResultProperties, ImageSampleResult] {
  
  def fromJSON(json: Any): ImageSampleResult = js.native
}
