package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareDependencyMetadata extends StObject {
  
  /**
    * Whether the dependency is injecting an attribute value.
    * Default: false.
    */
  var attribute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the dependency has an @Host qualifier.
    * Default: false,
    */
  var host: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the dependency has an @Optional qualifier.
    * Default: false,
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the dependency has an @Self qualifier.
    * Default: false,
    */
  var self: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the dependency has an @SkipSelf qualifier.
    * Default: false,
    */
  var skipSelf: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An expression representing the token or value to be injected, or `null` if the dependency is
    * not valid.
    *
    * If this dependency is due to the `@Attribute()` decorator, then this is an expression
    * evaluating to the name of the attribute.
    */
  var token: Expression | Null
}
object R3DeclareDependencyMetadata {
  
  inline def apply(): R3DeclareDependencyMetadata = {
    val __obj = js.Dynamic.literal(token = null)
    __obj.asInstanceOf[R3DeclareDependencyMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareDependencyMetadata] (val x: Self) extends AnyVal {
    
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
    
    inline def setToken(value: Expression): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
  }
}
