package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoDataTable extends StObject {
  
  val Application: js.Any
  
  var AutoScaleFont: js.Any
  
  val Border: IMsoBorder
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Font: ChartFont
  
  val Format: IMsoChartFormat
  
  var HasBorderHorizontal: Boolean
  
  var HasBorderOutline: Boolean
  
  var HasBorderVertical: Boolean
  
  @JSName("Office.IMsoDataTable_typekey")
  var OfficeDotIMsoDataTable_typekey: IMsoDataTable
  
  val Parent: js.Any
  
  def Select(): Unit
  
  var ShowLegendKey: Boolean
}
object IMsoDataTable {
  
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Font: ChartFont,
    Format: IMsoChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    OfficeDotIMsoDataTable_typekey: IMsoDataTable,
    Parent: js.Any,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): IMsoDataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoDataTable_typekey")(OfficeDotIMsoDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDataTable]
  }
  
  @scala.inline
  implicit class IMsoDataTableMutableBuilder[Self <: IMsoDataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderHorizontal(value: Boolean): Self = StObject.set(x, "HasBorderHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderOutline(value: Boolean): Self = StObject.set(x, "HasBorderOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderVertical(value: Boolean): Self = StObject.set(x, "HasBorderVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoDataTable_typekey(value: IMsoDataTable): Self = StObject.set(x, "Office.IMsoDataTable_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLegendKey(value: Boolean): Self = StObject.set(x, "ShowLegendKey", value.asInstanceOf[js.Any])
  }
}
