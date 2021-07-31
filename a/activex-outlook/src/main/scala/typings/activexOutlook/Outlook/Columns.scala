package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  def Add(Name: String): Column
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Column
  
  @JSName("Outlook.Columns_typekey")
  var OutlookDotColumns_typekey: Columns
  
  val Parent: js.Any
  
  def Remove(Index: js.Any): Unit
  
  def RemoveAll(): Unit
  
  val Session: NameSpace
}
object Columns {
  
  @scala.inline
  def apply(
    Add: String => Column,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Column,
    OutlookDotColumns_typekey: Columns,
    Parent: js.Any,
    Remove: js.Any => Unit,
    RemoveAll: () => Unit,
    Session: NameSpace
  ): Columns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Columns_typekey")(OutlookDotColumns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => Column): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Column): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotColumns_typekey(value: Columns): Self = StObject.set(x, "Outlook.Columns_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = StObject.set(x, "RemoveAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
