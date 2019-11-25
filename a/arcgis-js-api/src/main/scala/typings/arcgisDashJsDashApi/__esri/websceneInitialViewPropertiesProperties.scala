package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait websceneInitialViewPropertiesProperties extends js.Object {
  /**
    * The initial environment settings of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment)
    */
  var environment: js.UndefOr[EnvironmentProperties] = js.undefined
  /**
    * The spatial reference of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html). This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) the following [supported coordinate systems](esri-views-SceneView.html#supported-coordinate-systems) are available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The viewing mode of the scene. Global scenes allow the user to navigate the globe. Local scenes allow for navigation and feature display in a particular "localized" area. Users may also navigate the view's camera below the surface of a basemap in local scenes.  **Possible Values:** global | local
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode)
    *
    * @default global
    */
  var viewingMode: js.UndefOr[String] = js.undefined
  /**
    * The initial viewpoint of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}

object websceneInitialViewPropertiesProperties {
  @scala.inline
  def apply(
    environment: EnvironmentProperties = null,
    spatialReference: SpatialReferenceProperties = null,
    viewingMode: String = null,
    viewpoint: ViewpointProperties = null
  ): websceneInitialViewPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (viewingMode != null) __obj.updateDynamic("viewingMode")(viewingMode.asInstanceOf[js.Any])
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[websceneInitialViewPropertiesProperties]
  }
}

