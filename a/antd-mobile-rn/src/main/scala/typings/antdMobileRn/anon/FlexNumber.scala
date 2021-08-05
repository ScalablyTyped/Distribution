package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexNumber extends StObject {
  
  var flex: Double
}
object FlexNumber {
  
  inline def apply(flex: Double): FlexNumber = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexNumber]
  }
  
  extension [Self <: FlexNumber](x: Self) {
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
  }
}
