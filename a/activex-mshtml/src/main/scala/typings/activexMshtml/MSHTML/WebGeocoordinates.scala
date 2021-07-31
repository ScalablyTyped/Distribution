package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGeocoordinates extends StObject {
  
  @JSName("MSHTML.WebGeocoordinates_typekey")
  var MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates
  
  val accuracy: Double
  
  val altitude: js.Any
  
  val altitudeAccuracy: js.Any
  
  val heading: js.Any
  
  val latitude: Double
  
  val longitude: Double
  
  val speed: js.Any
}
object WebGeocoordinates {
  
  @scala.inline
  def apply(
    MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates,
    accuracy: Double,
    altitude: js.Any,
    altitudeAccuracy: js.Any,
    heading: js.Any,
    latitude: Double,
    longitude: Double,
    speed: js.Any
  ): WebGeocoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeocoordinates_typekey")(MSHTMLDotWebGeocoordinates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeocoordinates]
  }
  
  @scala.inline
  implicit class WebGeocoordinatesMutableBuilder[Self <: WebGeocoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: js.Any): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: js.Any): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: js.Any): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotWebGeocoordinates_typekey(value: WebGeocoordinates): Self = StObject.set(x, "MSHTML.WebGeocoordinates_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: js.Any): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
