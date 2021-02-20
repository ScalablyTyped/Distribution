package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoDropLines extends StObject {
  
  val Application: js.Any = js.native
  
  val Border: IMsoBorder = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Format: IMsoChartFormat = js.native
  
  val Name: String = js.native
  
  @JSName("Office.IMsoDropLines_typekey")
  var OfficeDotIMsoDropLines_typekey: IMsoDropLines = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): Unit = js.native
}
object IMsoDropLines {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoDropLines_typekey: IMsoDropLines,
    Parent: js.Any,
    Select: () => Unit
  ): IMsoDropLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoDropLines_typekey")(OfficeDotIMsoDropLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDropLines]
  }
  
  @scala.inline
  implicit class IMsoDropLinesMutableBuilder[Self <: IMsoDropLines] (val x: Self) extends AnyVal {
    
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
    def setOfficeDotIMsoDropLines_typekey(value: IMsoDropLines): Self = StObject.set(x, "Office.IMsoDropLines_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
