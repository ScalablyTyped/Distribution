package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SelectorMatcher")
@js.native
open class SelectorMatcher[T] () extends StObject {
  
  /* private */ var _addPartial: Any = js.native
  
  /**
    * Add an object that can be found later on by calling `match`.
    * @param cssSelector A css selector
    * @param callbackCtxt An opaque object that will be given to the callback of the `match` function
    */
  /* private */ var _addSelectable: Any = js.native
  
  /* private */ var _addTerminal: Any = js.native
  
  /* private */ var _attrValueMap: Any = js.native
  
  /* private */ var _attrValuePartialMap: Any = js.native
  
  /* private */ var _classMap: Any = js.native
  
  /* private */ var _classPartialMap: Any = js.native
  
  /* private */ var _elementMap: Any = js.native
  
  /* private */ var _elementPartialMap: Any = js.native
  
  /* private */ var _listContexts: Any = js.native
  
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
  
  @JSImport("@angular/compiler", "SelectorMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNotMatcher(notSelectors: js.Array[CssSelector]): SelectorMatcher[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNotMatcher")(notSelectors.asInstanceOf[js.Any]).asInstanceOf[SelectorMatcher[Null]]
}
