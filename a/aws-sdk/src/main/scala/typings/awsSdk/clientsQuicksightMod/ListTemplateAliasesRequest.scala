package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateAliasesRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the template aliases that you're listing.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the template.
    */
  var TemplateId: ShortRestrictiveResourceId
}
object ListTemplateAliasesRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, TemplateId: ShortRestrictiveResourceId): ListTemplateAliasesRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateAliasesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateAliasesRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTemplateId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
