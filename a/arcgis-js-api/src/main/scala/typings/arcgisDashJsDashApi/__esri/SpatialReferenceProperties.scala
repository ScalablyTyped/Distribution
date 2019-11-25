package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceProperties extends js.Object {
  /**
    * An [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) defines the spatial reference used to display the image in its original coordinates without distortion, map transformations or ortho-rectification. Typically, [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) is displayed in the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReference) of the view. In some cases, converting images into map coordinates can cause your images to look skewed or distorted because of the various transformations and terrain corrections that are used. Since there is no distortion with images in the image coordinate system, it is ideal for using with oblique imagery and mensuration.  The image can be displayed in its original coordinates only in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) with a `top-up`rotation which is always oriented in the look of direction of the dataset. This works similarly to an in-car navigation system where the choices are often either north is at the top of the screen (therefore, not using a top up option) or the screen rotates so the travel direction is always displayed at the top.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#imageCoordinateSystem)
    */
  var imageCoordinateSystem: js.UndefOr[js.Any] = js.undefined
  /**
    * The well-known ID of a spatial reference. See [Projected Coordinate Systems](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) and [Geographic Coordinate Systems](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) for the list of supported spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid)
    */
  var wkid: js.UndefOr[Double] = js.undefined
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt)
    */
  var wkt: js.UndefOr[String] = js.undefined
}

object SpatialReferenceProperties {
  @scala.inline
  def apply(imageCoordinateSystem: js.Any = null, wkid: Int | Double = null, wkt: String = null): SpatialReferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (imageCoordinateSystem != null) __obj.updateDynamic("imageCoordinateSystem")(imageCoordinateSystem.asInstanceOf[js.Any])
    if (wkid != null) __obj.updateDynamic("wkid")(wkid.asInstanceOf[js.Any])
    if (wkt != null) __obj.updateDynamic("wkt")(wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceProperties]
  }
}

