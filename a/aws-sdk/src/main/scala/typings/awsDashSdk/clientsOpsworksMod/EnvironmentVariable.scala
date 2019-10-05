package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentVariable extends js.Object {
  /**
    * (Required) The environment variable's name, which can consist of up to 64 characters and must be specified. The name can contain upper- and lowercase letters, numbers, and underscores (_), but it must start with a letter or underscore.
    */
  var Key: String
  /**
    * (Optional) Whether the variable's value will be returned by the DescribeApps action. To conceal an environment variable's value, set Secure to true. DescribeApps then returns *****FILTERED***** instead of the actual value. The default value for Secure is false. 
    */
  var Secure: js.UndefOr[Boolean] = js.undefined
  /**
    * (Optional) The environment variable's value, which can be left empty. If you specify a value, it can contain up to 256 characters, which must all be printable.
    */
  var Value: String
}

object EnvironmentVariable {
  @scala.inline
  def apply(Key: String, Value: String, Secure: js.UndefOr[scala.Boolean] = js.undefined): EnvironmentVariable = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
    if (!js.isUndefined(Secure)) __obj.updateDynamic("Secure")(Secure)
    __obj.asInstanceOf[EnvironmentVariable]
  }
}

