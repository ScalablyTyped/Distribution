package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  def BinaryToString(Index: js.Any): String
  
  val Class: OlObjectClass
  
  def GetValues(): js.Any
  
  def Item(Index: js.Any): js.Any
  
  def LocalTimeToUTC(Index: js.Any): VarDate
  
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: Row
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  def UTCToLocalTime(Index: js.Any): VarDate
}
object Row {
  
  @scala.inline
  def apply(
    Application: Application,
    BinaryToString: js.Any => String,
    Class: OlObjectClass,
    GetValues: () => js.Any,
    Item: js.Any => js.Any,
    LocalTimeToUTC: js.Any => VarDate,
    OutlookDotRow_typekey: Row,
    Parent: js.Any,
    Session: NameSpace,
    UTCToLocalTime: js.Any => VarDate
  ): Row = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], GetValues = js.Any.fromFunction0(GetValues), Item = js.Any.fromFunction1(Item), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.Row_typekey")(OutlookDotRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryToString(value: js.Any => String): Self = StObject.set(x, "BinaryToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetValues(value: () => js.Any): Self = StObject.set(x, "GetValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalTimeToUTC(value: js.Any => VarDate): Self = StObject.set(x, "LocalTimeToUTC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotRow_typekey(value: Row): Self = StObject.set(x, "Outlook.Row_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUTCToLocalTime(value: js.Any => VarDate): Self = StObject.set(x, "UTCToLocalTime", js.Any.fromFunction1(value))
  }
}
