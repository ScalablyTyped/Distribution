package typings.antvScale.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tick extends js.Object {
  
  /** 展示名 */
  var text: String = js.native
  
  /** 定义域值 */
  var tickValue: String | Double = js.native
  
  /** 值域值 */
  var value: Double = js.native
}
object Tick {
  
  @scala.inline
  def apply(text: String, tickValue: String | Double, value: Double): Tick = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tickValue = tickValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tick]
  }
  
  @scala.inline
  implicit class TickOps[Self <: Tick] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickValue(value: String | Double): Self = this.set("tickValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
