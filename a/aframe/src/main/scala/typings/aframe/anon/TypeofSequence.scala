package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSequence extends StObject {
  
  /* static member */
  var _nextId: js.Any = js.native
  
  /* static member */
  def nextId(): Double = js.native
}
object TypeofSequence {
  
  @scala.inline
  def apply(_nextId: js.Any, nextId: () => Double): TypeofSequence = {
    val __obj = js.Dynamic.literal(_nextId = _nextId.asInstanceOf[js.Any], nextId = js.Any.fromFunction0(nextId))
    __obj.asInstanceOf[TypeofSequence]
  }
  
  @scala.inline
  implicit class TypeofSequenceMutableBuilder[Self <: TypeofSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextId(value: () => Double): Self = StObject.set(x, "nextId", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_nextId(value: js.Any): Self = StObject.set(x, "_nextId", value.asInstanceOf[js.Any])
  }
}
