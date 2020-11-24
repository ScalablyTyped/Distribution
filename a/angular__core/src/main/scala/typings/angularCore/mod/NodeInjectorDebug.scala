package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInjectorDebug extends js.Object {
  
  /**
    * Instance bloom. Does the current injector have a provider with a given bloom mask.
    */
  var bloom: String = js.native
  
  /**
    * Cumulative bloom. Do any of the above injectors have a provider with a given bloom mask.
    */
  var cumulativeBloom: String = js.native
  
  /**
    * Location of the parent `TNode`.
    */
  var parentInjectorIndex: Double = js.native
  
  /**
    * A list of providers associated with this injector.
    */
  var providers: js.Array[Type[_] | ɵDirectiveDef[_] | ɵComponentDef[_]] = js.native
  
  /**
    * A list of providers associated with this injector visible to the view of the component only.
    */
  var viewProviders: js.Array[Type[_]] = js.native
}
object NodeInjectorDebug {
  
  @scala.inline
  def apply(
    bloom: String,
    cumulativeBloom: String,
    parentInjectorIndex: Double,
    providers: js.Array[Type[_] | ɵDirectiveDef[_] | ɵComponentDef[_]],
    viewProviders: js.Array[Type[_]]
  ): NodeInjectorDebug = {
    val __obj = js.Dynamic.literal(bloom = bloom.asInstanceOf[js.Any], cumulativeBloom = cumulativeBloom.asInstanceOf[js.Any], parentInjectorIndex = parentInjectorIndex.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInjectorDebug]
  }
  
  @scala.inline
  implicit class NodeInjectorDebugOps[Self <: NodeInjectorDebug] (val x: Self) extends AnyVal {
    
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
    def setBloom(value: String): Self = this.set("bloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeBloom(value: String): Self = this.set("cumulativeBloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentInjectorIndex(value: Double): Self = this.set("parentInjectorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: (Type[js.Any] | ɵDirectiveDef[js.Any] | ɵComponentDef[js.Any])*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[Type[_] | ɵDirectiveDef[_] | ɵComponentDef[_]]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersVarargs(value: Type[js.Any]*): Self = this.set("viewProviders", js.Array(value :_*))
    
    @scala.inline
    def setViewProviders(value: js.Array[Type[_]]): Self = this.set("viewProviders", value.asInstanceOf[js.Any])
  }
}
