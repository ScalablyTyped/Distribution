package typings.arcgisDashToDashGeojsonDashUtils

import typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod.Geometry
import typings.geojson.geojsonMod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arcgis-to-geojson-utils", JSImport.Namespace)
@js.native
object arcgisDashToDashGeojsonDashUtilsMod extends js.Object {
  def arcgisToGeoJSON[T /* <: Geometry */](arcgis: T): GeometryObject = js.native
  def geojsonToArcGIS(geojson: GeometryObject): Geometry = js.native
}

