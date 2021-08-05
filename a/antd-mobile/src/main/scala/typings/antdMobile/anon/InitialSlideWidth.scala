package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialSlideWidth extends StObject {
  
  var initialSlideWidth: Double
}
object InitialSlideWidth {
  
  inline def apply(initialSlideWidth: Double): InitialSlideWidth = {
    val __obj = js.Dynamic.literal(initialSlideWidth = initialSlideWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialSlideWidth]
  }
  
  extension [Self <: InitialSlideWidth](x: Self) {
    
    inline def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
  }
}
