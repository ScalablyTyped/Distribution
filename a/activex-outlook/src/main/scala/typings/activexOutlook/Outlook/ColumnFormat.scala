package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFormat extends StObject {
  
  var Align: OlAlign
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var FieldFormat: Double
  
  val FieldType: OlUserPropertyType
  
  var Label: String
  
  @JSName("Outlook.ColumnFormat_typekey")
  var OutlookDotColumnFormat_typekey: ColumnFormat
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  var Width: Double
}
object ColumnFormat {
  
  @scala.inline
  def apply(
    Align: OlAlign,
    Application: Application,
    Class: OlObjectClass,
    FieldFormat: Double,
    FieldType: OlUserPropertyType,
    Label: String,
    OutlookDotColumnFormat_typekey: ColumnFormat,
    Parent: js.Any,
    Session: NameSpace,
    Width: Double
  ): ColumnFormat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], FieldFormat = FieldFormat.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ColumnFormat_typekey")(OutlookDotColumnFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFormat]
  }
  
  @scala.inline
  implicit class ColumnFormatMutableBuilder[Self <: ColumnFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: OlAlign): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFormat(value: Double): Self = StObject.set(x, "FieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: OlUserPropertyType): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotColumnFormat_typekey(value: ColumnFormat): Self = StObject.set(x, "Outlook.ColumnFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
