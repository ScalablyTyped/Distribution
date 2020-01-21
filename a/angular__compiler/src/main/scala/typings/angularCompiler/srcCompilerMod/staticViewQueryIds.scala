package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.templateAstMod.TemplateAst
import typings.angularCompiler.viewCompilerViewCompilerMod.StaticAndDynamicQueryIds
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "staticViewQueryIds")
@js.native
object staticViewQueryIds extends js.Object {
  def apply(nodeStaticQueryIds: Map[TemplateAst, StaticAndDynamicQueryIds]): StaticAndDynamicQueryIds = js.native
}

