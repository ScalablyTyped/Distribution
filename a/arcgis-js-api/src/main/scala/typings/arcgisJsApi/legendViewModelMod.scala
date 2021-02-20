package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LegendViewModel
import typings.arcgisJsApi.esri.LegendViewModelConstructor
import typings.arcgisJsApi.esri.LegendViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Legend/LegendViewModel", JSImport.Namespace)
  @js.native
  val ^ : LegendViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Legend/LegendViewModel", JSImport.Namespace)
  @js.native
  class Class () extends LegendViewModel {
    def this(properties: LegendViewModelProperties) = this()
  }
  
  type _To = LegendViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `legendViewModelMod.foo` */
  override def _to: LegendViewModelConstructor = ^
}
