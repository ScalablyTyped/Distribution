package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Membership extends StObject {
  
  var project: typings.asana.mod.resources.Resource = js.native
  
  var section: typings.asana.mod.resources.Resource | Null = js.native
}
object Membership {
  
  @scala.inline
  def apply(project: typings.asana.mod.resources.Resource): Membership = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit class MembershipMutableBuilder[Self <: Membership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: typings.asana.mod.resources.Resource): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: typings.asana.mod.resources.Resource): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionNull: Self = StObject.set(x, "section", null)
  }
}
