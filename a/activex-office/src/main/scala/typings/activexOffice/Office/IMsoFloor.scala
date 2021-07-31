package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoFloor extends StObject {
  
  val Application: js.Any
  
  val Border: IMsoBorder
  
  def ClearFormats(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: IMsoChartFormat
  
  val Interior: IMsoInterior
  
  val Name: String
  
  @JSName("Office.IMsoFloor_typekey")
  var OfficeDotIMsoFloor_typekey: IMsoFloor
  
  val Parent: js.Any
  
  def Paste(): Unit
  
  var PictureType: js.Any
  
  def Select(): js.Any
  
  var Thickness: Double
}
object IMsoFloor {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoFloor_typekey: IMsoFloor,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    Select: () => js.Any,
    Thickness: Double
  ): IMsoFloor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoFloor_typekey")(OfficeDotIMsoFloor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoFloor]
  }
  
  @scala.inline
  implicit class IMsoFloorMutableBuilder[Self <: IMsoFloor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoFloor_typekey(value: IMsoFloor): Self = StObject.set(x, "Office.IMsoFloor_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: () => Unit): Self = StObject.set(x, "Paste", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPictureType(value: js.Any): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
  }
}
