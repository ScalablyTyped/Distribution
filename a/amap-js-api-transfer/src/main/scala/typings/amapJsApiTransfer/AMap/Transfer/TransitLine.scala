package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitLine extends js.Object {
  
  /**
    * 公交路线末班车时间
    */
  var etime: String | js.Array[scala.Nothing] = js.native
  
  /**
    * 公交路线ID
    */
  var id: String = js.native
  
  /**
    * 公交路线名
    */
  var name: String = js.native
  
  /**
    * 公交路线首班车时间
    */
  var stime: String | js.Array[scala.Nothing] = js.native
  
  /**
    * 公交类型
    */
  var `type`: String = js.native
}
object TransitLine {
  
  @scala.inline
  def apply(
    etime: String | js.Array[scala.Nothing],
    id: String,
    name: String,
    stime: String | js.Array[scala.Nothing],
    `type`: String
  ): TransitLine = {
    val __obj = js.Dynamic.literal(etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitLine]
  }
  
  @scala.inline
  implicit class TransitLineOps[Self <: TransitLine] (val x: Self) extends AnyVal {
    
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
    def setEtimeVarargs(value: scala.Nothing*): Self = this.set("etime", js.Array(value :_*))
    
    @scala.inline
    def setEtime(value: String | js.Array[scala.Nothing]): Self = this.set("etime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStimeVarargs(value: scala.Nothing*): Self = this.set("stime", js.Array(value :_*))
    
    @scala.inline
    def setStime(value: String | js.Array[scala.Nothing]): Self = this.set("stime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
