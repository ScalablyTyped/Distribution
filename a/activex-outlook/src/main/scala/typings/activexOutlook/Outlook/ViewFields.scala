package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewFields extends StObject {
  
  def Add(PropertyName: String): ViewField
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Insert(PropertyName: String, Index: js.Any): ViewField
  
  def Item(Index: js.Any): ViewField
  
  /* private */ @JSName("Outlook.ViewFields_typekey")
  var OutlookDotViewFields_typekey: ViewFields
  
  val Parent: js.Any
  
  def Remove(Index: js.Any): Unit
  
  val Session: NameSpace
}
object ViewFields {
  
  inline def apply(
    Add: String => ViewField,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, js.Any) => ViewField,
    Item: js.Any => ViewField,
    OutlookDotViewFields_typekey: ViewFields,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): ViewFields = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewFields_typekey")(OutlookDotViewFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFields]
  }
  
  extension [Self <: ViewFields](x: Self) {
    
    inline def setAdd(value: String => ViewField): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInsert(value: (String, js.Any) => ViewField): Self = StObject.set(x, "Insert", js.Any.fromFunction2(value))
    
    inline def setItem(value: js.Any => ViewField): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotViewFields_typekey(value: ViewFields): Self = StObject.set(x, "Outlook.ViewFields_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
