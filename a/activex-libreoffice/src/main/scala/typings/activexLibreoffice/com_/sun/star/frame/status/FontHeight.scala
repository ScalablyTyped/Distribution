package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the characteristics of a font.
  *
  * For example, this can be used to select a font.
  * @since OOo 2.0
  */
@js.native
trait FontHeight extends js.Object {
  
  /** specifies the width of the font in the measure of the destination. */
  var Diff: Double = js.native
  
  /** specifies the current height of the font. */
  var Height: Double = js.native
  
  /** specifies the height of the font in the measure of the destination. */
  var Prop: Double = js.native
}
object FontHeight {
  
  @scala.inline
  def apply(Diff: Double, Height: Double, Prop: Double): FontHeight = {
    val __obj = js.Dynamic.literal(Diff = Diff.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Prop = Prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontHeight]
  }
  
  @scala.inline
  implicit class FontHeightOps[Self <: FontHeight] (val x: Self) extends AnyVal {
    
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
    def setDiff(value: Double): Self = this.set("Diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProp(value: Double): Self = this.set("Prop", value.asInstanceOf[js.Any])
  }
}
