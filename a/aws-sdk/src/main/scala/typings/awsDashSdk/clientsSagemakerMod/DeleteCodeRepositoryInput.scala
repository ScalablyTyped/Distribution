package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to delete.
    */
  var CodeRepositoryName: EntityName = js.native
}

object DeleteCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DeleteCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCodeRepositoryInput]
  }
}

