package typings.atAntvG2

import org.scalablytyped.runtime.StringDictionary
import typings.atAntvG2.atAntvG2Mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var offset: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[text] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    offset: Int | Double = null,
    textStyle: text = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

