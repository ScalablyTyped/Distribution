package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol3D extends Symbol {
  /**
    * The origin of the style from which the symbol was originally referenced. A reference to the style origin can be either by styleName or by styleUrl (but not both). This information is part of the WebScene persistence model and may be used to understand where a symbol was originally sourced from. It does not affect actual appearance or rendering of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleOrigin: Symbol3DStyleOrigin = js.native
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature. Individual symbol layers may be autocast as objects and specified using the `type` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#symbolLayers)
    */
  var symbolLayers: Collection[Symbol3DLayer] = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#type)
    */
  @JSName("type")
  val type_Symbol3D: `point-3d` | `line-3d` | `polygon-3d` | `mesh-3d` | `label-3d` = js.native
}

@JSGlobal("__esri.Symbol3D")
@js.native
object Symbol3D extends TopLevel[Symbol3DConstructor]

