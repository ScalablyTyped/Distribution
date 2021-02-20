package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugNode extends StObject {
  
  val componentInstance: js.Any = js.native
  
  val context: js.Any = js.native
  
  val injector: Injector = js.native
  
  val listeners: js.Array[DebugEventListener] = js.native
  
  val nativeNode: js.Any = js.native
  
  val parent: DebugElement | Null = js.native
  
  val providerTokens: js.Array[_] = js.native
  
  val references: StringDictionary[js.Any] = js.native
}
object DebugNode {
  
  @scala.inline
  def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    nativeNode: js.Any,
    providerTokens: js.Array[_],
    references: StringDictionary[js.Any]
  ): DebugNode = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], nativeNode = nativeNode.asInstanceOf[js.Any], providerTokens = providerTokens.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugNode]
  }
  
  @scala.inline
  implicit class DebugNodeMutableBuilder[Self <: DebugNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentInstance(value: js.Any): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjector(value: Injector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListeners(value: js.Array[DebugEventListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersVarargs(value: DebugEventListener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
    
    @scala.inline
    def setNativeNode(value: js.Any): Self = StObject.set(x, "nativeNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: DebugElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setProviderTokens(value: js.Array[_]): Self = StObject.set(x, "providerTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTokensVarargs(value: js.Any*): Self = StObject.set(x, "providerTokens", js.Array(value :_*))
    
    @scala.inline
    def setReferences(value: StringDictionary[js.Any]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
  }
}
