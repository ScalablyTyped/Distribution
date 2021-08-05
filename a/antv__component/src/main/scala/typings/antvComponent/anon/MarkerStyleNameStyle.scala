package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerStyleNameStyle extends StObject {
  
  var markerStyle: OpacityNumber
  
  var nameStyle: FillString
}
object MarkerStyleNameStyle {
  
  inline def apply(markerStyle: OpacityNumber, nameStyle: FillString): MarkerStyleNameStyle = {
    val __obj = js.Dynamic.literal(markerStyle = markerStyle.asInstanceOf[js.Any], nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerStyleNameStyle]
  }
  
  extension [Self <: MarkerStyleNameStyle](x: Self) {
    
    inline def setMarkerStyle(value: OpacityNumber): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    inline def setNameStyle(value: FillString): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
  }
}
