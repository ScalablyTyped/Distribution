package typings.angularCore.providersEvaluatorMod

import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderLiteral extends js.Object {
  var node: ObjectLiteralExpression = js.native
  var resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any = js.native
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
  @scala.inline
  implicit class ProviderLiteralOps[Self <: ProviderLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNode(value: ObjectLiteralExpression): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
    ): Self = this.set("resolvedValue", value.asInstanceOf[js.Any])
  }
  
}

