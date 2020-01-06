package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeRepositoryOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typings.awsDashSdk.clientsSagemakerMod.CodeRepositoryArn = js.native
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * The date and time that the repository was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime = js.native
  /**
    * Configuration details about the repository, including the URL where the repository is located, the default branch, and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.GitConfig] = js.native
  /**
    * The date and time that the repository was last changed.
    */
  var LastModifiedTime: typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime = js.native
}

object DescribeCodeRepositoryOutput {
  @scala.inline
  def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: CreationTime,
    LastModifiedTime: LastModifiedTime,
    GitConfig: GitConfig = null
  ): DescribeCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any], CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    if (GitConfig != null) __obj.updateDynamic("GitConfig")(GitConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryOutput]
  }
}

