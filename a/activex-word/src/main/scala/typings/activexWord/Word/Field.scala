package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Code: Range
  val Creator: Double
  var Data: String
  val Index: Double
  val InlineShape: typings.activexWord.Word.InlineShape
  val Kind: WdFieldKind
  val LinkFormat: typings.activexWord.Word.LinkFormat
  var Locked: Boolean
  val Next: Field
  val OLEFormat: typings.activexWord.Word.OLEFormat
  val Parent: js.Any
  val Previous: Field
  var Result: Range
  var ShowCodes: Boolean
  val Type: WdFieldType
  @JSName("Word.Field_typekey")
  var WordDotField_typekey: Field
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def DoClick(): Unit
  def Select(): Unit
  def Unlink(): Unit
  def Update(): Boolean
  def UpdateSource(): Unit
}

object Field {
  @scala.inline
  def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Data: String,
    Delete: () => Unit,
    DoClick: () => Unit,
    Index: Double,
    InlineShape: InlineShape,
    Kind: WdFieldKind,
    LinkFormat: LinkFormat,
    Locked: Boolean,
    Next: Field,
    OLEFormat: OLEFormat,
    Parent: js.Any,
    Previous: Field,
    Result: Range,
    Select: () => Unit,
    ShowCodes: Boolean,
    Type: WdFieldType,
    Unlink: () => Unit,
    Update: () => Boolean,
    UpdateSource: () => Unit,
    WordDotField_typekey: Field
  ): Field = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Data = Data.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DoClick = js.Any.fromFunction0(DoClick), Index = Index.asInstanceOf[js.Any], InlineShape = InlineShape.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], LinkFormat = LinkFormat.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], OLEFormat = OLEFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowCodes = ShowCodes.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlink = js.Any.fromFunction0(Unlink), Update = js.Any.fromFunction0(Update), UpdateSource = js.Any.fromFunction0(UpdateSource))
    __obj.updateDynamic("Word.Field_typekey")(WordDotField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

