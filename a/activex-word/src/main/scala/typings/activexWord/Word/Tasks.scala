package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tasks extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Exists(Name: String): Boolean = js.native
  
  def ExitWindows(): Unit = js.native
  
  def Item(Index: js.Any): Task = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: Tasks = js.native
}
object Tasks {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Exists: String => Boolean,
    ExitWindows: () => Unit,
    Item: js.Any => Task,
    Parent: js.Any,
    WordDotTasks_typekey: Tasks
  ): Tasks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = js.Any.fromFunction1(Exists), ExitWindows = js.Any.fromFunction0(ExitWindows), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Tasks_typekey")(WordDotTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
  
  @scala.inline
  implicit class TasksMutableBuilder[Self <: Tasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExists(value: String => Boolean): Self = StObject.set(x, "Exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExitWindows(value: () => Unit): Self = StObject.set(x, "ExitWindows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: js.Any => Task): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTasks_typekey(value: Tasks): Self = StObject.set(x, "Word.Tasks_typekey", value.asInstanceOf[js.Any])
  }
}
