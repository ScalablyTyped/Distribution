package typings.atom.anon

import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintainHistory extends StObject {
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object MaintainHistory {
  
  @scala.inline
  def apply(): MaintainHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintainHistory]
  }
  
  @scala.inline
  implicit class MaintainHistoryMutableBuilder[Self <: MaintainHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    @scala.inline
    def setMaintainHistory(value: Boolean): Self = StObject.set(x, "maintainHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainHistoryUndefined: Self = StObject.set(x, "maintainHistory", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
