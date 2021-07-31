package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Links extends StObject {
  
  def Add(Item: js.Any): Link
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): Link
  
  @JSName("Outlook.Links_typekey")
  var OutlookDotLinks_typekey: Links
  
  val Parent: js.Any
  
  def Remove(Index: js.Any): Unit
  
  val Session: NameSpace
}
object Links {
  
  @scala.inline
  def apply(
    Add: js.Any => Link,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Link,
    OutlookDotLinks_typekey: Links,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): Links = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Links_typekey")(OutlookDotLinks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Any => Link): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Link): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotLinks_typekey(value: Links): Self = StObject.set(x, "Outlook.Links_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
