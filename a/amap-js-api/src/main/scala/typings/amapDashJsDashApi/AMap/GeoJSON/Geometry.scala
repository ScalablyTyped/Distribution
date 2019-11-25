package typings.amapDashJsDashApi.AMap.GeoJSON

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.GeometryCollection
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.LineString
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiLineString
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPoint
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.MultiPolygon
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApi.Anon_Coordinates
  - typings.amapDashJsDashApi.Anon_CoordinatesLineString
  - typings.amapDashJsDashApi.Anon_CoordinatesMultiLineString
  - typings.amapDashJsDashApi.Anon_Geometries
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def Anon_Coordinates(coordinates: js.Tuple2[Double, Double], `type`: Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Anon_CoordinatesLineString(
    coordinates: js.Array[js.Tuple2[Double, Double]],
    `type`: MultiPoint | LineString | typings.amapDashJsDashApi.amapDashJsDashApiStrings.Polygon
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Anon_CoordinatesMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Anon_Geometries(
    geometries: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
    ],
    `type`: GeometryCollection
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

