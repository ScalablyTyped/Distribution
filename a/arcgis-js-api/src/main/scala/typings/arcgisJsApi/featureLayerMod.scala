package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureLayer
import typings.arcgisJsApi.esri.FeatureLayerConstructor
import typings.arcgisJsApi.esri.FeatureLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureLayerMod extends Shortcut {
  
  @JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
  @js.native
  val ^ : FeatureLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
  @js.native
  /**
    * A FeatureLayer is a single layer that can be created from a [Map Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
    */
  class Class () extends FeatureLayer {
    def this(properties: FeatureLayerProperties) = this()
  }
  
  type _To = FeatureLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureLayerMod.foo` */
  override def _to: FeatureLayerConstructor = ^
}
