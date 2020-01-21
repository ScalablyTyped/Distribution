package typings.alksNode.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyData extends js.Object {
  var accessKey: String
  var alksAccount: String
  var alksRole: String
  var expires: Moment
  var secretKey: String
  var sessionTime: String
  var sessionToken: String
}

object KeyData {
  @scala.inline
  def apply(
    accessKey: String,
    alksAccount: String,
    alksRole: String,
    expires: Moment,
    secretKey: String,
    sessionTime: String,
    sessionToken: String
  ): KeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionTime = sessionTime.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyData]
  }
}

