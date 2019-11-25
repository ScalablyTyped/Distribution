package typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.applicationinsights.applicationinsightsStrings.Event
  - typings.applicationinsights.applicationinsightsStrings.Exception
  - typings.applicationinsights.applicationinsightsStrings.Trace
  - typings.applicationinsights.applicationinsightsStrings.Metric
  - typings.applicationinsights.applicationinsightsStrings.Request
  - typings.applicationinsights.applicationinsightsStrings.Dependency
  - typings.applicationinsights.applicationinsightsStrings.Availability
*/
trait TelemetryTypeKeys extends js.Object

object TelemetryTypeKeys {
  @scala.inline
  def Availability: typings.applicationinsights.applicationinsightsStrings.Availability = this.cast("Availability")
  @scala.inline
  def Dependency: typings.applicationinsights.applicationinsightsStrings.Dependency = this.cast("Dependency")
  @scala.inline
  def Event: typings.applicationinsights.applicationinsightsStrings.Event = this.cast("Event")
  @scala.inline
  def Exception: typings.applicationinsights.applicationinsightsStrings.Exception = this.cast("Exception")
  @scala.inline
  def Metric: typings.applicationinsights.applicationinsightsStrings.Metric = this.cast("Metric")
  @scala.inline
  def Request: typings.applicationinsights.applicationinsightsStrings.Request = this.cast("Request")
  @scala.inline
  def Trace: typings.applicationinsights.applicationinsightsStrings.Trace = this.cast("Trace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

