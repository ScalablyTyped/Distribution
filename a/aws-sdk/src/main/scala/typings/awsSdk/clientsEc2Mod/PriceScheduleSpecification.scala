package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceScheduleSpecification extends StObject {
  
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
object PriceScheduleSpecification {
  
  inline def apply(): PriceScheduleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceScheduleSpecification]
  }
  
  extension [Self <: PriceScheduleSpecification](x: Self) {
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "Price", js.undefined)
    
    inline def setTerm(value: Long): Self = StObject.set(x, "Term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "Term", js.undefined)
  }
}
