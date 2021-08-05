package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Floor extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Border: ChartBorder
  
  def ClearFormats(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: ChartFormat
  
  val Interior: typings.activexPowerpoint.PowerPoint.Interior
  
  val Name: String
  
  val Parent: js.Any
  
  def Paste(): Unit
  
  var PictureType: js.Any
  
  /* private */ @JSName("PowerPoint.Floor_typekey")
  var PowerPointDotFloor_typekey: Floor
  
  def Select(): js.Any
  
  var Thickness: Double
}
object Floor {
  
  inline def apply(
    Application: Application,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    PowerPointDotFloor_typekey: Floor,
    Select: () => js.Any,
    Thickness: Double
  ): Floor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Floor_typekey")(PowerPointDotFloor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floor]
  }
  
  extension [Self <: Floor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: () => Unit): Self = StObject.set(x, "Paste", js.Any.fromFunction0(value))
    
    inline def setPictureType(value: js.Any): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotFloor_typekey(value: Floor): Self = StObject.set(x, "PowerPoint.Floor_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setThickness(value: Double): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
  }
}
