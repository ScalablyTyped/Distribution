package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryMetadata extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the repository.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * The ID of the AWS account associated with the repository.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  var cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.undefined
  /**
    * The URL to use for cloning the repository over SSH.
    */
  var cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.undefined
  /**
    * The date and time the repository was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * The repository's default branch name.
    */
  var defaultBranch: js.UndefOr[BranchName] = js.undefined
  /**
    * The date and time the repository was last modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
  /**
    * A comment or description about the repository.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  /**
    * The ID of the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  /**
    * The repository's name.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}

object RepositoryMetadata {
  @scala.inline
  def apply(
    Arn: Arn = null,
    accountId: AccountId = null,
    cloneUrlHttp: CloneUrlHttp = null,
    cloneUrlSsh: CloneUrlSsh = null,
    creationDate: CreationDate = null,
    defaultBranch: BranchName = null,
    lastModifiedDate: LastModifiedDate = null,
    repositoryDescription: RepositoryDescription = null,
    repositoryId: RepositoryId = null,
    repositoryName: RepositoryName = null
  ): RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (cloneUrlHttp != null) __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp)
    if (cloneUrlSsh != null) __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription)
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[RepositoryMetadata]
  }
}

