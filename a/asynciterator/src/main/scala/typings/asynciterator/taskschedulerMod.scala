package typings.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskschedulerMod {
  
  @JSImport("asynciterator/dist/taskscheduler", JSImport.Default)
  @js.native
  def default(): TaskScheduler = js.native
  
  type Task = js.Function0[Unit]
  
  type TaskScheduler = js.Function1[/* task */ Task, Unit]
}
