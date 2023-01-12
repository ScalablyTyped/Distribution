package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPaneObject extends StObject {
  
  /* private */ @JSName("InfoPath.TaskPaneObject_typekey")
  var InfoPathDotTaskPaneObject_typekey: TaskPaneObject
  
  val Type: XdTaskPaneType
  
  var Visible: Boolean
}
object TaskPaneObject {
  
  inline def apply(InfoPathDotTaskPaneObject_typekey: TaskPaneObject, Type: XdTaskPaneType, Visible: Boolean): TaskPaneObject = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.TaskPaneObject_typekey")(InfoPathDotTaskPaneObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPaneObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskPaneObject] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotTaskPaneObject_typekey(value: TaskPaneObject): Self = StObject.set(x, "InfoPath.TaskPaneObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setType(value: XdTaskPaneType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
