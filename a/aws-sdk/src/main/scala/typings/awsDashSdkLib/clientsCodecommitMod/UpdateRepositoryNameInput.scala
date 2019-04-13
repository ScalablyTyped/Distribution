package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRepositoryNameInput extends js.Object {
  /**
    * The new name for the repository.
    */
  var newName: RepositoryName
  /**
    * The existing name of the repository.
    */
  var oldName: RepositoryName
}

object UpdateRepositoryNameInput {
  @scala.inline
  def apply(newName: RepositoryName, oldName: RepositoryName): UpdateRepositoryNameInput = {
    val __obj = js.Dynamic.literal(newName = newName, oldName = oldName)
  
    __obj.asInstanceOf[UpdateRepositoryNameInput]
  }
}

