package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDatabaseCredentials extends js.Object {
  var Password: RDSDatabasePassword = js.native
  var Username: RDSDatabaseUsername = js.native
}

object RDSDatabaseCredentials {
  @scala.inline
  def apply(Password: RDSDatabasePassword, Username: RDSDatabaseUsername): RDSDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RDSDatabaseCredentials]
  }
}

