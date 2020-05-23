package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathAutoCorrectEntry extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  var Name: String
  val Parent: js.Any
  var Value: String
  @JSName("Word.OMathAutoCorrectEntry_typekey")
  var WordDotOMathAutoCorrectEntry_typekey: OMathAutoCorrectEntry
  def Delete(): Unit
}

object OMathAutoCorrectEntry {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotOMathAutoCorrectEntry_typekey: OMathAutoCorrectEntry
  ): OMathAutoCorrectEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrectEntry_typekey")(WordDotOMathAutoCorrectEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrectEntry]
  }
}

