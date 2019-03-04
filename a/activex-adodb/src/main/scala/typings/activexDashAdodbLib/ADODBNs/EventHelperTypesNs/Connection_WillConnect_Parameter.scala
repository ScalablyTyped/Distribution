package typings
package activexDashAdodbLib.ADODBNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection_WillConnect_Parameter extends js.Object {
  var ConnectionString: java.lang.String
  var Options: scala.Double
  var Password: java.lang.String
  var UserID: java.lang.String
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum
  val pConnection: activexDashAdodbLib.ADODBNs.Connection
}

object Connection_WillConnect_Parameter {
  @scala.inline
  def apply(
    ConnectionString: java.lang.String,
    Options: scala.Double,
    Password: java.lang.String,
    UserID: java.lang.String,
    adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum,
    pConnection: activexDashAdodbLib.ADODBNs.Connection
  ): Connection_WillConnect_Parameter = {
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString, Options = Options, Password = Password, UserID = UserID, adStatus = adStatus, pConnection = pConnection)
  
    __obj.asInstanceOf[Connection_WillConnect_Parameter]
  }
}

