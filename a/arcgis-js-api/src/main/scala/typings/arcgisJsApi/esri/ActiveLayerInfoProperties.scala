package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveLayerInfoProperties extends StObject {
  
  /**
    * A collection of child activeLayerInfos.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.undefined
  
  /**
    * When `true`, layers will only be shown in the legend if they are visible in the view's extent.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#hideLayersNotInCurrentView)
    */
  var hideLayersNotInCurrentView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.undefined
  
  /**
    * The layerView represented by the ActiveLayerInfo object's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layerView)
    */
  var layerView: js.UndefOr[LayerViewProperties] = js.undefined
  
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.UndefOr[
    js.Array[
      SymbolTableElement | ColorRampElement | OpacityRampElement | SizeRampElement | HeatmapRampElement | RelationshipRampElement
    ]
  ] = js.undefined
  
  /**
    * The ActiveLayerInfo of the parent module:esri/layers/support/ISublayer or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: js.UndefOr[ActiveLayerInfoProperties] = js.undefined
  
  /**
    * Indicates if the activeLayerInfo is ready.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether to respect the properties of the layers in the map that control the legend's visibility (`minScale`, `maxScale`, `legendEnabled`).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#respectLayerVisibility)
    */
  var respectLayerVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Only applies if the [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer) is a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#sublayerIds)
    */
  var sublayerIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The text string that represents the legend's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the ActiveLayerInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: js.UndefOr[Double] = js.undefined
  
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: js.UndefOr[ViewProperties] = js.undefined
}
object ActiveLayerInfoProperties {
  
  inline def apply(): ActiveLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveLayerInfoProperties]
  }
  
  extension [Self <: ActiveLayerInfoProperties](x: Self) {
    
    inline def setChildren(value: CollectionProperties[ActiveLayerInfoProperties]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ActiveLayerInfoProperties*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHideLayersNotInCurrentView(value: Boolean): Self = StObject.set(x, "hideLayersNotInCurrentView", value.asInstanceOf[js.Any])
    
    inline def setHideLayersNotInCurrentViewUndefined: Self = StObject.set(x, "hideLayersNotInCurrentView", js.undefined)
    
    inline def setIsScaleDriven(value: Boolean): Self = StObject.set(x, "isScaleDriven", value.asInstanceOf[js.Any])
    
    inline def setIsScaleDrivenUndefined: Self = StObject.set(x, "isScaleDriven", js.undefined)
    
    inline def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLayerView(value: LayerViewProperties): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    inline def setLayerViewUndefined: Self = StObject.set(x, "layerView", js.undefined)
    
    inline def setLegendElements(
      value: js.Array[
          SymbolTableElement | ColorRampElement | OpacityRampElement | SizeRampElement | HeatmapRampElement | RelationshipRampElement
        ]
    ): Self = StObject.set(x, "legendElements", value.asInstanceOf[js.Any])
    
    inline def setLegendElementsUndefined: Self = StObject.set(x, "legendElements", js.undefined)
    
    inline def setLegendElementsVarargs(
      value: (SymbolTableElement | ColorRampElement | OpacityRampElement | SizeRampElement | HeatmapRampElement | RelationshipRampElement)*
    ): Self = StObject.set(x, "legendElements", js.Array(value*))
    
    inline def setParent(value: ActiveLayerInfoProperties): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRespectLayerVisibility(value: Boolean): Self = StObject.set(x, "respectLayerVisibility", value.asInstanceOf[js.Any])
    
    inline def setRespectLayerVisibilityUndefined: Self = StObject.set(x, "respectLayerVisibility", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSublayerIds(value: js.Array[Double]): Self = StObject.set(x, "sublayerIds", value.asInstanceOf[js.Any])
    
    inline def setSublayerIdsUndefined: Self = StObject.set(x, "sublayerIds", js.undefined)
    
    inline def setSublayerIdsVarargs(value: Double*): Self = StObject.set(x, "sublayerIds", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setView(value: ViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
