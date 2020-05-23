package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Script extends js.Object {
  val Application: js.Any
  val Creator: Double
  var Extended: String
  var Id: String
  var Language: MsoScriptLanguage
  val Location: MsoScriptLocation
  @JSName("Office.Script_typekey")
  var OfficeDotScript_typekey: Script
  val Parent: js.Any
  var ScriptText: String
  val Shape: js.Any
  def Delete(): Unit
}

object Script {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    Extended: String,
    Id: String,
    Language: MsoScriptLanguage,
    Location: MsoScriptLocation,
    OfficeDotScript_typekey: Script,
    Parent: js.Any,
    ScriptText: String,
    Shape: js.Any
  ): Script = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Extended = Extended.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ScriptText = ScriptText.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Script_typekey")(OfficeDotScript_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
}

