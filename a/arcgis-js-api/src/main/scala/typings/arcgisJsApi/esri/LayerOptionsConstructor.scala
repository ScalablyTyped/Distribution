package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerOptionsConstructor
  extends StObject
     with /**
  * The `LayerOptions` class defines additional options that can be defined for a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html)
  */
Instantiable0[LayerOptions]
     with Instantiable1[/* properties */ LayerOptionsProperties, LayerOptions] {
  
  def fromJSON(json: Any): LayerOptions = js.native
}
