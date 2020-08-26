package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminationHealth extends js.Object {
  /**
    * The source IP address.
    */
  var Source: js.UndefOr[String] = js.native
  /**
    * The timestamp, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[Iso8601Timestamp] = js.native
}

object TerminationHealth {
  @scala.inline
  def apply(): TerminationHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminationHealth]
  }
  @scala.inline
  implicit class TerminationHealthOps[Self <: TerminationHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setTimestamp(value: Iso8601Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

