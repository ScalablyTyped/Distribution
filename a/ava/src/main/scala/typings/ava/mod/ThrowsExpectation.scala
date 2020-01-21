package typings.ava.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrowsExpectation extends js.Object {
  /** The thrown error must have a code that equals the given string or number. */
  var code: js.UndefOr[String | Double] = js.undefined
  /** The thrown error must be an instance of this constructor. */
  var instanceOf: js.UndefOr[Constructor] = js.undefined
  /** The thrown error must be strictly equal to this value. */
  var is: js.UndefOr[Error] = js.undefined
  /** The thrown error must have a message that equals the given string, or matches the regular expression. */
  var message: js.UndefOr[String | RegExp] = js.undefined
  /** The thrown error must have a name that equals the given string. */
  var name: js.UndefOr[String] = js.undefined
}

object ThrowsExpectation {
  @scala.inline
  def apply(
    code: String | Double = null,
    instanceOf: Constructor = null,
    is: Error = null,
    message: String | RegExp = null,
    name: String = null
  ): ThrowsExpectation = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (instanceOf != null) __obj.updateDynamic("instanceOf")(instanceOf.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowsExpectation]
  }
}

