package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceSchedule extends StObject {
  
  /**
    * The current price schedule, as determined by the term remaining for the Reserved Instance in the listing. A specific price schedule is always in effect, but only one price schedule can be active at any time. Take, for example, a Reserved Instance listing that has five months remaining in its term. When you specify price schedules for five months and two months, this means that schedule 1, covering the first three months of the remaining term, will be active during months 5, 4, and 3. Then schedule 2, covering the last two months of the term, will be active for months 2 and 1.
    */
  var Active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * The fixed price for the term.
    */
  var Price: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
    */
  var Term: js.UndefOr[Long] = js.undefined
}
object PriceSchedule {
  
  inline def apply(): PriceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceSchedule]
  }
  
  extension [Self <: PriceSchedule](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "Price", js.undefined)
    
    inline def setTerm(value: Long): Self = StObject.set(x, "Term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "Term", js.undefined)
  }
}
