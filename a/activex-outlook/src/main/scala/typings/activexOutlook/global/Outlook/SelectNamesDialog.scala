package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlDefaultSelectNamesDisplayMode
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRecipientSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.SelectNamesDialog")
@js.native
/* private */ class SelectNamesDialog ()
  extends StObject
     with typings.activexOutlook.Outlook.SelectNamesDialog {
  
  /* CompleteClass */
  var AllowMultipleSelection: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  var BccLabel: String = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  var CcLabel: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Display(): Boolean = js.native
  
  /* CompleteClass */
  var ForceResolution: Boolean = js.native
  
  /* CompleteClass */
  var InitialAddressList: typings.activexOutlook.Outlook.AddressList = js.native
  
  /* CompleteClass */
  var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: typings.activexOutlook.Outlook.SelectNamesDialog = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
  
  /* CompleteClass */
  var ShowOnlyInitialAddressList: Boolean = js.native
  
  /* CompleteClass */
  var ToLabel: String = js.native
}
