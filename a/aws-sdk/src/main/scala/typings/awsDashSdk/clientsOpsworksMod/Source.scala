package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /**
    * When included in a request, the parameter depends on the repository type.   For Amazon S3 bundles, set Password to the appropriate IAM secret access key.   For HTTP bundles and Subversion repositories, set Password to the password.   For more information on how to safely handle IAM credentials, see https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html. In responses, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var Password: js.UndefOr[String] = js.undefined
  /**
    * The application's version. AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the simplest approaches is to have branches or revisions in your repository that represent different versions that can potentially be deployed.
    */
  var Revision: js.UndefOr[String] = js.undefined
  /**
    * In requests, the repository's SSH key. In responses, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var SshKey: js.UndefOr[String] = js.undefined
  /**
    * The repository type.
    */
  var Type: js.UndefOr[SourceType] = js.undefined
  /**
    * The source URL. The following is an example of an Amazon S3 source URL: https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz.
    */
  var Url: js.UndefOr[String] = js.undefined
  /**
    * This parameter depends on the repository type.   For Amazon S3 bundles, set Username to the appropriate IAM access key ID.   For HTTP bundles, Git repositories, and Subversion repositories, set Username to the user name.  
    */
  var Username: js.UndefOr[String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    Password: String = null,
    Revision: String = null,
    SshKey: String = null,
    Type: SourceType = null,
    Url: String = null,
    Username: String = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (Revision != null) __obj.updateDynamic("Revision")(Revision)
    if (SshKey != null) __obj.updateDynamic("SshKey")(SshKey)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[Source]
  }
}

