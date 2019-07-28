package typings.alksDashNode.alksDashNodeMod

import typings.moment.momentMod.Moment
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
    val __obj = js.Dynamic.literal(accessKey = accessKey, alksAccount = alksAccount, alksRole = alksRole, expires = expires, secretKey = secretKey, sessionTime = sessionTime, sessionToken = sessionToken)
  
    __obj.asInstanceOf[KeyData]
  }
}

