package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoSeriesLines extends js.Object {
  
  val Application: js.Any = js.native
  
  val Border: IMsoBorder = js.native
  
  val Creator: Double = js.native
  
  def Delete(): js.Any = js.native
  
  val Format: IMsoChartFormat = js.native
  
  val Name: String = js.native
  
  @JSName("Office.IMsoSeriesLines_typekey")
  var OfficeDotIMsoSeriesLines_typekey: IMsoSeriesLines = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): js.Any = js.native
}
object IMsoSeriesLines {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => js.Any,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoSeriesLines_typekey: IMsoSeriesLines,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoSeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoSeriesLines_typekey")(OfficeDotIMsoSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoSeriesLines]
  }
  
  @scala.inline
  implicit class IMsoSeriesLinesOps[Self <: IMsoSeriesLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoSeriesLines_typekey(value: IMsoSeriesLines): Self = this.set("Office.IMsoSeriesLines_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
  }
}
