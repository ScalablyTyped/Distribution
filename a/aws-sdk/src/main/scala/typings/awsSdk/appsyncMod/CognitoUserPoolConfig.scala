package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoUserPoolConfig extends StObject {
  
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String
  
  /**
    * The user pool ID.
    */
  var userPoolId: String
}
object CognitoUserPoolConfig {
  
  @scala.inline
  def apply(awsRegion: String, userPoolId: String): CognitoUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPoolConfig]
  }
  
  @scala.inline
  implicit class CognitoUserPoolConfigMutableBuilder[Self <: CognitoUserPoolConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppIdClientRegex(value: String): Self = StObject.set(x, "appIdClientRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdClientRegexUndefined: Self = StObject.set(x, "appIdClientRegex", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
  }
}
