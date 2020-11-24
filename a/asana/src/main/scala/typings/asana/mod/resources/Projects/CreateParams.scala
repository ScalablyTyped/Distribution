package typings.asana.mod.resources.Projects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParams extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var due_date: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var team: js.UndefOr[String | Double] = js.native
}
object CreateParams {
  
  @scala.inline
  def apply(): CreateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParams]
  }
  
  @scala.inline
  implicit class CreateParamsOps[Self <: CreateParams] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDue_date(value: String): Self = this.set("due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDue_date: Self = this.set("due_date", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setTeam(value: String | Double): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
  }
}
