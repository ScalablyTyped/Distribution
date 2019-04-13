package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRepositoryInput extends js.Object {
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName
}

object DeleteRepositoryInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): DeleteRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
  
    __obj.asInstanceOf[DeleteRepositoryInput]
  }
}

