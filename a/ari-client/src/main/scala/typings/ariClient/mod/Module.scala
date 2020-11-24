package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends js.Object {
  
  /**
    * The description of this module.
    */
  var description: String = js.native
  
  /**
    * The name of this module.
    */
  var name: String = js.native
  
  /**
    * The running status of this module.
    */
  var status: String = js.native
  
  /**
    * The support state of this module.
    */
  var support_level: String = js.native
  
  /**
    * The number of times this module is being used.
    */
  var use_count: Double = js.native
}
object Module {
  
  @scala.inline
  def apply(description: String, name: String, status: String, support_level: String, use_count: Double): Module = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], support_level = support_level.asInstanceOf[js.Any], use_count = use_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupport_level(value: String): Self = this.set("support_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_count(value: Double): Self = this.set("use_count", value.asInstanceOf[js.Any])
  }
}
