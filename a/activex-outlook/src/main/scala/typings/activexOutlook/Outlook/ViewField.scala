package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewField extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ColumnFormat: typings.activexOutlook.Outlook.ColumnFormat
  
  /* private */ @JSName("Outlook.ViewField_typekey")
  var OutlookDotViewField_typekey: ViewField
  
  val Parent: Any
  
  val Session: NameSpace
  
  val ViewXMLSchemaName: String
}
object ViewField {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ColumnFormat: ColumnFormat,
    OutlookDotViewField_typekey: ViewField,
    Parent: Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): ViewField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFormat = ColumnFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewField_typekey")(OutlookDotViewField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewField]
  }
  
  extension [Self <: ViewField](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setColumnFormat(value: ColumnFormat): Self = StObject.set(x, "ColumnFormat", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotViewField_typekey(value: ViewField): Self = StObject.set(x, "Outlook.ViewField_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setViewXMLSchemaName(value: String): Self = StObject.set(x, "ViewXMLSchemaName", value.asInstanceOf[js.Any])
  }
}
