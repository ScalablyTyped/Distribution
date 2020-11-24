package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewData extends js.Object {
  
  var NewData: String = js.native
  
  var Response: Double = js.native
}
object NewData {
  
  @scala.inline
  def apply(NewData: String, Response: Double): NewData = {
    val __obj = js.Dynamic.literal(NewData = NewData.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewData]
  }
  
  @scala.inline
  implicit class NewDataOps[Self <: NewData] (val x: Self) extends AnyVal {
    
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
    def setNewData(value: String): Self = this.set("NewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Double): Self = this.set("Response", value.asInstanceOf[js.Any])
  }
}
