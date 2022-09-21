package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlSelectionContents
import typings.activexOutlook.Outlook.OlSelectionLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Selection")
@js.native
/* private */ open class Selection ()
  extends StObject
     with typings.activexOutlook.Outlook.Selection {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetSelection(SelectionContents: OlSelectionContents): typings.activexOutlook.Outlook.Selection = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): Any = js.native
  
  /* CompleteClass */
  override val Location: OlSelectionLocation = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Selection_typekey")
  var OutlookDotSelection_typekey: typings.activexOutlook.Outlook.Selection = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
