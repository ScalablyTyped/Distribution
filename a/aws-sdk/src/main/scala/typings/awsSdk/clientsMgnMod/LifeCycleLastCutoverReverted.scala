package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastCutoverReverted extends StObject {
  
  /**
    * Lifecycle last Cutover reverted API call date time.
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object LifeCycleLastCutoverReverted {
  
  inline def apply(): LifeCycleLastCutoverReverted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastCutoverReverted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycleLastCutoverReverted] (val x: Self) extends AnyVal {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
  }
}
