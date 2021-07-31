package typings.angularCompiler.astMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedEvent")
@js.native
class ParsedEvent protected () extends StObject {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: ASTWithSource,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  
  var handler: ASTWithSource = js.native
  
  var handlerSpan: ParseSourceSpan = js.native
  
  var name: String = js.native
  
  var sourceSpan: ParseSourceSpan = js.native
  
  var targetOrPhase: String = js.native
  
  var `type`: ParsedEventType = js.native
}
