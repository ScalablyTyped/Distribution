package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  var Target: WdBrowseTarget
  @JSName("Word.Browser_typekey")
  var WordDotBrowser_typekey: Browser
  def Next(): Unit
  def Previous(): Unit
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
}

