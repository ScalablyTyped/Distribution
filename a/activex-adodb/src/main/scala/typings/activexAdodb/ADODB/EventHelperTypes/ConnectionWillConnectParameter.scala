package typings.activexAdodb.ADODB.EventHelperTypes

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionWillConnectParameter extends js.Object {
  var ConnectionString: String = js.native
  var Options: Double = js.native
  var Password: String = js.native
  var UserID: String = js.native
  var adStatus: EventStatusEnum = js.native
  val pConnection: Connection = js.native
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
  @scala.inline
  implicit class ConnectionWillConnectParameterOps[Self <: ConnectionWillConnectParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionString(value: String): Self = this.set("ConnectionString", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Double): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserID(value: String): Self = this.set("UserID", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdStatus(value: EventStatusEnum): Self = this.set("adStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPConnection(value: Connection): Self = this.set("pConnection", value.asInstanceOf[js.Any])
  }
  
}

