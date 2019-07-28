package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RDSDatabaseCredentials extends js.Object {
  var Password: RDSDatabasePassword
  var Username: RDSDatabaseUsername
}

object RDSDatabaseCredentials {
  @scala.inline
  def apply(Password: RDSDatabasePassword, Username: RDSDatabaseUsername): RDSDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password, Username = Username)
  
    __obj.asInstanceOf[RDSDatabaseCredentials]
  }
}

