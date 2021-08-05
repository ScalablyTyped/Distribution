package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDomTokenList extends StObject {
  
  def add(token: String): Unit
  
  def remove(token: String): Unit
}
object RDomTokenList {
  
  inline def apply(add: String => Unit, remove: String => Unit): RDomTokenList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[RDomTokenList]
  }
  
  extension [Self <: RDomTokenList](x: Self) {
    
    inline def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
