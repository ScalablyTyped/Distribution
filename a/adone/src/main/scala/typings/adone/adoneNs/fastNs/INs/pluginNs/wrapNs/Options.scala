package typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var escape: js.UndefOr[RegExp] = js.undefined
  var evaluate: js.UndefOr[RegExp] = js.undefined
  var imports: js.UndefOr[js.Object] = js.undefined
  var interpolate: js.UndefOr[RegExp] = js.undefined
  /**
    * Set to explicit false value to disable automatic JSON, JSON5 and YAML parsing
    */
  var parse: js.UndefOr[Boolean] = js.undefined
  var sourceURL: js.UndefOr[String] = js.undefined
  var variable: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    escape: RegExp = null,
    evaluate: RegExp = null,
    imports: js.Object = null,
    interpolate: RegExp = null,
    parse: js.UndefOr[Boolean] = js.undefined,
    sourceURL: String = null,
    variable: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (evaluate != null) __obj.updateDynamic("evaluate")(evaluate)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[Options]
  }
}

