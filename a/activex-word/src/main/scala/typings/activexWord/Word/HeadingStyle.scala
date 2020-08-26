package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadingStyle extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Level: Double = js.native
  val Parent: js.Any = js.native
  var Style: js.Any = js.native
  @JSName("Word.HeadingStyle_typekey")
  var WordDotHeadingStyle_typekey: HeadingStyle = js.native
  def Delete(): Unit = js.native
}

object HeadingStyle {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Level: Double,
    Parent: js.Any,
    Style: js.Any,
    WordDotHeadingStyle_typekey: HeadingStyle
  ): HeadingStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Level = Level.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyle_typekey")(WordDotHeadingStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyle]
  }
  @scala.inline
  implicit class HeadingStyleOps[Self <: HeadingStyle] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setLevel(value: Double): Self = this.set("Level", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotHeadingStyle_typekey(value: HeadingStyle): Self = this.set("Word.HeadingStyle_typekey", value.asInstanceOf[js.Any])
  }
  
}

