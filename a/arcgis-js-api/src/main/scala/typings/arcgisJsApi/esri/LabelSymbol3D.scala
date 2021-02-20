package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSymbol3D
  extends Symbol3D
     with typings.arcgisJsApi.esri.symbols.Symbol2D3D
     with Symbol2D3D
     with typings.arcgisJsApi.esri.symbols.Symbol3D
     with symbolsSymbol3D {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout)
    */
  var callout: Callout3D = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#type)
    */
  @JSName("type")
  val type_LabelSymbol3D: `label-3d` = js.native
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var verticalOffset: LabelSymbol3DVerticalOffset = js.native
}
