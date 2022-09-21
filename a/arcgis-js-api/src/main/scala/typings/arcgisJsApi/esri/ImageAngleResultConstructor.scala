package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAngleResultConstructor
  extends StObject
     with /**
  * The results from [imageService.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles) or [ImageryLayer.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeAngles) method.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html)
  */
Instantiable0[ImageAngleResult]
     with Instantiable1[/* properties */ ImageAngleResultProperties, ImageAngleResult] {
  
  def fromJSON(json: Any): ImageAngleResult = js.native
}
