package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClassedColorSliderViewModel
import typings.arcgisJsApi.esri.ClassedColorSliderViewModelConstructor
import typings.arcgisJsApi.esri.ClassedColorSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingClassedColorSliderClassedColorSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider/ClassedColorSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClassedColorSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedColorSlider/ClassedColorSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [ClassedColorSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with ClassedColorSliderViewModel {
    def this(properties: ClassedColorSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & ClassedColorSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingClassedColorSliderClassedColorSliderViewModelMod.foo` */
  override def _to: js.Object & ClassedColorSliderViewModelConstructor = ^
}
