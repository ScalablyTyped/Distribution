package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.StaticAndDynamicQueryIds
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "findStaticQueryIds")
@js.native
object findStaticQueryIds extends js.Object {
  def apply(nodes: js.Array[TemplateAst]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def apply(nodes: js.Array[TemplateAst], result: Map[TemplateAst, StaticAndDynamicQueryIds]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
}

