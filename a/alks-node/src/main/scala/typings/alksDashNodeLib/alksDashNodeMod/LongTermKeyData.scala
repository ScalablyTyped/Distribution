package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongTermKeyData extends js.Object {
  var accessKey: java.lang.String
  var alksAccount: java.lang.String
  var alksRole: java.lang.String
  var iamUserArn: java.lang.String
  var iamUserName: java.lang.String
  var secretKey: java.lang.String
}

object LongTermKeyData {
  @scala.inline
  def apply(
    accessKey: java.lang.String,
    alksAccount: java.lang.String,
    alksRole: java.lang.String,
    iamUserArn: java.lang.String,
    iamUserName: java.lang.String,
    secretKey: java.lang.String
  ): LongTermKeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey, alksAccount = alksAccount, alksRole = alksRole, iamUserArn = iamUserArn, iamUserName = iamUserName, secretKey = secretKey)
  
    __obj.asInstanceOf[LongTermKeyData]
  }
}

