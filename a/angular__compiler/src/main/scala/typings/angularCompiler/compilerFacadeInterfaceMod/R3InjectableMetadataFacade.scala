package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3InjectableMetadataFacade extends StObject {
  
  var name: String
  
  var providedIn: js.Any
  
  var `type`: js.Any
  
  var typeArgumentCount: Double
  
  var useClass: js.UndefOr[js.Any] = js.undefined
  
  var useExisting: js.UndefOr[js.Any] = js.undefined
  
  var useFactory: js.UndefOr[js.Any] = js.undefined
  
  var useValue: js.UndefOr[js.Any] = js.undefined
  
  var userDeps: js.UndefOr[js.Array[R3DependencyMetadataFacade]] = js.undefined
}
object R3InjectableMetadataFacade {
  
  @scala.inline
  def apply(name: String, providedIn: js.Any, `type`: js.Any, typeArgumentCount: Double): R3InjectableMetadataFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectableMetadataFacade]
  }
  
  @scala.inline
  implicit class R3InjectableMetadataFacadeMutableBuilder[Self <: R3InjectableMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedIn(value: js.Any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClass(value: js.Any): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    @scala.inline
    def setUseExisting(value: js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    @scala.inline
    def setUseFactory(value: js.Any): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
    
    @scala.inline
    def setUserDeps(value: js.Array[R3DependencyMetadataFacade]): Self = StObject.set(x, "userDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDepsUndefined: Self = StObject.set(x, "userDeps", js.undefined)
    
    @scala.inline
    def setUserDepsVarargs(value: R3DependencyMetadataFacade*): Self = StObject.set(x, "userDeps", js.Array(value :_*))
  }
}
