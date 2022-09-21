package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SelectorListContext")
@js.native
open class SelectorListContext protected () extends StObject {
  def this(selectors: js.Array[CssSelector]) = this()
  
  var alreadyMatched: Boolean = js.native
  
  var selectors: js.Array[CssSelector] = js.native
}
