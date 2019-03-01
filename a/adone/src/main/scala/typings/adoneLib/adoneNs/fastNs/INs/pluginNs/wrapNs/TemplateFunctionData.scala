package typings
package adoneLib.adoneNs.fastNs.INs.pluginNs.wrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateFunctionData[T]
  extends Options
     with /* custom */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var contents: js.Object
  var file: T
}

object TemplateFunctionData {
  @scala.inline
  def apply[T](
    contents: js.Object,
    file: T,
    StringDictionary: /* custom */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    escape: stdLib.RegExp = null,
    evaluate: stdLib.RegExp = null,
    imports: js.Object = null,
    interpolate: stdLib.RegExp = null,
    parse: js.UndefOr[scala.Boolean] = js.undefined,
    sourceURL: java.lang.String = null,
    variable: java.lang.String = null
  ): TemplateFunctionData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contents")(contents)
    __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
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

