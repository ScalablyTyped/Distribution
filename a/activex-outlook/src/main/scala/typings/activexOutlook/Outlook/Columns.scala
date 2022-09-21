package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  def Add(Name: String): Column
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Column
  
  /* private */ @JSName("Outlook.Columns_typekey")
  var OutlookDotColumns_typekey: Columns
  
  val Parent: Any
  
  def Remove(Index: Any): Unit
  
  def RemoveAll(): Unit
  
  val Session: NameSpace
}
object Columns {
  
  inline def apply(
    Add: String => Column,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Column,
    OutlookDotColumns_typekey: Columns,
    Parent: Any,
    Remove: Any => Unit,
    RemoveAll: () => Unit,
    Session: NameSpace
  ): Columns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Columns_typekey")(OutlookDotColumns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setAdd(value: String => Column): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Column): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotColumns_typekey(value: Columns): Self = StObject.set(x, "Outlook.Columns_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setRemoveAll(value: () => Unit): Self = StObject.set(x, "RemoveAll", js.Any.fromFunction0(value))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
