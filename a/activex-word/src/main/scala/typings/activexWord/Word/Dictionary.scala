package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionary extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageSpecific: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val ReadOnly: Boolean = js.native
  val Type: WdDictionaryType = js.native
  @JSName("Word.Dictionary_typekey")
  var WordDotDictionary_typekey: Dictionary = js.native
  def Delete(): Unit = js.native
}

object Dictionary {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    LanguageID: WdLanguageID,
    LanguageSpecific: Boolean,
    Name: String,
    Parent: js.Any,
    Path: String,
    ReadOnly: Boolean,
    Type: WdDictionaryType,
    WordDotDictionary_typekey: Dictionary
  ): Dictionary = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), LanguageID = LanguageID.asInstanceOf[js.Any], LanguageSpecific = LanguageSpecific.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dictionary_typekey")(WordDotDictionary_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionary]
  }
  @scala.inline
  implicit class DictionaryOps[Self <: Dictionary] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = this.set("LanguageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageSpecific(value: Boolean): Self = this.set("LanguageSpecific", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WdDictionaryType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotDictionary_typekey(value: Dictionary): Self = this.set("Word.Dictionary_typekey", value.asInstanceOf[js.Any])
  }
  
}

