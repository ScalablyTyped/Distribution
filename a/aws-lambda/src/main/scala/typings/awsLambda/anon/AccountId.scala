package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountId extends js.Object {
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
    timeEpoch: Double,
    authorizer: Jwt = null
  ): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainPrefix = domainPrefix.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeEpoch = timeEpoch.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountId]
  }
}

