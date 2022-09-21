package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SelectorContext")
@js.native
open class SelectorContext[T] protected () extends StObject {
  def this(selector: CssSelector, cbContext: T, listContext: SelectorListContext) = this()
  
  var cbContext: T = js.native
  
  def finalize(cssSelector: CssSelector): Boolean = js.native
  def finalize(cssSelector: CssSelector, callback: js.Function2[/* c */ CssSelector, /* a */ T, Unit]): Boolean = js.native
  
  var listContext: SelectorListContext = js.native
  
  var notSelectors: js.Array[CssSelector] = js.native
  
  var selector: CssSelector = js.native
}
