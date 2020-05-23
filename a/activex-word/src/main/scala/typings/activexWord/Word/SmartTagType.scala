package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagType extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val FriendlyName: String
  val Name: String
  val Parent: js.Any
  val SmartTagActions: typings.activexWord.Word.SmartTagActions
  val SmartTagRecognizers: typings.activexWord.Word.SmartTagRecognizers
  @JSName("Word.SmartTagType_typekey")
  var WordDotSmartTagType_typekey: SmartTagType
}

object SmartTagType {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    FriendlyName: String,
    Name: String,
    Parent: js.Any,
    SmartTagActions: SmartTagActions,
    SmartTagRecognizers: SmartTagRecognizers,
    WordDotSmartTagType_typekey: SmartTagType
  ): SmartTagType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SmartTagActions = SmartTagActions.asInstanceOf[js.Any], SmartTagRecognizers = SmartTagRecognizers.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagType_typekey")(WordDotSmartTagType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagType]
  }
}

