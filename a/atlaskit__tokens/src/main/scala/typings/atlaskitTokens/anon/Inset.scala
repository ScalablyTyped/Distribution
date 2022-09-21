package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inset extends StObject {
  
  var color: String
  
  var inset: Unit
  
  var offset: X
  
  var opacity: Double
  
  var radius: Double
  
  var spread: Unit
}
object Inset {
  
  inline def apply(color: String, inset: Unit, offset: X, opacity: Double, radius: Double, spread: Unit): Inset = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inset]
  }
  
  extension [Self <: Inset](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setInset(value: Unit): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Unit): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
  }
}
