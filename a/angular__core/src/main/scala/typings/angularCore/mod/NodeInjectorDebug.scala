package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInjectorDebug extends StObject {
  
  /**
    * Instance bloom. Does the current injector have a provider with a given bloom mask.
    */
  var bloom: String
  
  /**
    * Cumulative bloom. Do any of the above injectors have a provider with a given bloom mask.
    */
  var cumulativeBloom: String
  
  /**
    * Location of the parent `TNode`.
    */
  var parentInjectorIndex: Double
  
  /**
    * A list of providers associated with this injector.
    */
  var providers: js.Array[Type[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any]]
  
  /**
    * A list of providers associated with this injector visible to the view of the component only.
    */
  var viewProviders: js.Array[Type[js.Any]]
}
object NodeInjectorDebug {
  
  @scala.inline
  def apply(
    bloom: String,
    cumulativeBloom: String,
    parentInjectorIndex: Double,
    providers: js.Array[Type[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any]],
    viewProviders: js.Array[Type[js.Any]]
  ): NodeInjectorDebug = {
    val __obj = js.Dynamic.literal(bloom = bloom.asInstanceOf[js.Any], cumulativeBloom = cumulativeBloom.asInstanceOf[js.Any], parentInjectorIndex = parentInjectorIndex.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInjectorDebug]
  }
  
  @scala.inline
  implicit class NodeInjectorDebugMutableBuilder[Self <: NodeInjectorDebug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBloom(value: String): Self = StObject.set(x, "bloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeBloom(value: String): Self = StObject.set(x, "cumulativeBloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentInjectorIndex(value: Double): Self = StObject.set(x, "parentInjectorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: js.Array[Type[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any]]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: (Type[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any])*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setViewProviders(value: js.Array[Type[js.Any]]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersVarargs(value: Type[js.Any]*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
  }
}
