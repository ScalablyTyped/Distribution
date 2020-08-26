package typings.angularCompiler.templateAstMod

import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.astMod.ParsedEvent
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundEventAst")
@js.native
class BoundEventAst protected () extends TemplateAst {
  def this(
    name: String,
    target: String,
    phase: String,
    handler: ASTWithSource,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: String,
    phase: Null,
    handler: ASTWithSource,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: String,
    handler: ASTWithSource,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: Null,
    handler: ASTWithSource,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  val fullName: String = js.native
  var handler: ASTWithSource = js.native
  var handlerSpan: ParseSourceSpan = js.native
  val isAnimation: Boolean = js.native
  var name: String = js.native
  var phase: String | Null = js.native
  var target: String | Null = js.native
}

/* static members */
@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundEventAst")
@js.native
object BoundEventAst extends js.Object {
  def calcFullName(name: String): String = js.native
  def calcFullName(name: String, target: String): String = js.native
  def calcFullName(name: String, target: String, phase: String): String = js.native
  def calcFullName(name: String, target: Null, phase: String): String = js.native
  def fromParsedEvent(event: ParsedEvent): BoundEventAst = js.native
}

