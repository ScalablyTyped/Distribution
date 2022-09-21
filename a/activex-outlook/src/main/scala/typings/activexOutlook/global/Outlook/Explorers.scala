package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlFolderDisplayMode
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Explorers")
@js.native
/* private */ open class Explorers ()
  extends StObject
     with typings.activexOutlook.Outlook.Explorers {
  
  /* CompleteClass */
  override def Add(Folder: Any, DisplayMode: OlFolderDisplayMode): typings.activexOutlook.Outlook.Explorer = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.Explorer = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: typings.activexOutlook.Outlook.Explorers = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
