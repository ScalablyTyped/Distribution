package typings.angularCore.anon

import typings.angularCore.providersEvaluatorMod.ProviderLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Literals extends StObject {
  
  var literals: js.Array[ProviderLiteral]
  
  var resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
}
object Literals {
  
  inline def apply(
    literals: js.Array[ProviderLiteral],
    resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
  ): Literals = {
    val __obj = js.Dynamic.literal(literals = literals.asInstanceOf[js.Any], resolvedValue = resolvedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literals]
  }
  
  extension [Self <: Literals](x: Self) {
    
    inline def setLiterals(value: js.Array[ProviderLiteral]): Self = StObject.set(x, "literals", value.asInstanceOf[js.Any])
    
    inline def setLiteralsVarargs(value: ProviderLiteral*): Self = StObject.set(x, "literals", js.Array(value :_*))
    
    inline def setResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
    ): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
  }
}
