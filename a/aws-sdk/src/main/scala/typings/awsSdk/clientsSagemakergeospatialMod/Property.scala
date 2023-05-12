package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  /**
    * The structure representing EoCloudCover property filter containing a lower bound and upper bound.
    */
  var EoCloudCover: js.UndefOr[EoCloudCoverInput] = js.undefined
  
  /**
    * The structure representing Land Cloud Cover property filter for Landsat collection containing a lower bound and upper bound.
    */
  var LandsatCloudCoverLand: js.UndefOr[LandsatCloudCoverLandInput] = js.undefined
  
  /**
    * The structure representing Platform property filter consisting of value and comparison operator.
    */
  var Platform: js.UndefOr[PlatformInput] = js.undefined
  
  /**
    * The structure representing ViewOffNadir property filter containing a lower bound and upper bound.
    */
  var ViewOffNadir: js.UndefOr[ViewOffNadirInput] = js.undefined
  
  /**
    * The structure representing ViewSunAzimuth property filter containing a lower bound and upper bound.
    */
  var ViewSunAzimuth: js.UndefOr[ViewSunAzimuthInput] = js.undefined
  
  /**
    * The structure representing ViewSunElevation property filter containing a lower bound and upper bound.
    */
  var ViewSunElevation: js.UndefOr[ViewSunElevationInput] = js.undefined
}
object Property {
  
  inline def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    inline def setEoCloudCover(value: EoCloudCoverInput): Self = StObject.set(x, "EoCloudCover", value.asInstanceOf[js.Any])
    
    inline def setEoCloudCoverUndefined: Self = StObject.set(x, "EoCloudCover", js.undefined)
    
    inline def setLandsatCloudCoverLand(value: LandsatCloudCoverLandInput): Self = StObject.set(x, "LandsatCloudCoverLand", value.asInstanceOf[js.Any])
    
    inline def setLandsatCloudCoverLandUndefined: Self = StObject.set(x, "LandsatCloudCoverLand", js.undefined)
    
    inline def setPlatform(value: PlatformInput): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setViewOffNadir(value: ViewOffNadirInput): Self = StObject.set(x, "ViewOffNadir", value.asInstanceOf[js.Any])
    
    inline def setViewOffNadirUndefined: Self = StObject.set(x, "ViewOffNadir", js.undefined)
    
    inline def setViewSunAzimuth(value: ViewSunAzimuthInput): Self = StObject.set(x, "ViewSunAzimuth", value.asInstanceOf[js.Any])
    
    inline def setViewSunAzimuthUndefined: Self = StObject.set(x, "ViewSunAzimuth", js.undefined)
    
    inline def setViewSunElevation(value: ViewSunElevationInput): Self = StObject.set(x, "ViewSunElevation", value.asInstanceOf[js.Any])
    
    inline def setViewSunElevationUndefined: Self = StObject.set(x, "ViewSunElevation", js.undefined)
  }
}
