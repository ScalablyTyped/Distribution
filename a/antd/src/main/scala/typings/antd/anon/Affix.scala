package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Affix extends js.Object {
  
  var affix: Boolean = js.native
  
  var showInkInFixed: Boolean = js.native
}
object Affix {
  
  @scala.inline
  def apply(affix: Boolean, showInkInFixed: Boolean): Affix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affix]
  }
  
  @scala.inline
  implicit class AffixOps[Self <: Affix] (val x: Self) extends AnyVal {
    
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
    def setAffix(value: Boolean): Self = this.set("affix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInkInFixed(value: Boolean): Self = this.set("showInkInFixed", value.asInstanceOf[js.Any])
  }
}
