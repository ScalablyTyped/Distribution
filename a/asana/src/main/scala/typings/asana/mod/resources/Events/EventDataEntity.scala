package typings.asana.mod.resources.Events

import typings.asana.mod.resources.Users.ShortType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDataEntity extends js.Object {
  
  var action: String = js.native
  
  var created_at: String = js.native
  
  var parent: EventTask | EventProject | EventSection | Null = js.native
  
  var resource: EventTask | EventProject | EventSection | EventStory = js.native
  
  var `type`: String = js.native
  
  var user: ShortType | Null = js.native
}
object EventDataEntity {
  
  @scala.inline
  def apply(
    action: String,
    created_at: String,
    resource: EventTask | EventProject | EventSection | EventStory,
    `type`: String
  ): EventDataEntity = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDataEntity]
  }
  
  @scala.inline
  implicit class EventDataEntityOps[Self <: EventDataEntity] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: EventTask | EventProject | EventSection | EventStory): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: EventTask | EventProject | EventSection): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setUser(value: ShortType): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
}
