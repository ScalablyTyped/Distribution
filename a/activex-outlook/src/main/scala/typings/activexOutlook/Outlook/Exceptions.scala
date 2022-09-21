package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exceptions extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Exception
  
  /* private */ @JSName("Outlook.Exceptions_typekey")
  var OutlookDotExceptions_typekey: Exceptions
  
  val Parent: Any
  
  val Session: NameSpace
}
object Exceptions {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Exception,
    OutlookDotExceptions_typekey: Exceptions,
    Parent: Any,
    Session: NameSpace
  ): Exceptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Exceptions_typekey")(OutlookDotExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exceptions]
  }
  
  extension [Self <: Exceptions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Exception): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotExceptions_typekey(value: Exceptions): Self = StObject.set(x, "Outlook.Exceptions_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
