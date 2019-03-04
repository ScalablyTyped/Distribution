package typings
package activexDashAdodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdStatus extends js.Object {
  val TransactionLevel: scala.Double
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum
  val pConnection: activexDashAdodbLib.ADODBNs.Connection
  val pError: activexDashAdodbLib.ADODBNs.Error
}

object Anon_AdStatus {
  @scala.inline
  def apply(
    TransactionLevel: scala.Double,
    adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum,
    pConnection: activexDashAdodbLib.ADODBNs.Connection,
    pError: activexDashAdodbLib.ADODBNs.Error
  ): Anon_AdStatus = {
    val __obj = js.Dynamic.literal(TransactionLevel = TransactionLevel, adStatus = adStatus, pConnection = pConnection, pError = pError)
  
    __obj.asInstanceOf[Anon_AdStatus]
  }
}

