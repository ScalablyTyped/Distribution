package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModel
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModelConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMeasurement2DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/AreaMeasurement2D/AreaMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  val ^ : AreaMeasurement2DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/AreaMeasurement2D/AreaMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  class Class () extends AreaMeasurement2DViewModel {
    def this(properties: js.Any) = this()
  }
  
  type _To = AreaMeasurement2DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `areaMeasurement2DViewModelMod.foo` */
  override def _to: AreaMeasurement2DViewModelConstructor = ^
}
