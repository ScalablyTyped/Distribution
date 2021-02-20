package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveLayerInfoProperties extends StObject {
  
  /**
    * A collection of child activeLayerInfos.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  
  /**
    * The layerView represented by the ActiveLayerInfo object's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layerView)
    */
  var layerView: js.UndefOr[LayerViewProperties] = js.native
  
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.UndefOr[js.Array[LegendElement]] = js.native
  
  /**
    * The ActiveLayerInfo of the parent [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: js.UndefOr[ActiveLayerInfoProperties] = js.native
  
  /**
    * Indicates if the activeLayerInfo is ready.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: js.UndefOr[Boolean] = js.native
  
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The text string that represents the legend's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The version of the ActiveLayerInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: js.UndefOr[Double] = js.native
  
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: js.UndefOr[ViewProperties] = js.native
}
object ActiveLayerInfoProperties {
  
  @scala.inline
  def apply(): ActiveLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveLayerInfoProperties]
  }
  
  @scala.inline
  implicit class ActiveLayerInfoPropertiesMutableBuilder[Self <: ActiveLayerInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: CollectionProperties[ActiveLayerInfoProperties]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ActiveLayerInfoProperties*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setIsScaleDriven(value: Boolean): Self = StObject.set(x, "isScaleDriven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScaleDrivenUndefined: Self = StObject.set(x, "isScaleDriven", js.undefined)
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setLayerView(value: LayerViewProperties): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerViewUndefined: Self = StObject.set(x, "layerView", js.undefined)
    
    @scala.inline
    def setLegendElements(value: js.Array[LegendElement]): Self = StObject.set(x, "legendElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendElementsUndefined: Self = StObject.set(x, "legendElements", js.undefined)
    
    @scala.inline
    def setLegendElementsVarargs(value: LegendElement*): Self = StObject.set(x, "legendElements", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: ActiveLayerInfoProperties): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setView(value: ViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
