package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reversed extends StObject {
  
  var reversed: Boolean
}
object Reversed {
  
  inline def apply(reversed: Boolean): Reversed = {
    val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reversed]
  }
  
  extension [Self <: Reversed](x: Self) {
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
  }
}
