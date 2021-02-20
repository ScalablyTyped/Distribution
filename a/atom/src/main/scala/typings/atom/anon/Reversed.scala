package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reversed extends StObject {
  
  var reversed: Boolean = js.native
}
object Reversed {
  
  @scala.inline
  def apply(reversed: Boolean): Reversed = {
    val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reversed]
  }
  
  @scala.inline
  implicit class ReversedMutableBuilder[Self <: Reversed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
  }
}
