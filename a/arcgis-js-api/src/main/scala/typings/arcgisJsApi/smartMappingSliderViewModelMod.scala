package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SmartMappingSliderViewModel
import typings.arcgisJsApi.esri.SmartMappingSliderViewModelConstructor
import typings.arcgisJsApi.esri.SmartMappingSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smartMappingSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SmartMappingSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SmartMappingSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SmartMappingSliderViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with SmartMappingSliderViewModel {
    def this(properties: SmartMappingSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & SmartMappingSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `smartMappingSliderViewModelMod.foo` */
  override def _to: js.Object & SmartMappingSliderViewModelConstructor = ^
}
