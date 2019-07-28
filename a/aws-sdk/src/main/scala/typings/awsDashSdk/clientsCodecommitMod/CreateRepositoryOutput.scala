package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRepositoryOutput extends js.Object {
  /**
    * Information about the newly created repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
}

object CreateRepositoryOutput {
  @scala.inline
  def apply(repositoryMetadata: RepositoryMetadata = null): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata)
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
}

