package typings.actionsOnGoogle.dialogflowConvMod

import typings.actionsOnGoogle.anon.ProtoAnystringJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemIntent extends js.Object {
  
  var data: ProtoAnystringJsonObject = js.native
  
  var intent: String = js.native
}
object SystemIntent {
  
  @scala.inline
  def apply(data: ProtoAnystringJsonObject, intent: String): SystemIntent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemIntent]
  }
  
  @scala.inline
  implicit class SystemIntentOps[Self <: SystemIntent] (val x: Self) extends AnyVal {
    
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
    def setData(value: ProtoAnystringJsonObject): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
  }
}
