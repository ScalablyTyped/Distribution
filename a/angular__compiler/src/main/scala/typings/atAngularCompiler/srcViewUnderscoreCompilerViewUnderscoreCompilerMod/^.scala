package typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/view_compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elementEventFullName(target: String, name: String): String = js.native
  def elementEventFullName(target: Null, name: String): String = js.native
  def findStaticQueryIds(nodes: js.Array[TemplateAst]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def findStaticQueryIds(nodes: js.Array[TemplateAst], result: Map[TemplateAst, StaticAndDynamicQueryIds]): Map[TemplateAst, StaticAndDynamicQueryIds] = js.native
  def staticViewQueryIds(nodeStaticQueryIds: Map[TemplateAst, StaticAndDynamicQueryIds]): StaticAndDynamicQueryIds = js.native
}

