package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account. 
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    *  The ID of the requested insight. 
    */
  var InsightId: typings.awsSdk.clientsDevopsguruMod.InsightId
  
  /**
    * A locale that specifies the language to use for recommendations.
    */
  var Locale: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.Locale] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListRecommendationsRequest {
  
  inline def apply(InsightId: InsightId): ListRecommendationsRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
