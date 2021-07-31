package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Characters extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  val First: Range
  
  def Item(Index: Double): Range
  
  val Last: Range
  
  val Parent: js.Any
  
  @JSName("Word.Characters_typekey")
  var WordDotCharacters_typekey: Characters
}
object Characters {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    First: Range,
    Item: Double => Range,
    Last: Range,
    Parent: js.Any,
    WordDotCharacters_typekey: Characters
  ): Characters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Last = Last.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Characters_typekey")(WordDotCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characters]
  }
  
  @scala.inline
  implicit class CharactersMutableBuilder[Self <: Characters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Range): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLast(value: Range): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCharacters_typekey(value: Characters): Self = StObject.set(x, "Word.Characters_typekey", value.asInstanceOf[js.Any])
  }
}
