package typings.activexAdodb

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdStatus extends js.Object {
  val TransactionLevel: Double
  var adStatus: EventStatusEnum
  val pConnection: Connection
  val pError: Error
}

object AnonAdStatus {
  @scala.inline
  def apply(TransactionLevel: Double, adStatus: EventStatusEnum, pConnection: Connection, pError: Error): AnonAdStatus = {
    val __obj = js.Dynamic.literal(TransactionLevel = TransactionLevel.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdStatus]
  }
}

