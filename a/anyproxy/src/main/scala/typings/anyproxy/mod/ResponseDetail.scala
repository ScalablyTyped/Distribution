package typings.anyproxy.mod

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseDetail extends js.Object {
  
  var _res: ServerResponse = js.native
  
  var response: Response = js.native
}
object ResponseDetail {
  
  @scala.inline
  def apply(_res: ServerResponse, response: Response): ResponseDetail = {
    val __obj = js.Dynamic.literal(_res = _res.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDetail]
  }
  
  @scala.inline
  implicit class ResponseDetailOps[Self <: ResponseDetail] (val x: Self) extends AnyVal {
    
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
    def set_res(value: ServerResponse): Self = this.set("_res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
