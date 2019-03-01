package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectLocale extends js.Object {
  var notFoundContent: js.UndefOr[java.lang.String] = js.undefined
}

object SelectLocale {
  @scala.inline
  def apply(notFoundContent: java.lang.String = null): SelectLocale = {
    val __obj = js.Dynamic.literal()
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent)
    __obj.asInstanceOf[SelectLocale]
  }
}

