package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SnappingControlsViewModel
import typings.arcgisJsApi.esri.SnappingControlsViewModelConstructor
import typings.arcgisJsApi.esri.SnappingControlsViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportSnappingControlsSnappingControlsViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/SnappingControls/SnappingControlsViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SnappingControlsViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/SnappingControls/SnappingControlsViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [SnappingControls](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls-SnappingControlsViewModel.html)
    */
  open class Class ()
    extends StObject
       with SnappingControlsViewModel {
    def this(properties: SnappingControlsViewModelProperties) = this()
  }
  
  type _To = js.Object & SnappingControlsViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportSnappingControlsSnappingControlsViewModelMod.foo` */
  override def _to: js.Object & SnappingControlsViewModelConstructor = ^
}
