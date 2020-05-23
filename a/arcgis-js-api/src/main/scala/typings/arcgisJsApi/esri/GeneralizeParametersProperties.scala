package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralizeParametersProperties extends js.Object {
  /**
    * The maximum deviation unit. If the unit is not specified, units are derived from the spatial reference. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#deviationUnit)
    */
  var deviationUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.undefined
  /**
    * The array of input geometries to generalize. All geometries in this array must be of the same geometry type (e.g. `esriGeometryPolyline` or `esriGeometryPolygon`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  /**
    * The maximum deviation for constructing a generalized geometry based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#maxDeviation)
    */
  var maxDeviation: js.UndefOr[Double] = js.undefined
}

object GeneralizeParametersProperties {
  @scala.inline
  def apply(
    deviationUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = null,
    geometries: js.Array[GeometryProperties] = null,
    maxDeviation: js.UndefOr[Double] = js.undefined
  ): GeneralizeParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (deviationUnit != null) __obj.updateDynamic("deviationUnit")(deviationUnit.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeviation)) __obj.updateDynamic("maxDeviation")(maxDeviation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralizeParametersProperties]
  }
}

