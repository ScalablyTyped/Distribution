package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureTableViewModel
import typings.arcgisJsApi.esri.FeatureTableViewModelConstructor
import typings.arcgisJsApi.esri.FeatureTableViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTableFeatureTableViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/FeatureTableViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureTableViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/FeatureTableViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget, which allows users to view content from feature attributes in a tabular format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html)
    */
  open class Class ()
    extends StObject
       with FeatureTableViewModel {
    def this(properties: FeatureTableViewModelProperties) = this()
  }
  
  type _To = js.Object & FeatureTableViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTableFeatureTableViewModelMod.foo` */
  override def _to: js.Object & FeatureTableViewModelConstructor = ^
}
