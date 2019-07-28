package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterResult extends js.Object {
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameter] = js.undefined
}

object GetParameterResult {
  @scala.inline
  def apply(Parameter: Parameter = null): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    if (Parameter != null) __obj.updateDynamic("Parameter")(Parameter)
    __obj.asInstanceOf[GetParameterResult]
  }
}

