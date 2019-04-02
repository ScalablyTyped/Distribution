package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewBase extends js.Object {
  def goTo(target: Geometry): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Geometry, options: MapViewBaseGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Graphic): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Graphic, options: MapViewBaseGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: MapViewBaseGoToTarget): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: MapViewBaseGoToTarget, options: MapViewBaseGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Viewpoint): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Viewpoint, options: MapViewBaseGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Sets the view to a given target. The target parameter can be one of the following:
    *   * `[longitude, latitude]` pair of coordinates
    *   * [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) (or array of [Geometry[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html))
    *   * [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) (or array of [Graphic[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html))
    *   * [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
    *   * Object with a combination of `target`, `center` and `scale` properties (with `target` being any of the types listed above). The `center` property is provided as a convenience to animate the [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#center) and is equivalent to specifying the `target` with the center [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    *
    * This function returns a promise which resolves as soon as the new view has been set to the target. If the transition is animated, then the ongoing animation can be obtained using [MapView.animation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#animation).  If a tiled map service is used as the basemap and `snapToZoom` property is set to `true` in [constraints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#constraints), the `goTo` method will zoom in to fit the defined `target`. If `snapToZoom` property is set to `false`, the `goTo` method will zoom to the exact `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    *
    * @param target The target location/viewpoint to animate to. When using an object for `target`, use the properties in the table below.
    * @param target.target The target of the animation.
    * @param target.center The [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#center) to go to.
    * @param target.scale The [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#scale) to go to.
    * @param target.zoom The [MapView.zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#zoom) to go to.
    * @param options Animation options. See properties below for object specifications.
    * @param options.animate Indicates if the transition to the new view should be animated. If set to false, `duration` and `easing` properties are ignored.
    * @param options.duration The duration of the animation in milliseconds.
    * @param options.easing The easing function used for the animation. See [easing functions](https://easings.net/) for graphical representations of these functions.  **Possible Values:** linear | ease | ease-in | ease-out | ease-in-out
    *
    */
  def goTo(target: js.Array[scala.Double | Geometry | Graphic]): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: js.Array[scala.Double | Geometry | Graphic], options: MapViewBaseGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

@JSGlobal("__esri.MapViewBase")
@js.native
class MapViewBaseCls () extends MapViewBase

