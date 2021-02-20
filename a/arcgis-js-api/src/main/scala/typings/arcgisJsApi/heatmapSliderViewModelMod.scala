package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeatmapSliderViewModel
import typings.arcgisJsApi.esri.HeatmapSliderViewModelConstructor
import typings.arcgisJsApi.esri.HeatmapSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/HeatmapSlider/HeatmapSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : HeatmapSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/HeatmapSlider/HeatmapSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends HeatmapSliderViewModel {
    def this(properties: HeatmapSliderViewModelProperties) = this()
  }
  
  type _To = HeatmapSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heatmapSliderViewModelMod.foo` */
  override def _to: HeatmapSliderViewModelConstructor = ^
}
