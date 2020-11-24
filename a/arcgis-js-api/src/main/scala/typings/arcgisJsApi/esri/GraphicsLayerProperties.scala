package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
    * Specifies how graphics are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[GraphicsLayerElevationInfo] = js.native
  
  /**
    * A collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.native
}
object GraphicsLayerProperties {
  
  @scala.inline
  def apply(): GraphicsLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsLayerProperties]
  }
  
  @scala.inline
  implicit class GraphicsLayerPropertiesOps[Self <: GraphicsLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElevationInfo(value: GraphicsLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    
    @scala.inline
    def setGraphicsVarargs(value: GraphicProperties*): Self = this.set("graphics", js.Array(value :_*))
    
    @scala.inline
    def setGraphics(value: CollectionProperties[GraphicProperties]): Self = this.set("graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphics: Self = this.set("graphics", js.undefined)
    
    @scala.inline
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = this.set("screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenSizePerspectiveEnabled: Self = this.set("screenSizePerspectiveEnabled", js.undefined)
  }
}
