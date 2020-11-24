package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorEntity extends js.Object {
  
  /**
    *  Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If another call is made with entitiesPath = "the_current_entity_name_with_hasNestedEntities_true", then it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a recursive fashion. 
    */
  var hasNestedEntities: js.UndefOr[Boolean] = js.native
  
  /**
    *  The label applied to the connector entity. 
    */
  var label: js.UndefOr[Label] = js.native
  
  /**
    *  The name of the connector entity. 
    */
  var name: Name = js.native
}
object ConnectorEntity {
  
  @scala.inline
  def apply(name: Name): ConnectorEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorEntity]
  }
  
  @scala.inline
  implicit class ConnectorEntityOps[Self <: ConnectorEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNestedEntities(value: Boolean): Self = this.set("hasNestedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasNestedEntities: Self = this.set("hasNestedEntities", js.undefined)
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
