package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundProperties extends LoadableProperties {
  
  /**
    * A collection of [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) that define the elevation or terrain that makes up the ground surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[ElevationLayerProperties]] = js.native
  
  /**
    * Specifies the user navigation constraints relative to the ground surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var navigationConstraint: js.UndefOr[GroundNavigationConstraintProperties] = js.native
  
  /**
    * Opacity of the ground, including surface default color and the basemap (without reference layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * The color of the ground surface, displayed underneath the basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#surfaceColor)
    */
  var surfaceColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
}
object GroundProperties {
  
  @scala.inline
  def apply(): GroundProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundProperties]
  }
  
  @scala.inline
  implicit class GroundPropertiesOps[Self <: GroundProperties] (val x: Self) extends AnyVal {
    
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
    def setLayersVarargs(value: ElevationLayerProperties*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: CollectionProperties[ElevationLayerProperties]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setNavigationConstraint(value: GroundNavigationConstraintProperties): Self = this.set("navigationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationConstraint: Self = this.set("navigationConstraint", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSurfaceColorVarargs(value: Double*): Self = this.set("surfaceColor", js.Array(value :_*))
    
    @scala.inline
    def setSurfaceColor(value: Color_ | js.Array[Double] | String): Self = this.set("surfaceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurfaceColor: Self = this.set("surfaceColor", js.undefined)
  }
}
