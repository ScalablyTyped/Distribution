package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectOptions extends StObject {
  
  /**
    * Stop injection at the host component's injector. Only relevant when injecting from an element
    * injector, and a no-op for environment injectors.
    */
  var host: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use optional injection, and return `null` if the requested token is not found.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only query the current injector for the token, and don't fall back to the parent injector if
    * it's not found.
    */
  var self: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Start injection at the parent of the current injector.
    */
  var skipSelf: js.UndefOr[Boolean] = js.undefined
}
object InjectOptions {
  
  inline def apply(): InjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InjectOptions] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    inline def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    inline def setSkipSelfUndefined: Self = StObject.set(x, "skipSelf", js.undefined)
  }
}
