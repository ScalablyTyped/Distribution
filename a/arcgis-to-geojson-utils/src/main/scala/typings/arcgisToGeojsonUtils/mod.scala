package typings.arcgisToGeojsonUtils

import typings.arcgisRestApi.mod.Geometry
import typings.geojson.mod.GeometryObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("arcgis-to-geojson-utils", "arcgisToGeoJSON")
  @js.native
  def arcgisToGeoJSON[T /* <: Geometry */](arcgis: T): GeometryObject = js.native
  
  @JSImport("arcgis-to-geojson-utils", "geojsonToArcGIS")
  @js.native
  def geojsonToArcGIS(geojson: GeometryObject): Geometry = js.native
}
