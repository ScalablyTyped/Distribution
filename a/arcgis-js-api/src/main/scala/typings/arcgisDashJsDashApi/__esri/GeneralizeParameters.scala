package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralizeParameters extends Accessor {
  /**
    * The maximum deviation unit. If the unit is not specified, units are derived from the spatial reference. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#deviationUnit)
    */
  var deviationUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  /**
    * The array of input geometries to generalize. All geometries in this array must be of the same geometry type (e.g. `esriGeometryPolyline` or `esriGeometryPolygon`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#geometries)
    */
  var geometries: js.Array[Geometry] = js.native
  /**
    * The maximum deviation for constructing a generalized geometry based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#maxDeviation)
    */
  var maxDeviation: Double = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GeneralizeParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.GeneralizeParameters")
@js.native
object GeneralizeParameters extends TopLevel[GeneralizeParametersConstructor]

