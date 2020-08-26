package typings.asynciterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator/taskscheduler", JSImport.Namespace)
@js.native
object taskschedulerMod extends js.Object {
  def default(): TaskScheduler = js.native
  type Task = js.Function0[Unit]
  type TaskScheduler = js.Function1[/* task */ Task, Unit]
}

