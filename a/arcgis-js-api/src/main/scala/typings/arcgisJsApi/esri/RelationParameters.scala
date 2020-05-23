package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`interior-intersection`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-coincidence`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-touch`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-touch`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.disjoint
import typings.arcgisJsApi.arcgisJsApiStrings.in_
import typings.arcgisJsApi.arcgisJsApiStrings.intersection
import typings.arcgisJsApi.arcgisJsApiStrings.overlap
import typings.arcgisJsApi.arcgisJsApiStrings.touch
import typings.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationParameters
  extends Accessor
     with JSONSupport {
  /**
    * The first array of geometries to compute the relation. The structure of each geometry in the array is same as the structure of the json geometry objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.Array[Geometry_] = js.native
  /**
    * The second array of geometries to compute the relation. The structure of each geometry in the array is same as the structure of the json geometry objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.Array[Geometry_] = js.native
  /**
    * The spatial relationship to be tested between the two input geometry arrays. See table below for a list of possible values. If the relation is specified as `relation`, the `relationParameter` parameter describes the spatial relationship and must be specified.
    *
    * Value | Description
    * ------|------------
    * cross | Two polylines cross if they share only points in common, at least one of which is not an endpoint. A polyline and an polygon cross if they share a polyline in common on the interior of the polygon which is not equivalent to the entire polyline. Cross is a Clementini operator. If either one of the geometries is empty, the geometries do not cross.
    * disjoint | Two geometries are disjoint if their intersection is empty. Two geometries intersect if disjoint is "false".
    * in | The base geometry is within the comparison geometry if the base geometry is the intersection of the geometries and the intersection of their interiors is not empty. An empty geometry is within another geometry, unless the other geometry is empty.
    * interior-intersection | Geometries intersect excluding boundary touch.
    * intersection | Geometry interiors intersect or boundaries touch, same as 'not disjoint'.
    * line-coincidence | The boundaries of the geometries must share an intersection, but the relationship between the interiors of the shapes is not considered (they could overlap, one could be contained in the other, or their interiors could be disjoint). This relation applies to polylines and polygons.
    * line-touch | Two geometries are said to touch when the intersection of the geometries is non-empty, but the intersection of their interiors is empty. This evaluates if the touch occurs along a boundary (not a point). Valid for polygons.
    * overlap | Two polylines share a common sub-line, or two polygons share a common sub-area. Two geometries do not overlap if either one is empty.
    * point-touch | Two geometries are said to touch when the intersection of the geometries is non-empty, but the intersection of their interiors is empty. This evaluates if the touch occurs at a point (not a boundary).
    * relation | Allows specification of any relationship defined using the Shape Comparison Language. If this value is used, a value for `relationParameter` must be specified.
    * touch | The union of point touch and line touch. Two geometries are said to touch when the intersection of the geometries is non-empty, but the intersection of their interiors is empty. For example, a point touches a polyline only if the point is coincident with one of the polyline end points. If either one of the two geometries is empty, the geometries are not touched.
    * within | Same as `in` but also allows polylines that are strictly on the boundaries of polygons to be considered in the polygon.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relation)
    */
  var relation: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typings.arcgisJsApi.arcgisJsApiStrings.relation | touch | within = js.native
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`. The [Relational functions for ST_Geometry](https://desktop.arcgis.com/en/arcmap/latest/manage-data/using-sql-with-gdbs/relational-functions-for-st-geometry.htm) topic has additional details. An example of a valid string is: `FFFTTT**`. Also see the description of [geometryEngine.relate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#relate) for additional examples of valid strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: String = js.native
}

