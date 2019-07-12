package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyData extends js.Object {
  var accessKey: java.lang.String
  var alksAccount: java.lang.String
  var alksRole: java.lang.String
  var expires: momentLib.momentMod.Moment
  var secretKey: java.lang.String
  var sessionTime: java.lang.String
  var sessionToken: java.lang.String
}

object KeyData {
  @scala.inline
  def apply(
    accessKey: java.lang.String,
    alksAccount: java.lang.String,
    alksRole: java.lang.String,
    expires: momentLib.momentMod.Moment,
    secretKey: java.lang.String,
    sessionTime: java.lang.String,
    sessionToken: java.lang.String
  ): KeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey, alksAccount = alksAccount, alksRole = alksRole, expires = expires, secretKey = secretKey, sessionTime = sessionTime, sessionToken = sessionToken)
  
    __obj.asInstanceOf[KeyData]
  }
}

