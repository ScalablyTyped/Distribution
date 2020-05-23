package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProperties extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.CustomProperties_typekey")
  var WordDotCustomProperties_typekey: CustomProperties
  def Add(Name: String, Value: String): CustomProperty
  def Item(Index: js.Any): CustomProperty
}

object CustomProperties {
  @scala.inline
  def apply(
    Add: (String, String) => CustomProperty,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => CustomProperty,
    Parent: js.Any,
    WordDotCustomProperties_typekey: CustomProperties
  ): CustomProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomProperties_typekey")(WordDotCustomProperties_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperties]
  }
}

