package typings.awsLambda.appsyncResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSyncIdentityIAM extends js.Object {
  
  var accountId: String = js.native
  
  var cognitoIdentityAuthProvider: String = js.native
  
  var cognitoIdentityAuthType: String = js.native
  
  var cognitoIdentityId: String = js.native
  
  var cognitoIdentityPoolId: String = js.native
  
  var sourceIp: js.Array[String] = js.native
  
  var userArn: String = js.native
  
  var username: String = js.native
}
object AppSyncIdentityIAM {
  
  @scala.inline
  def apply(
    accountId: String,
    cognitoIdentityAuthProvider: String,
    cognitoIdentityAuthType: String,
    cognitoIdentityId: String,
    cognitoIdentityPoolId: String,
    sourceIp: js.Array[String],
    userArn: String,
    username: String
  ): AppSyncIdentityIAM = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], cognitoIdentityAuthProvider = cognitoIdentityAuthProvider.asInstanceOf[js.Any], cognitoIdentityAuthType = cognitoIdentityAuthType.asInstanceOf[js.Any], cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSyncIdentityIAM]
  }
  
  @scala.inline
  implicit class AppSyncIdentityIAMOps[Self <: AppSyncIdentityIAM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityAuthProvider(value: String): Self = this.set("cognitoIdentityAuthProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityAuthType(value: String): Self = this.set("cognitoIdentityAuthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityId(value: String): Self = this.set("cognitoIdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityPoolId(value: String): Self = this.set("cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpVarargs(value: String*): Self = this.set("sourceIp", js.Array(value :_*))
    
    @scala.inline
    def setSourceIp(value: js.Array[String]): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArn(value: String): Self = this.set("userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
