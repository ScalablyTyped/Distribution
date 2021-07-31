package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupShapes extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): Shape
  
  val Parent: js.Any
  
  def Range(Index: js.Any): ShapeRange
  
  @JSName("Word.GroupShapes_typekey")
  var WordDotGroupShapes_typekey: GroupShapes
}
object GroupShapes {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Shape,
    Parent: js.Any,
    Range: js.Any => ShapeRange,
    WordDotGroupShapes_typekey: GroupShapes
  ): GroupShapes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range))
    __obj.updateDynamic("Word.GroupShapes_typekey")(WordDotGroupShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupShapes]
  }
  
  @scala.inline
  implicit class GroupShapesMutableBuilder[Self <: GroupShapes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Shape): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Any => ShapeRange): Self = StObject.set(x, "Range", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWordDotGroupShapes_typekey(value: GroupShapes): Self = StObject.set(x, "Word.GroupShapes_typekey", value.asInstanceOf[js.Any])
  }
}
