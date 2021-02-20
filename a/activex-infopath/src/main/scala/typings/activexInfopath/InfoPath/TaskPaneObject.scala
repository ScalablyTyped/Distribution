package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskPaneObject extends StObject {
  
  @JSName("InfoPath.TaskPaneObject_typekey")
  var InfoPathDotTaskPaneObject_typekey: TaskPaneObject = js.native
  
  val Type: XdTaskPaneType = js.native
  
  var Visible: Boolean = js.native
}
object TaskPaneObject {
  
  @scala.inline
  def apply(InfoPathDotTaskPaneObject_typekey: TaskPaneObject, Type: XdTaskPaneType, Visible: Boolean): TaskPaneObject = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.TaskPaneObject_typekey")(InfoPathDotTaskPaneObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPaneObject]
  }
  
  @scala.inline
  implicit class TaskPaneObjectMutableBuilder[Self <: TaskPaneObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotTaskPaneObject_typekey(value: TaskPaneObject): Self = StObject.set(x, "InfoPath.TaskPaneObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XdTaskPaneType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
