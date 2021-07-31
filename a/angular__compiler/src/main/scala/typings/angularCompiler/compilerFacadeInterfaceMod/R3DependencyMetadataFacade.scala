package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DependencyMetadataFacade extends StObject {
  
  var host: Boolean
  
  var optional: Boolean
  
  var resolved: R3ResolvedDependencyType
  
  var self: Boolean
  
  var skipSelf: Boolean
  
  var token: js.Any
}
object R3DependencyMetadataFacade {
  
  @scala.inline
  def apply(
    host: Boolean,
    optional: Boolean,
    resolved: R3ResolvedDependencyType,
    self: Boolean,
    skipSelf: Boolean,
    token: js.Any
  ): R3DependencyMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DependencyMetadataFacade]
  }
  
  @scala.inline
  implicit class R3DependencyMetadataFacadeMutableBuilder[Self <: R3DependencyMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolved(value: R3ResolvedDependencyType): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
