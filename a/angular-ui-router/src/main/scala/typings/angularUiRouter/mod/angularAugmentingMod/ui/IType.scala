package typings.angularUiRouter.mod.angularAugmentingMod.ui

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IType extends js.Object {
  /**
    * Determines whether two decoded values are equivalent.
    *
    * @param a {any} A value to compare against.
    * @param b {any} A value to compare against.
    *
    * @returns {boolean} Returns true if the values are equivalent/equal, otherwise false.
    */
  @JSName("equals")
  var equals_FIType: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.undefined
  /**
    * The regular expression pattern used to match values of this type when coming from a substring of a URL.
    */
  var pattern: js.UndefOr[RegExp] = js.undefined
  /**
    * Converts a parameter value (from URL string or transition param) to a custom/native value.
    *
    * @param val {string} The URL parameter value to decode.
    * @param key {string} The name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
    *
    * @returns {any} Returns a custom representation of the URL parameter value.
    */
  def decode(`val`: String, key: String): js.Any
  /**
    * Encodes a custom/native type value to a string that can be embedded in a URL. Note that the return value does not need to be URL-safe (i.e. passed through encodeURIComponent()), it only needs to be a representation of val that has been coerced to a string.
    *
    * @param val {any} The value to encode.
    * @param key {string} The name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
    *
    * @returns {string} Returns a string representation of val that can be encoded in a URL.
    */
  def encode(`val`: js.Any, key: String): String
  /**
    * Detects whether a value is of a particular type. Accepts a native (decoded) value and determines whether it matches the current Type object.
    *
    * @param val {any} The value to check.
    * @param key {any} Optional. If the type check is happening in the context of a specific UrlMatcher object, this is the name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
    *
    * @returns {boolean} Returns true if the value matches the type, otherwise false.
    */
  def is(`val`: js.Any, key: String): Boolean
}

object IType {
  @scala.inline
  def apply(
    decode: (String, String) => js.Any,
    encode: (js.Any, String) => String,
    is: (js.Any, String) => Boolean,
    equals: (/* a */ js.Any, /* b */ js.Any) => Boolean = null,
    pattern: RegExp = null
  ): IType = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), is = js.Any.fromFunction2(is))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
}

