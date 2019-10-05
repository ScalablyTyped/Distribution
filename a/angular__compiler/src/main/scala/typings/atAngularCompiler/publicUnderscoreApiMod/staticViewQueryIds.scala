package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.StaticAndDynamicQueryIds
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "staticViewQueryIds")
@js.native
object staticViewQueryIds extends js.Object {
  def apply(nodeStaticQueryIds: Map[TemplateAst, StaticAndDynamicQueryIds]): StaticAndDynamicQueryIds = js.native
}

