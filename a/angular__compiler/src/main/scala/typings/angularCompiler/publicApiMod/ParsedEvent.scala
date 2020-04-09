package typings.angularCompiler.publicApiMod

import typings.angularCompiler.astMod.ParsedEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typings.angularCompiler.srcCompilerMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

