package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenTypes extends js.Object {
  var builders: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Builders */ js.Any = js.native
  var namedTypes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NamedTypes */ js.Any = js.native
  def visit[M](node: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ASTNode */ js.Any): js.Any = js.native
  def visit[M](
    node: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ASTNode */ js.Any,
    methods: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Visitor<M> */ js.Any) with M
  ): js.Any = js.native
}

