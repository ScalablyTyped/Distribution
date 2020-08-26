package typings.aphrodite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calling StyleSheet.extend() returns an object with each of the exported
  * properties on it.
  */
@js.native
trait Exports extends js.Object {
  var StyleSheet: StyleSheetStatic = js.native
  var StyleSheetServer: StyleSheetServerStatic = js.native
  var StyleSheetTestUtils: StyleSheetTestUtilsStatic = js.native
  def css(styles: CSSInputTypes*): String = js.native
  def flushToStyleTag(): Unit = js.native
}

object Exports {
  @scala.inline
  def apply(
    StyleSheet: StyleSheetStatic,
    StyleSheetServer: StyleSheetServerStatic,
    StyleSheetTestUtils: StyleSheetTestUtilsStatic,
    css: /* repeated */ CSSInputTypes => String,
    flushToStyleTag: () => Unit
  ): Exports = {
    val __obj = js.Dynamic.literal(StyleSheet = StyleSheet.asInstanceOf[js.Any], StyleSheetServer = StyleSheetServer.asInstanceOf[js.Any], StyleSheetTestUtils = StyleSheetTestUtils.asInstanceOf[js.Any], css = js.Any.fromFunction1(css), flushToStyleTag = js.Any.fromFunction0(flushToStyleTag))
    __obj.asInstanceOf[Exports]
  }
  @scala.inline
  implicit class ExportsOps[Self <: Exports] (val x: Self) extends AnyVal {
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
    def setStyleSheet(value: StyleSheetStatic): Self = this.set("StyleSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSheetServer(value: StyleSheetServerStatic): Self = this.set("StyleSheetServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleSheetTestUtils(value: StyleSheetTestUtilsStatic): Self = this.set("StyleSheetTestUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: /* repeated */ CSSInputTypes => String): Self = this.set("css", js.Any.fromFunction1(value))
    @scala.inline
    def setFlushToStyleTag(value: () => Unit): Self = this.set("flushToStyleTag", js.Any.fromFunction0(value))
  }
  
}

