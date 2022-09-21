package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LayerView
import typings.arcgisJsApi.esri.LayerViewConstructor
import typings.arcgisJsApi.esri.LayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/LayerView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/LayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the view for a single layer after it has been added to either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html)
    */
  open class Class ()
    extends StObject
       with LayerView {
    def this(properties: LayerViewProperties) = this()
  }
  
  type _To = js.Object & LayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `layerViewMod.foo` */
  override def _to: js.Object & LayerViewConstructor = ^
}
