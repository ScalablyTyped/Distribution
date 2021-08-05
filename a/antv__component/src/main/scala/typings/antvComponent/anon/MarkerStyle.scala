package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerStyle extends StObject {
  
  var markerStyle: FillStroke
  
  var nameStyle: FillString
}
object MarkerStyle {
  
  inline def apply(markerStyle: FillStroke, nameStyle: FillString): MarkerStyle = {
    val __obj = js.Dynamic.literal(markerStyle = markerStyle.asInstanceOf[js.Any], nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerStyle]
  }
  
  extension [Self <: MarkerStyle](x: Self) {
    
    inline def setMarkerStyle(value: FillStroke): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    inline def setNameStyle(value: FillString): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
  }
}
