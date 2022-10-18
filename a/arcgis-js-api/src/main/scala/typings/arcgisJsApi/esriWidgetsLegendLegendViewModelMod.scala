package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LegendViewModel
import typings.arcgisJsApi.esri.LegendViewModelConstructor
import typings.arcgisJsApi.esri.LegendViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLegendLegendViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Legend/LegendViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LegendViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Legend/LegendViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget, which displays a label and symbol for interpreting the [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) of each layer in a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html)
    */
  open class Class ()
    extends StObject
       with LegendViewModel {
    def this(properties: LegendViewModelProperties) = this()
  }
  
  type _To = js.Object & LegendViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLegendLegendViewModelMod.foo` */
  override def _to: js.Object & LegendViewModelConstructor = ^
}
