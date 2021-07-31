package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persistent extends StObject {
  
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object Persistent {
  
  @scala.inline
  def apply(): Persistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Persistent]
  }
  
  @scala.inline
  implicit class PersistentMutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaintainHistory(value: Boolean): Self = StObject.set(x, "maintainHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainHistoryUndefined: Self = StObject.set(x, "maintainHistory", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}
