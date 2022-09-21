package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tasks extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Exists(Name: String): Boolean
  
  def ExitWindows(): Unit
  
  def Item(Index: Any): Task
  
  val Parent: Any
  
  /* private */ @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: Tasks
}
object Tasks {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Exists: String => Boolean,
    ExitWindows: () => Unit,
    Item: Any => Task,
    Parent: Any,
    WordDotTasks_typekey: Tasks
  ): Tasks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = js.Any.fromFunction1(Exists), ExitWindows = js.Any.fromFunction0(ExitWindows), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Tasks_typekey")(WordDotTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
  
  extension [Self <: Tasks](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExists(value: String => Boolean): Self = StObject.set(x, "Exists", js.Any.fromFunction1(value))
    
    inline def setExitWindows(value: () => Unit): Self = StObject.set(x, "ExitWindows", js.Any.fromFunction0(value))
    
    inline def setItem(value: Any => Task): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTasks_typekey(value: Tasks): Self = StObject.set(x, "Word.Tasks_typekey", value.asInstanceOf[js.Any])
  }
}
