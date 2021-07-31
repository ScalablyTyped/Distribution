package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BaseLayerViewGL2D
import typings.arcgisJsApi.esri.BaseLayerViewGL2DConstructor
import typings.arcgisJsApi.esri.BaseLayerViewGL2DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseLayerViewGL2DMod extends Shortcut {
  
  @JSImport("esri/views/2d/layers/BaseLayerViewGL2D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BaseLayerViewGL2DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/2d/layers/BaseLayerViewGL2D", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html)
    */
  class Class ()
    extends StObject
       with BaseLayerViewGL2D {
    def this(properties: BaseLayerViewGL2DProperties) = this()
  }
  
  type _To = js.Object & BaseLayerViewGL2DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `baseLayerViewGL2DMod.foo` */
  override def _to: js.Object & BaseLayerViewGL2DConstructor = ^
}
