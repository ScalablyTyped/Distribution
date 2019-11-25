package typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  /**
    * The date at which this guid was genereated.
    * Per the spec the ID will be regenerated if more than acquisitionSpan milliseconds ellapse from this time.
    */
  var acquisitionDate: Double
  /**
    * The session ID.
    */
  var id: String
  /**
    * The true if this is the first session
    */
  var isFirst: Boolean
  /**
    * The date at which this session ID was last reported.
    * This value should be updated whenever telemetry is sent using this ID.
    * Per the spec the ID will be regenerated if more than renewalSpan milliseconds elapse from this time with no activity.
    */
  var renewalDate: Double
}

object ISession {
  @scala.inline
  def apply(acquisitionDate: Double, id: String, isFirst: Boolean, renewalDate: Double): ISession = {
    val __obj = js.Dynamic.literal(acquisitionDate = acquisitionDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], renewalDate = renewalDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISession]
  }
}

