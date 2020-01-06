package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryInput extends js.Object {
  /**
    * The name of the repository to delete.
    */
  var repositoryName: RepositoryName = js.native
}

object DeleteRepositoryInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): DeleteRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRepositoryInput]
  }
}

