package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.color
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import typings.arcgisJsApi.esri.OGCFeatureLayer
import typings.arcgisJsApi.esri.OGCFeatureLayerConstructor
import typings.arcgisJsApi.esri.OGCFeatureLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ogcfeaturelayerMod extends Shortcut {
  
  @JSImport("esri/layers/OGCFeatureLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OGCFeatureLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/OGCFeatureLayer", JSImport.Namespace)
  @js.native
  /**
    * The OGCFeatureLayer class is used to create a layer based on individual collections from a [OGC API Features](https://www.opengeospatial.org/standards/ogcapi-features) service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html)
    */
  class Class ()
    extends StObject
       with OGCFeatureLayer {
    def this(properties: OGCFeatureLayerProperties) = this()
    
    /**
      * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
      */
    /* CompleteClass */
    var blendMode: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
    
    /**
      * Fetches all the data for the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /**
      * Refresh interval of the layer in minutes.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
      */
    /* CompleteClass */
    var refreshInterval: Double = js.native
  }
  
  type _To = js.Object & OGCFeatureLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `ogcfeaturelayerMod.foo` */
  override def _to: js.Object & OGCFeatureLayerConstructor = ^
}
