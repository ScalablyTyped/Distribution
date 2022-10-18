package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersOptedOutInput extends StObject {
  
  /**
    * A NextToken string is used when you call the ListPhoneNumbersOptedOut action to retrieve additional records that are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.undefined
}
object ListPhoneNumbersOptedOutInput {
  
  inline def apply(): ListPhoneNumbersOptedOutInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersOptedOutInput]
  }
  
  extension [Self <: ListPhoneNumbersOptedOutInput](x: Self) {
    
    inline def setNextToken(value: java.lang.String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
