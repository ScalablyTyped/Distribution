package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SizeSliderViewModel
import typings.arcgisJsApi.esri.SizeSliderViewModelConstructor
import typings.arcgisJsApi.esri.SizeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SizeSlider/SizeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SizeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SizeSlider/SizeSliderViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with SizeSliderViewModel {
    def this(properties: SizeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & SizeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sizeSliderViewModelMod.foo` */
  override def _to: js.Object & SizeSliderViewModelConstructor = ^
}
