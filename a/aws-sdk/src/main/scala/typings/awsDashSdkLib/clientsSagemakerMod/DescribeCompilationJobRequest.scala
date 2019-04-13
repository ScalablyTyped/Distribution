package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCompilationJobRequest extends js.Object {
  /**
    * The name of the model compilation job that you want information about.
    */
  var CompilationJobName: EntityName
}

object DescribeCompilationJobRequest {
  @scala.inline
  def apply(CompilationJobName: EntityName): DescribeCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName)
  
    __obj.asInstanceOf[DescribeCompilationJobRequest]
  }
}

