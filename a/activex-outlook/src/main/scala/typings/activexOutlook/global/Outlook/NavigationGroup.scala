package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlGroupType
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationGroup")
@js.native
/* private */ class NavigationGroup ()
  extends StObject
     with typings.activexOutlook.Outlook.NavigationGroup {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val GroupType: OlGroupType = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val NavigationFolders: typings.activexOutlook.Outlook.NavigationFolders = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationGroup_typekey")
  var OutlookDotNavigationGroup_typekey: typings.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
