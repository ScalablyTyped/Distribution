package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Recipients")
@js.native
/* private */ open class Recipients ()
  extends StObject
     with typings.activexOutlook.Outlook.Recipients {
  
  /* CompleteClass */
  override def Add(Name: String): typings.activexOutlook.Outlook.Recipient = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.Recipient = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Recipients_typekey")
  var OutlookDotRecipients_typekey: typings.activexOutlook.Outlook.Recipients = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  
  /* CompleteClass */
  override def ResolveAll(): Boolean = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
