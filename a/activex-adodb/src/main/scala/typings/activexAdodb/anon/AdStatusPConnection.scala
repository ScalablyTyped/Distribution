package typings.activexAdodb.anon

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdStatusPConnection extends js.Object {
  var adStatus: EventStatusEnum = js.native
  val pConnection: Connection = js.native
}

object AdStatusPConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection): AdStatusPConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStatusPConnection]
  }
  @scala.inline
  implicit class AdStatusPConnectionOps[Self <: AdStatusPConnection] (val x: Self) extends AnyVal {
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
    def setAdStatus(value: EventStatusEnum): Self = this.set("adStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPConnection(value: Connection): Self = this.set("pConnection", value.asInstanceOf[js.Any])
  }
  
}

