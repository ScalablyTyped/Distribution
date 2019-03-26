package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectParameters extends Accessor {
  /**
    * The input geometries to project.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#geometries)
    */
  var geometries: js.Array[Geometry] = js.native
  /**
    * The spatial reference to which you are projecting the geometries. Use [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSpatialReference) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSR)
    */
  var outSR: SpatialReference = js.native
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * Indicates whether to transform forward or not. The forward or reverse direction of transformation is implied in the name of the transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward)
    */
  var transformForward: scala.Boolean = js.native
  /**
    * The well-known id {wkid:number} or well-known text {wkt:string} of the datum transformation to be applied to the projected geometries. See [Datum transformations](https://developers.arcgis.com/rest/services-reference/datum-transformations.htm) for a list of valid datum transformations that may be used here.  If a transformation is specified, a value must also be specified in the [transformForward](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var transformation: ProjectParametersTransformation = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.ProjectParameters")
@js.native
class ProjectParametersCls () extends ProjectParameters {
  def this(properties: ProjectParametersProperties) = this()
}

