package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends SuccessFailOptions {
  /** The queue ARN to associate the contact with. */
  val queueARN: js.UndefOr[String] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
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
    def setQueueARN(value: String): Self = this.set("queueARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueARN: Self = this.set("queueARN", js.undefined)
  }
  
}

