package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editors extends StObject {
  
  def Add(EditorID: js.Any): Editor
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): Editor
  
  val Parent: js.Any
  
  @JSName("Word.Editors_typekey")
  var WordDotEditors_typekey: Editors
}
object Editors {
  
  @scala.inline
  def apply(
    Add: js.Any => Editor,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Editor,
    Parent: js.Any,
    WordDotEditors_typekey: Editors
  ): Editors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Editors_typekey")(WordDotEditors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editors]
  }
  
  @scala.inline
  implicit class EditorsMutableBuilder[Self <: Editors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Any => Editor): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Editor): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEditors_typekey(value: Editors): Self = StObject.set(x, "Word.Editors_typekey", value.asInstanceOf[js.Any])
  }
}
