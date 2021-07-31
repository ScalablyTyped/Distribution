package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGeoposition extends StObject {
  
  @JSName("MSHTML.WebGeoposition_typekey")
  var MSHTMLDotWebGeoposition_typekey: WebGeoposition
  
  val coords: IWebGeocoordinates
  
  val timeStamp: Double
}
object WebGeoposition {
  
  @scala.inline
  def apply(MSHTMLDotWebGeoposition_typekey: WebGeoposition, coords: IWebGeocoordinates, timeStamp: Double): WebGeoposition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeoposition_typekey")(MSHTMLDotWebGeoposition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeoposition]
  }
  
  @scala.inline
  implicit class WebGeopositionMutableBuilder[Self <: WebGeoposition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: IWebGeocoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotWebGeoposition_typekey(value: WebGeoposition): Self = StObject.set(x, "MSHTML.WebGeoposition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
