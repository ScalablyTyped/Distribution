package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameParams extends js.Object {
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AnonNameParams {
  @scala.inline
  def apply(params: StringDictionary[js.Any] = null): AnonNameParams = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameParams]
  }
}

