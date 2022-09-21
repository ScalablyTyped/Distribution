package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectLineMeasurement3DViewModel
import typings.arcgisJsApi.esri.DirectLineMeasurement3DViewModelConstructor
import typings.arcgisJsApi.esri.DirectLineMeasurement3DViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directLineMeasurement3DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/DirectLineMeasurement3D/DirectLineMeasurement3DViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectLineMeasurement3DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DirectLineMeasurement3D/DirectLineMeasurement3DViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [DirectLineMeasurement3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html)
    */
  open class Class ()
    extends StObject
       with DirectLineMeasurement3DViewModel {
    def this(properties: DirectLineMeasurement3DViewModelProperties) = this()
  }
  
  type _To = js.Object & DirectLineMeasurement3DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directLineMeasurement3DViewModelMod.foo` */
  override def _to: js.Object & DirectLineMeasurement3DViewModelConstructor = ^
}
