package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphqlApi extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  /**
    * The API ID.
    */
  var apiId: js.UndefOr[String] = js.native
  /**
    * The ARN.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The authentication type.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  /**
    * The API name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The URIs.
    */
  var uris: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  /**
    * A flag representing whether X-Ray tracing is enabled for this GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}

object GraphqlApi {
  @scala.inline
  def apply(): GraphqlApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphqlApi]
  }
  @scala.inline
  implicit class GraphqlApiOps[Self <: GraphqlApi] (val x: Self) extends AnyVal {
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
    def setAdditionalAuthenticationProvidersVarargs(value: AdditionalAuthenticationProvider*): Self = this.set("additionalAuthenticationProviders", js.Array(value :_*))
    @scala.inline
    def setAdditionalAuthenticationProviders(value: AdditionalAuthenticationProviders): Self = this.set("additionalAuthenticationProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalAuthenticationProviders: Self = this.set("additionalAuthenticationProviders", js.undefined)
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiId: Self = this.set("apiId", js.undefined)
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    @scala.inline
    def setLogConfig(value: LogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpenIDConnectConfig(value: OpenIDConnectConfig): Self = this.set("openIDConnectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIDConnectConfig: Self = this.set("openIDConnectConfig", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUris(value: MapOfStringToString): Self = this.set("uris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUris: Self = this.set("uris", js.undefined)
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

