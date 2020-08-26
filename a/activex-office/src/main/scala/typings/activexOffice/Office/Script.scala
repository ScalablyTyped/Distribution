package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Script extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var Extended: String = js.native
  var Id: String = js.native
  var Language: MsoScriptLanguage = js.native
  val Location: MsoScriptLocation = js.native
  @JSName("Office.Script_typekey")
  var OfficeDotScript_typekey: Script = js.native
  val Parent: js.Any = js.native
  var ScriptText: String = js.native
  val Shape: js.Any = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class ScriptOps[Self <: Script] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setExtended(value: String): Self = this.set("Extended", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: MsoScriptLanguage): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: MsoScriptLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotScript_typekey(value: Script): Self = this.set("Office.Script_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptText(value: String): Self = this.set("ScriptText", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: js.Any): Self = this.set("Shape", value.asInstanceOf[js.Any])
  }
  
}

