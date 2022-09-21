package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoChartFormat extends StObject {
  
  def Adjustments(Index: Double): Double
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments
  
  val Application: Any
  
  var AutoShapeType: MsoAutoShapeType
  
  val Creator: Double
  
  val Fill: FillFormat
  
  val Glow: GlowFormat
  
  val Line: LineFormat
  
  /* private */ @JSName("Office.IMsoChartFormat_typekey")
  var OfficeDotIMsoChartFormat_typekey: IMsoChartFormat
  
  val Parent: Any
  
  val PictureFormat: typings.activexOffice.Office.PictureFormat
  
  val Shadow: ShadowFormat
  
  val SoftEdge: SoftEdgeFormat
  
  val TextFrame2: typings.activexOffice.Office.TextFrame2
  
  val ThreeD: ThreeDFormat
}
object IMsoChartFormat {
  
  inline def apply(
    Adjustments: Adjustments,
    Application: Any,
    AutoShapeType: MsoAutoShapeType,
    Creator: Double,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    OfficeDotIMsoChartFormat_typekey: IMsoChartFormat,
    Parent: Any,
    PictureFormat: PictureFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): IMsoChartFormat = {
    val __obj = js.Dynamic.literal(Adjustments = Adjustments.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoShapeType = AutoShapeType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartFormat_typekey")(OfficeDotIMsoChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartFormat]
  }
  
  extension [Self <: IMsoChartFormat](x: Self) {
    
    inline def setAdjustments(value: Adjustments): Self = StObject.set(x, "Adjustments", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoShapeType(value: MsoAutoShapeType): Self = StObject.set(x, "AutoShapeType", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoChartFormat_typekey(value: IMsoChartFormat): Self = StObject.set(x, "Office.IMsoChartFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPictureFormat(value: PictureFormat): Self = StObject.set(x, "PictureFormat", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSoftEdge(value: SoftEdgeFormat): Self = StObject.set(x, "SoftEdge", value.asInstanceOf[js.Any])
    
    inline def setTextFrame2(value: TextFrame2): Self = StObject.set(x, "TextFrame2", value.asInstanceOf[js.Any])
    
    inline def setThreeD(value: ThreeDFormat): Self = StObject.set(x, "ThreeD", value.asInstanceOf[js.Any])
  }
}
