package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISession extends js.Object {
  /**
    * The date at which this guid was genereated.
    * Per the spec the ID will be regenerated if more than acquisitionSpan milliseconds ellapse from this time.
    */
  var acquisitionDate: Double = js.native
  /**
    * The session ID.
    */
  var id: String = js.native
  /**
    * The true if this is the first session
    */
  var isFirst: Boolean = js.native
  /**
    * The date at which this session ID was last reported.
    * This value should be updated whenever telemetry is sent using this ID.
    * Per the spec the ID will be regenerated if more than renewalSpan milliseconds elapse from this time with no activity.
    */
  var renewalDate: Double = js.native
}

object ISession {
  @scala.inline
  def apply(acquisitionDate: Double, id: String, isFirst: Boolean, renewalDate: Double): ISession = {
    val __obj = js.Dynamic.literal(acquisitionDate = acquisitionDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], renewalDate = renewalDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  @scala.inline
  implicit class ISessionOps[Self <: ISession] (val x: Self) extends AnyVal {
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
    def setAcquisitionDate(value: Double): Self = this.set("acquisitionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFirst(value: Boolean): Self = this.set("isFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenewalDate(value: Double): Self = this.set("renewalDate", value.asInstanceOf[js.Any])
  }
  
}

