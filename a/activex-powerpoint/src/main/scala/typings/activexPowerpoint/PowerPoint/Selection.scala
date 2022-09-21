package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.TextRange2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val ChildShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange
  
  def Copy(): Unit
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val HasChildShapeRange: Boolean
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection
  
  val ShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange
  
  val SlideRange: typings.activexPowerpoint.PowerPoint.SlideRange
  
  val TextRange: typings.activexPowerpoint.PowerPoint.TextRange
  
  val TextRange2: typings.activexOffice.Office.TextRange2
  
  val Type: PpSelectionType
  
  def Unselect(): Unit
}
object Selection {
  
  inline def apply(
    Application: Application,
    ChildShapeRange: ShapeRange,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    HasChildShapeRange: Boolean,
    Parent: Any,
    PowerPointDotSelection_typekey: Selection,
    ShapeRange: ShapeRange,
    SlideRange: SlideRange,
    TextRange: TextRange,
    TextRange2: TextRange2,
    Type: PpSelectionType,
    Unselect: () => Unit
  ): Selection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ChildShapeRange = ChildShapeRange.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), HasChildShapeRange = HasChildShapeRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ShapeRange = ShapeRange.asInstanceOf[js.Any], SlideRange = SlideRange.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], TextRange2 = TextRange2.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unselect = js.Any.fromFunction0(Unselect))
    __obj.updateDynamic("PowerPoint.Selection_typekey")(PowerPointDotSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setChildShapeRange(value: ShapeRange): Self = StObject.set(x, "ChildShapeRange", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setHasChildShapeRange(value: Boolean): Self = StObject.set(x, "HasChildShapeRange", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSelection_typekey(value: Selection): Self = StObject.set(x, "PowerPoint.Selection_typekey", value.asInstanceOf[js.Any])
    
    inline def setShapeRange(value: ShapeRange): Self = StObject.set(x, "ShapeRange", value.asInstanceOf[js.Any])
    
    inline def setSlideRange(value: SlideRange): Self = StObject.set(x, "SlideRange", value.asInstanceOf[js.Any])
    
    inline def setTextRange(value: TextRange): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    inline def setTextRange2(value: TextRange2): Self = StObject.set(x, "TextRange2", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpSelectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnselect(value: () => Unit): Self = StObject.set(x, "Unselect", js.Any.fromFunction0(value))
  }
}
