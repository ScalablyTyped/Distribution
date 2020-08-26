package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Cited: Boolean = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val Tag: String = js.native
  @JSName("Word.Source_typekey")
  var WordDotSource_typekey: Source = js.native
  val XML: String = js.native
  def Delete(): Unit = js.native
  def Field(Name: String): String = js.native
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
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setCited(value: Boolean): Self = this.set("Cited", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setField(value: String => String): Self = this.set("Field", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotSource_typekey(value: Source): Self = this.set("Word.Source_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setXML(value: String): Self = this.set("XML", value.asInstanceOf[js.Any])
  }
  
}

