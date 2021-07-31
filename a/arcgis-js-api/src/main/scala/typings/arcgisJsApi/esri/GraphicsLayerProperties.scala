package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
    * Specifies how graphics are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[GraphicsLayerElevationInfo] = js.undefined
  
  /**
    * A collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.undefined
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.undefined
}
object GraphicsLayerProperties {
  
  @scala.inline
  def apply(): GraphicsLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsLayerProperties]
  }
  
  @scala.inline
  implicit class GraphicsLayerPropertiesMutableBuilder[Self <: GraphicsLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElevationInfo(value: GraphicsLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    @scala.inline
    def setGraphics(value: CollectionProperties[GraphicProperties]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsUndefined: Self = StObject.set(x, "graphics", js.undefined)
    
    @scala.inline
    def setGraphicsVarargs(value: GraphicProperties*): Self = StObject.set(x, "graphics", js.Array(value :_*))
    
    @scala.inline
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = StObject.set(x, "screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSizePerspectiveEnabledUndefined: Self = StObject.set(x, "screenSizePerspectiveEnabled", js.undefined)
  }
}
