package typings.ansiStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modifier extends js.Object {
  
  /**
  		Make text bold.
  		*/
  val bold: CSPair = js.native
  
  /**
  		Emitting only a small amount of light.
  		*/
  val dim: CSPair = js.native
  
  /**
  		Prints the text, but makes it invisible.
  		*/
  val hidden: CSPair = js.native
  
  /**
  		Inverse background and foreground colors.
  		*/
  val inverse: CSPair = js.native
  
  /**
  		Make text italic. (Not widely supported)
  		*/
  val italic: CSPair = js.native
  
  /**
  		Resets the current color chain.
  		*/
  val reset: CSPair = js.native
  
  /**
  		Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  val strikethrough: CSPair = js.native
  
  /**
  		Make text underline. (Not widely supported)
  		*/
  val underline: CSPair = js.native
}
object Modifier {
  
  @scala.inline
  def apply(
    bold: CSPair,
    dim: CSPair,
    hidden: CSPair,
    inverse: CSPair,
    italic: CSPair,
    reset: CSPair,
    strikethrough: CSPair,
    underline: CSPair
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
    def setBold(value: CSPair): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDim(value: CSPair): Self = this.set("dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: CSPair): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverse(value: CSPair): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: CSPair): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: CSPair): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: CSPair): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: CSPair): Self = this.set("underline", value.asInstanceOf[js.Any])
  }
}
