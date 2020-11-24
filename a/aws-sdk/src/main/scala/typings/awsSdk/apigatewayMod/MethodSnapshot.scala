package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodSnapshot extends js.Object {
  
  /**
    * Specifies whether the method requires a valid ApiKey.
    */
  var apiKeyRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
    */
  var authorizationType: js.UndefOr[String] = js.native
}
object MethodSnapshot {
  
  @scala.inline
  def apply(): MethodSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSnapshot]
  }
  
  @scala.inline
  implicit class MethodSnapshotOps[Self <: MethodSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiKeyRequired(value: Boolean): Self = this.set("apiKeyRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeyRequired: Self = this.set("apiKeyRequired", js.undefined)
    
    @scala.inline
    def setAuthorizationType(value: String): Self = this.set("authorizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationType: Self = this.set("authorizationType", js.undefined)
  }
}
