package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialMinutes extends StObject {
  
  /**
    * The number of free trial minutes remaining in the account.
    */
  var remaining: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of free trial minutes that the account started with.
    */
  var total: js.UndefOr[Double] = js.undefined
}
object TrialMinutes {
  
  inline def apply(): TrialMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialMinutes]
  }
  
  extension [Self <: TrialMinutes](x: Self) {
    
    inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
