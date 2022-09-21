package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationFolders")
@js.native
/* private */ open class NavigationFolders ()
  extends StObject
     with typings.activexOutlook.Outlook.NavigationFolders {
  
  /* CompleteClass */
  override def Add(Folder: typings.activexOutlook.Outlook.Folder): typings.activexOutlook.Outlook.NavigationFolder = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.NavigationFolder = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationFolders_typekey")
  var OutlookDotNavigationFolders_typekey: typings.activexOutlook.Outlook.NavigationFolders = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(RemovableFolder: typings.activexOutlook.Outlook.NavigationFolder): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
