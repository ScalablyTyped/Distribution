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
import typings.arcgisJsApi.esri.Effect
import typings.arcgisJsApi.esri.FeatureEffect
import typings.arcgisJsApi.esri.FeatureLayer
import typings.arcgisJsApi.esri.FeatureLayerConstructor
import typings.arcgisJsApi.esri.FeatureLayerProperties
import typings.arcgisJsApi.esri.OrderedLayerOrderBy
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.TimeExtent
import typings.arcgisJsApi.esri.TimeInfo
import typings.arcgisJsApi.esri.TimeInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersFeatureLayerMod extends Shortcut {
  
  @JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
  @js.native
  /**
    * A FeatureLayer is a single layer that can be created from a [Map Service](https://enterprise.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](https://enterprise.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
    */
  open class Class ()
    extends StObject
       with FeatureLayer {
    def this(properties: FeatureLayerProperties) = this()
    
    /**
      * An authorization string used to access a resource or service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
      */
    /* CompleteClass */
    var apiKey: String = js.native
    
    /**
      * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
      *
      * @default normal
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
      */
    /* CompleteClass */
    var blendMode: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
    
    /**
      * A list of custom parameters appended to the URL of all resources fetched by the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
      */
    /* CompleteClass */
    var customParameters: Any = js.native
    
    /**
      * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
      */
    /* CompleteClass */
    var effect: Effect = js.native
    
    /**
      * The featureEffect can be used to draw attention features of interest.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
      */
    /* CompleteClass */
    var featureEffect: FeatureEffect = js.native
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
    
    /**
      * Determines the order in which features are drawn in the view.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
      */
    /* CompleteClass */
    var orderBy: js.Array[OrderedLayerOrderBy] = js.native
    
    /**
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
    
    /**
      * The layer's time extent.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
      */
    /* CompleteClass */
    var timeExtent: TimeExtent = js.native
    
    /**
      * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
      */
    /* CompleteClass */
    var timeInfo: TimeInfo = js.native
    
    /**
      * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
      */
    /* CompleteClass */
    var timeOffset: TimeInterval = js.native
    
    /**
      * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
      *
      * @default true
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
      */
    /* CompleteClass */
    var useViewTime: Boolean = js.native
  }
  
  type _To = js.Object & FeatureLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersFeatureLayerMod.foo` */
  override def _to: js.Object & FeatureLayerConstructor = ^
}
