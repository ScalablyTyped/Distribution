package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure is used to specify the height of a text line.
  * @see LineSpacingMode
  */
trait LineSpacing extends StObject {
  
  /** This value specifies the height in regard to **Mode** . */
  var Height: Double
  
  /** This value specifies the way the height is specified. */
  var Mode: Double
}
object LineSpacing {
  
  inline def apply(Height: Double, Mode: Double): LineSpacing = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSpacing]
  }
  
  extension [Self <: LineSpacing](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
