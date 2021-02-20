package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorSliderViewModel
import typings.arcgisJsApi.esri.ColorSliderViewModelConstructor
import typings.arcgisJsApi.esri.ColorSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ColorSlider/ColorSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : ColorSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ColorSlider/ColorSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ColorSliderViewModel {
    def this(properties: ColorSliderViewModelProperties) = this()
  }
  
  type _To = ColorSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorSliderViewModelMod.foo` */
  override def _to: ColorSliderViewModelConstructor = ^
}
