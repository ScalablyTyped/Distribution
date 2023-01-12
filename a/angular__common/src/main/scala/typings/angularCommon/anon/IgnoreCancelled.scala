package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreCancelled extends StObject {
  
  var ignoreCancelled: js.UndefOr[Boolean] = js.undefined
}
object IgnoreCancelled {
  
  inline def apply(): IgnoreCancelled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreCancelled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreCancelled] (val x: Self) extends AnyVal {
    
    inline def setIgnoreCancelled(value: Boolean): Self = StObject.set(x, "ignoreCancelled", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCancelledUndefined: Self = StObject.set(x, "ignoreCancelled", js.undefined)
  }
}
