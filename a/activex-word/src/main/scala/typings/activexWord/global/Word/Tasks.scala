package typings.activexWord.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Tasks")
@js.native
class Tasks protected ()
  extends StObject
     with typings.activexWord.Word.Tasks {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Exists(Name: String): Boolean = js.native
  
  /* CompleteClass */
  override def ExitWindows(): Unit = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.Task = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: typings.activexWord.Word.Tasks = js.native
}
