package typings.ansiStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorBase extends js.Object {
  
  val ansi: ColorConvert = js.native
  
  val ansi16m: ColorConvert = js.native
  
  val ansi256: ColorConvert = js.native
  
  /**
  		The ANSI terminal control sequence for ending this color.
  		*/
  val close: String = js.native
}
object ColorBase {
  
  @scala.inline
  def apply(ansi: ColorConvert, ansi16m: ColorConvert, ansi256: ColorConvert, close: String): ColorBase = {
    val __obj = js.Dynamic.literal(ansi = ansi.asInstanceOf[js.Any], ansi16m = ansi16m.asInstanceOf[js.Any], ansi256 = ansi256.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBase]
  }
  
  @scala.inline
  implicit class ColorBaseOps[Self <: ColorBase] (val x: Self) extends AnyVal {
    
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
    def setAnsi(value: ColorConvert): Self = this.set("ansi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnsi16m(value: ColorConvert): Self = this.set("ansi16m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnsi256(value: ColorConvert): Self = this.set("ansi256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
  }
}
