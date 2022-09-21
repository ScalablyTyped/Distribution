package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifyResultConstructor
  extends StObject
     with /**
  * The result from [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyResult.html)
  */
Instantiable0[IdentifyResult]
     with Instantiable1[/* properties */ IdentifyResultProperties, IdentifyResult] {
  
  def fromJSON(json: Any): IdentifyResult = js.native
}
