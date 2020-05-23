package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionary extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var LanguageID: WdLanguageID
  var LanguageSpecific: Boolean
  val Name: String
  val Parent: js.Any
  val Path: String
  val ReadOnly: Boolean
  val Type: WdDictionaryType
  @JSName("Word.Dictionary_typekey")
  var WordDotDictionary_typekey: Dictionary
  def Delete(): Unit
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
}

