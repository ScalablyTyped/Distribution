package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SliderViewModel
import typings.arcgisJsApi.esri.SliderViewModelConstructor
import typings.arcgisJsApi.esri.SliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Slider/SliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : SliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slider/SliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends SliderViewModel {
    def this(properties: SliderViewModelProperties) = this()
  }
  
  type _To = SliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sliderViewModelMod.foo` */
  override def _to: SliderViewModelConstructor = ^
}
