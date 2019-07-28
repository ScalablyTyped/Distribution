package typings.atAngularCompiler.srcSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/selector", "SelectorMatcher")
@js.native
class SelectorMatcher[T] () extends js.Object {
  var _addPartial: js.Any = js.native
  /**
    * Add an object that can be found later on by calling `match`.
    * @param cssSelector A css selector
    * @param callbackCtxt An opaque object that will be given to the callback of the `match` function
    */
  var _addSelectable: js.Any = js.native
  var _addTerminal: js.Any = js.native
  var _attrValueMap: js.Any = js.native
  var _attrValuePartialMap: js.Any = js.native
  var _classMap: js.Any = js.native
  var _classPartialMap: js.Any = js.native
  var _elementMap: js.Any = js.native
  var _elementPartialMap: js.Any = js.native
  var _listContexts: js.Any = js.native
  def addSelectables(cssSelectors: js.Array[CssSelector]): Unit = js.native
  def addSelectables(cssSelectors: js.Array[CssSelector], callbackCtxt: T): Unit = js.native
  def `match`(cssSelector: CssSelector): Boolean = js.native
  /**
    * Find the objects that have been added via `addSelectable`
    * whose css selector is contained in the given css selector.
    * @param cssSelector A css selector
    * @param matchedCallback This callback will be called with the object handed into `addSelectable`
    * @return boolean true if a match was found
    */
  def `match`(cssSelector: CssSelector, matchedCallback: js.Function2[/* c */ CssSelector, /* a */ T, Unit]): Boolean = js.native
}

/* static members */
@JSImport("@angular/compiler/src/selector", "SelectorMatcher")
@js.native
object SelectorMatcher extends js.Object {
  def createNotMatcher(notSelectors: js.Array[CssSelector]): SelectorMatcher[Null] = js.native
}

