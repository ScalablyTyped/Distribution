package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProperties extends js.Object {
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
  var basemap: js.UndefOr[BasemapProperties | String] = js.undefined
  /**
    * The description of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#description)
    */
  var description: js.UndefOr[SlideDescriptionProperties | String] = js.undefined
  /**
    * Represents settings that affect the environment in which the WebScene is displayed (such as lighting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
    */
  var environment: js.UndefOr[EnvironmentProperties] = js.undefined
  /**
    * Ground properties for this slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
    */
  var ground: js.UndefOr[SlideGroundProperties] = js.undefined
  /**
    * The unique id of a slide within the [slides property](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) of a [Presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A data URI encoded thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
    */
  var thumbnail: js.UndefOr[SlideThumbnailProperties | String] = js.undefined
  /**
    * The title of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var title: js.UndefOr[SlideTitleProperties | String] = js.undefined
  /**
    * The viewpoint of the slide. This acts like a bookmark, saving a predefined location or point of view from which to view the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
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
  var visibleLayers: js.UndefOr[CollectionProperties[SlideVisibleLayersProperties]] = js.undefined
}

object SlideProperties {
  @scala.inline
  def apply(
    basemap: BasemapProperties | String = null,
    description: SlideDescriptionProperties | String = null,
    environment: EnvironmentProperties = null,
    ground: SlideGroundProperties = null,
    id: String = null,
    thumbnail: SlideThumbnailProperties | String = null,
    title: SlideTitleProperties | String = null,
    viewpoint: ViewpointProperties = null,
    visibleLayers: CollectionProperties[SlideVisibleLayersProperties] = null
  ): SlideProperties = {
    val __obj = js.Dynamic.literal()
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (ground != null) __obj.updateDynamic("ground")(ground)
    if (id != null) __obj.updateDynamic("id")(id)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint)
    if (visibleLayers != null) __obj.updateDynamic("visibleLayers")(visibleLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideProperties]
  }
}

