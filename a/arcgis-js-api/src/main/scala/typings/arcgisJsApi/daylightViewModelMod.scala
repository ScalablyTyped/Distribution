package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DaylightViewModel
import typings.arcgisJsApi.esri.DaylightViewModelConstructor
import typings.arcgisJsApi.esri.DaylightViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daylightViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Daylight/DaylightViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DaylightViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Daylight/DaylightViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Daylight](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html)
    */
  open class Class ()
    extends StObject
       with DaylightViewModel {
    def this(properties: DaylightViewModelProperties) = this()
  }
  
  type _To = js.Object & DaylightViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `daylightViewModelMod.foo` */
  override def _to: js.Object & DaylightViewModelConstructor = ^
}
