package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeNode extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val EditingType: MsoEditingType
  
  /* private */ @JSName("Office.ShapeNode_typekey")
  var OfficeDotShapeNode_typekey: ShapeNode
  
  val Parent: Any
  
  val Points: Any
  
  val SegmentType: MsoSegmentType
}
object ShapeNode {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    EditingType: MsoEditingType,
    OfficeDotShapeNode_typekey: ShapeNode,
    Parent: Any,
    Points: Any,
    SegmentType: MsoSegmentType
  ): ShapeNode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EditingType = EditingType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ShapeNode_typekey")(OfficeDotShapeNode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeNode] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEditingType(value: MsoEditingType): Self = StObject.set(x, "EditingType", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotShapeNode_typekey(value: ShapeNode): Self = StObject.set(x, "Office.ShapeNode_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Any): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    inline def setSegmentType(value: MsoSegmentType): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
  }
}
