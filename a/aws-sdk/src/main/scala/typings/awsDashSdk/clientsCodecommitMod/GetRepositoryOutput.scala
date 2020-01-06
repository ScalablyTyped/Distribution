package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryOutput extends js.Object {
  /**
    * Information about the repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.native
}

object GetRepositoryOutput {
  @scala.inline
  def apply(repositoryMetadata: RepositoryMetadata = null): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryOutput]
  }
}

