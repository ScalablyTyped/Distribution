package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlActionCopyLike
import typings.activexOutlook.Outlook.OlActionReplyStyle
import typings.activexOutlook.Outlook.OlActionResponseStyle
import typings.activexOutlook.Outlook.OlActionShowOn
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Action")
@js.native
class Action protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Action {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var CopyLike: OlActionCopyLike = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  override def Execute(): js.Any = js.native
  
  /* CompleteClass */
  var MessageClass: String = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Action_typekey")
  var OutlookDotAction_typekey: typings.activexOutlook.Outlook.Action = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Prefix: String = js.native
  
  /* CompleteClass */
  var ReplyStyle: OlActionReplyStyle = js.native
  
  /* CompleteClass */
  var ResponseStyle: OlActionResponseStyle = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowOn: OlActionShowOn = js.native
}
