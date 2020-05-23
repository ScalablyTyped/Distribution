package typings.amapJsApi.AMap.GeoJSON

import typings.amapJsApi.amapJsApiStrings.GeometryCollection
import typings.amapJsApi.amapJsApiStrings.LineString
import typings.amapJsApi.amapJsApiStrings.MultiLineString
import typings.amapJsApi.amapJsApiStrings.MultiPoint
import typings.amapJsApi.amapJsApiStrings.MultiPolygon
import typings.amapJsApi.amapJsApiStrings.Point
import typings.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.anon.Coordinates
  - typings.amapJsApi.anon.CoordinatesType
  - typings.amapJsApi.anon.CoordinatesArray
  - typings.amapJsApi.anon.Geometries
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def Coordinates(coordinates: js.Tuple2[Double, Double], `type`: Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def CoordinatesType(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def CoordinatesArray(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Geometries(
    geometries: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
    ],
    `type`: GeometryCollection
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

