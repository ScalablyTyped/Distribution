package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagRecognizer extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Caption: String
  val Creator: Double
  var Enabled: Boolean
  val FullName: String
  val Parent: js.Any
  val ProgID: String
  @JSName("Word.SmartTagRecognizer_typekey")
  var WordDotSmartTagRecognizer_typekey: SmartTagRecognizer
}

object SmartTagRecognizer {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: Double,
    Enabled: Boolean,
    FullName: String,
    Parent: js.Any,
    ProgID: String,
    WordDotSmartTagRecognizer_typekey: SmartTagRecognizer
  ): SmartTagRecognizer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProgID = ProgID.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagRecognizer_typekey")(WordDotSmartTagRecognizer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizer]
  }
}

