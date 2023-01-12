package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeywordsForDataSourceResponse extends StObject {
  
  /**
    *  The list of keywords for the event mapping source. 
    */
  var keywords: js.UndefOr[Keywords] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListKeywordsForDataSourceResponse {
  
  inline def apply(): ListKeywordsForDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeywordsForDataSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeywordsForDataSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setKeywords(value: Keywords): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: KeywordValue*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
