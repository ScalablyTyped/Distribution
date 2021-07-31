package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Columns")
@js.native
class Columns protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Columns {
  
  /* CompleteClass */
  override def Add(Name: String): typings.activexOutlook.Outlook.Column = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Column = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Columns_typekey")
  var OutlookDotColumns_typekey: typings.activexOutlook.Outlook.Columns = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def RemoveAll(): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
