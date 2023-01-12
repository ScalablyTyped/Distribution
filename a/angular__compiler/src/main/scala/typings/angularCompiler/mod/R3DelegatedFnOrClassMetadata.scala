package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.angularCompiler.mod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFnOrClassMetadata
  extends StObject
     with R3ConstructorFactoryMetadata {
  
  var delegate: Expression
  
  var delegateDeps: js.Array[R3DependencyMetadata]
  
  var delegateType: R3FactoryDelegateType
}
object R3DelegatedFnOrClassMetadata {
  
  inline def apply(
    delegate: Expression,
    delegateDeps: js.Array[R3DependencyMetadata],
    delegateType: R3FactoryDelegateType,
    internalType: Expression,
    name: String,
    target: FactoryTarget,
    `type`: R3Reference,
    typeArgumentCount: Double
  ): R3DelegatedFnOrClassMetadata = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DelegatedFnOrClassMetadata] (val x: Self) extends AnyVal {
    
    inline def setDelegate(value: Expression): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "delegateDeps", value.asInstanceOf[js.Any])
    
    inline def setDelegateDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "delegateDeps", js.Array(value*))
    
    inline def setDelegateType(value: R3FactoryDelegateType): Self = StObject.set(x, "delegateType", value.asInstanceOf[js.Any])
  }
}
