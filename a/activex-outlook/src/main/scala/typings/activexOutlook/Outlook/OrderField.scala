package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderField extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var IsDescending: Boolean
  
  /* private */ @JSName("Outlook.OrderField_typekey")
  var OutlookDotOrderField_typekey: OrderField
  
  val Parent: Any
  
  val Session: NameSpace
  
  val ViewXMLSchemaName: String
}
object OrderField {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    IsDescending: Boolean,
    OutlookDotOrderField_typekey: OrderField,
    Parent: Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): OrderField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], IsDescending = IsDescending.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OrderField_typekey")(OutlookDotOrderField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderField]
  }
  
  extension [Self <: OrderField](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setIsDescending(value: Boolean): Self = StObject.set(x, "IsDescending", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOrderField_typekey(value: OrderField): Self = StObject.set(x, "Outlook.OrderField_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setViewXMLSchemaName(value: String): Self = StObject.set(x, "ViewXMLSchemaName", value.asInstanceOf[js.Any])
  }
}
