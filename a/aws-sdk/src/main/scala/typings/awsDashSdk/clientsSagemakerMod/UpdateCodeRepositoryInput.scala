package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to update.
    */
  var CodeRepositoryName: EntityName
  /**
    * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var GitConfig: js.UndefOr[GitConfigForUpdate] = js.undefined
}

object UpdateCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName, GitConfig: GitConfigForUpdate = null): UpdateCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName)
    if (GitConfig != null) __obj.updateDynamic("GitConfig")(GitConfig)
    __obj.asInstanceOf[UpdateCodeRepositoryInput]
  }
}

