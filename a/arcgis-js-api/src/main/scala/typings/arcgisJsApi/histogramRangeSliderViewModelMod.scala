package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HistogramRangeSliderViewModel
import typings.arcgisJsApi.esri.HistogramRangeSliderViewModelConstructor
import typings.arcgisJsApi.esri.HistogramRangeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramRangeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/HistogramRangeSlider/HistogramRangeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : HistogramRangeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/HistogramRangeSlider/HistogramRangeSliderViewModel", JSImport.Namespace)
  @js.native
  class Class () extends HistogramRangeSliderViewModel {
    def this(properties: HistogramRangeSliderViewModelProperties) = this()
  }
  
  type _To = HistogramRangeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `histogramRangeSliderViewModelMod.foo` */
  override def _to: HistogramRangeSliderViewModelConstructor = ^
}
