package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slide extends Accessor {
  /**
    * The basemap of the scene. Only the [base](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers) and [reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers) layers of the basemap are stored in a slide.  This value can be an instance of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) or one of the strings listed in the table below.
    *
    * Value | Description
    * ------|------------
    * streets | ![basemap-streets](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets.jpg)
    * satellite | ![basemap-satellite](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/satellite.jpg)
    * hybrid | ![basemap-hybrid](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/hybrid.jpg)
    * topo | ![basemap-topo](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/topo.jpg)
    * gray | ![basemap-gray](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/gray.jpg)
    * dark-gray | ![basemap-dark-gray](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/dark-gray.jpg)
    * oceans | ![basemap-oceans](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/oceans.jpg)
    * national-geographic | ![basemap-national-geographic](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/national-geographic.jpg)
    * terrain | ![basemap-terrain](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/terrain.jpg)
    * osm | ![basemap-osm](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/osm.jpg)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#basemap)
    */
  var basemap: Basemap = js.native
  /**
    * The description of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#description)
    */
  var description: SlideDescription = js.native
  /**
    * Represents settings that affect the environment in which the WebScene is displayed (such as lighting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
    */
  var environment: Environment = js.native
  /**
    * Ground properties for this slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
    */
  var ground: SlideGround = js.native
  /**
    * The unique id of a slide within the [slides property](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) of a [Presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#id)
    */
  var id: String = js.native
  /**
    * A data URI encoded thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
    */
  var thumbnail: SlideThumbnail = js.native
  /**
    * The title of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var title: SlideTitle = js.native
  /**
    * The viewpoint of the slide. This acts like a bookmark, saving a predefined location or point of view from which to view the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  /**
    * The visible layers of the scene. This is a collection of objects that stores references (by ID) to the [scene layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) and [ground layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) that are set as `visible` when a slide is applied to a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  When assigning visible layers, the following types of values will be automatically casted:
    *   * Array (or [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html)) of [Layer instances](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html): `[layerInstance, layerInstance]`
    *   * Array (or [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html)) of [Layer IDs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id): `["layer-1", "layer-2"]`
    *
    *
    * The specification for each object in the collection is outlined in the table below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var visibleLayers: Collection[SlideVisibleLayers] = js.native
  /**
    * Applies a slide's settings to a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#applyTo)
    *
    * @param view The SceneView the slide should be applied to.
    * @param options Animation options. See properties below for object specifications.
    * @param options.animate Indicates whether to animate the slide transition.
    * @param options.speedFactor Increases or decreases the animation speed by the specified factor. A speedFactor of 2 will make the animation twice as fast, while a speedFactor of 0.5 will make the animation half as fast. Setting the speed factor will automatically adapt the default maxDuration accordingly.
    * @param options.duration Set the exact duration (in milliseconds) of the animation. Note that by default, animation duration is calculated based on the time required to reach the target at a constant speed. Setting duration overrides the speedFactor option. Note that the resulting duration is still limited to the maxDuration.
    * @param options.maxDuration The maximum allowed duration (in milliseconds) of the animation. The default maxDuration value takes the specified speedFactor into account.
    * @param options.easing The easing function to use for the animation. This may either be a preset (named) function, or a user specified function. Supported named presets are: `linear`, `in-cubic`, `out-cubic`, `in-out-cubic`, `in-expo`, `out-expo`, `in-out-expo` By default, animations that are less than 1000 ms use an out easing function; longer animations use an in-out function.
    * @param options.signal Signal object that can be used to abort the asynchronous task. Aborting will cause the slide animation to stop. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def applyTo(view: SceneView): js.Promise[Slide] = js.native
  def applyTo(view: SceneView, options: SlideApplyToOptions): js.Promise[Slide] = js.native
  /**
    * Updates a slide from a [WebScene's slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides). Updating the slide is asynchronous and a snapshot of the view is only complete once the returned promise has resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    *
    * @param view The SceneView from which the slide should update.
    * @param options Update options. See properties below for object specifications.
    * @param options.screenshot Screenshot options to use. See properties below for object specifications.
    *
    */
  def updateFrom(view: SceneView): js.Promise[Slide] = js.native
  def updateFrom(view: SceneView, options: SlideUpdateFromOptions): js.Promise[Slide] = js.native
}

@JSGlobal("__esri.Slide")
@js.native
object Slide extends TopLevel[SlideConstructor]

