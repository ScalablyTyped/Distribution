package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMergeDataField extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Value: String = js.native
  @JSName("Word.MailMergeDataField_typekey")
  var WordDotMailMergeDataField_typekey: MailMergeDataField = js.native
}

object MailMergeDataField {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotMailMergeDataField_typekey: MailMergeDataField
  ): MailMergeDataField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeDataField_typekey")(WordDotMailMergeDataField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeDataField]
  }
  @scala.inline
  implicit class MailMergeDataFieldOps[Self <: MailMergeDataField] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotMailMergeDataField_typekey(value: MailMergeDataField): Self = this.set("Word.MailMergeDataField_typekey", value.asInstanceOf[js.Any])
  }
  
}

