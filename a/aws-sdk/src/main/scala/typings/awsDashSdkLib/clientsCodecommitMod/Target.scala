package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /**
    * The branch of the repository where the pull request changes will be merged into. Also known as the destination branch.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.undefined
  /**
    * The name of the repository that contains the pull request.
    */
  var repositoryName: RepositoryName
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: ReferenceName
}

object Target {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    sourceReference: ReferenceName,
    destinationReference: ReferenceName = null
  ): Target = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName, sourceReference = sourceReference)
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference)
    __obj.asInstanceOf[Target]
  }
}

