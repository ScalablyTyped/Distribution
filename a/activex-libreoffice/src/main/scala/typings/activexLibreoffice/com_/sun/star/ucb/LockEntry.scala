package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines the types of locks that can be used with a resource. */
trait LockEntry extends StObject {
  
  /** defines the lock's scope. */
  var Scope: LockScope
  
  /** defines the type of the lock. */
  var Type: LockType
}
object LockEntry {
  
  @scala.inline
  def apply(Scope: LockScope, Type: LockType): LockEntry = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockEntry]
  }
  
  @scala.inline
  implicit class LockEntryMutableBuilder[Self <: LockEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: LockScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LockType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
