package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "LiteralMapEntry")
@js.native
class LiteralMapEntry protected () extends StObject {
  def this(key: String, value: Expression, quoted: Boolean) = this()
  
  def isEquivalent(e: LiteralMapEntry): Boolean = js.native
  
  var key: String = js.native
  
  var quoted: Boolean = js.native
  
  var value: Expression = js.native
}
