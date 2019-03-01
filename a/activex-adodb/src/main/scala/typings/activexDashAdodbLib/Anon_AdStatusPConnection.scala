package typings
package activexDashAdodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdStatusPConnection extends js.Object {
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum
  val pConnection: activexDashAdodbLib.ADODBNs.Connection
  val pError: activexDashAdodbLib.ADODBNs.Error
}

object Anon_AdStatusPConnection {
  @scala.inline
  def apply(
    adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum,
    pConnection: activexDashAdodbLib.ADODBNs.Connection,
    pError: activexDashAdodbLib.ADODBNs.Error
  ): Anon_AdStatusPConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adStatus")(adStatus)
    __obj.updateDynamic("pConnection")(pConnection)
    __obj.updateDynamic("pError")(pError)
    __obj.asInstanceOf[Anon_AdStatusPConnection]
  }
}

