package typings
package aspnetDashIdentityDashPwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aspnet-identity-pw", JSImport.Namespace)
@js.native
object aspnetDashIdentityDashPwMod extends js.Object {
  def hashPassword(password: java.lang.String): java.lang.String = js.native
  def hashPassword(
    password: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def validatePassword(password: java.lang.String, hashedPass: java.lang.String): scala.Boolean = js.native
  def validatePassword(
    password: java.lang.String,
    hashedPass: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

