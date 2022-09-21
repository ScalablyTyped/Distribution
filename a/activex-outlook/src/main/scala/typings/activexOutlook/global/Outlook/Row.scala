package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Row")
@js.native
/* private */ open class Row ()
  extends StObject
     with typings.activexOutlook.Outlook.Row {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def BinaryToString(Index: Any): String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def GetValues(): Any = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): Any = js.native
  
  /* CompleteClass */
  override def LocalTimeToUTC(Index: Any): VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Row_typekey")
  var OutlookDotRow_typekey: typings.activexOutlook.Outlook.Row = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override def UTCToLocalTime(Index: Any): VarDate = js.native
}
