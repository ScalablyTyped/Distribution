package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewBase extends js.Object {
  /**
    * Sets the view to a given target. The target parameter can be one of the following:
    *   * `[longitude, latitude]` pair of coordinates
    *   * [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) (or array of [Geometry[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html))
    *   * [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) (or array of [Graphic[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html))
    *   * [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
    *   * Object with a combination of `target`, `center`, `scale` and `rotation` properties (with `target` being any of the types listed above). The `center` property is provided as a convenience to animate the [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#center) and is equivalent to specifying the `target` with the center [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    *
    * This function returns a promise which resolves as soon as the new view has been set to the target. If the transition is animated, then the ongoing animation can be obtained using [MapView.animation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#animation).  If a tiled map service is used as the basemap and `snapToZoom` property is set to `true` in [constraints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#constraints), the `goTo` method will zoom in to fit the defined `target`. If `snapToZoom` property is set to `false`, the `goTo` method will zoom to the exact `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    *
    * @param target The target location/viewpoint to animate to. When using an object for `target`, use the properties in [GoToTarget2D](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToTarget2D).
    * @param options Animation options for controlling the duration and easing of the animation. See the properties defined in [GoToOptions2D](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#GoToOptions2D) for object specifications.
    *
    */
  def goTo(target: GoToTarget2D): js.Promise[_] = js.native
  def goTo(target: GoToTarget2D, options: GoToOptions2D): js.Promise[_] = js.native
}

@JSGlobal("__esri.MapViewBase")
@js.native
object MapViewBase extends TopLevel[MapViewBaseConstructor]

