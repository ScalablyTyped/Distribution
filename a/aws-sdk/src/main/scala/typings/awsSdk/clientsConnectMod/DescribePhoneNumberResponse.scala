package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePhoneNumberResponse extends StObject {
  
  /**
    * Information about a phone number that's been claimed to your Amazon Connect instance.
    */
  var ClaimedPhoneNumberSummary: js.UndefOr[typings.awsSdk.clientsConnectMod.ClaimedPhoneNumberSummary] = js.undefined
}
object DescribePhoneNumberResponse {
  
  inline def apply(): DescribePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePhoneNumberResponse]
  }
  
  extension [Self <: DescribePhoneNumberResponse](x: Self) {
    
    inline def setClaimedPhoneNumberSummary(value: ClaimedPhoneNumberSummary): Self = StObject.set(x, "ClaimedPhoneNumberSummary", value.asInstanceOf[js.Any])
    
    inline def setClaimedPhoneNumberSummaryUndefined: Self = StObject.set(x, "ClaimedPhoneNumberSummary", js.undefined)
  }
}
