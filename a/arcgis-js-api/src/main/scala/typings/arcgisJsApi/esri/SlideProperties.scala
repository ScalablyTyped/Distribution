package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var basemap: js.UndefOr[BasemapProperties | String] = js.native
  /**
    * The description of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#description)
    */
  var description: js.UndefOr[SlideDescriptionProperties | String] = js.native
  /**
    * Represents settings that affect the environment in which the WebScene is displayed (such as lighting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
    */
  var environment: js.UndefOr[EnvironmentProperties] = js.native
  /**
    * Ground properties for this slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
    */
  var ground: js.UndefOr[SlideGroundProperties] = js.native
  /**
    * The unique id of a slide within the [slides property](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html#slides) of a [Presentation](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#id)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A data URI encoded thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#thumbnail)
    */
  var thumbnail: js.UndefOr[SlideThumbnailProperties | String] = js.native
  /**
    * The title of the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var title: js.UndefOr[SlideTitleProperties | String] = js.native
  /**
    * The viewpoint of the slide. This acts like a bookmark, saving a predefined location or point of view from which to view the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
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
  var visibleLayers: js.UndefOr[CollectionProperties[SlideVisibleLayersProperties]] = js.native
}

object SlideProperties {
  @scala.inline
  def apply(): SlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideProperties]
  }
  @scala.inline
  implicit class SlidePropertiesOps[Self <: SlideProperties] (val x: Self) extends AnyVal {
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
    def setBasemap(value: BasemapProperties | String): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setDescription(value: SlideDescriptionProperties | String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnvironment(value: EnvironmentProperties): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setGround(value: SlideGroundProperties): Self = this.set("ground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGround: Self = this.set("ground", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setThumbnail(value: SlideThumbnailProperties | String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setTitle(value: SlideTitleProperties | String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = this.set("viewpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewpoint: Self = this.set("viewpoint", js.undefined)
    @scala.inline
    def setVisibleLayersVarargs(value: SlideVisibleLayersProperties*): Self = this.set("visibleLayers", js.Array(value :_*))
    @scala.inline
    def setVisibleLayers(value: CollectionProperties[SlideVisibleLayersProperties]): Self = this.set("visibleLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleLayers: Self = this.set("visibleLayers", js.undefined)
  }
  
}

