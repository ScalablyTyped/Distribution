package typings.activexDashAdodb

import typings.activexDashAdodb.ADODB.Connection
import typings.activexDashAdodb.ADODB.Error
import typings.activexDashAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdStatus extends js.Object {
  val TransactionLevel: Double
  var adStatus: EventStatusEnum
  val pConnection: Connection
  val pError: Error
}

object Anon_AdStatus {
  @scala.inline
  def apply(TransactionLevel: Double, adStatus: EventStatusEnum, pConnection: Connection, pError: Error): Anon_AdStatus = {
    val __obj = js.Dynamic.literal(TransactionLevel = TransactionLevel, adStatus = adStatus, pConnection = pConnection, pError = pError)
  
    __obj.asInstanceOf[Anon_AdStatus]
  }
}

