package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolConfig extends StObject {
  
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String
  
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool configuration.
    */
  var defaultAction: DefaultAction
  
  /**
    * The user pool ID.
    */
  var userPoolId: String
}
object UserPoolConfig {
  
  inline def apply(awsRegion: String, defaultAction: DefaultAction, userPoolId: String): UserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolConfig]
  }
  
  extension [Self <: UserPoolConfig](x: Self) {
    
    inline def setAppIdClientRegex(value: String): Self = StObject.set(x, "appIdClientRegex", value.asInstanceOf[js.Any])
    
    inline def setAppIdClientRegexUndefined: Self = StObject.set(x, "appIdClientRegex", js.undefined)
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setDefaultAction(value: DefaultAction): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
  }
}
