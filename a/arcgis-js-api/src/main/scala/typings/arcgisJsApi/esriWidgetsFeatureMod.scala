package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Feature
import typings.arcgisJsApi.esri.FeatureConstructor
import typings.arcgisJsApi.esri.FeatureProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureMod extends Shortcut {
  
  @JSImport("esri/widgets/Feature", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Feature", JSImport.Namespace)
  @js.native
  /**
    * The Feature widget displays a graphic according to its [PopupTemplate](esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html)
    */
  open class Class ()
    extends StObject
       with Feature {
    def this(properties: FeatureProperties) = this()
  }
  
  type _To = js.Object & FeatureConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureMod.foo` */
  override def _to: js.Object & FeatureConstructor = ^
}
