package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappedDataField extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var DataFieldIndex: Double
  val DataFieldName: String
  val Index: Double
  val Name: String
  val Parent: js.Any
  val Value: String
  @JSName("Word.MappedDataField_typekey")
  var WordDotMappedDataField_typekey: MappedDataField
}

object MappedDataField {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    DataFieldIndex: Double,
    DataFieldName: String,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotMappedDataField_typekey: MappedDataField
  ): MappedDataField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataFieldIndex = DataFieldIndex.asInstanceOf[js.Any], DataFieldName = DataFieldName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MappedDataField_typekey")(WordDotMappedDataField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedDataField]
  }
}

