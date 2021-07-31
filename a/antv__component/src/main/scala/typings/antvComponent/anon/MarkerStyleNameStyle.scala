package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerStyleNameStyle extends StObject {
  
  var markerStyle: OpacityNumber
  
  var nameStyle: FillString
}
object MarkerStyleNameStyle {
  
  @scala.inline
  def apply(markerStyle: OpacityNumber, nameStyle: FillString): MarkerStyleNameStyle = {
    val __obj = js.Dynamic.literal(markerStyle = markerStyle.asInstanceOf[js.Any], nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerStyleNameStyle]
  }
  
  @scala.inline
  implicit class MarkerStyleNameStyleMutableBuilder[Self <: MarkerStyleNameStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkerStyle(value: OpacityNumber): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameStyle(value: FillString): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
  }
}
