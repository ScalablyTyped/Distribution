package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Templates extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Template
  
  def LoadBuildingBlocks(): Unit
  
  val Parent: Any
  
  /* private */ @JSName("Word.Templates_typekey")
  var WordDotTemplates_typekey: Templates
}
object Templates {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => Template,
    LoadBuildingBlocks: () => Unit,
    Parent: Any,
    WordDotTemplates_typekey: Templates
  ): Templates = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), LoadBuildingBlocks = js.Any.fromFunction0(LoadBuildingBlocks), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Templates_typekey")(WordDotTemplates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Templates] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Template): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLoadBuildingBlocks(value: () => Unit): Self = StObject.set(x, "LoadBuildingBlocks", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTemplates_typekey(value: Templates): Self = StObject.set(x, "Word.Templates_typekey", value.asInstanceOf[js.Any])
  }
}
