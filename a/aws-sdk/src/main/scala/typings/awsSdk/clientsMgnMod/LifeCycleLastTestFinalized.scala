package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastTestFinalized extends StObject {
  
  /**
    * Lifecycle Test failed API call date and time.
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object LifeCycleLastTestFinalized {
  
  inline def apply(): LifeCycleLastTestFinalized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastTestFinalized]
  }
  
  extension [Self <: LifeCycleLastTestFinalized](x: Self) {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
  }
}
