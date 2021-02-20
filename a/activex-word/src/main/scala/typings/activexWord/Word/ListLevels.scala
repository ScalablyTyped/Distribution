package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLevels extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): ListLevel = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.ListLevels_typekey")
  var WordDotListLevels_typekey: ListLevels = js.native
}
object ListLevels {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => ListLevel,
    Parent: js.Any,
    WordDotListLevels_typekey: ListLevels
  ): ListLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevels_typekey")(WordDotListLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevels]
  }
  
  @scala.inline
  implicit class ListLevelsMutableBuilder[Self <: ListLevels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ListLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotListLevels_typekey(value: ListLevels): Self = StObject.set(x, "Word.ListLevels_typekey", value.asInstanceOf[js.Any])
  }
}
