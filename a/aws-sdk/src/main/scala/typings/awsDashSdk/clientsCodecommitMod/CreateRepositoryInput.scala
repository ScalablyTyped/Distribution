package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRepositoryInput extends js.Object {
  /**
    * A comment or description about the new repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.native
  /**
    * The name of the new repository to be created.  The repository name must be unique across the calling AWS account. Repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. For more information about the limits on repository names, see Limits in the AWS CodeCommit User Guide. The suffix .git is prohibited. 
    */
  var repositoryName: RepositoryName = js.native
  /**
    * One or more tag key-value pairs to use when tagging this repository.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object CreateRepositoryInput {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    repositoryDescription: RepositoryDescription = null,
    tags: TagsMap = null
  ): CreateRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryInput]
  }
}

