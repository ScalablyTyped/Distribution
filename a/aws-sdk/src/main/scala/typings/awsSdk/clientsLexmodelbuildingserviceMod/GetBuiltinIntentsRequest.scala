package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBuiltinIntentsRequest extends StObject {
  
  /**
    * A list of locales that the intent supports.
    */
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * The maximum number of intents to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, use the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signatureContains: js.UndefOr[String] = js.undefined
}
object GetBuiltinIntentsRequest {
  
  inline def apply(): GetBuiltinIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentsRequest]
  }
  
  extension [Self <: GetBuiltinIntentsRequest](x: Self) {
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSignatureContains(value: String): Self = StObject.set(x, "signatureContains", value.asInstanceOf[js.Any])
    
    inline def setSignatureContainsUndefined: Self = StObject.set(x, "signatureContains", js.undefined)
  }
}
