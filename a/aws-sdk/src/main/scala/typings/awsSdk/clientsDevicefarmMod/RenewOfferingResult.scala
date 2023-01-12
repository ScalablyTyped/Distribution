package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewOfferingResult extends StObject {
  
  /**
    * Represents the status of the offering transaction for the renewal.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined
}
object RenewOfferingResult {
  
  inline def apply(): RenewOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenewOfferingResult] (val x: Self) extends AnyVal {
    
    inline def setOfferingTransaction(value: OfferingTransaction): Self = StObject.set(x, "offeringTransaction", value.asInstanceOf[js.Any])
    
    inline def setOfferingTransactionUndefined: Self = StObject.set(x, "offeringTransaction", js.undefined)
  }
}
