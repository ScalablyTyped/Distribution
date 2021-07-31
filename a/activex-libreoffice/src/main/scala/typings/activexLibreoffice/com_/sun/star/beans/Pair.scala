package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tuple, or pair.
  *
  * This structure allows for conveniently packing together two values of any type, and could be useful as the result type of methods.
  * @since OOo 3.0
  */
trait Pair[T, U] extends StObject {
  
  var First: T
  
  var Second: U
}
object Pair {
  
  @scala.inline
  def apply[T, U](First: T, Second: U): Pair[T, U] = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair[T, U]]
  }
  
  @scala.inline
  implicit class PairMutableBuilder[Self <: Pair[?, ?], T, U] (val x: Self & (Pair[T, U])) extends AnyVal {
    
    @scala.inline
    def setFirst(value: T): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: U): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
  }
}
