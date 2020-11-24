package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormDescription extends js.Object {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var Category: String = js.native
  
  var CategorySub: String = js.native
  
  val Class: OlObjectClass = js.native
  
  var Comment: String = js.native
  
  var ContactName: String = js.native
  
  var DisplayName: String = js.native
  
  var Hidden: Boolean = js.native
  
  var Icon: String = js.native
  
  var Locked: Boolean = js.native
  
  val MessageClass: String = js.native
  
  var MiniIcon: String = js.native
  
  var Name: String = js.native
  
  var Number: String = js.native
  
  var OneOff: Boolean = js.native
  
  @JSName("Outlook.FormDescription_typekey")
  var OutlookDotFormDescription_typekey: FormDescription = js.native
  
  val Parent: js.Any = js.native
  
  var Password: String = js.native
  
  def PublishForm(Registry: OlFormRegistry): Unit = js.native
  def PublishForm(Registry: OlFormRegistry, Folder: js.Any): Unit = js.native
  
  val ScriptText: String = js.native
  
  val Session: NameSpace = js.native
  
  var Template: String = js.native
  
  var UseWordMail: Boolean = js.native
  
  var Version: String = js.native
}
