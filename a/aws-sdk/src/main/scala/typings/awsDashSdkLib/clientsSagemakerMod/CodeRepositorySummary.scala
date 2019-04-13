package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeRepositorySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: awsDashSdkLib.clientsSagemakerMod.CodeRepositoryArn
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName
  /**
    * The date and time that the Git repository was created.
    */
  var CreationTime: awsDashSdkLib.clientsSagemakerMod.CreationTime
  /**
    * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[GitConfig] = js.undefined
  /**
    * The date and time that the Git repository was last modified.
    */
  var LastModifiedTime: awsDashSdkLib.clientsSagemakerMod.LastModifiedTime
}

object CodeRepositorySummary {
  @scala.inline
  def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: CreationTime,
    LastModifiedTime: LastModifiedTime,
    GitConfig: GitConfig = null
  ): CodeRepositorySummary = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn, CodeRepositoryName = CodeRepositoryName, CreationTime = CreationTime, LastModifiedTime = LastModifiedTime)
    if (GitConfig != null) __obj.updateDynamic("GitConfig")(GitConfig)
    __obj.asInstanceOf[CodeRepositorySummary]
  }
}

