package typings.aphrodite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calling StyleSheet.extend() returns an object with each of the exported
  * properties on it.
  */
trait Exports extends js.Object {
  var StyleSheet: StyleSheetStatic
  var StyleSheetServer: StyleSheetServerStatic
  var StyleSheetTestUtils: StyleSheetTestUtilsStatic
  def css(styles: CSSInputTypes*): String
  def flushToStyleTag(): Unit
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
}

