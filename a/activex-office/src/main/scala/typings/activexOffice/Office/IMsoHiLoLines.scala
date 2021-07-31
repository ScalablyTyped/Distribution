package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoHiLoLines extends StObject {
  
  val Application: js.Any
  
  val Border: IMsoBorder
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Format: IMsoChartFormat
  
  val Name: String
  
  @JSName("Office.IMsoHiLoLines_typekey")
  var OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines
  
  val Parent: js.Any
  
  def Select(): Unit
}
object IMsoHiLoLines {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoHiLoLines_typekey: IMsoHiLoLines,
    Parent: js.Any,
    Select: () => Unit
  ): IMsoHiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoHiLoLines_typekey")(OfficeDotIMsoHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoHiLoLines]
  }
  
  @scala.inline
  implicit class IMsoHiLoLinesMutableBuilder[Self <: IMsoHiLoLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoHiLoLines_typekey(value: IMsoHiLoLines): Self = StObject.set(x, "Office.IMsoHiLoLines_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
