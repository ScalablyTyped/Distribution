package typings.args.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimistOptions extends js.Object {
  var `--`: js.UndefOr[Boolean] = js.undefined
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var stopEarly: js.UndefOr[Boolean] = js.undefined
  var string: js.UndefOr[String | js.Array[String]] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.undefined
}

object MinimistOptions {
  @scala.inline
  def apply(
    `--`: js.UndefOr[Boolean] = js.undefined,
    alias: StringDictionary[String | js.Array[String]] = null,
    boolean: Boolean | String | js.Array[String] = null,
    default: StringDictionary[js.Any] = null,
    stopEarly: js.UndefOr[Boolean] = js.undefined,
    string: String | js.Array[String] = null,
    unknown: /* param */ String => Boolean = null
  ): MinimistOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`.get.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly.get.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[MinimistOptions]
  }
}

