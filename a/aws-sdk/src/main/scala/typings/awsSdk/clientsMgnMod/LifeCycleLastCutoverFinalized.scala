package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastCutoverFinalized extends StObject {
  
  /**
    * Lifecycle Cutover finalized date and time.
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object LifeCycleLastCutoverFinalized {
  
  inline def apply(): LifeCycleLastCutoverFinalized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastCutoverFinalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycleLastCutoverFinalized] (val x: Self) extends AnyVal {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
  }
}
