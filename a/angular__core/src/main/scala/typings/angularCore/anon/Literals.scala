package typings.angularCore.anon

import typings.angularCore.providersEvaluatorMod.ProviderLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Literals extends StObject {
  
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
  implicit class LiteralsMutableBuilder[Self <: Literals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLiterals(value: js.Array[ProviderLiteral]): Self = StObject.set(x, "literals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralsVarargs(value: ProviderLiteral*): Self = StObject.set(x, "literals", js.Array(value :_*))
    
    @scala.inline
    def setResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
    ): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
  }
}
