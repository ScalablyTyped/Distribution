package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overflow extends StObject {
  
  var overflow: String
}
object Overflow {
  
  @scala.inline
  def apply(overflow: String): Overflow = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overflow]
  }
  
  @scala.inline
  implicit class OverflowMutableBuilder[Self <: Overflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
