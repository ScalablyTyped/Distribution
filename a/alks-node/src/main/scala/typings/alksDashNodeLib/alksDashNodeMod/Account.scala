package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var alksAccount: java.lang.String
  var alksRole: java.lang.String
  var server: java.lang.String
  var userid: java.lang.String
}

object Account {
  @scala.inline
  def apply(
    alksAccount: java.lang.String,
    alksRole: java.lang.String,
    server: java.lang.String,
    userid: java.lang.String
  ): Account = {
    val __obj = js.Dynamic.literal(alksAccount = alksAccount, alksRole = alksRole, server = server, userid = userid)
  
    __obj.asInstanceOf[Account]
  }
}

