package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "ParseSpan")
@js.native
class ParseSpan protected () extends StObject {
  def this(start: Double, end: Double) = this()
  
  var end: Double = js.native
  
  var start: Double = js.native
  
  def toAbsolute(absoluteOffset: Double): AbsoluteSourceSpan = js.native
}
