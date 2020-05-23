package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subdocument extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val HasFile: Boolean
  val Level: Double
  var Locked: Boolean
  val Name: String
  val Parent: js.Any
  val Path: String
  val Range: typings.activexWord.Word.Range
  @JSName("Word.Subdocument_typekey")
  var WordDotSubdocument_typekey: Subdocument
  def Delete(): Unit
  def Open(): Document
  def Split(Range: typings.activexWord.Word.Range): Unit
}

object Subdocument {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    HasFile: Boolean,
    Level: Double,
    Locked: Boolean,
    Name: String,
    Open: () => Document,
    Parent: js.Any,
    Path: String,
    Range: Range,
    Split: Range => Unit,
    WordDotSubdocument_typekey: Subdocument
  ): Subdocument = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasFile = HasFile.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Split = js.Any.fromFunction1(Split))
    __obj.updateDynamic("Word.Subdocument_typekey")(WordDotSubdocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subdocument]
  }
}

