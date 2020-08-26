package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountId extends js.Object {
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
  implicit class AccountIdOps[Self <: AccountId] (val x: Self) extends AnyVal {
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
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainPrefix(value: String): Self = this.set("domainPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: Method): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteKey(value: String): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeEpoch(value: Double): Self = this.set("timeEpoch", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizer(value: Jwt): Self = this.set("authorizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizer: Self = this.set("authorizer", js.undefined)
  }
  
}

