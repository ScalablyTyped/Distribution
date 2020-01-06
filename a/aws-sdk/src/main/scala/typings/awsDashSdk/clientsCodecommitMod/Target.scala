package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The branch of the repository where the pull request changes are merged. Also known as the destination branch.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: ReferenceName = js.native
}

object Target {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    sourceReference: ReferenceName,
    destinationReference: ReferenceName = null
  ): Target = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], sourceReference = sourceReference.asInstanceOf[js.Any])
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

