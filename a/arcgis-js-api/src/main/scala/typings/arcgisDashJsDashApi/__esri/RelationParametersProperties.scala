package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`interior-intersection`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`line-coincidence`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`line-touch`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`point-touch`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cross
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disjoint
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.in_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.intersection
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.overlap
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.relation
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.touch
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationParametersProperties extends js.Object {
  /**
    * The first array of geometries to compute the relation. The structure of each geometry in the array is same as the structure of the json geometry objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  /**
    * The second array of geometries to compute the relation. The structure of each geometry in the array is same as the structure of the json geometry objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
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
  var relation: js.UndefOr[
    cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.relation | touch | within
  ] = js.undefined
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`. The [Relational functions for ST_Geometry](https://desktop.arcgis.com/en/arcmap/latest/manage-data/using-sql-with-gdbs/relational-functions-for-st-geometry.htm) topic has additional details. An example of a valid string is: `FFFTTT**`. Also see the description of [geometryEngine.relate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#relate) for additional examples of valid strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: js.UndefOr[String] = js.undefined
}

object RelationParametersProperties {
  @scala.inline
  def apply(
    geometries1: js.Array[GeometryProperties] = null,
    geometries2: js.Array[GeometryProperties] = null,
    relation: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | relation | touch | within = null,
    relationParameter: String = null
  ): RelationParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (geometries1 != null) __obj.updateDynamic("geometries1")(geometries1.asInstanceOf[js.Any])
    if (geometries2 != null) __obj.updateDynamic("geometries2")(geometries2.asInstanceOf[js.Any])
    if (relation != null) __obj.updateDynamic("relation")(relation.asInstanceOf[js.Any])
    if (relationParameter != null) __obj.updateDynamic("relationParameter")(relationParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationParametersProperties]
  }
}

