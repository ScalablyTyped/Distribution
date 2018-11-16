package typings
package asyncDashPollingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object asyncDashPollingLibStrings {
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait result extends js.Object
  
  @js.native
  sealed trait run extends js.Object
  
  @js.native
  sealed trait schedule extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait stop extends js.Object
  
  def end: end = "end".asInstanceOf[end]
  def error: error = "error".asInstanceOf[error]
  def result: result = "result".asInstanceOf[result]
  def run: run = "run".asInstanceOf[run]
  def schedule: schedule = "schedule".asInstanceOf[schedule]
  def start: start = "start".asInstanceOf[start]
  def stop: stop = "stop".asInstanceOf[stop]
}

