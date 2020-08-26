package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagType extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val FriendlyName: String = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val SmartTagActions: typings.activexWord.Word.SmartTagActions = js.native
  val SmartTagRecognizers: typings.activexWord.Word.SmartTagRecognizers = js.native
  @JSName("Word.SmartTagType_typekey")
  var WordDotSmartTagType_typekey: SmartTagType = js.native
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
  @scala.inline
  implicit class SmartTagTypeOps[Self <: SmartTagType] (val x: Self) extends AnyVal {
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
    def setFriendlyName(value: String): Self = this.set("FriendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmartTagActions(value: SmartTagActions): Self = this.set("SmartTagActions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmartTagRecognizers(value: SmartTagRecognizers): Self = this.set("SmartTagRecognizers", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotSmartTagType_typekey(value: SmartTagType): Self = this.set("Word.SmartTagType_typekey", value.asInstanceOf[js.Any])
  }
  
}

