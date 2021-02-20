package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectLineMeasurement3DViewModel
import typings.arcgisJsApi.esri.DirectLineMeasurement3DViewModelConstructor
import typings.arcgisJsApi.esri.DirectLineMeasurement3DViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directLineMeasurement3DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/DirectLineMeasurement3D/DirectLineMeasurement3DViewModel", JSImport.Namespace)
  @js.native
  val ^ : DirectLineMeasurement3DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DirectLineMeasurement3D/DirectLineMeasurement3DViewModel", JSImport.Namespace)
  @js.native
  class Class () extends DirectLineMeasurement3DViewModel {
    def this(properties: DirectLineMeasurement3DViewModelProperties) = this()
  }
  
  type _To = DirectLineMeasurement3DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directLineMeasurement3DViewModelMod.foo` */
  override def _to: DirectLineMeasurement3DViewModelConstructor = ^
}
