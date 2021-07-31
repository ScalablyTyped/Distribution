package typings.angularCore.anon

import typings.angularCore.mod.Injector
import typings.angularCore.mod.StaticProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[Injector] = js.undefined
  
  var providers: js.Array[StaticProvider]
}
object Parent {
  
  @scala.inline
  def apply(providers: js.Array[StaticProvider]): Parent = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  @scala.inline
  implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: Injector): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProviders(value: js.Array[StaticProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: StaticProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
