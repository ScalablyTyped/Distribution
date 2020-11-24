package typings.atomKeymap.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTarget extends js.Object {
  
  var defaultTarget: js.UndefOr[HTMLElement] = js.native
}
object DefaultTarget {
  
  @scala.inline
  def apply(): DefaultTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTarget]
  }
  
  @scala.inline
  implicit class DefaultTargetOps[Self <: DefaultTarget] (val x: Self) extends AnyVal {
    
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
    def setDefaultTarget(value: HTMLElement): Self = this.set("defaultTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTarget: Self = this.set("defaultTarget", js.undefined)
  }
}
