package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Code: Range = js.native
  val Creator: Double = js.native
  var Data: String = js.native
  val Index: Double = js.native
  val InlineShape: typings.activexWord.Word.InlineShape = js.native
  val Kind: WdFieldKind = js.native
  val LinkFormat: typings.activexWord.Word.LinkFormat = js.native
  var Locked: Boolean = js.native
  val Next: Field = js.native
  val OLEFormat: typings.activexWord.Word.OLEFormat = js.native
  val Parent: js.Any = js.native
  val Previous: Field = js.native
  var Result: Range = js.native
  var ShowCodes: Boolean = js.native
  val Type: WdFieldType = js.native
  @JSName("Word.Field_typekey")
  var WordDotField_typekey: Field = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def DoClick(): Unit = js.native
  def Select(): Unit = js.native
  def Unlink(): Unit = js.native
  def Update(): Boolean = js.native
  def UpdateSource(): Unit = js.native
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
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setCode(value: Range): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: String): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDoClick(value: () => Unit): Self = this.set("DoClick", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineShape(value: InlineShape): Self = this.set("InlineShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: WdFieldKind): Self = this.set("Kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkFormat(value: LinkFormat): Self = this.set("LinkFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Field): Self = this.set("Next", value.asInstanceOf[js.Any])
    @scala.inline
    def setOLEFormat(value: OLEFormat): Self = this.set("OLEFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: Field): Self = this.set("Previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Range): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setShowCodes(value: Boolean): Self = this.set("ShowCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WdFieldType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlink(value: () => Unit): Self = this.set("Unlink", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Boolean): Self = this.set("Update", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateSource(value: () => Unit): Self = this.set("UpdateSource", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotField_typekey(value: Field): Self = this.set("Word.Field_typekey", value.asInstanceOf[js.Any])
  }
  
}

