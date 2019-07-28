package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRepositoryRequest extends js.Object {
  /**
    * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined
  /**
    * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app).
    */
  var repositoryName: RepositoryName
  /**
    * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateRepositoryRequest {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    imageTagMutability: ImageTagMutability = null,
    tags: TagList = null
  ): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (imageTagMutability != null) __obj.updateDynamic("imageTagMutability")(imageTagMutability.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
}

