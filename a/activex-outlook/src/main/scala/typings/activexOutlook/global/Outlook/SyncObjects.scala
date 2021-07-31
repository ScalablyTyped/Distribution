package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.SyncObjects")
@js.native
class SyncObjects protected ()
  extends StObject
     with typings.activexOutlook.Outlook.SyncObjects {
  
  /* CompleteClass */
  override val AppFolders: typings.activexOutlook.Outlook.SyncObject = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.SyncObject = js.native
  
  /* CompleteClass */
  @JSName("Outlook.SyncObjects_typekey")
  var OutlookDotSyncObjects_typekey: typings.activexOutlook.Outlook.SyncObjects = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
