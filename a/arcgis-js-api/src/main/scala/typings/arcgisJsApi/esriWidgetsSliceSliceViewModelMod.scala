package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SliceViewModel
import typings.arcgisJsApi.esri.SliceViewModelConstructor
import typings.arcgisJsApi.esri.SliceViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSliceSliceViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Slice/SliceViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliceViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slice/SliceViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html)
    */
  open class Class ()
    extends StObject
       with SliceViewModel {
    def this(properties: SliceViewModelProperties) = this()
  }
  
  type _To = js.Object & SliceViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSliceSliceViewModelMod.foo` */
  override def _to: js.Object & SliceViewModelConstructor = ^
}
