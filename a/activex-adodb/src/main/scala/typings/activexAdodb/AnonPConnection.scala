package typings.activexAdodb

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPConnection extends js.Object {
  var adStatus: EventStatusEnum
  val pConnection: Connection
  val pError: Error
}

object AnonPConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection, pError: Error): AnonPConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPConnection]
  }
}

