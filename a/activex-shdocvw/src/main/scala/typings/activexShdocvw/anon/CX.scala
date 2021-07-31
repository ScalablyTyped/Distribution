package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CX extends StObject {
  
  var CX: Double
  
  var CY: Double
}
object CX {
  
  @scala.inline
  def apply(CX: Double, CY: Double): CX = {
    val __obj = js.Dynamic.literal(CX = CX.asInstanceOf[js.Any], CY = CY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CX]
  }
  
  @scala.inline
  implicit class CXMutableBuilder[Self <: CX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCX(value: Double): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCY(value: Double): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
  }
}
