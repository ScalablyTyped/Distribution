package typings.aureliaTaskQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-task-queue", "TaskQueue")
  @js.native
  /**
    * Creates an instance of TaskQueue.
    */
  open class TaskQueue () extends StObject {
    
    /**
      * Immediately flushes the micro task queue.
      */
    def flushMicroTaskQueue(): Unit = js.native
    
    /**
      * Immediately flushes the task queue.
      */
    def flushTaskQueue(): Unit = js.native
    
    /**
      * Whether the queue is in the process of flushing.
      */
    var flushing: Any = js.native
    
    /**
      * Enables long stack traces for queued tasks.
      */
    var longStacks: Any = js.native
    
    def prepareQueueStack(): Any = js.native
    def prepareQueueStack(separator: Any): Any = js.native
    
    def queueMicroTask(task: js.Function): Unit = js.native
    /**
      * Queues a task on the micro task queue for ASAP execution.
      * @param task The task to queue up for ASAP execution.
      */
    def queueMicroTask(task: Task): Unit = js.native
    
    def queueTask(task: js.Function): Unit = js.native
    /**
      * Queues a task on the macro task queue for turn-based execution.
      * @param task The task to queue up for turn-based execution.
      */
    def queueTask(task: Task): Unit = js.native
  }
  
  trait Task extends StObject {
    
    /**
      * Call it.
      */
    def call(): Unit
  }
  object Task {
    
    inline def apply(call: () => Unit): Task = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call))
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setCall(value: () => Unit): Self = StObject.set(x, "call", js.Any.fromFunction0(value))
    }
  }
}
