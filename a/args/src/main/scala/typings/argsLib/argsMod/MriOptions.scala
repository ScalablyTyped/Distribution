package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MriOptions extends js.Object {
  var alias: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var boolean: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var string: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* param */ java.lang.String, scala.Boolean]] = js.undefined
}

object MriOptions {
  @scala.inline
  def apply(
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    args: js.Array[java.lang.String] = null,
    boolean: java.lang.String | js.Array[java.lang.String] = null,
    default: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    string: java.lang.String | js.Array[java.lang.String] = null,
    unknown: js.Function1[/* param */ java.lang.String, scala.Boolean] = null
  ): MriOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[MriOptions]
  }
}

