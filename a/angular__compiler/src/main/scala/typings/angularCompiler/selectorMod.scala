package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorMod {
  
  @JSImport("@angular/compiler/src/selector", "CssSelector")
  @js.native
  class CssSelector () extends StObject {
    
    def addAttribute(name: String): Unit = js.native
    def addAttribute(name: String, value: String): Unit = js.native
    
    def addClassName(name: String): Unit = js.native
    
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
    
    def getAttrs(): js.Array[String] = js.native
    
    /** Gets a template string for an element that matches the selector. */
    def getMatchingElementTemplate(): String = js.native
    
    def hasElementSelector(): Boolean = js.native
    
    def isElementSelector(): Boolean = js.native
    
    var notSelectors: js.Array[CssSelector] = js.native
    
    def setElement(): Unit = js.native
    def setElement(element: String): Unit = js.native
  }
  /* static members */
  object CssSelector {
    
    @JSImport("@angular/compiler/src/selector", "CssSelector")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(selector: String): js.Array[CssSelector] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[CssSelector]]
  }
  
  @JSImport("@angular/compiler/src/selector", "SelectorContext")
  @js.native
  class SelectorContext[T] protected () extends StObject {
    def this(selector: CssSelector, cbContext: T, listContext: SelectorListContext) = this()
    
    var cbContext: T = js.native
    
    def finalize(cssSelector: CssSelector): Boolean = js.native
    def finalize(cssSelector: CssSelector, callback: js.Function2[/* c */ CssSelector, /* a */ T, Unit]): Boolean = js.native
    
    var listContext: SelectorListContext = js.native
    
    var notSelectors: js.Array[CssSelector] = js.native
    
    var selector: CssSelector = js.native
  }
  
  @JSImport("@angular/compiler/src/selector", "SelectorListContext")
  @js.native
  class SelectorListContext protected () extends StObject {
    def this(selectors: js.Array[CssSelector]) = this()
    
    var alreadyMatched: Boolean = js.native
    
    var selectors: js.Array[CssSelector] = js.native
  }
  
  @JSImport("@angular/compiler/src/selector", "SelectorMatcher")
  @js.native
  class SelectorMatcher[T] () extends StObject {
    
    /* private */ var _addPartial: js.Any = js.native
    
    /**
      * Add an object that can be found later on by calling `match`.
      * @param cssSelector A css selector
      * @param callbackCtxt An opaque object that will be given to the callback of the `match` function
      */
    /* private */ var _addSelectable: js.Any = js.native
    
    /* private */ var _addTerminal: js.Any = js.native
    
    /* private */ var _attrValueMap: js.Any = js.native
    
    /* private */ var _attrValuePartialMap: js.Any = js.native
    
    /* private */ var _classMap: js.Any = js.native
    
    /* private */ var _classPartialMap: js.Any = js.native
    
    /* private */ var _elementMap: js.Any = js.native
    
    /* private */ var _elementPartialMap: js.Any = js.native
    
    /* private */ var _listContexts: js.Any = js.native
    
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
  object SelectorMatcher {
    
    @JSImport("@angular/compiler/src/selector", "SelectorMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createNotMatcher(notSelectors: js.Array[CssSelector]): SelectorMatcher[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNotMatcher")(notSelectors.asInstanceOf[js.Any]).asInstanceOf[SelectorMatcher[Null]]
  }
}
