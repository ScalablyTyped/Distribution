package typings.activexOffice.Office

import typings.activexOutlook.Outlook.MailItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsoEnvelope extends StObject {
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  var Introduction: String = js.native
  
  val Item: MailItem = js.native
  
  @JSName("Office.MsoEnvelope_typekey")
  var OfficeDotMsoEnvelope_typekey: MsoEnvelope = js.native
  
  val Parent: js.Any = js.native
}
