package typings.anyproxy.mod

import typings.anyproxy.anon.PartialResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeSendResponseResult extends js.Object {
  
  var response: PartialResponse = js.native
}
object BeforeSendResponseResult {
  
  @scala.inline
  def apply(response: PartialResponse): BeforeSendResponseResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSendResponseResult]
  }
  
  @scala.inline
  implicit class BeforeSendResponseResultOps[Self <: BeforeSendResponseResult] (val x: Self) extends AnyVal {
    
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
    def setResponse(value: PartialResponse): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
