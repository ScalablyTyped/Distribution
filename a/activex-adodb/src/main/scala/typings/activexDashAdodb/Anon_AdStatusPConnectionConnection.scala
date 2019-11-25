package typings.activexDashAdodb

import typings.activexDashAdodb.ADODB.Connection
import typings.activexDashAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdStatusPConnectionConnection extends js.Object {
  var adStatus: EventStatusEnum
  val pConnection: Connection
}

object Anon_AdStatusPConnectionConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection): Anon_AdStatusPConnectionConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdStatusPConnectionConnection]
  }
}

