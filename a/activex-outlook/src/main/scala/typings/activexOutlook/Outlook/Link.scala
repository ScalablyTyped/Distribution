package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Item: js.Any
  
  val Name: String
  
  @JSName("Outlook.Link_typekey")
  var OutlookDotLink_typekey: Link
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  val Type: OlObjectClass
}
object Link {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Item: js.Any,
    Name: String,
    OutlookDotLink_typekey: Link,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlObjectClass
  ): Link = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Link_typekey")(OutlookDotLink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotLink_typekey(value: Link): Self = StObject.set(x, "Outlook.Link_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OlObjectClass): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
