package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.TimeZones")
@js.native
/* private */ open class TimeZones ()
  extends StObject
     with typings.activexOutlook.Outlook.TimeZones {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def ConvertTime(
    SourceDateTime: VarDate,
    SourceTimeZone: typings.activexOutlook.Outlook.TimeZone,
    DestinationTimeZone: typings.activexOutlook.Outlook.TimeZone
  ): VarDate = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val CurrentTimeZone: typings.activexOutlook.Outlook.TimeZone = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexOutlook.Outlook.TimeZone = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.TimeZones_typekey")
  var OutlookDotTimeZones_typekey: typings.activexOutlook.Outlook.TimeZones = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
