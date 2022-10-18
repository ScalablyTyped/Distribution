package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePhoneNumbersResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberInformationList] = js.undefined
}
object DescribePhoneNumbersResult {
  
  inline def apply(): DescribePhoneNumbersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePhoneNumbersResult]
  }
  
  extension [Self <: DescribePhoneNumbersResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumberInformationList): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumberInformation*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
  }
}
