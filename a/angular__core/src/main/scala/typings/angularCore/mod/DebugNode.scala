package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugNode extends StObject {
  
  val componentInstance: js.Any
  
  val context: js.Any
  
  val injector: Injector
  
  val listeners: js.Array[DebugEventListener]
  
  val nativeNode: js.Any
  
  val parent: DebugElement | Null
  
  val providerTokens: js.Array[js.Any]
  
  val references: StringDictionary[js.Any]
}
object DebugNode {
  
  inline def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    nativeNode: js.Any,
    providerTokens: js.Array[js.Any],
    references: StringDictionary[js.Any]
  ): DebugNode = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], nativeNode = nativeNode.asInstanceOf[js.Any], providerTokens = providerTokens.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[DebugNode]
  }
  
  extension [Self <: DebugNode](x: Self) {
    
    inline def setComponentInstance(value: js.Any): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: js.Array[DebugEventListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: DebugEventListener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    
    inline def setNativeNode(value: js.Any): Self = StObject.set(x, "nativeNode", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DebugElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProviderTokens(value: js.Array[js.Any]): Self = StObject.set(x, "providerTokens", value.asInstanceOf[js.Any])
    
    inline def setProviderTokensVarargs(value: js.Any*): Self = StObject.set(x, "providerTokens", js.Array(value :_*))
    
    inline def setReferences(value: StringDictionary[js.Any]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
  }
}
