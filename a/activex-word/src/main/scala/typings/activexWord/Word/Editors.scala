package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editors extends StObject {
  
  def Add(EditorID: Any): Editor
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Editor
  
  val Parent: Any
  
  /* private */ @JSName("Word.Editors_typekey")
  var WordDotEditors_typekey: Editors
}
object Editors {
  
  inline def apply(
    Add: Any => Editor,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => Editor,
    Parent: Any,
    WordDotEditors_typekey: Editors
  ): Editors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Editors_typekey")(WordDotEditors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Editors] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Any => Editor): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Editor): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotEditors_typekey(value: Editors): Self = StObject.set(x, "Word.Editors_typekey", value.asInstanceOf[js.Any])
  }
}
