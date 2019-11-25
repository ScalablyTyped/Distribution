package typings.asyncDashPolling.asyncDashPollingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.asyncDashPolling.asyncDashPollingStrings.run
  - typings.asyncDashPolling.asyncDashPollingStrings.start
  - typings.asyncDashPolling.asyncDashPollingStrings.error
  - typings.asyncDashPolling.asyncDashPollingStrings.result
  - typings.asyncDashPolling.asyncDashPollingStrings.end
  - typings.asyncDashPolling.asyncDashPollingStrings.schedule
  - typings.asyncDashPolling.asyncDashPollingStrings.stop
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.asyncDashPolling.asyncDashPollingStrings.end = this.cast("end")
  @scala.inline
  def error: typings.asyncDashPolling.asyncDashPollingStrings.error = this.cast("error")
  @scala.inline
  def result: typings.asyncDashPolling.asyncDashPollingStrings.result = this.cast("result")
  @scala.inline
  def run: typings.asyncDashPolling.asyncDashPollingStrings.run = this.cast("run")
  @scala.inline
  def schedule: typings.asyncDashPolling.asyncDashPollingStrings.schedule = this.cast("schedule")
  @scala.inline
  def start: typings.asyncDashPolling.asyncDashPollingStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.asyncDashPolling.asyncDashPollingStrings.stop = this.cast("stop")
}

