package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeNode extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val EditingType: MsoEditingType = js.native
  
  val Parent: js.Any = js.native
  
  val Points: js.Any = js.native
  
  @JSName("PowerPoint.ShapeNode_typekey")
  var PowerPointDotShapeNode_typekey: ShapeNode = js.native
  
  val SegmentType: MsoSegmentType = js.native
}
object ShapeNode {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    EditingType: MsoEditingType,
    Parent: js.Any,
    Points: js.Any,
    PowerPointDotShapeNode_typekey: ShapeNode,
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ShapeNode_typekey")(PowerPointDotShapeNode_typekey.asInstanceOf[js.Any])
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
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Any): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotShapeNode_typekey(value: ShapeNode): Self = StObject.set(x, "PowerPoint.ShapeNode_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentType(value: MsoSegmentType): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
  }
}
