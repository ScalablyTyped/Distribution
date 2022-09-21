package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureViewModel
import typings.arcgisJsApi.esri.FeatureViewModelConstructor
import typings.arcgisJsApi.esri.FeatureViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Feature/FeatureViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Feature/FeatureViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html)
    */
  open class Class ()
    extends StObject
       with FeatureViewModel {
    def this(properties: FeatureViewModelProperties) = this()
  }
  
  type _To = js.Object & FeatureViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureViewModelMod.foo` */
  override def _to: js.Object & FeatureViewModelConstructor = ^
}
