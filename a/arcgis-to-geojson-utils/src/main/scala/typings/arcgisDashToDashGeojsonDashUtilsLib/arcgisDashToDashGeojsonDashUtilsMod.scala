package typings
package arcgisDashToDashGeojsonDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arcgis-to-geojson-utils", JSImport.Namespace)
@js.native
object arcgisDashToDashGeojsonDashUtilsMod extends js.Object {
  def arcgisToGeoJSON[T /* <: arcgisDashRestDashApiLib.arcgisDashRestDashApiMod.Geometry */](arcgis: T): geojsonLib.geojsonMod.GeometryObject = js.native
  def geojsonToArcGIS(geojson: geojsonLib.geojsonMod.GeometryObject): arcgisDashRestDashApiLib.arcgisDashRestDashApiMod.Geometry = js.native
}

