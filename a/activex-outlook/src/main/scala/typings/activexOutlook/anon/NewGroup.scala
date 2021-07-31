package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewGroup extends StObject {
  
  val NewGroup: OutlookBarGroup
}
object NewGroup {
  
  @scala.inline
  def apply(NewGroup: OutlookBarGroup): NewGroup = {
    val __obj = js.Dynamic.literal(NewGroup = NewGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewGroup]
  }
  
  @scala.inline
  implicit class NewGroupMutableBuilder[Self <: NewGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewGroup(value: OutlookBarGroup): Self = StObject.set(x, "NewGroup", value.asInstanceOf[js.Any])
  }
}
