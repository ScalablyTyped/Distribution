package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
class BoundEventAst protected ()
  extends typings.angularCompiler.srcCompilerMod.BoundEventAst {
  def this(
    name: String,
    target: String,
    phase: String,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: String,
    phase: Null,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: String,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: Null,
    handler: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
object BoundEventAst extends js.Object {
  def calcFullName(name: String): String = js.native
  def calcFullName(name: String, target: String): String = js.native
  def calcFullName(name: String, target: String, phase: String): String = js.native
  def calcFullName(name: String, target: Null, phase: String): String = js.native
  def fromParsedEvent(event: typings.angularCompiler.astMod.ParsedEvent): typings.angularCompiler.templateAstMod.BoundEventAst = js.native
}

