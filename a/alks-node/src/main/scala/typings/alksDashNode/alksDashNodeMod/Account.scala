package typings.alksDashNode.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var alksAccount: String
  var alksRole: String
  var server: String
  var userid: String
}

object Account {
  @scala.inline
  def apply(alksAccount: String, alksRole: String, server: String, userid: String): Account = {
    val __obj = js.Dynamic.literal(alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Account]
  }
}

