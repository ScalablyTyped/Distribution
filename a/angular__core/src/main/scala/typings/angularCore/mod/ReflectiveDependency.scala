package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Dependency` is used by the framework to extend DI.
  * This is internal to Angular and should not be used directly.
  */
trait ReflectiveDependency extends StObject {
  
  var key: ReflectiveKey
  
  var optional: Boolean
  
  var visibility: Self | SkipSelf | Null
}
object ReflectiveDependency {
  
  inline def apply(key: ReflectiveKey, optional: Boolean): ReflectiveDependency = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], visibility = null)
    __obj.asInstanceOf[ReflectiveDependency]
  }
  
  extension [Self <: ReflectiveDependency](x: Self) {
    
    inline def setKey(value: ReflectiveKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: typings.angularCore.mod.Self | SkipSelf): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
  }
}
