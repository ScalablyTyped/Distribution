package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  /**
    * Estimate of cloud cover.
    */
  var EoCloudCover: js.UndefOr[Float] = js.undefined
  
  /**
    * Land cloud cover for Landsat Data Collection.
    */
  var LandsatCloudCoverLand: js.UndefOr[Float] = js.undefined
  
  /**
    * Platform property. Platform refers to the unique name of the specific platform the instrument is attached to. For satellites it is the name of the satellite, eg. landsat-8 (Landsat-8), sentinel-2a.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The angle from the sensor between nadir (straight down) and the scene center. Measured in degrees (0-90).
    */
  var ViewOffNadir: js.UndefOr[Float] = js.undefined
  
  /**
    * The sun azimuth angle. From the scene center point on the ground, this is the angle between truth north and the sun. Measured clockwise in degrees (0-360).
    */
  var ViewSunAzimuth: js.UndefOr[Float] = js.undefined
  
  /**
    * The sun elevation angle. The angle from the tangent of the scene center point to the sun. Measured from the horizon in degrees (-90-90). Negative values indicate the sun is below the horizon, e.g. sun elevation of -10° means the data was captured during nautical twilight.
    */
  var ViewSunElevation: js.UndefOr[Float] = js.undefined
}
object Properties {
  
  inline def apply(): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    inline def setEoCloudCover(value: Float): Self = StObject.set(x, "EoCloudCover", value.asInstanceOf[js.Any])
    
    inline def setEoCloudCoverUndefined: Self = StObject.set(x, "EoCloudCover", js.undefined)
    
    inline def setLandsatCloudCoverLand(value: Float): Self = StObject.set(x, "LandsatCloudCoverLand", value.asInstanceOf[js.Any])
    
    inline def setLandsatCloudCoverLandUndefined: Self = StObject.set(x, "LandsatCloudCoverLand", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setViewOffNadir(value: Float): Self = StObject.set(x, "ViewOffNadir", value.asInstanceOf[js.Any])
    
    inline def setViewOffNadirUndefined: Self = StObject.set(x, "ViewOffNadir", js.undefined)
    
    inline def setViewSunAzimuth(value: Float): Self = StObject.set(x, "ViewSunAzimuth", value.asInstanceOf[js.Any])
    
    inline def setViewSunAzimuthUndefined: Self = StObject.set(x, "ViewSunAzimuth", js.undefined)
    
    inline def setViewSunElevation(value: Float): Self = StObject.set(x, "ViewSunElevation", value.asInstanceOf[js.Any])
    
    inline def setViewSunElevationUndefined: Self = StObject.set(x, "ViewSunElevation", js.undefined)
  }
}
