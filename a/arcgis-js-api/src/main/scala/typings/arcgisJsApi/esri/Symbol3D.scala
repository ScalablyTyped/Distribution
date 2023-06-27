package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol3D
  extends StObject
     with Symbol {
  
  /**
  		 * The origin of the style from which the symbol was originally referenced.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
  		 */
  var styleOrigin: StyleOrigin = js.native
  
  /**
  		 * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
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
