package typings.activexLibreoffice.com_.sun.star.animations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuePair extends StObject {
  
  var First: js.Any = js.native
  
  var Second: js.Any = js.native
}
object ValuePair {
  
  @scala.inline
  def apply(First: js.Any, Second: js.Any): ValuePair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePair]
  }
  
  @scala.inline
  implicit class ValuePairMutableBuilder[Self <: ValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: js.Any): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: js.Any): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
  }
}
