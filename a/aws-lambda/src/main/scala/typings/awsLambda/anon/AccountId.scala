package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountId extends StObject {
  
  var accountId: String
  
  var apiId: String
  
  var authorizer: js.UndefOr[Jwt] = js.undefined
  
  var domainName: String
  
  var domainPrefix: String
  
  var http: Method
  
  var requestId: String
  
  var routeKey: String
  
  var stage: String
  
  var time: String
  
  var timeEpoch: Double
}
object AccountId {
  
  inline def apply(
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
  
  extension [Self <: AccountId](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizer(value: Jwt): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainPrefix(value: String): Self = StObject.set(x, "domainPrefix", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Method): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRouteKey(value: String): Self = StObject.set(x, "routeKey", value.asInstanceOf[js.Any])
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeEpoch(value: Double): Self = StObject.set(x, "timeEpoch", value.asInstanceOf[js.Any])
  }
}
