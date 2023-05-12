package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInputSourcesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The Resilience Hub application version.
    */
  var appVersion: EntityVersion
  
  /**
    * Maximum number of input sources to be displayed per Resilience Hub application.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Null, or the token from a previous call to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppInputSourcesRequest {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): ListAppInputSourcesRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppInputSourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppInputSourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
