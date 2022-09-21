package typings.angularCore.anon

import typings.angularCore.angularCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.InjectOptions & {  optional :false | undefined} */
trait InjectOptionsoptionalfals extends StObject {
  
  /**
    * Stop injection at the host component's injector. Only relevant when injecting from an element
    * injector, and a no-op for environment injectors.
    */
  var host: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use optional injection, and return `null` if the requested token is not found.
    */
  var optional: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
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
object InjectOptionsoptionalfals {
  
  inline def apply(optional: js.UndefOr[Boolean] & js.UndefOr[`false`]): InjectOptionsoptionalfals = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectOptionsoptionalfals]
  }
  
  extension [Self <: InjectOptionsoptionalfals](x: Self) {
    
    inline def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOptional(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    inline def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    inline def setSkipSelfUndefined: Self = StObject.set(x, "skipSelf", js.undefined)
  }
}
