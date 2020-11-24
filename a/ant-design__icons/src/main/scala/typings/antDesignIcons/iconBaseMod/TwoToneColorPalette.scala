package typings.antDesignIcons.iconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwoToneColorPalette extends TwoToneColorPaletteSetter {
  
  var calculated: js.UndefOr[Boolean] = js.native
}
object TwoToneColorPalette {
  
  @scala.inline
  def apply(primaryColor: String): TwoToneColorPalette = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoToneColorPalette]
  }
  
  @scala.inline
  implicit class TwoToneColorPaletteOps[Self <: TwoToneColorPalette] (val x: Self) extends AnyVal {
    
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
    def setCalculated(value: Boolean): Self = this.set("calculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculated: Self = this.set("calculated", js.undefined)
  }
}
