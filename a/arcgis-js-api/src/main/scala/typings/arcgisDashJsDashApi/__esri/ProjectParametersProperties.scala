package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectParametersProperties extends js.Object {
  /**
    * The input geometries to project.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSR)
    */
  var outSR: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * Indicates whether to transform forward or not. The forward or reverse direction of transformation is implied in the name of the transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward)
    */
  var transformForward: js.UndefOr[Boolean] = js.undefined
  /**
    * The well-known id {wkid:number} or well-known text {wkt:string} of the datum transformation to be applied to the projected geometries. See [Datum transformations](https://developers.arcgis.com/rest/services-reference/datum-transformations.htm) for a list of valid datum transformations that may be used here.  If a transformation is specified, a value must also be specified in the [transformForward](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var transformation: js.UndefOr[ProjectParametersTransformation] = js.undefined
}

object ProjectParametersProperties {
  @scala.inline
  def apply(
    geometries: js.Array[GeometryProperties] = null,
    outSR: SpatialReferenceProperties = null,
    outSpatialReference: SpatialReferenceProperties = null,
    transformForward: js.UndefOr[Boolean] = js.undefined,
    transformation: ProjectParametersTransformation = null
  ): ProjectParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (outSR != null) __obj.updateDynamic("outSR")(outSR.asInstanceOf[js.Any])
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference.asInstanceOf[js.Any])
    if (!js.isUndefined(transformForward)) __obj.updateDynamic("transformForward")(transformForward.asInstanceOf[js.Any])
    if (transformation != null) __obj.updateDynamic("transformation")(transformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectParametersProperties]
  }
}

