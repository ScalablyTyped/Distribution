package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Actions")
@js.native
/* private */ open class Actions ()
  extends StObject
     with typings.activexOutlook.Outlook.Actions {
  
  /* CompleteClass */
  override def Add(): typings.activexOutlook.Outlook.Action = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.Action = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Actions_typekey")
  var OutlookDotActions_typekey: typings.activexOutlook.Outlook.Actions = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
