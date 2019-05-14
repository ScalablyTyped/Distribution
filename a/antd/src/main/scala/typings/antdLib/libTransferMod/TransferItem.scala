package typings
package antdLib.libTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferItem
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var key: java.lang.String
  var title: java.lang.String
}

object TransferItem {
  @scala.inline
  def apply(
    key: java.lang.String,
    title: java.lang.String,
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    description: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): TransferItem = {
    val __obj = js.Dynamic.literal(key = key, title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[TransferItem]
  }
}

