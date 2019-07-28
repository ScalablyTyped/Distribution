package typings.activexDashAdodb

import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.Error
import typings.activexDashAdodb.ADODBNs.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdStatusPConnection extends js.Object {
  var adStatus: EventStatusEnum
  val pConnection: Connection
  val pError: Error
}

object Anon_AdStatusPConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection, pError: Error): Anon_AdStatusPConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus, pConnection = pConnection, pError = pError)
  
    __obj.asInstanceOf[Anon_AdStatusPConnection]
  }
}

