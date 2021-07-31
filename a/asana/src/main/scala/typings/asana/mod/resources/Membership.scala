package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Membership extends StObject {
  
  var project: Resource
  
  var section: Resource | Null
}
object Membership {
  
  @scala.inline
  def apply(project: Resource): Membership = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], section = null)
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit class MembershipMutableBuilder[Self <: Membership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: Resource): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: Resource): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionNull: Self = StObject.set(x, "section", null)
  }
}
