package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundProperties extends LoadableProperties {
  /**
    * A collection of [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) that define the elevation or terrain that makes up the ground surface. When elevation layers are added to the ground, the topographical variations of the surface are rendered in 3D as they would appear in the real world.  ![elev-default](https://developers.arcgis.com/javascript/assets/img/apiref/ground/elev-default.png)  When the layers collection is empty, the ground surface is flat.  ![no-elev](https://developers.arcgis.com/javascript/assets/img/apiref/ground/no-elev.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[ElevationLayerProperties]] = js.undefined
  /**
    * Specifies the user navigation constraints relative to the ground surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var navigationConstraint: js.UndefOr[GroundNavigationConstraintProperties] = js.undefined
  /**
    * Opacity of the ground, including surface default color and the basemap (without reference layers). This property can be used for a see-through ground effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#opacity)
    *
    * @default 1
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The color of the ground surface, displayed underneath the basemap. If this is null, a grid is displayed instead. The alpha value in the color is ignored. Use the [opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#opacity) property to control the opacity of the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#surfaceColor)
    *
    * @default null
    */
  var surfaceColor: js.UndefOr[Color | js.Array[Double] | String] = js.undefined
}

object GroundProperties {
  @scala.inline
  def apply(
    layers: CollectionProperties[ElevationLayerProperties] = null,
    navigationConstraint: GroundNavigationConstraintProperties = null,
    opacity: Int | Double = null,
    surfaceColor: Color | js.Array[Double] | String = null
  ): GroundProperties = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (navigationConstraint != null) __obj.updateDynamic("navigationConstraint")(navigationConstraint)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (surfaceColor != null) __obj.updateDynamic("surfaceColor")(surfaceColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundProperties]
  }
}

