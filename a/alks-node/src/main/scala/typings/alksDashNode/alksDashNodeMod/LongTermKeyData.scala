package typings.alksDashNode.alksDashNodeMod

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
    val __obj = js.Dynamic.literal(accessKey = accessKey, alksAccount = alksAccount, alksRole = alksRole, iamUserArn = iamUserArn, iamUserName = iamUserName, secretKey = secretKey)
  
    __obj.asInstanceOf[LongTermKeyData]
  }
}

