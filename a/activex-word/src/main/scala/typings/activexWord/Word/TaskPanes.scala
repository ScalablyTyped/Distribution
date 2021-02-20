package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskPanes extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: WdTaskPanes): TaskPane = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.TaskPanes_typekey")
  var WordDotTaskPanes_typekey: TaskPanes = js.native
}
object TaskPanes {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdTaskPanes => TaskPane,
    Parent: js.Any,
    WordDotTaskPanes_typekey: TaskPanes
  ): TaskPanes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TaskPanes_typekey")(WordDotTaskPanes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPanes]
  }
  
  @scala.inline
  implicit class TaskPanesMutableBuilder[Self <: TaskPanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdTaskPanes => TaskPane): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTaskPanes_typekey(value: TaskPanes): Self = StObject.set(x, "Word.TaskPanes_typekey", value.asInstanceOf[js.Any])
  }
}
