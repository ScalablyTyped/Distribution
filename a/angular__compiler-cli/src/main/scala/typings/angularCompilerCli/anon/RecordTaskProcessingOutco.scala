package typings.angularCompilerCli.anon

import typings.angularCompilerCli.completionMod.TaskCompletedHandler
import typings.angularCompilerCli.tasksApiMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/execution/tasks/api.TaskProcessingOutcome, @angular/compiler-cli.@angular/compiler-cli/ngcc/src/execution/tasks/completion.TaskCompletedHandler> */
trait RecordTaskProcessingOutco extends StObject {
  
  def `0`(task: Task): Unit
  def `0`(task: Task, message: String): Unit
  @JSName("0")
  var `0_Original`: TaskCompletedHandler
  
  def `1`(task: Task): Unit
  def `1`(task: Task, message: String): Unit
  @JSName("1")
  var `1_Original`: TaskCompletedHandler
}
object RecordTaskProcessingOutco {
  
  inline def apply(
    `0`: (/* task */ Task, /* message */ String | Null) => Unit,
    `1`: (/* task */ Task, /* message */ String | Null) => Unit
  ): RecordTaskProcessingOutco = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(js.Any.fromFunction2(`0`))
    __obj.updateDynamic("1")(js.Any.fromFunction2(`1`))
    __obj.asInstanceOf[RecordTaskProcessingOutco]
  }
  
  extension [Self <: RecordTaskProcessingOutco](x: Self) {
    
    inline def set0(value: (/* task */ Task, /* message */ String | Null) => Unit): Self = StObject.set(x, "0", js.Any.fromFunction2(value))
    
    inline def set1(value: (/* task */ Task, /* message */ String | Null) => Unit): Self = StObject.set(x, "1", js.Any.fromFunction2(value))
  }
}
