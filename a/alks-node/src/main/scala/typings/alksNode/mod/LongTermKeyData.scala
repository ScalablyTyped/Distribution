package typings.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongTermKeyData extends js.Object {
  var accessKey: String
  var alksAccount: String
  var alksRole: String
  var iamUserArn: String
  var iamUserName: String
  var secretKey: String
}

object LongTermKeyData {
  @scala.inline
  def apply(
    accessKey: String,
    alksAccount: String,
    alksRole: String,
    iamUserArn: String,
    iamUserName: String,
    secretKey: String
  ): LongTermKeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], iamUserArn = iamUserArn.asInstanceOf[js.Any], iamUserName = iamUserName.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongTermKeyData]
  }
}

