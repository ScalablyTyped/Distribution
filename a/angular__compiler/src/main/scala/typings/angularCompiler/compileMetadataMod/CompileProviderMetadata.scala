package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileProviderMetadata extends StObject {
  
  var deps: js.UndefOr[js.Array[CompileDiDependencyMetadata]] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var token: CompileTokenMetadata = js.native
  
  var useClass: js.UndefOr[CompileTypeMetadata] = js.native
  
  var useExisting: js.UndefOr[CompileTokenMetadata] = js.native
  
  var useFactory: js.UndefOr[CompileFactoryMetadata] = js.native
  
  var useValue: js.UndefOr[js.Any] = js.native
}
object CompileProviderMetadata {
  
  @scala.inline
  def apply(token: CompileTokenMetadata): CompileProviderMetadata = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileProviderMetadata]
  }
  
  @scala.inline
  implicit class CompileProviderMetadataMutableBuilder[Self <: CompileProviderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[CompileDiDependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: CompileDiDependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setToken(value: CompileTokenMetadata): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClass(value: CompileTypeMetadata): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    @scala.inline
    def setUseExisting(value: CompileTokenMetadata): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    @scala.inline
    def setUseFactory(value: CompileFactoryMetadata): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
