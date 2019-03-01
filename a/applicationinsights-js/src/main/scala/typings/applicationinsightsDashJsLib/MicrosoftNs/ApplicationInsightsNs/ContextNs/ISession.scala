package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  /**
    * The date at which this guid was genereated.
    * Per the spec the ID will be regenerated if more than acquisitionSpan milliseconds ellapse from this time.
    */
  var acquisitionDate: scala.Double
  /**
    * The session ID.
    */
  var id: java.lang.String
  /**
    * The true if this is the first session
    */
  var isFirst: scala.Boolean
  /**
    * The date at which this session ID was last reported.
    * This value should be updated whenever telemetry is sent using this ID.
    * Per the spec the ID will be regenerated if more than renewalSpan milliseconds elapse from this time with no activity.
    */
  var renewalDate: scala.Double
}

object ISession {
  @scala.inline
  def apply(
    acquisitionDate: scala.Double,
    id: java.lang.String,
    isFirst: scala.Boolean,
    renewalDate: scala.Double
  ): ISession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquisitionDate")(acquisitionDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isFirst")(isFirst)
    __obj.updateDynamic("renewalDate")(renewalDate)
    __obj.asInstanceOf[ISession]
  }
}

