package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebGeocoordinates extends StObject {
  
  /* private */ @JSName("MSHTML.IWebGeocoordinates_typekey")
  var MSHTMLDotIWebGeocoordinates_typekey: IWebGeocoordinates
  
  val accuracy: Double
  
  val altitude: js.Any
  
  val altitudeAccuracy: js.Any
  
  val heading: js.Any
  
  val latitude: Double
  
  val longitude: Double
  
  val speed: js.Any
}
object IWebGeocoordinates {
  
  inline def apply(
    MSHTMLDotIWebGeocoordinates_typekey: IWebGeocoordinates,
    accuracy: Double,
    altitude: js.Any,
    altitudeAccuracy: js.Any,
    heading: js.Any,
    latitude: Double,
    longitude: Double,
    speed: js.Any
  ): IWebGeocoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IWebGeocoordinates_typekey")(MSHTMLDotIWebGeocoordinates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebGeocoordinates]
  }
  
  extension [Self <: IWebGeocoordinates](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: js.Any): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: js.Any): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: js.Any): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIWebGeocoordinates_typekey(value: IWebGeocoordinates): Self = StObject.set(x, "MSHTML.IWebGeocoordinates_typekey", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: js.Any): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
