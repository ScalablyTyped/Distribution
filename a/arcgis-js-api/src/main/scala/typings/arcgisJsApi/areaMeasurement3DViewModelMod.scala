package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AreaMeasurement3DViewModel
import typings.arcgisJsApi.esri.AreaMeasurement3DViewModelConstructor
import typings.arcgisJsApi.esri.AreaMeasurement3DViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMeasurement3DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/AreaMeasurement3D/AreaMeasurement3DViewModel", JSImport.Namespace)
  @js.native
  val ^ : AreaMeasurement3DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/AreaMeasurement3D/AreaMeasurement3DViewModel", JSImport.Namespace)
  @js.native
  class Class () extends AreaMeasurement3DViewModel {
    def this(properties: AreaMeasurement3DViewModelProperties) = this()
  }
  
  type _To = AreaMeasurement3DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `areaMeasurement3DViewModelMod.foo` */
  override def _to: AreaMeasurement3DViewModelConstructor = ^
}
