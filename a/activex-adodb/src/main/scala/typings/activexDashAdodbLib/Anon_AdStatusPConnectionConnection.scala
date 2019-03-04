package typings
package activexDashAdodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdStatusPConnectionConnection extends js.Object {
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum
  val pConnection: activexDashAdodbLib.ADODBNs.Connection
}

object Anon_AdStatusPConnectionConnection {
  @scala.inline
  def apply(
    adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum,
    pConnection: activexDashAdodbLib.ADODBNs.Connection
  ): Anon_AdStatusPConnectionConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus, pConnection = pConnection)
  
    __obj.asInstanceOf[Anon_AdStatusPConnectionConnection]
  }
}

