package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMessage extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  def CheckName(): Unit
  
  val Creator: Double
  
  def Delete(): Unit
  
  def DisplayMoveDialog(): Unit
  
  def DisplayProperties(): Unit
  
  def DisplaySelectNamesDialog(): Unit
  
  def Forward(): Unit
  
  def GoToNext(): Unit
  
  def GoToPrevious(): Unit
  
  val Parent: js.Any
  
  def Reply(): Unit
  
  def ReplyAll(): Unit
  
  def ToggleHeader(): Unit
  
  /* private */ @JSName("Word.MailMessage_typekey")
  var WordDotMailMessage_typekey: MailMessage
}
object MailMessage {
  
  inline def apply(
    Application: Application,
    CheckName: () => Unit,
    Creator: Double,
    Delete: () => Unit,
    DisplayMoveDialog: () => Unit,
    DisplayProperties: () => Unit,
    DisplaySelectNamesDialog: () => Unit,
    Forward: () => Unit,
    GoToNext: () => Unit,
    GoToPrevious: () => Unit,
    Parent: js.Any,
    Reply: () => Unit,
    ReplyAll: () => Unit,
    ToggleHeader: () => Unit,
    WordDotMailMessage_typekey: MailMessage
  ): MailMessage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CheckName = js.Any.fromFunction0(CheckName), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayMoveDialog = js.Any.fromFunction0(DisplayMoveDialog), DisplayProperties = js.Any.fromFunction0(DisplayProperties), DisplaySelectNamesDialog = js.Any.fromFunction0(DisplaySelectNamesDialog), Forward = js.Any.fromFunction0(Forward), GoToNext = js.Any.fromFunction0(GoToNext), GoToPrevious = js.Any.fromFunction0(GoToPrevious), Parent = Parent.asInstanceOf[js.Any], Reply = js.Any.fromFunction0(Reply), ReplyAll = js.Any.fromFunction0(ReplyAll), ToggleHeader = js.Any.fromFunction0(ToggleHeader))
    __obj.updateDynamic("Word.MailMessage_typekey")(WordDotMailMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  
  extension [Self <: MailMessage](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCheckName(value: () => Unit): Self = StObject.set(x, "CheckName", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDisplayMoveDialog(value: () => Unit): Self = StObject.set(x, "DisplayMoveDialog", js.Any.fromFunction0(value))
    
    inline def setDisplayProperties(value: () => Unit): Self = StObject.set(x, "DisplayProperties", js.Any.fromFunction0(value))
    
    inline def setDisplaySelectNamesDialog(value: () => Unit): Self = StObject.set(x, "DisplaySelectNamesDialog", js.Any.fromFunction0(value))
    
    inline def setForward(value: () => Unit): Self = StObject.set(x, "Forward", js.Any.fromFunction0(value))
    
    inline def setGoToNext(value: () => Unit): Self = StObject.set(x, "GoToNext", js.Any.fromFunction0(value))
    
    inline def setGoToPrevious(value: () => Unit): Self = StObject.set(x, "GoToPrevious", js.Any.fromFunction0(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReply(value: () => Unit): Self = StObject.set(x, "Reply", js.Any.fromFunction0(value))
    
    inline def setReplyAll(value: () => Unit): Self = StObject.set(x, "ReplyAll", js.Any.fromFunction0(value))
    
    inline def setToggleHeader(value: () => Unit): Self = StObject.set(x, "ToggleHeader", js.Any.fromFunction0(value))
    
    inline def setWordDotMailMessage_typekey(value: MailMessage): Self = StObject.set(x, "Word.MailMessage_typekey", value.asInstanceOf[js.Any])
  }
}
