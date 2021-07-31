package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var r: Double
  
  var symbol: String
}
object R {
  
  @scala.inline
  def apply(r: Double, symbol: String): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
