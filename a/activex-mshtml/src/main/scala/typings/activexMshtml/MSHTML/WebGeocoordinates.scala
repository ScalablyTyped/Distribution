package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGeocoordinates extends StObject {
  
  /* private */ @JSName("MSHTML.WebGeocoordinates_typekey")
  var MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates
  
  val accuracy: Double
  
  val altitude: Any
  
  val altitudeAccuracy: Any
  
  val heading: Any
  
  val latitude: Double
  
  val longitude: Double
  
  val speed: Any
}
object WebGeocoordinates {
  
  inline def apply(
    MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates,
    accuracy: Double,
    altitude: Any,
    altitudeAccuracy: Any,
    heading: Any,
    latitude: Double,
    longitude: Double,
    speed: Any
  ): WebGeocoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeocoordinates_typekey")(MSHTMLDotWebGeocoordinates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeocoordinates]
  }
  
  extension [Self <: WebGeocoordinates](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: Any): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Any): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Any): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotWebGeocoordinates_typekey(value: WebGeocoordinates): Self = StObject.set(x, "MSHTML.WebGeocoordinates_typekey", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Any): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
