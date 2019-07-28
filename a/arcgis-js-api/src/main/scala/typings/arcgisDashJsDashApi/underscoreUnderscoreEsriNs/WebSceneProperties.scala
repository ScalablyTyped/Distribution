package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneProperties extends MapProperties {
  /**
    * Configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[ApplicationPropertiesProperties] = js.undefined
  /**
    * *This property only applies to local scenes.* Represents an optional clipping area used to define the bounds or [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene. If defined, only data (including the basemap) within the area will be displayed.  Set the [clippingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled) property to `true` to apply the specified clippingArea to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * *This property only applies to local scenes.* Determines whether clipping using the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea) is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    *
    * @default false
    */
  var clippingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The height model info of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html). This object defines the characteristics of the vertical coordinate system used by the scene. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), the height model info is used to avoid combining layers that have incompatible vertical coordinate systems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#heightModelInfo)
    */
  var heightModelInfo: js.UndefOr[HeightModelInfoProperties] = js.undefined
  /**
    * The initial view of the WebScene. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference), [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode), and [environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment) that should be applied to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the scene loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[websceneInitialViewPropertiesProperties] = js.undefined
  /**
    * The portal item from which the WebScene is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * Provides a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of slides that act as bookmarks for saving predefined [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) and visible layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation)
    */
  var presentation: js.UndefOr[PresentationProperties] = js.undefined
  /**
    * The URL to the thumbnail used for the web scene. The thumbnail will by default be the thumbnail URL from the portal item associated to the web scene. The thumbnail of the web scene may be updated by changing the thumbnail URL and saving the web scene. Use #updateFrom to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
}

object WebSceneProperties {
  @scala.inline
  def apply(
    applicationProperties: ApplicationPropertiesProperties = null,
    basemap: BasemapProperties | String = null,
    clippingArea: ExtentProperties = null,
    clippingEnabled: js.UndefOr[Boolean] = js.undefined,
    ground: GroundProperties | String = null,
    heightModelInfo: HeightModelInfoProperties = null,
    initialViewProperties: websceneInitialViewPropertiesProperties = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null,
    portalItem: PortalItemProperties = null,
    presentation: PresentationProperties = null,
    thumbnailUrl: String = null
  ): WebSceneProperties = {
    val __obj = js.Dynamic.literal()
    if (applicationProperties != null) __obj.updateDynamic("applicationProperties")(applicationProperties)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (clippingArea != null) __obj.updateDynamic("clippingArea")(clippingArea)
    if (!js.isUndefined(clippingEnabled)) __obj.updateDynamic("clippingEnabled")(clippingEnabled)
    if (ground != null) __obj.updateDynamic("ground")(ground.asInstanceOf[js.Any])
    if (heightModelInfo != null) __obj.updateDynamic("heightModelInfo")(heightModelInfo)
    if (initialViewProperties != null) __obj.updateDynamic("initialViewProperties")(initialViewProperties)
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (presentation != null) __obj.updateDynamic("presentation")(presentation)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    __obj.asInstanceOf[WebSceneProperties]
  }
}

