package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlGroupType
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationGroups")
@js.native
/* private */ open class NavigationGroups ()
  extends StObject
     with typings.activexOutlook.Outlook.NavigationGroups {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Create(GroupDisplayName: String): typings.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* CompleteClass */
  override def Delete(Group: typings.activexOutlook.Outlook.NavigationGroup): Unit = js.native
  
  /* CompleteClass */
  override def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): typings.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationGroups_typekey")
  var OutlookDotNavigationGroups_typekey: typings.activexOutlook.Outlook.NavigationGroups = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
