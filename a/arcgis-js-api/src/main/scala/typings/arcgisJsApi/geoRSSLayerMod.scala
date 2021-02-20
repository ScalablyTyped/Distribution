package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeoRSSLayer
import typings.arcgisJsApi.esri.GeoRSSLayerConstructor
import typings.arcgisJsApi.esri.GeoRSSLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoRSSLayerMod extends Shortcut {
  
  @JSImport("esri/layers/GeoRSSLayer", JSImport.Namespace)
  @js.native
  val ^ : GeoRSSLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/GeoRSSLayer", JSImport.Namespace)
  @js.native
  /**
    * The GeoRSSLayer class is used to create a layer based on [GeoRSS](https://www.ogc.org/standards/georss).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html)
    */
  class Class () extends GeoRSSLayer {
    def this(properties: GeoRSSLayerProperties) = this()
  }
  
  type _To = GeoRSSLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geoRSSLayerMod.foo` */
  override def _to: GeoRSSLayerConstructor = ^
}
