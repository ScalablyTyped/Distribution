package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoHyperlinkType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hyperlink extends StObject {
  
  def AddToFavorites(): Unit
  
  var Address: String
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def CreateNewDocument(FileName: String, EditNow: MsoTriState, Overwrite: MsoTriState): Unit
  
  def Delete(): Unit
  
  var EmailSubject: String
  
  def Follow(): Unit
  
  val Parent: js.Any
  
  @JSName("PowerPoint.Hyperlink_typekey")
  var PowerPointDotHyperlink_typekey: Hyperlink
  
  var ScreenTip: String
  
  var ShowAndReturn: MsoTriState
  
  var SubAddress: String
  
  var TextToDisplay: String
  
  val Type: MsoHyperlinkType
}
object Hyperlink {
  
  @scala.inline
  def apply(
    AddToFavorites: () => Unit,
    Address: String,
    Application: Application,
    CreateNewDocument: (String, MsoTriState, MsoTriState) => Unit,
    Delete: () => Unit,
    EmailSubject: String,
    Follow: () => Unit,
    Parent: js.Any,
    PowerPointDotHyperlink_typekey: Hyperlink,
    ScreenTip: String,
    ShowAndReturn: MsoTriState,
    SubAddress: String,
    TextToDisplay: String,
    Type: MsoHyperlinkType
  ): Hyperlink = {
    val __obj = js.Dynamic.literal(AddToFavorites = js.Any.fromFunction0(AddToFavorites), Address = Address.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CreateNewDocument = js.Any.fromFunction3(CreateNewDocument), Delete = js.Any.fromFunction0(Delete), EmailSubject = EmailSubject.asInstanceOf[js.Any], Follow = js.Any.fromFunction0(Follow), Parent = Parent.asInstanceOf[js.Any], ScreenTip = ScreenTip.asInstanceOf[js.Any], ShowAndReturn = ShowAndReturn.asInstanceOf[js.Any], SubAddress = SubAddress.asInstanceOf[js.Any], TextToDisplay = TextToDisplay.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Hyperlink_typekey")(PowerPointDotHyperlink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
  
  @scala.inline
  implicit class HyperlinkMutableBuilder[Self <: Hyperlink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToFavorites(value: () => Unit): Self = StObject.set(x, "AddToFavorites", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNewDocument(value: (String, MsoTriState, MsoTriState) => Unit): Self = StObject.set(x, "CreateNewDocument", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "EmailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollow(value: () => Unit): Self = StObject.set(x, "Follow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHyperlink_typekey(value: Hyperlink): Self = StObject.set(x, "PowerPoint.Hyperlink_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenTip(value: String): Self = StObject.set(x, "ScreenTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAndReturn(value: MsoTriState): Self = StObject.set(x, "ShowAndReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAddress(value: String): Self = StObject.set(x, "SubAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToDisplay(value: String): Self = StObject.set(x, "TextToDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoHyperlinkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
