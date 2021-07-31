package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frames extends StObject {
  
  def Add(Range: Range): Frame
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Delete(): Unit
  
  def Item(Index: Double): Frame
  
  val Parent: js.Any
  
  @JSName("Word.Frames_typekey")
  var WordDotFrames_typekey: Frames
}
object Frames {
  
  @scala.inline
  def apply(
    Add: Range => Frame,
    Application: Application,
    Count: Double,
    Creator: Double,
    Delete: () => Unit,
    Item: Double => Frame,
    Parent: js.Any,
    WordDotFrames_typekey: Frames
  ): Frames = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frames_typekey")(WordDotFrames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frames]
  }
  
  @scala.inline
  implicit class FramesMutableBuilder[Self <: Frames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Range => Frame): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: Double => Frame): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFrames_typekey(value: Frames): Self = StObject.set(x, "Word.Frames_typekey", value.asInstanceOf[js.Any])
  }
}
