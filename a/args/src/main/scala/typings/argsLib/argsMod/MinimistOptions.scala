package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimistOptions extends js.Object {
  var `--`: js.UndefOr[scala.Boolean] = js.undefined
  var alias: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  var boolean: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var stopEarly: js.UndefOr[scala.Boolean] = js.undefined
  var string: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* param */ java.lang.String, scala.Boolean]] = js.undefined
}

object MinimistOptions {
  @scala.inline
  def apply(
    `--`: js.UndefOr[scala.Boolean] = js.undefined,
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    boolean: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    default: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    stopEarly: js.UndefOr[scala.Boolean] = js.undefined,
    string: java.lang.String | js.Array[java.lang.String] = null,
    unknown: js.Function1[/* param */ java.lang.String, scala.Boolean] = null
  ): MinimistOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly)
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[MinimistOptions]
  }
}

