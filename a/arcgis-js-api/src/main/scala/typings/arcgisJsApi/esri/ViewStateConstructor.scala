package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStateConstructor
  extends StObject
     with /**
  * Object that holds information about the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) state.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html)
  */
Instantiable0[ViewState]
     with Instantiable1[/* properties */ ViewStateProperties, ViewState] {
  
  def fromJSON(json: Any): ViewState = js.native
}
