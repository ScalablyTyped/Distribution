package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  def Add(Item: Any): Link
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Link
  
  /* private */ @JSName("Outlook.Links_typekey")
  var OutlookDotLinks_typekey: Links
  
  val Parent: Any
  
  def Remove(Index: Any): Unit
  
  val Session: NameSpace
}
object Links {
  
  inline def apply(
    Add: Any => Link,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Link,
    OutlookDotLinks_typekey: Links,
    Parent: Any,
    Remove: Any => Unit,
    Session: NameSpace
  ): Links = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Links_typekey")(OutlookDotLinks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Any => Link): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Link): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotLinks_typekey(value: Links): Self = StObject.set(x, "Outlook.Links_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
