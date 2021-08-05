package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPanes extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdTaskPanes): TaskPane
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.TaskPanes_typekey")
  var WordDotTaskPanes_typekey: TaskPanes
}
object TaskPanes {
  
  inline def apply(
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
  
  extension [Self <: TaskPanes](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdTaskPanes => TaskPane): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTaskPanes_typekey(value: TaskPanes): Self = StObject.set(x, "Word.TaskPanes_typekey", value.asInstanceOf[js.Any])
  }
}
