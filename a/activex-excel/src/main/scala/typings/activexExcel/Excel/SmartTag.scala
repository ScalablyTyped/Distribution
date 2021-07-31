package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTag extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  val DownloadURL: String
  
  @JSName("Excel.SmartTag_typekey")
  var ExcelDotSmartTag_typekey: SmartTag
  
  val Name: String
  
  val Parent: js.Any
  
  def Properties(Index: String): CustomProperty
  def Properties(Index: Double): CustomProperty
  @JSName("Properties")
  val Properties_Original: CustomProperties
  
  def Range(Address: String): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range
  @JSName("Range")
  val Range_Original: Range
  
  def SmartTagActions(Index: js.Any): SmartTagAction
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions
  
  val XML: String
  
  val _Default: String
}
object SmartTag {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    DownloadURL: String,
    ExcelDotSmartTag_typekey: SmartTag,
    Name: String,
    Parent: js.Any,
    Properties: CustomProperties,
    Range: Range,
    SmartTagActions: SmartTagActions,
    XML: String,
    _Default: String
  ): SmartTag = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DownloadURL = DownloadURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], SmartTagActions = SmartTagActions.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTag_typekey")(ExcelDotSmartTag_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTag]
  }
  
  @scala.inline
  implicit class SmartTagMutableBuilder[Self <: SmartTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTag_typekey(value: SmartTag): Self = StObject.set(x, "Excel.SmartTag_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CustomProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartTagActions(value: SmartTagActions): Self = StObject.set(x, "SmartTagActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
