package typings.angularCore.anon

import typings.angularCore.providersEvaluatorMod.ProviderLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Literals extends js.Object {
  var literals: js.Array[ProviderLiteral] = js.native
  var resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any = js.native
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
  @scala.inline
  implicit class LiteralsOps[Self <: Literals] (val x: Self) extends AnyVal {
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
    def setLiteralsVarargs(value: ProviderLiteral*): Self = this.set("literals", js.Array(value :_*))
    @scala.inline
    def setLiterals(value: js.Array[ProviderLiteral]): Self = this.set("literals", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
    ): Self = this.set("resolvedValue", value.asInstanceOf[js.Any])
  }
  
}

