package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RDomTokenList extends StObject {
  
  def add(token: String): Unit = js.native
  
  def remove(token: String): Unit = js.native
}
object RDomTokenList {
  
  @scala.inline
  def apply(add: String => Unit, remove: String => Unit): RDomTokenList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[RDomTokenList]
  }
  
  @scala.inline
  implicit class RDomTokenListMutableBuilder[Self <: RDomTokenList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
