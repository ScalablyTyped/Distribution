package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyAccessor extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  def BinaryToString(Value: js.Any): String
  
  val Class: OlObjectClass
  
  def DeleteProperties(SchemaNames: js.Any): js.Any
  
  def DeleteProperty(SchemaName: String): Unit
  
  def GetProperties(SchemaNames: js.Any): js.Any
  
  def GetProperty(SchemaName: String): js.Any
  
  def LocalTimeToUTC(Value: VarDate): VarDate
  
  /* private */ @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: PropertyAccessor
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  def SetProperties(SchemaNames: js.Any, Values: js.Any): js.Any
  
  def SetProperty(SchemaName: String, Value: js.Any): Unit
  
  def StringToBinary(Value: String): js.Any
  
  def UTCToLocalTime(Value: VarDate): VarDate
}
object PropertyAccessor {
  
  inline def apply(
    Application: Application,
    BinaryToString: js.Any => String,
    Class: OlObjectClass,
    DeleteProperties: js.Any => js.Any,
    DeleteProperty: String => Unit,
    GetProperties: js.Any => js.Any,
    GetProperty: String => js.Any,
    LocalTimeToUTC: VarDate => VarDate,
    OutlookDotPropertyAccessor_typekey: PropertyAccessor,
    Parent: js.Any,
    Session: NameSpace,
    SetProperties: (js.Any, js.Any) => js.Any,
    SetProperty: (String, js.Any) => Unit,
    StringToBinary: String => js.Any,
    UTCToLocalTime: VarDate => VarDate
  ): PropertyAccessor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], DeleteProperties = js.Any.fromFunction1(DeleteProperties), DeleteProperty = js.Any.fromFunction1(DeleteProperty), GetProperties = js.Any.fromFunction1(GetProperties), GetProperty = js.Any.fromFunction1(GetProperty), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetProperties = js.Any.fromFunction2(SetProperties), SetProperty = js.Any.fromFunction2(SetProperty), StringToBinary = js.Any.fromFunction1(StringToBinary), UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.PropertyAccessor_typekey")(OutlookDotPropertyAccessor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyAccessor]
  }
  
  extension [Self <: PropertyAccessor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBinaryToString(value: js.Any => String): Self = StObject.set(x, "BinaryToString", js.Any.fromFunction1(value))
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDeleteProperties(value: js.Any => js.Any): Self = StObject.set(x, "DeleteProperties", js.Any.fromFunction1(value))
    
    inline def setDeleteProperty(value: String => Unit): Self = StObject.set(x, "DeleteProperty", js.Any.fromFunction1(value))
    
    inline def setGetProperties(value: js.Any => js.Any): Self = StObject.set(x, "GetProperties", js.Any.fromFunction1(value))
    
    inline def setGetProperty(value: String => js.Any): Self = StObject.set(x, "GetProperty", js.Any.fromFunction1(value))
    
    inline def setLocalTimeToUTC(value: VarDate => VarDate): Self = StObject.set(x, "LocalTimeToUTC", js.Any.fromFunction1(value))
    
    inline def setOutlookDotPropertyAccessor_typekey(value: PropertyAccessor): Self = StObject.set(x, "Outlook.PropertyAccessor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetProperties(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "SetProperties", js.Any.fromFunction2(value))
    
    inline def setSetProperty(value: (String, js.Any) => Unit): Self = StObject.set(x, "SetProperty", js.Any.fromFunction2(value))
    
    inline def setStringToBinary(value: String => js.Any): Self = StObject.set(x, "StringToBinary", js.Any.fromFunction1(value))
    
    inline def setUTCToLocalTime(value: VarDate => VarDate): Self = StObject.set(x, "UTCToLocalTime", js.Any.fromFunction1(value))
  }
}
