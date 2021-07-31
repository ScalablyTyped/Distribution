package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlViewSaveOption
import typings.activexOutlook.Outlook.OlViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Views")
@js.native
class Views protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Views {
  
  /* CompleteClass */
  override def Add(Name: String, ViewType: OlViewType, SaveOption: OlViewSaveOption): typings.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Views_typekey")
  var OutlookDotViews_typekey: typings.activexOutlook.Outlook.Views = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
