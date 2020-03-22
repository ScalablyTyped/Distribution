package typings.angularCore.definitionCollectorMod

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedNgModule extends js.Object {
  var decorator: NgDecorator
  var name: String
  var node: ClassDeclaration
  var providersExpr: Expression | Null
}

object ResolvedNgModule {
  @scala.inline
  def apply(decorator: NgDecorator, name: String, node: ClassDeclaration, providersExpr: Expression = null): ResolvedNgModule = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (providersExpr != null) __obj.updateDynamic("providersExpr")(providersExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNgModule]
  }
}

