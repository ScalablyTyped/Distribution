package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRepositoryOutput extends js.Object {
  /**
    * Information about the newly created repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.native
}

object CreateRepositoryOutput {
  @scala.inline
  def apply(repositoryMetadata: RepositoryMetadata = null): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
}

