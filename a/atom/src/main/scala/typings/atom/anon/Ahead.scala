package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ahead extends js.Object {
  
  var ahead: Double = js.native
  
  var behind: Double = js.native
}
object Ahead {
  
  @scala.inline
  def apply(ahead: Double, behind: Double): Ahead = {
    val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], behind = behind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ahead]
  }
  
  @scala.inline
  implicit class AheadOps[Self <: Ahead] (val x: Self) extends AnyVal {
    
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
    def setAhead(value: Double): Self = this.set("ahead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehind(value: Double): Self = this.set("behind", value.asInstanceOf[js.Any])
  }
}
