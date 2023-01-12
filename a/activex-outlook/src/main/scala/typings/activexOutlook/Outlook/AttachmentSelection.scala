package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentSelection extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def GetSelection(SelectionContents: OlSelectionContents): Selection
  
  def Item(Index: Any): Attachment
  
  val Location: OlSelectionLocation
  
  /* private */ @JSName("Outlook.AttachmentSelection_typekey")
  var OutlookDotAttachmentSelection_typekey: AttachmentSelection
  
  val Parent: Any
  
  val Session: NameSpace
}
object AttachmentSelection {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetSelection: OlSelectionContents => Selection,
    Item: Any => Attachment,
    Location: OlSelectionLocation,
    OutlookDotAttachmentSelection_typekey: AttachmentSelection,
    Parent: Any,
    Session: NameSpace
  ): AttachmentSelection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetSelection = js.Any.fromFunction1(GetSelection), Item = js.Any.fromFunction1(Item), Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AttachmentSelection_typekey")(OutlookDotAttachmentSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentSelection] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetSelection(value: OlSelectionContents => Selection): Self = StObject.set(x, "GetSelection", js.Any.fromFunction1(value))
    
    inline def setItem(value: Any => Attachment): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLocation(value: OlSelectionLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotAttachmentSelection_typekey(value: AttachmentSelection): Self = StObject.set(x, "Outlook.AttachmentSelection_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
