package typings.activexDashAdodb.ADODB.EventHelperTypes

import typings.activexDashAdodb.ADODB.Connection
import typings.activexDashAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection_WillConnect_Parameter extends js.Object {
  var ConnectionString: String
  var Options: Double
  var Password: String
  var UserID: String
  var adStatus: EventStatusEnum
  val pConnection: Connection
}

object Connection_WillConnect_Parameter {
  @scala.inline
  def apply(
    ConnectionString: String,
    Options: Double,
    Password: String,
    UserID: String,
    adStatus: EventStatusEnum,
    pConnection: Connection
  ): Connection_WillConnect_Parameter = {
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection_WillConnect_Parameter]
  }
}

