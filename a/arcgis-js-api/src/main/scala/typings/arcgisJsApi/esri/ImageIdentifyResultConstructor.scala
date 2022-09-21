package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageIdentifyResultConstructor
  extends StObject
     with /**
  * The results from [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html)
  */
Instantiable0[ImageIdentifyResult]
     with Instantiable1[/* properties */ ImageIdentifyResultProperties, ImageIdentifyResult] {
  
  def fromJSON(json: Any): ImageIdentifyResult = js.native
}
