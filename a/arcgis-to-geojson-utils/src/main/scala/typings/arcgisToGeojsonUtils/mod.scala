package typings.arcgisToGeojsonUtils

import typings.arcgisRestApi.mod.Geometry
import typings.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("arcgis-to-geojson-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def arcgisToGeoJSON[T /* <: Geometry */](arcgis: T): GeometryObject = js.native
  
  def geojsonToArcGIS(geojson: GeometryObject): Geometry = js.native
}
