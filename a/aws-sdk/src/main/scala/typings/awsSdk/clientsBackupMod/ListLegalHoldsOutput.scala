package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLegalHoldsOutput extends StObject {
  
  /**
    * This is an array of returned legal holds, both active and previous.
    */
  var LegalHolds: js.UndefOr[LegalHoldsList] = js.undefined
  
  /**
    * The next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLegalHoldsOutput {
  
  inline def apply(): ListLegalHoldsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLegalHoldsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLegalHoldsOutput] (val x: Self) extends AnyVal {
    
    inline def setLegalHolds(value: LegalHoldsList): Self = StObject.set(x, "LegalHolds", value.asInstanceOf[js.Any])
    
    inline def setLegalHoldsUndefined: Self = StObject.set(x, "LegalHolds", js.undefined)
    
    inline def setLegalHoldsVarargs(value: LegalHold*): Self = StObject.set(x, "LegalHolds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
