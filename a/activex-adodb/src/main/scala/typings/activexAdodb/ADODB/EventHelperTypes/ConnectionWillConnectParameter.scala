package typings.activexAdodb.ADODB.EventHelperTypes

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionWillConnectParameter extends js.Object {
  var ConnectionString: String
  var Options: Double
  var Password: String
  var UserID: String
  var adStatus: EventStatusEnum
  val pConnection: Connection
}

object ConnectionWillConnectParameter {
  @scala.inline
  def apply(
    ConnectionString: String,
    Options: Double,
    Password: String,
    UserID: String,
    adStatus: EventStatusEnum,
    pConnection: Connection
  ): ConnectionWillConnectParameter = {
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionWillConnectParameter]
  }
}

