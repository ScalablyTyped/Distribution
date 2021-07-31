package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Links")
@js.native
class Links protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Links {
  
  /* CompleteClass */
  override def Add(Item: js.Any): typings.activexOutlook.Outlook.Link = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Link = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Links_typekey")
  var OutlookDotLinks_typekey: typings.activexOutlook.Outlook.Links = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
