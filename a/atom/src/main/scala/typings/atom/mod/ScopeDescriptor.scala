package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeDescriptor extends StObject {
  
  /** Returns all scopes for this descriptor. */
  def getScopesArray(): js.Array[String] = js.native
}
object ScopeDescriptor {
  
  @scala.inline
  def apply(getScopesArray: () => js.Array[String]): ScopeDescriptor = {
    val __obj = js.Dynamic.literal(getScopesArray = js.Any.fromFunction0(getScopesArray))
    __obj.asInstanceOf[ScopeDescriptor]
  }
  
  @scala.inline
  implicit class ScopeDescriptorMutableBuilder[Self <: ScopeDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetScopesArray(value: () => js.Array[String]): Self = StObject.set(x, "getScopesArray", js.Any.fromFunction0(value))
  }
}
