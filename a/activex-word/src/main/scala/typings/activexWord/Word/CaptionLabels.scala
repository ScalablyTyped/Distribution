package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionLabels extends StObject {
  
  def Add(Name: String): CaptionLabel = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): CaptionLabel = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.CaptionLabels_typekey")
  var WordDotCaptionLabels_typekey: CaptionLabels = js.native
}
object CaptionLabels {
  
  @scala.inline
  def apply(
    Add: String => CaptionLabel,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => CaptionLabel,
    Parent: js.Any,
    WordDotCaptionLabels_typekey: CaptionLabels
  ): CaptionLabels = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabels_typekey")(WordDotCaptionLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabels]
  }
  
  @scala.inline
  implicit class CaptionLabelsMutableBuilder[Self <: CaptionLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => CaptionLabel): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => CaptionLabel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCaptionLabels_typekey(value: CaptionLabels): Self = StObject.set(x, "Word.CaptionLabels_typekey", value.asInstanceOf[js.Any])
  }
}
