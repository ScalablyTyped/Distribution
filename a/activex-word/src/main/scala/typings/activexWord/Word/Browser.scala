package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Target: WdBrowseTarget = js.native
  @JSName("Word.Browser_typekey")
  var WordDotBrowser_typekey: Browser = js.native
  def Next(): Unit = js.native
  def Previous(): Unit = js.native
}

object Browser {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Next: () => Unit,
    Parent: js.Any,
    Previous: () => Unit,
    Target: WdBrowseTarget,
    WordDotBrowser_typekey: Browser
  ): Browser = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Next = js.Any.fromFunction0(Next), Parent = Parent.asInstanceOf[js.Any], Previous = js.Any.fromFunction0(Previous), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Browser_typekey")(WordDotBrowser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def setNext(value: () => Unit): Self = this.set("Next", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("Previous", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: WdBrowseTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotBrowser_typekey(value: Browser): Self = this.set("Word.Browser_typekey", value.asInstanceOf[js.Any])
  }
  
}

