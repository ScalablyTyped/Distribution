package typings.activexAdodb

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdStatusPConnection extends js.Object {
  var adStatus: EventStatusEnum
  val pConnection: Connection
}

object AnonAdStatusPConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection): AnonAdStatusPConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdStatusPConnection]
  }
}

