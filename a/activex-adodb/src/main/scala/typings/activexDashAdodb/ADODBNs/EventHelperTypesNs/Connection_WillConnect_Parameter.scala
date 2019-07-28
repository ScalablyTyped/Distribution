package typings.activexDashAdodb.ADODBNs.EventHelperTypesNs

import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.EventStatusEnum
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
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString, Options = Options, Password = Password, UserID = UserID, adStatus = adStatus, pConnection = pConnection)
  
    __obj.asInstanceOf[Connection_WillConnect_Parameter]
  }
}

