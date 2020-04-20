package typings.angularCore.providersEvaluatorMod

import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderLiteral extends js.Object {
  var node: ObjectLiteralExpression
  var resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
}

object ProviderLiteral {
  @scala.inline
  def apply(
    node: ObjectLiteralExpression,
    resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
  ): ProviderLiteral = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], resolvedValue = resolvedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderLiteral]
  }
}

