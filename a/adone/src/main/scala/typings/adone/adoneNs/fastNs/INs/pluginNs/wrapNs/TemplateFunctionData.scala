package typings.adone.adoneNs.fastNs.INs.pluginNs.wrapNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateFunctionData[T]
  extends Options
     with /* custom */ StringDictionary[js.Any] {
  var contents: js.Object
  var file: T
}

object TemplateFunctionData {
  @scala.inline
  def apply[T](
    contents: js.Object,
    file: T,
    StringDictionary: /* custom */ StringDictionary[js.Any] = null,
    escape: RegExp = null,
    evaluate: RegExp = null,
    imports: js.Object = null,
    interpolate: RegExp = null,
    parse: js.UndefOr[Boolean] = js.undefined,
    sourceURL: String = null,
    variable: String = null
  ): TemplateFunctionData[T] = {
    val __obj = js.Dynamic.literal(contents = contents, file = file.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (evaluate != null) __obj.updateDynamic("evaluate")(evaluate)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[TemplateFunctionData[T]]
  }
}

