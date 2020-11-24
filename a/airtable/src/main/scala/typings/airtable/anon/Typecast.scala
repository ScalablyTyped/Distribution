package typings.airtable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typecast extends js.Object {
  
  var typecast: Boolean = js.native
}
object Typecast {
  
  @scala.inline
  def apply(typecast: Boolean): Typecast = {
    val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typecast]
  }
  
  @scala.inline
  implicit class TypecastOps[Self <: Typecast] (val x: Self) extends AnyVal {
    
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
    def setTypecast(value: Boolean): Self = this.set("typecast", value.asInstanceOf[js.Any])
  }
}
