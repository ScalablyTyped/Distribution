package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inactive extends js.Object {
  
  var active: NameStyle = js.native
  
  var inactive: MarkerStyleNameStyle = js.native
  
  var unchecked: MarkerStyle = js.native
}
object Inactive {
  
  @scala.inline
  def apply(active: NameStyle, inactive: MarkerStyleNameStyle, unchecked: MarkerStyle): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  
  @scala.inline
  implicit class InactiveOps[Self <: Inactive] (val x: Self) extends AnyVal {
    
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
    def setActive(value: NameStyle): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: MarkerStyleNameStyle): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnchecked(value: MarkerStyle): Self = this.set("unchecked", value.asInstanceOf[js.Any])
  }
}
