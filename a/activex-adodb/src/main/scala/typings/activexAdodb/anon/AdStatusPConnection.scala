package typings.activexAdodb.anon

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStatusPConnection extends js.Object {
  var adStatus: EventStatusEnum
  val pConnection: Connection
}

object AdStatusPConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection): AdStatusPConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStatusPConnection]
  }
}

