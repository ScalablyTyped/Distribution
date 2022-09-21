package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZones extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  def ConvertTime(SourceDateTime: VarDate, SourceTimeZone: TimeZone, DestinationTimeZone: TimeZone): VarDate
  
  val Count: Double
  
  val CurrentTimeZone: TimeZone
  
  def Item(Index: Any): TimeZone
  
  /* private */ @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: TimeZones
  
  val Parent: Any
  
  val Session: NameSpace
}
object TimeZones {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ConvertTime: (VarDate, TimeZone, TimeZone) => VarDate,
    Count: Double,
    CurrentTimeZone: TimeZone,
    Item: Any => TimeZone,
    OutlookDotTimeZones_typekey: TimeZones,
    Parent: Any,
    Session: NameSpace
  ): TimeZones = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConvertTime = js.Any.fromFunction3(ConvertTime), Count = Count.asInstanceOf[js.Any], CurrentTimeZone = CurrentTimeZone.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZones_typekey")(OutlookDotTimeZones_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZones]
  }
  
  extension [Self <: TimeZones](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConvertTime(value: (VarDate, TimeZone, TimeZone) => VarDate): Self = StObject.set(x, "ConvertTime", js.Any.fromFunction3(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeZone(value: TimeZone): Self = StObject.set(x, "CurrentTimeZone", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => TimeZone): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotTimeZones_typekey(value: TimeZones): Self = StObject.set(x, "Outlook.TimeZones_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
