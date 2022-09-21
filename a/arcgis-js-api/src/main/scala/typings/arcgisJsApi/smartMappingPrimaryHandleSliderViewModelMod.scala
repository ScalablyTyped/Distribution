package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SmartMappingPrimaryHandleSliderViewModel
import typings.arcgisJsApi.esri.SmartMappingPrimaryHandleSliderViewModelConstructor
import typings.arcgisJsApi.esri.SmartMappingPrimaryHandleSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smartMappingPrimaryHandleSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SmartMappingPrimaryHandleSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SmartMappingPrimaryHandleSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SmartMappingPrimaryHandleSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Shared properties for sliders that have a [primaryHandle](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingPrimaryHandleSliderViewModel.html#primaryHandleEnabled) option.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingPrimaryHandleSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with SmartMappingPrimaryHandleSliderViewModel {
    def this(properties: SmartMappingPrimaryHandleSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & SmartMappingPrimaryHandleSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `smartMappingPrimaryHandleSliderViewModelMod.foo` */
  override def _to: js.Object & SmartMappingPrimaryHandleSliderViewModelConstructor = ^
}
