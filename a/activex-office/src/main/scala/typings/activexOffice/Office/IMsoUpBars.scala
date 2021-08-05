package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoUpBars extends StObject {
  
  val Application: js.Any
  
  val Border: IMsoBorder
  
  val Creator: Double
  
  def Delete(): js.Any
  
  val Fill: ChartFillFormat
  
  val Format: IMsoChartFormat
  
  val Interior: IMsoInterior
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoUpBars_typekey")
  var OfficeDotIMsoUpBars_typekey: IMsoUpBars
  
  val Parent: js.Any
  
  def Select(): js.Any
}
object IMsoUpBars {
  
  inline def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoUpBars_typekey: IMsoUpBars,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoUpBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoUpBars_typekey")(OfficeDotIMsoUpBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoUpBars]
  }
  
  extension [Self <: IMsoUpBars](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoUpBars_typekey(value: IMsoUpBars): Self = StObject.set(x, "Office.IMsoUpBars_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
