package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToGroup extends StObject {
  
  var Cancel: Boolean
  
  val ToGroup: OutlookBarGroup
}
object ToGroup {
  
  @scala.inline
  def apply(Cancel: Boolean, ToGroup: OutlookBarGroup): ToGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ToGroup = ToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToGroup]
  }
  
  @scala.inline
  implicit class ToGroupMutableBuilder[Self <: ToGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToGroup(value: OutlookBarGroup): Self = StObject.set(x, "ToGroup", value.asInstanceOf[js.Any])
  }
}
