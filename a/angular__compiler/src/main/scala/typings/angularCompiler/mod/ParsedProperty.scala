package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParsedProperty")
@js.native
open class ParsedProperty protected () extends StObject {
  def this(
    name: String,
    expression: ASTWithSource,
    `type`: ParsedPropertyType,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    expression: ASTWithSource,
    `type`: ParsedPropertyType,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  
  var expression: ASTWithSource = js.native
  
  val isAnimation: Boolean = js.native
  
  val isLiteral: Boolean = js.native
  
  val keySpan: ParseSourceSpan = js.native
  
  var name: String = js.native
  
  var sourceSpan: ParseSourceSpan = js.native
  
  var `type`: ParsedPropertyType = js.native
  
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}
