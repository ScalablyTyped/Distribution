package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappedDataFields extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.MappedDataFields_typekey")
  var WordDotMappedDataFields_typekey: MappedDataFields
  def Item(Index: WdMappedDataFields): MappedDataField
}

object MappedDataFields {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdMappedDataFields => MappedDataField,
    Parent: js.Any,
    WordDotMappedDataFields_typekey: MappedDataFields
  ): MappedDataFields = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MappedDataFields_typekey")(WordDotMappedDataFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedDataFields]
  }
}

