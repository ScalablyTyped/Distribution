package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountId extends StObject {
  
  var accountId: String = js.native
  
  var apiId: String = js.native
  
  var authorizer: js.UndefOr[Jwt] = js.native
  
  var domainName: String = js.native
  
  var domainPrefix: String = js.native
  
  var http: Method = js.native
  
  var requestId: String = js.native
  
  var routeKey: String = js.native
  
  var stage: String = js.native
  
  var time: String = js.native
  
  var timeEpoch: Double = js.native
}
object AccountId {
  
  @scala.inline
  def apply(
    accountId: String,
    apiId: String,
    domainName: String,
    domainPrefix: String,
    http: Method,
    requestId: String,
    routeKey: String,
    stage: String,
    time: String,
    timeEpoch: Double
  ): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainPrefix = domainPrefix.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeEpoch = timeEpoch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountId]
  }
  
  @scala.inline
  implicit class AccountIdMutableBuilder[Self <: AccountId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizer(value: Jwt): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainPrefix(value: String): Self = StObject.set(x, "domainPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Method): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeEpoch(value: Double): Self = StObject.set(x, "timeEpoch", value.asInstanceOf[js.Any])
  }
}
