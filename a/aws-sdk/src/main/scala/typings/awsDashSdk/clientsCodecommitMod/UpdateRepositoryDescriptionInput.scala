package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRepositoryDescriptionInput extends js.Object {
  /**
    * The new comment or description for the specified repository. Repository descriptions are limited to 1,000 characters.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  /**
    * The name of the repository to set or change the comment or description for.
    */
  var repositoryName: RepositoryName
}

object UpdateRepositoryDescriptionInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, repositoryDescription: RepositoryDescription = null): UpdateRepositoryDescriptionInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription)
    __obj.asInstanceOf[UpdateRepositoryDescriptionInput]
  }
}

