package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeNode extends js.Object {
  
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
  implicit class ShapeNodeOps[Self <: ShapeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingType(value: MsoEditingType): Self = this.set("EditingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotShapeNode_typekey(value: ShapeNode): Self = this.set("Excel.ShapeNode_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: SafeArray[Double]): Self = this.set("Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentType(value: MsoSegmentType): Self = this.set("SegmentType", value.asInstanceOf[js.Any])
  }
}
