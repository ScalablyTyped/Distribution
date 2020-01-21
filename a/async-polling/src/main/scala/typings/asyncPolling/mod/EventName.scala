package typings.asyncPolling.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.asyncPolling.asyncPollingStrings.run
  - typings.asyncPolling.asyncPollingStrings.start
  - typings.asyncPolling.asyncPollingStrings.error
  - typings.asyncPolling.asyncPollingStrings.result
  - typings.asyncPolling.asyncPollingStrings.end
  - typings.asyncPolling.asyncPollingStrings.schedule
  - typings.asyncPolling.asyncPollingStrings.stop
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.asyncPolling.asyncPollingStrings.end = this.cast("end")
  @scala.inline
  def error: typings.asyncPolling.asyncPollingStrings.error = this.cast("error")
  @scala.inline
  def result: typings.asyncPolling.asyncPollingStrings.result = this.cast("result")
  @scala.inline
  def run: typings.asyncPolling.asyncPollingStrings.run = this.cast("run")
  @scala.inline
  def schedule: typings.asyncPolling.asyncPollingStrings.schedule = this.cast("schedule")
  @scala.inline
  def start: typings.asyncPolling.asyncPollingStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.asyncPolling.asyncPollingStrings.stop = this.cast("stop")
}

