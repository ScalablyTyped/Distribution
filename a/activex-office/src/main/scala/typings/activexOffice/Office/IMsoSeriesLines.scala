package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoSeriesLines extends StObject {
  
  val Application: Any
  
  val Border: IMsoBorder
  
  val Creator: Double
  
  def Delete(): Any
  
  val Format: IMsoChartFormat
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoSeriesLines_typekey")
  var OfficeDotIMsoSeriesLines_typekey: IMsoSeriesLines
  
  val Parent: Any
  
  def Select(): Any
}
object IMsoSeriesLines {
  
  inline def apply(
    Application: Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Any,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoSeriesLines_typekey: IMsoSeriesLines,
    Parent: Any,
    Select: () => Any
  ): IMsoSeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoSeriesLines_typekey")(OfficeDotIMsoSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoSeriesLines]
  }
  
  extension [Self <: IMsoSeriesLines](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoSeriesLines_typekey(value: IMsoSeriesLines): Self = StObject.set(x, "Office.IMsoSeriesLines_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
