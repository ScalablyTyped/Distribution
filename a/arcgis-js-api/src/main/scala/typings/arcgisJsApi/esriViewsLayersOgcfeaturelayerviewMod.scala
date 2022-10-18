package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OGCFeatureLayerView
import typings.arcgisJsApi.esri.OGCFeatureLayerViewConstructor
import typings.arcgisJsApi.esri.OGCFeatureLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsLayersOgcfeaturelayerviewMod extends Shortcut {
  
  @JSImport("esri/views/layers/OGCFeatureLayerView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OGCFeatureLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/OGCFeatureLayerView", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with OGCFeatureLayerView {
    def this(properties: OGCFeatureLayerViewProperties) = this()
  }
  
  type _To = js.Object & OGCFeatureLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsLayersOgcfeaturelayerviewMod.foo` */
  override def _to: js.Object & OGCFeatureLayerViewConstructor = ^
}
