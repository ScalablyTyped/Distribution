package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryOutput extends js.Object {
  /**
    * Information about the repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
}

object GetRepositoryOutput {
  @scala.inline
  def apply(repositoryMetadata: RepositoryMetadata = null): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata)
    __obj.asInstanceOf[GetRepositoryOutput]
  }
}

