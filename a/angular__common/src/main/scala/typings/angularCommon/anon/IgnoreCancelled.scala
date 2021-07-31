package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreCancelled extends StObject {
  
  var ignoreCancelled: js.UndefOr[Boolean] = js.undefined
}
object IgnoreCancelled {
  
  @scala.inline
  def apply(): IgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreCancelled]
  }
  
  @scala.inline
  implicit class IgnoreCancelledMutableBuilder[Self <: IgnoreCancelled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreCancelled(value: Boolean): Self = StObject.set(x, "ignoreCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCancelledUndefined: Self = StObject.set(x, "ignoreCancelled", js.undefined)
  }
}
