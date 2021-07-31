package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialogs extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdWordDialog): Dialog
  
  val Parent: js.Any
  
  @JSName("Word.Dialogs_typekey")
  var WordDotDialogs_typekey: Dialogs
}
object Dialogs {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdWordDialog => Dialog,
    Parent: js.Any,
    WordDotDialogs_typekey: Dialogs
  ): Dialogs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dialogs_typekey")(WordDotDialogs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialogs]
  }
  
  @scala.inline
  implicit class DialogsMutableBuilder[Self <: Dialogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdWordDialog => Dialog): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDialogs_typekey(value: Dialogs): Self = StObject.set(x, "Word.Dialogs_typekey", value.asInstanceOf[js.Any])
  }
}
