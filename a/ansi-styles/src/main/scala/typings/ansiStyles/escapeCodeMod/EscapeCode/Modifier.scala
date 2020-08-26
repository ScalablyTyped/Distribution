package typings.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifier extends js.Object {
  var bold: CodePair = js.native
  var dim: CodePair = js.native
  var hidden: CodePair = js.native
  var inverse: CodePair = js.native
  /**
    * Not widely supported
    */
  var italic: CodePair = js.native
  var reset: CodePair = js.native
  /**
    * Not widely supported
    */
  var strikethrough: CodePair = js.native
  var underline: CodePair = js.native
}

object Modifier {
  @scala.inline
  def apply(
    bold: CodePair,
    dim: CodePair,
    hidden: CodePair,
    inverse: CodePair,
    italic: CodePair,
    reset: CodePair,
    strikethrough: CodePair,
    underline: CodePair
  ): Modifier = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], dim = dim.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifier]
  }
  @scala.inline
  implicit class ModifierOps[Self <: Modifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBold(value: CodePair): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setDim(value: CodePair): Self = this.set("dim", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: CodePair): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverse(value: CodePair): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def setItalic(value: CodePair): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: CodePair): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikethrough(value: CodePair): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: CodePair): Self = this.set("underline", value.asInstanceOf[js.Any])
  }
  
}

