package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/selector", JSImport.Namespace)
@js.native
object selectorMod extends js.Object {
  @js.native
  class CssSelector () extends js.Object {
    /**
      * The selectors are encoded in pairs where:
      * - even locations are attribute names
      * - odd locations are attribute values.
      *
      * Example:
      * Selector: `[key1=value1][key2]` would parse to:
      * ```
      * ['key1', 'value1', 'key2', '']
      * ```
      */
    var attrs: js.Array[String] = js.native
    var classNames: js.Array[String] = js.native
    var element: String | Null = js.native
    var notSelectors: js.Array[CssSelector] = js.native
    def addAttribute(name: String): Unit = js.native
    def addAttribute(name: String, value: String): Unit = js.native
    def addClassName(name: String): Unit = js.native
    def getAttrs(): js.Array[String] = js.native
    /** Gets a template string for an element that matches the selector. */
    def getMatchingElementTemplate(): String = js.native
    def hasElementSelector(): Boolean = js.native
    def isElementSelector(): Boolean = js.native
    def setElement(): Unit = js.native
    def setElement(element: String): Unit = js.native
  }
  
  @js.native
  class SelectorContext[T] protected () extends js.Object {
    def this(selector: CssSelector, cbContext: T, listContext: SelectorListContext) = this()
    var cbContext: T = js.native
    var listContext: SelectorListContext = js.native
    var notSelectors: js.Array[CssSelector] = js.native
    var selector: CssSelector = js.native
    def finalize(cssSelector: CssSelector): Boolean = js.native
    def finalize(cssSelector: CssSelector, callback: js.Function2[/* c */ CssSelector, /* a */ T, Unit]): Boolean = js.native
  }
  
  @js.native
  class SelectorListContext protected () extends js.Object {
    def this(selectors: js.Array[CssSelector]) = this()
    var alreadyMatched: Boolean = js.native
    var selectors: js.Array[CssSelector] = js.native
  }
  
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
    /**
      * Find the objects that have been added via `addSelectable`
      * whose css selector is contained in the given css selector.
      * @param cssSelector A css selector
      * @param matchedCallback This callback will be called with the object handed into `addSelectable`
      * @return boolean true if a match was found
      */
    def `match`(cssSelector: CssSelector): Boolean = js.native
    def `match`(cssSelector: CssSelector, matchedCallback: js.Function2[/* c */ CssSelector, /* a */ T, Unit]): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CssSelector extends js.Object {
    def parse(selector: String): js.Array[CssSelector] = js.native
  }
  
  /* static members */
  @js.native
  object SelectorMatcher extends js.Object {
    def createNotMatcher(notSelectors: js.Array[CssSelector]): SelectorMatcher[Null] = js.native
  }
  
}

