package typings.angularCore.anon

import typings.angularCore.providersEvaluatorMod.ProviderLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literals extends js.Object {
  var literals: js.Array[ProviderLiteral]
  var resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
}

object Literals {
  @scala.inline
  def apply(
    literals: js.Array[ProviderLiteral],
    resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
  ): Literals = {
    val __obj = js.Dynamic.literal(literals = literals.asInstanceOf[js.Any], resolvedValue = resolvedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literals]
  }
}

