package typings.antvDataSet

import typings.d3Geo.mod.ExtendedFeature
import typings.d3Geo.mod.GeoGeometryObjects
import typings.geojson.mod.GeoJsonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoMod {
  
  @js.native
  trait GeoApi extends StObject {
    
    def geoArea(feature: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = js.native
    
    def geoAreaByName(name: String): Double = js.native
    
    def geoCentroid(feature: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): js.Tuple2[Double, Double] = js.native
    
    def geoCentroidByName(name: String): js.Tuple2[Double, Double] = js.native
    
    def geoContains(
      feature: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties],
      position: js.Tuple2[Double, Double]
    ): Boolean = js.native
    
    def geoDistance(p1: js.Any, p2: js.Any): Double = js.native
    
    def geoFeatureByName(name: String): js.Any = js.native
    
    def geoFeatureByPosition(position: js.Tuple2[Double, Double]): js.Any = js.native
    
    def geoLength(feature: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = js.native
    
    def geoLengthByName(name: String): Double = js.native
    
    def geoNameByPosition(position: js.Tuple2[Double, Double]): js.Any = js.native
    
    def geoProject(feature: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties], projection: String): js.Any = js.native
    def geoProject(
      feature: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties],
      projection: String,
      exportRaw: Boolean
    ): js.Any = js.native
    
    def geoProjectByName(name: String, projection: String): js.Any = js.native
    def geoProjectByName(name: String, projection: String, exportRaw: Boolean): js.Any = js.native
    
    def geoProjectInvert(position: js.Tuple2[Double, Double], projection: String): js.Any = js.native
    def geoProjectInvert(position: js.Tuple2[Double, Double], projection: String, exportRaw: Boolean): js.Any = js.native
    
    def geoProjectPosition(position: js.Tuple2[Double, Double], projection: String): js.Any = js.native
    def geoProjectPosition(position: js.Tuple2[Double, Double], projection: String, exportRaw: Boolean): js.Any = js.native
    
    def getGeoProjection(projection: String): js.Any = js.native
    def getGeoProjection(projection: String, exportRaw: Boolean): js.Any = js.native
  }
}
