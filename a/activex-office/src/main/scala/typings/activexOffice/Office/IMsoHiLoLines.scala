package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoHiLoLines extends StObject {
  
  val Application: Any
  
  val Border: IMsoBorder
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Format: IMsoChartFormat
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoHiLoLines_typekey")
  var OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines
  
  val Parent: Any
  
  def Select(): Unit
}
object IMsoHiLoLines {
  
  inline def apply(
    Application: Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines,
    Parent: Any,
    Select: () => Unit
  ): IMsoHiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoHiLoLines_typekey")(OfficeDotIMsoHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoHiLoLines]
  }
  
  extension [Self <: IMsoHiLoLines](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoHiLoLines_typekey(value: IMsoHiLoLines): Self = StObject.set(x, "Office.IMsoHiLoLines_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
