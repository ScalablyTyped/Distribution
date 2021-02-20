package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.TextRange2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selection extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val ChildShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  def Copy(): Unit = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  val HasChildShapeRange: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection = js.native
  
  val ShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  val SlideRange: typings.activexPowerpoint.PowerPoint.SlideRange = js.native
  
  val TextRange: typings.activexPowerpoint.PowerPoint.TextRange = js.native
  
  val TextRange2: typings.activexOffice.Office.TextRange2 = js.native
  
  val Type: PpSelectionType = js.native
  
  def Unselect(): Unit = js.native
}
object Selection {
  
  @scala.inline
  def apply(
    Application: Application,
    ChildShapeRange: ShapeRange,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    HasChildShapeRange: Boolean,
    Parent: js.Any,
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
  
  @scala.inline
  implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildShapeRange(value: ShapeRange): Self = StObject.set(x, "ChildShapeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildShapeRange(value: Boolean): Self = StObject.set(x, "HasChildShapeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSelection_typekey(value: Selection): Self = StObject.set(x, "PowerPoint.Selection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRange(value: ShapeRange): Self = StObject.set(x, "ShapeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideRange(value: SlideRange): Self = StObject.set(x, "SlideRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange(value: TextRange): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange2(value: TextRange2): Self = StObject.set(x, "TextRange2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpSelectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselect(value: () => Unit): Self = StObject.set(x, "Unselect", js.Any.fromFunction0(value))
  }
}
