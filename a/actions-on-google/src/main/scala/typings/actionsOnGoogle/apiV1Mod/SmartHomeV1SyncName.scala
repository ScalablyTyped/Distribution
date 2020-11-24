package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncName extends js.Object {
  
  var defaultNames: js.Array[String] = js.native
  
  var name: String = js.native
  
  var nicknames: js.Array[String] = js.native
}
object SmartHomeV1SyncName {
  
  @scala.inline
  def apply(defaultNames: js.Array[String], name: String, nicknames: js.Array[String]): SmartHomeV1SyncName = {
    val __obj = js.Dynamic.literal(defaultNames = defaultNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nicknames = nicknames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncName]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncNameOps[Self <: SmartHomeV1SyncName] (val x: Self) extends AnyVal {
    
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
    def setDefaultNamesVarargs(value: String*): Self = this.set("defaultNames", js.Array(value :_*))
    
    @scala.inline
    def setDefaultNames(value: js.Array[String]): Self = this.set("defaultNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknamesVarargs(value: String*): Self = this.set("nicknames", js.Array(value :_*))
    
    @scala.inline
    def setNicknames(value: js.Array[String]): Self = this.set("nicknames", value.asInstanceOf[js.Any])
  }
}
