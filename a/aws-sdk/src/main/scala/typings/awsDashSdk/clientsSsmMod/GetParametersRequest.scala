package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParametersRequest extends js.Object {
  /**
    * Names of the parameters for which you want to query information.
    */
  var Names: ParameterNameList
  /**
    * Return decrypted secure string value. Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}

object GetParametersRequest {
  @scala.inline
  def apply(Names: ParameterNameList, WithDecryption: js.UndefOr[scala.Boolean] = js.undefined): GetParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names)
    if (!js.isUndefined(WithDecryption)) __obj.updateDynamic("WithDecryption")(WithDecryption)
    __obj.asInstanceOf[GetParametersRequest]
  }
}

