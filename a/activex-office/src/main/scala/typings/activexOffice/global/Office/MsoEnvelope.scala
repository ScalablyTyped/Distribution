package typings.activexOffice.global.Office

import typings.activexOffice.Office.CommandBars
import typings.activexOutlook.Outlook.MailItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.MsoEnvelope")
@js.native
/* private */ class MsoEnvelope ()
  extends StObject
     with typings.activexOffice.Office.MsoEnvelope {
  
  /* CompleteClass */
  override def CommandBars(Index: String): typings.activexOffice.Office.CommandBar = js.native
  /* CompleteClass */
  override def CommandBars(Index: Double): typings.activexOffice.Office.CommandBar = js.native
  /* CompleteClass */
  @JSName("CommandBars")
  override val CommandBars_Original: CommandBars = js.native
  
  /* CompleteClass */
  var Introduction: String = js.native
  
  /* CompleteClass */
  override val Item: MailItem = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.MsoEnvelope_typekey")
  var OfficeDotMsoEnvelope_typekey: typings.activexOffice.Office.MsoEnvelope = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
}
