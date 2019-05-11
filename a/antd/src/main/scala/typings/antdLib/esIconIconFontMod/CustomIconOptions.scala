package typings
package antdLib.esIconIconFontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIconOptions extends js.Object {
  var extraCommonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var scriptUrl: js.UndefOr[java.lang.String] = js.undefined
}

object CustomIconOptions {
  @scala.inline
  def apply(
    extraCommonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    scriptUrl: java.lang.String = null
  ): CustomIconOptions = {
    val __obj = js.Dynamic.literal()
    if (extraCommonProps != null) __obj.updateDynamic("extraCommonProps")(extraCommonProps)
    if (scriptUrl != null) __obj.updateDynamic("scriptUrl")(scriptUrl)
    __obj.asInstanceOf[CustomIconOptions]
  }
}

