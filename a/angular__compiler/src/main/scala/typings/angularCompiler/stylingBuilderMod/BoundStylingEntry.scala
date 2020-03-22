package typings.angularCompiler.stylingBuilderMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An internal record of the input data for a styling binding
  */
trait BoundStylingEntry extends js.Object {
  var hasOverrideFlag: Boolean
  var name: String | Null
  var sanitize: Boolean
  var sourceSpan: ParseSourceSpan
  var unit: String | Null
  var value: AST
}

object BoundStylingEntry {
  @scala.inline
  def apply(
    hasOverrideFlag: Boolean,
    sanitize: Boolean,
    sourceSpan: ParseSourceSpan,
    value: AST,
    name: String = null,
    unit: String = null
  ): BoundStylingEntry = {
    val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], sanitize = sanitize.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundStylingEntry]
  }
}

