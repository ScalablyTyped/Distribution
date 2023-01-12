package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLongTermPricingResult extends StObject {
  
  /**
    * Each LongTermPricingEntry object contains a status, ID, and other information about the LongTermPricing type. 
    */
  var LongTermPricingEntries: js.UndefOr[LongTermPricingEntryList] = js.undefined
  
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of returned ListLongTermPricing list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLongTermPricingResult {
  
  inline def apply(): ListLongTermPricingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLongTermPricingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLongTermPricingResult] (val x: Self) extends AnyVal {
    
    inline def setLongTermPricingEntries(value: LongTermPricingEntryList): Self = StObject.set(x, "LongTermPricingEntries", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingEntriesUndefined: Self = StObject.set(x, "LongTermPricingEntries", js.undefined)
    
    inline def setLongTermPricingEntriesVarargs(value: LongTermPricingListEntry*): Self = StObject.set(x, "LongTermPricingEntries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
