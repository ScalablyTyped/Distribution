package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DependencyMetadata extends StObject {
  
  /**
    * If an @Attribute decorator is present, this is the literal type of the attribute name, or
    * the unknown type if no literal type is available (e.g. the attribute name is an expression).
    * Otherwise it is null;
    */
  var attributeNameType: Expression | Null
  
  /**
    * Whether the dependency has an @Host qualifier.
    */
  var host: Boolean
  
  /**
    * Whether the dependency has an @Optional qualifier.
    */
  var optional: Boolean
  
  /**
    * Whether the dependency has an @Self qualifier.
    */
  var self: Boolean
  
  /**
    * Whether the dependency has an @SkipSelf qualifier.
    */
  var skipSelf: Boolean
  
  /**
    * An expression representing the token or value to be injected.
    * Or `null` if the dependency could not be resolved - making it invalid.
    */
  var token: Expression | Null
}
object R3DependencyMetadata {
  
  inline def apply(host: Boolean, optional: Boolean, self: Boolean, skipSelf: Boolean): R3DependencyMetadata = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], attributeNameType = null, token = null)
    __obj.asInstanceOf[R3DependencyMetadata]
  }
  
  extension [Self <: R3DependencyMetadata](x: Self) {
    
    inline def setAttributeNameType(value: Expression): Self = StObject.set(x, "attributeNameType", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameTypeNull: Self = StObject.set(x, "attributeNameType", null)
    
    inline def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Expression): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
  }
}
