package typings
package adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var escape: js.UndefOr[stdLib.RegExp] = js.undefined
  var evaluate: js.UndefOr[stdLib.RegExp] = js.undefined
  var imports: js.UndefOr[js.Object] = js.undefined
  var interpolate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Set to explicit false value to disable automatic JSON, JSON5 and YAML parsing
    */
  var parse: js.UndefOr[scala.Boolean] = js.undefined
  var sourceURL: js.UndefOr[java.lang.String] = js.undefined
  var variable: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    escape: stdLib.RegExp = null,
    evaluate: stdLib.RegExp = null,
    imports: js.Object = null,
    interpolate: stdLib.RegExp = null,
    parse: js.UndefOr[scala.Boolean] = js.undefined,
    sourceURL: java.lang.String = null,
    variable: java.lang.String = null
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

