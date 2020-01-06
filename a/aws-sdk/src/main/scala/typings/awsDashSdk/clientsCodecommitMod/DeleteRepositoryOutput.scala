package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryOutput extends js.Object {
  /**
    * The ID of the repository that was deleted.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
}

object DeleteRepositoryOutput {
  @scala.inline
  def apply(repositoryId: RepositoryId = null): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
}

