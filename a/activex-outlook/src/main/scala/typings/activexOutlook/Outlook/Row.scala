package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  def BinaryToString(Index: Any): String
  
  val Class: OlObjectClass
  
  def GetValues(): Any
  
  def Item(Index: Any): Any
  
  def LocalTimeToUTC(Index: Any): VarDate
  
  /* private */ @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: Row
  
  val Parent: Any
  
  val Session: NameSpace
  
  def UTCToLocalTime(Index: Any): VarDate
}
object Row {
  
  inline def apply(
    Application: Application,
    BinaryToString: Any => String,
    Class: OlObjectClass,
    GetValues: () => Any,
    Item: Any => Any,
    LocalTimeToUTC: Any => VarDate,
    OutlookDotRow_typekey: Row,
    Parent: Any,
    Session: NameSpace,
    UTCToLocalTime: Any => VarDate
  ): Row = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], GetValues = js.Any.fromFunction0(GetValues), Item = js.Any.fromFunction1(Item), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.Row_typekey")(OutlookDotRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBinaryToString(value: Any => String): Self = StObject.set(x, "BinaryToString", js.Any.fromFunction1(value))
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setGetValues(value: () => Any): Self = StObject.set(x, "GetValues", js.Any.fromFunction0(value))
    
    inline def setItem(value: Any => Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLocalTimeToUTC(value: Any => VarDate): Self = StObject.set(x, "LocalTimeToUTC", js.Any.fromFunction1(value))
    
    inline def setOutlookDotRow_typekey(value: Row): Self = StObject.set(x, "Outlook.Row_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setUTCToLocalTime(value: Any => VarDate): Self = StObject.set(x, "UTCToLocalTime", js.Any.fromFunction1(value))
  }
}
