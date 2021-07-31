package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryRanges extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdStoryType): Range
  
  val Parent: js.Any
  
  @JSName("Word.StoryRanges_typekey")
  var WordDotStoryRanges_typekey: StoryRanges
}
object StoryRanges {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdStoryType => Range,
    Parent: js.Any,
    WordDotStoryRanges_typekey: StoryRanges
  ): StoryRanges = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StoryRanges_typekey")(WordDotStoryRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryRanges]
  }
  
  @scala.inline
  implicit class StoryRangesMutableBuilder[Self <: StoryRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdStoryType => Range): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotStoryRanges_typekey(value: StoryRanges): Self = StObject.set(x, "Word.StoryRanges_typekey", value.asInstanceOf[js.Any])
  }
}
