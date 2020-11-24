package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import typings.aliOss.mod.PutChannelConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPutChannelConf extends js.Object {
  
  var data: PutChannelConf = js.native
  
  var res: NormalSuccessResponse = js.native
}
object DataPutChannelConf {
  
  @scala.inline
  def apply(data: PutChannelConf, res: NormalSuccessResponse): DataPutChannelConf = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPutChannelConf]
  }
  
  @scala.inline
  implicit class DataPutChannelConfOps[Self <: DataPutChannelConf] (val x: Self) extends AnyVal {
    
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
    def setData(value: PutChannelConf): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
}
