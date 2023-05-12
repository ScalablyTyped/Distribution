package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppVersionAppComponentsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * Defines an Application Component.
    */
  var appComponents: js.UndefOr[AppComponentList] = js.undefined
  
  /**
    * The Resilience Hub application version.
    */
  var appVersion: EntityVersion
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppVersionAppComponentsResponse {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): ListAppVersionAppComponentsResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppVersionAppComponentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppVersionAppComponentsResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppComponents(value: AppComponentList): Self = StObject.set(x, "appComponents", value.asInstanceOf[js.Any])
    
    inline def setAppComponentsUndefined: Self = StObject.set(x, "appComponents", js.undefined)
    
    inline def setAppComponentsVarargs(value: AppComponent*): Self = StObject.set(x, "appComponents", js.Array(value*))
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
