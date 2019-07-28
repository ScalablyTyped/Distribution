package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopCompilationJobRequest extends js.Object {
  /**
    * The name of the model compilation job to stop.
    */
  var CompilationJobName: EntityName
}

object StopCompilationJobRequest {
  @scala.inline
  def apply(CompilationJobName: EntityName): StopCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName)
  
    __obj.asInstanceOf[StopCompilationJobRequest]
  }
}

