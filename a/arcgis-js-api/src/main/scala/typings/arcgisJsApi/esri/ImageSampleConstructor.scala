package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSampleConstructor
  extends StObject
     with /**
  * The [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) returns [ImageSampleResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html) containing array of this class.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html)
  */
Instantiable0[ImageSample]
     with Instantiable1[/* properties */ ImageSampleProperties, ImageSample] {
  
  def fromJSON(json: Any): ImageSample = js.native
}
