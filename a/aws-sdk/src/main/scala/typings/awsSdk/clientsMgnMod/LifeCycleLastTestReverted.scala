package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastTestReverted extends StObject {
  
  /**
    * Lifecycle last Test reverted API call date and time.
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object LifeCycleLastTestReverted {
  
  inline def apply(): LifeCycleLastTestReverted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastTestReverted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycleLastTestReverted] (val x: Self) extends AnyVal {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
  }
}
