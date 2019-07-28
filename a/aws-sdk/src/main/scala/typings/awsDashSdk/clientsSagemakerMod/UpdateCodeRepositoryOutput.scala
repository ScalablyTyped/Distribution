package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCodeRepositoryOutput extends js.Object {
  /**
    * The ARN of the Git repository.
    */
  var CodeRepositoryArn: typings.awsDashSdk.clientsSagemakerMod.CodeRepositoryArn
}

object UpdateCodeRepositoryOutput {
  @scala.inline
  def apply(CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn)
  
    __obj.asInstanceOf[UpdateCodeRepositoryOutput]
  }
}

