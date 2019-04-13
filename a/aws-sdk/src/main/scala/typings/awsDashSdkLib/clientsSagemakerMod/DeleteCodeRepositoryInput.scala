package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to delete.
    */
  var CodeRepositoryName: EntityName
}

object DeleteCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DeleteCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName)
  
    __obj.asInstanceOf[DeleteCodeRepositoryInput]
  }
}

