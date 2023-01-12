package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSMSSandboxPhoneNumbersInput extends StObject {
  
  /**
    * The maximum number of phone numbers to return.
    */
  var MaxResults: js.UndefOr[MaxItems] = js.undefined
  
  /**
    * Token that the previous ListSMSSandboxPhoneNumbersInput request returns.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
}
object ListSMSSandboxPhoneNumbersInput {
  
  inline def apply(): ListSMSSandboxPhoneNumbersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSMSSandboxPhoneNumbersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSMSSandboxPhoneNumbersInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxItems): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
