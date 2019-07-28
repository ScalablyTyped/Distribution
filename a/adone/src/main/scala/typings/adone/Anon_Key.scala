package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  /**
    * A function that alters the behavior of the stringification process,
    * or an array of String and Number objects that serve as a whitelist
    * for selecting/filtering the properties of the value object to be included in the JSON string
    */
  var replacer: js.UndefOr[(js.Function2[/* key */ String, /* value */ js.Any, _]) | js.Array[String]] = js.undefined
  /**
    * Indent spaces for pretty-printing
    */
  var space: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    replacer: (js.Function2[/* key */ String, /* value */ js.Any, _]) | js.Array[String] = null,
    space: String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[Anon_Key]
  }
}

