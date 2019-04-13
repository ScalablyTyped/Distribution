package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRepositoryRequest extends js.Object {
  /**
    * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app).
    */
  var repositoryName: RepositoryName
  /**
    * 
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateRepositoryRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, tags: TagList = null): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
}

