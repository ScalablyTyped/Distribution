package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Cited: Boolean
  val Creator: Double
  val Parent: js.Any
  val Tag: String
  @JSName("Word.Source_typekey")
  var WordDotSource_typekey: Source
  val XML: String
  def Delete(): Unit
  def Field(Name: String): String
}

object Source {
  @scala.inline
  def apply(
    Application: Application,
    Cited: Boolean,
    Creator: Double,
    Delete: () => Unit,
    Field: String => String,
    Parent: js.Any,
    Tag: String,
    WordDotSource_typekey: Source,
    XML: String
  ): Source = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cited = Cited.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Field = js.Any.fromFunction1(Field), Parent = Parent.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Source_typekey")(WordDotSource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

