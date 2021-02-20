package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeoJSONLayer
import typings.arcgisJsApi.esri.GeoJSONLayerConstructor
import typings.arcgisJsApi.esri.GeoJSONLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoJSONLayerMod extends Shortcut {
  
  @JSImport("esri/layers/GeoJSONLayer", JSImport.Namespace)
  @js.native
  val ^ : GeoJSONLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/GeoJSONLayer", JSImport.Namespace)
  @js.native
  /**
    * The GeoJSONLayer class is used to create a layer based on [GeoJSON](http://geojson.org/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html)
    */
  class Class () extends GeoJSONLayer {
    def this(properties: GeoJSONLayerProperties) = this()
  }
  
  type _To = GeoJSONLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geoJSONLayerMod.foo` */
  override def _to: GeoJSONLayerConstructor = ^
}
