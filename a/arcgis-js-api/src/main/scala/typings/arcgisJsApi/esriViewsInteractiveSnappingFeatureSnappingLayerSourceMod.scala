package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureSnappingLayerSource
import typings.arcgisJsApi.esri.FeatureSnappingLayerSourceConstructor
import typings.arcgisJsApi.esri.FeatureSnappingLayerSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInteractiveSnappingFeatureSnappingLayerSourceMod extends Shortcut {
  
  @JSImport("esri/views/interactive/snapping/FeatureSnappingLayerSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureSnappingLayerSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/interactive/snapping/FeatureSnappingLayerSource", JSImport.Namespace)
  @js.native
  /**
    * The FeatureSnappingLayerSource specifies which layers will be utilized for snapping in the [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html)
    */
  open class Class ()
    extends StObject
       with FeatureSnappingLayerSource {
    def this(properties: FeatureSnappingLayerSourceProperties) = this()
  }
  
  type _To = js.Object & FeatureSnappingLayerSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsInteractiveSnappingFeatureSnappingLayerSourceMod.foo` */
  override def _to: js.Object & FeatureSnappingLayerSourceConstructor = ^
}
