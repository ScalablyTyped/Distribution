package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTable extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var AutoScaleFont: js.Any
  
  val Border: ChartBorder
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Font: ChartFont
  
  val Format: ChartFormat
  
  var HasBorderHorizontal: Boolean
  
  var HasBorderOutline: Boolean
  
  var HasBorderVertical: Boolean
  
  val Parent: js.Any
  
  @JSName("PowerPoint.DataTable_typekey")
  var PowerPointDotDataTable_typekey: DataTable
  
  def Select(): Unit
  
  var ShowLegendKey: Boolean
}
object DataTable {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => Unit,
    Font: ChartFont,
    Format: ChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    Parent: js.Any,
    PowerPointDotDataTable_typekey: DataTable,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): DataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.DataTable_typekey")(PowerPointDotDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
  
  @scala.inline
  implicit class DataTableMutableBuilder[Self <: DataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderHorizontal(value: Boolean): Self = StObject.set(x, "HasBorderHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderOutline(value: Boolean): Self = StObject.set(x, "HasBorderOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderVertical(value: Boolean): Self = StObject.set(x, "HasBorderVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotDataTable_typekey(value: DataTable): Self = StObject.set(x, "PowerPoint.DataTable_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLegendKey(value: Boolean): Self = StObject.set(x, "ShowLegendKey", value.asInstanceOf[js.Any])
  }
}
