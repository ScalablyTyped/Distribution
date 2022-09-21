package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindResultConstructor
  extends StObject
     with /**
  * The result from [find](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-find.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html)
  */
Instantiable0[FindResult]
     with Instantiable1[/* properties */ FindResultProperties, FindResult] {
  
  def fromJSON(json: Any): FindResult = js.native
}
