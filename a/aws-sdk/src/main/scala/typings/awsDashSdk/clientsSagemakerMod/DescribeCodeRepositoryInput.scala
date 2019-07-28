package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to describe.
    */
  var CodeRepositoryName: EntityName
}

object DescribeCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DescribeCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName)
  
    __obj.asInstanceOf[DescribeCodeRepositoryInput]
  }
}

