package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryRanges extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdStoryType): Range
  
  val Parent: Any
  
  /* private */ @JSName("Word.StoryRanges_typekey")
  var WordDotStoryRanges_typekey: StoryRanges
}
object StoryRanges {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdStoryType => Range,
    Parent: Any,
    WordDotStoryRanges_typekey: StoryRanges
  ): StoryRanges = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StoryRanges_typekey")(WordDotStoryRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryRanges] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdStoryType => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotStoryRanges_typekey(value: StoryRanges): Self = StObject.set(x, "Word.StoryRanges_typekey", value.asInstanceOf[js.Any])
  }
}
