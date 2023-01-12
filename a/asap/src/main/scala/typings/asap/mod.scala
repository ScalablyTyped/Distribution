package typings.asap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Executes a task as soon as possible.
    * @param task Function or any object that implements `call()`.
    */
  inline def apply(task: Task): Unit = ^.asInstanceOf[js.Dynamic].apply(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("asap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Task extends StObject {
    
    def call(args: Any*): Any
  }
  object Task {
    
    inline def apply(call: /* repeated */ Any => Any): Task = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      inline def setCall(value: /* repeated */ Any => Any): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
    }
  }
}
