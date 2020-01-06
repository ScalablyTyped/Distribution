package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNameIdPair extends js.Object {
  /**
    * The ID associated with the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
  /**
    * The name associated with the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object RepositoryNameIdPair {
  @scala.inline
  def apply(repositoryId: RepositoryId = null, repositoryName: RepositoryName = null): RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNameIdPair]
  }
}

