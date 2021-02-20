package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskPane extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Visible: Boolean = js.native
  
  @JSName("Word.TaskPane_typekey")
  var WordDotTaskPane_typekey: TaskPane = js.native
}
object TaskPane {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Visible: Boolean,
    WordDotTaskPane_typekey: TaskPane
  ): TaskPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TaskPane_typekey")(WordDotTaskPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPane]
  }
  
  @scala.inline
  implicit class TaskPaneMutableBuilder[Self <: TaskPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTaskPane_typekey(value: TaskPane): Self = StObject.set(x, "Word.TaskPane_typekey", value.asInstanceOf[js.Any])
  }
}
