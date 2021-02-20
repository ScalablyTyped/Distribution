package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
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
  implicit class GroundPropertiesMutableBuilder[Self <: GroundProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: CollectionProperties[ElevationLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: ElevationLayerProperties*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setNavigationConstraint(value: GroundNavigationConstraintProperties): Self = StObject.set(x, "navigationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationConstraintUndefined: Self = StObject.set(x, "navigationConstraint", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSurfaceColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "surfaceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceColorUndefined: Self = StObject.set(x, "surfaceColor", js.undefined)
    
    @scala.inline
    def setSurfaceColorVarargs(value: Double*): Self = StObject.set(x, "surfaceColor", js.Array(value :_*))
  }
}
