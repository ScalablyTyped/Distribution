package typings.angularCompiler.compilerMod

import typings.angularCompiler.astMod.ParsedEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typings.angularCompiler.publicApiMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
