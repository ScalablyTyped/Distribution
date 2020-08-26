package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphqlApiRequest extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  /**
    * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
    */
  var authenticationType: AuthenticationType = js.native
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  /**
    * A user-supplied name for the GraphqlApi.
    */
  var name: String = js.native
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * A TagMap object.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  /**
    * A flag indicating whether to enable X-Ray tracing for the GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}

object CreateGraphqlApiRequest {
  @scala.inline
  def apply(authenticationType: AuthenticationType, name: String): CreateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGraphqlApiRequest]
  }
  @scala.inline
  implicit class CreateGraphqlApiRequestOps[Self <: CreateGraphqlApiRequest] (val x: Self) extends AnyVal {
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
    def setAuthenticationType(value: AuthenticationType): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalAuthenticationProvidersVarargs(value: AdditionalAuthenticationProvider*): Self = this.set("additionalAuthenticationProviders", js.Array(value :_*))
    @scala.inline
    def setAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = this.set("additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalAuthenticationProviders: Self = this.set("additionalAuthenticationProviders", js.undefined)
    @scala.inline
    def setLogConfig(value: LogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = this.set("openIDConnectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIDConnectConfig: Self = this.set("openIDConnectConfig", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUserPoolConfig(value: UserPoolConfig): Self = this.set("userPoolConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolConfig: Self = this.set("userPoolConfig", js.undefined)
    @scala.inline
    def setXrayEnabled(value: Boolean): Self = this.set("xrayEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXrayEnabled: Self = this.set("xrayEnabled", js.undefined)
  }
  
}

