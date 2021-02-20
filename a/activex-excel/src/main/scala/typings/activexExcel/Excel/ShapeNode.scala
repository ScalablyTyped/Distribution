package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeNode extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val EditingType: MsoEditingType = js.native
  
  @JSName("Excel.ShapeNode_typekey")
  var ExcelDotShapeNode_typekey: ShapeNode = js.native
  
  val Parent: js.Any = js.native
  
  val Points: SafeArray[Double] = js.native
  
  val SegmentType: MsoSegmentType = js.native
}
object ShapeNode {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    EditingType: MsoEditingType,
    ExcelDotShapeNode_typekey: ShapeNode,
    Parent: js.Any,
    Points: SafeArray[Double],
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ShapeNode_typekey")(ExcelDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
  
  @scala.inline
  implicit class ShapeNodeMutableBuilder[Self <: ShapeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingType(value: MsoEditingType): Self = StObject.set(x, "EditingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotShapeNode_typekey(value: ShapeNode): Self = StObject.set(x, "Excel.ShapeNode_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: SafeArray[Double]): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentType(value: MsoSegmentType): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
  }
}
