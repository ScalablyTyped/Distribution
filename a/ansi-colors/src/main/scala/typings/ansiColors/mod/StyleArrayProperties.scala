package typings.ansiColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleArrayProperties extends js.Object {
  
  var close: String = js.native
  
  var closeRe: String = js.native
  
  var open: String = js.native
}
object StyleArrayProperties {
  
  @scala.inline
  def apply(close: String, closeRe: String, open: String): StyleArrayProperties = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], closeRe = closeRe.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleArrayProperties]
  }
  
  @scala.inline
  implicit class StyleArrayPropertiesOps[Self <: StyleArrayProperties] (val x: Self) extends AnyVal {
    
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseRe(value: String): Self = this.set("closeRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
  }
}
