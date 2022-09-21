package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.GlowFormat
import typings.activexOffice.Office.SoftEdgeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartFormat extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Creator: Double
  
  val Fill: FillFormat
  
  val Glow: GlowFormat
  
  val Line: LineFormat
  
  val Parent: Any
  
  val PictureFormat: typings.activexPowerpoint.PowerPoint.PictureFormat
  
  /* private */ @JSName("PowerPoint.ChartFormat_typekey")
  var PowerPointDotChartFormat_typekey: ChartFormat
  
  val Shadow: ShadowFormat
  
  val SoftEdge: SoftEdgeFormat
  
  val TextFrame2: typings.activexPowerpoint.PowerPoint.TextFrame2
  
  val ThreeD: ThreeDFormat
}
object ChartFormat {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: Any,
    PictureFormat: PictureFormat,
    PowerPointDotChartFormat_typekey: ChartFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFormat_typekey")(PowerPointDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
  
  extension [Self <: ChartFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPictureFormat(value: PictureFormat): Self = StObject.set(x, "PictureFormat", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartFormat_typekey(value: ChartFormat): Self = StObject.set(x, "PowerPoint.ChartFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSoftEdge(value: SoftEdgeFormat): Self = StObject.set(x, "SoftEdge", value.asInstanceOf[js.Any])
    
    inline def setTextFrame2(value: TextFrame2): Self = StObject.set(x, "TextFrame2", value.asInstanceOf[js.Any])
    
    inline def setThreeD(value: ThreeDFormat): Self = StObject.set(x, "ThreeD", value.asInstanceOf[js.Any])
  }
}
