package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ShadowCastViewModel
import typings.arcgisJsApi.esri.ShadowCastViewModelConstructor
import typings.arcgisJsApi.esri.ShadowCastViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsShadowCastShadowCastViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/ShadowCast/ShadowCastViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ShadowCastViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ShadowCast/ShadowCastViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [ShadowCast](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html)
    */
  open class Class ()
    extends StObject
       with ShadowCastViewModel {
    def this(properties: ShadowCastViewModelProperties) = this()
  }
  
  type _To = js.Object & ShadowCastViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsShadowCastShadowCastViewModelMod.foo` */
  override def _to: js.Object & ShadowCastViewModelConstructor = ^
}
