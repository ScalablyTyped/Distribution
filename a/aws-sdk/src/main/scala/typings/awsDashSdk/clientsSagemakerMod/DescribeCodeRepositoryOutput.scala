package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCodeRepositoryOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typings.awsDashSdk.clientsSagemakerMod.CodeRepositoryArn
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName
  /**
    * The date and time that the repository was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime
  /**
    * Configuration details about the repository, including the URL where the repository is located, the default branch, and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.GitConfig] = js.undefined
  /**
    * The date and time that the repository was last changed.
    */
  var LastModifiedTime: typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime
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
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn, CodeRepositoryName = CodeRepositoryName, CreationTime = CreationTime, LastModifiedTime = LastModifiedTime)
    if (GitConfig != null) __obj.updateDynamic("GitConfig")(GitConfig)
    __obj.asInstanceOf[DescribeCodeRepositoryOutput]
  }
}

