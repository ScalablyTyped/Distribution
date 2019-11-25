package typings.antd.libIconIconFontMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIconOptions extends js.Object {
  var extraCommonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var scriptUrl: js.UndefOr[String] = js.undefined
}

object CustomIconOptions {
  @scala.inline
  def apply(extraCommonProps: StringDictionary[js.Any] = null, scriptUrl: String = null): CustomIconOptions = {
    val __obj = js.Dynamic.literal()
    if (extraCommonProps != null) __obj.updateDynamic("extraCommonProps")(extraCommonProps.asInstanceOf[js.Any])
    if (scriptUrl != null) __obj.updateDynamic("scriptUrl")(scriptUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomIconOptions]
  }
}

