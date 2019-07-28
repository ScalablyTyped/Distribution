package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConfig extends js.Object {
  /**
    * The default branch for the Git repository.
    */
  var Branch: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.Branch] = js.undefined
  /**
    * The URL where the Git repository is located.
    */
  var RepositoryUrl: GitConfigUrl
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SecretArn] = js.undefined
}

object GitConfig {
  @scala.inline
  def apply(RepositoryUrl: GitConfigUrl, Branch: Branch = null, SecretArn: SecretArn = null): GitConfig = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl)
    if (Branch != null) __obj.updateDynamic("Branch")(Branch)
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn)
    __obj.asInstanceOf[GitConfig]
  }
}

