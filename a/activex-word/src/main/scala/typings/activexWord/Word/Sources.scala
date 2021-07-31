package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sources extends StObject {
  
  def Add(Data: String): Unit
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Source
  
  val Parent: js.Any
  
  @JSName("Word.Sources_typekey")
  var WordDotSources_typekey: Sources
}
object Sources {
  
  @scala.inline
  def apply(
    Add: String => Unit,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Source,
    Parent: js.Any,
    WordDotSources_typekey: Sources
  ): Sources = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Sources_typekey")(WordDotSources_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
  
  @scala.inline
  implicit class SourcesMutableBuilder[Self <: Sources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Source): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSources_typekey(value: Sources): Self = StObject.set(x, "Word.Sources_typekey", value.asInstanceOf[js.Any])
  }
}
