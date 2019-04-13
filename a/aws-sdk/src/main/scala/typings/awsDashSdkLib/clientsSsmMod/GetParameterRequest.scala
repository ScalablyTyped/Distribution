package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterRequest extends js.Object {
  /**
    * The name of the parameter you want to query.
    */
  var Name: PSParameterName
  /**
    * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}

object GetParameterRequest {
  @scala.inline
  def apply(Name: PSParameterName, WithDecryption: js.UndefOr[Boolean] = js.undefined): GetParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(WithDecryption)) __obj.updateDynamic("WithDecryption")(WithDecryption)
    __obj.asInstanceOf[GetParameterRequest]
  }
}

