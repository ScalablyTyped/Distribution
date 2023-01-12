package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareDependencyMetadataFacade extends StObject {
  
  var attribute: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[Boolean] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var self: js.UndefOr[Boolean] = js.undefined
  
  var skipSelf: js.UndefOr[Boolean] = js.undefined
  
  var token: OpaqueValue
}
object R3DeclareDependencyMetadataFacade {
  
  inline def apply(token: OpaqueValue): R3DeclareDependencyMetadataFacade = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareDependencyMetadataFacade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareDependencyMetadataFacade] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    inline def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    inline def setSkipSelfUndefined: Self = StObject.set(x, "skipSelf", js.undefined)
    
    inline def setToken(value: OpaqueValue): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
