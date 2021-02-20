package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCaptions extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def CancelAutoInsert(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): AutoCaption = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.AutoCaptions_typekey")
  var WordDotAutoCaptions_typekey: AutoCaptions = js.native
}
object AutoCaptions {
  
  @scala.inline
  def apply(
    Application: Application,
    CancelAutoInsert: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCaption,
    Parent: js.Any,
    WordDotAutoCaptions_typekey: AutoCaptions
  ): AutoCaptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CancelAutoInsert = js.Any.fromFunction0(CancelAutoInsert), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaptions_typekey")(WordDotAutoCaptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaptions]
  }
  
  @scala.inline
  implicit class AutoCaptionsMutableBuilder[Self <: AutoCaptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelAutoInsert(value: () => Unit): Self = StObject.set(x, "CancelAutoInsert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => AutoCaption): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAutoCaptions_typekey(value: AutoCaptions): Self = StObject.set(x, "Word.AutoCaptions_typekey", value.asInstanceOf[js.Any])
  }
}
