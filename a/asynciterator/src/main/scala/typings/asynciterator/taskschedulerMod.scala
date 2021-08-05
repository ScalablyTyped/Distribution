package typings.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskschedulerMod {
  
  @JSImport("asynciterator/dist/taskscheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): TaskScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TaskScheduler]
  
  type Task = js.Function0[Unit]
  
  type TaskScheduler = js.Function1[/* task */ Task, Unit]
}
