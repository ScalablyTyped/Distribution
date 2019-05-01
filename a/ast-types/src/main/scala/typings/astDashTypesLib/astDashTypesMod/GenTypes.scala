package typings
package astDashTypesLib.astDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenTypes extends js.Object {
  var builders: astDashTypesLib.genBuildersMod.Builders = js.native
  var namedTypes: astDashTypesLib.genNamedTypesMod.NamedTypes = js.native
  def visit[M](node: astDashTypesLib.libTypesMod.ASTNode): js.Any = js.native
  def visit[M](
    node: astDashTypesLib.libTypesMod.ASTNode,
    methods: astDashTypesLib.genVisitorMod.Visitor[M] with M
  ): js.Any = js.native
}

