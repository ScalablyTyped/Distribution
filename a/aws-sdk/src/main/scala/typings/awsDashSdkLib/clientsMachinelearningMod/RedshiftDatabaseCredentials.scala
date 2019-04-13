package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftDatabaseCredentials extends js.Object {
  var Password: RedshiftDatabasePassword
  var Username: RedshiftDatabaseUsername
}

object RedshiftDatabaseCredentials {
  @scala.inline
  def apply(Password: RedshiftDatabasePassword, Username: RedshiftDatabaseUsername): RedshiftDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password, Username = Username)
  
    __obj.asInstanceOf[RedshiftDatabaseCredentials]
  }
}

