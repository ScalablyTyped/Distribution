package typings.asynciterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator/dist/taskscheduler", JSImport.Namespace)
@js.native
object taskschedulerMod extends js.Object {
  
  def default(): TaskScheduler = js.native
  
  type Task = js.Function0[Unit]
  
  type TaskScheduler = js.Function1[/* task */ Task, Unit]
}
