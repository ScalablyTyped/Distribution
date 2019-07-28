package typings.astring.astringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** generate comments if true (defaults to false) */
  var comments: js.UndefOr[Boolean] = js.undefined
  /** custom code generator (defaults to astring.baseGenerator) */
  var generator: js.UndefOr[js.Object] = js.undefined
  /** string to use for indentation (defaults to "  ") */
  var indent: js.UndefOr[String] = js.undefined
  /** string to use for line endings (defaults to "\n") */
  var lineEnd: js.UndefOr[String] = js.undefined
  /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
  var sourceMap: js.UndefOr[js.Any] = js.undefined
  /** indent level to start from (defaults to 0) */
  var startingIndentLevel: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    comments: js.UndefOr[Boolean] = js.undefined,
    generator: js.Object = null,
    indent: String = null,
    lineEnd: String = null,
    sourceMap: js.Any = null,
    startingIndentLevel: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (generator != null) __obj.updateDynamic("generator")(generator)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (lineEnd != null) __obj.updateDynamic("lineEnd")(lineEnd)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    if (startingIndentLevel != null) __obj.updateDynamic("startingIndentLevel")(startingIndentLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

