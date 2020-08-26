package typings.activexAdodb.anon

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdStatus extends js.Object {
  val TransactionLevel: Double = js.native
  var adStatus: EventStatusEnum = js.native
  val pConnection: Connection = js.native
  val pError: Error = js.native
}

object AdStatus {
  @scala.inline
  def apply(TransactionLevel: Double, adStatus: EventStatusEnum, pConnection: Connection, pError: Error): AdStatus = {
    val __obj = js.Dynamic.literal(TransactionLevel = TransactionLevel.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStatus]
  }
  @scala.inline
  implicit class AdStatusOps[Self <: AdStatus] (val x: Self) extends AnyVal {
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
    def setTransactionLevel(value: Double): Self = this.set("TransactionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdStatus(value: EventStatusEnum): Self = this.set("adStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPConnection(value: Connection): Self = this.set("pConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPError(value: Error): Self = this.set("pError", value.asInstanceOf[js.Any])
  }
  
}

