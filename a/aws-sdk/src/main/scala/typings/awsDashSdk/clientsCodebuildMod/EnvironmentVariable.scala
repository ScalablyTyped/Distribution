package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentVariable extends js.Object {
  /**
    * The name or key of the environment variable.
    */
  var name: NonEmptyString = js.native
  /**
    * The type of environment variable. Valid values include:    PARAMETER_STORE: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.    PLAINTEXT: An environment variable in plain text format.    SECRETS_MANAGER: An environment variable stored in AWS Secrets Manager.  
    */
  var `type`: js.UndefOr[EnvironmentVariableType] = js.native
  /**
    * The value of the environment variable.  We strongly discourage the use of environment variables to store sensitive values, especially AWS secret key IDs and secret access keys. Environment variables can be displayed in plain text using the AWS CodeBuild console and the AWS Command Line Interface (AWS CLI). 
    */
  var value: String = js.native
}

object EnvironmentVariable {
  @scala.inline
  def apply(name: NonEmptyString, value: String, `type`: EnvironmentVariableType = null): EnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariable]
  }
}

