package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityContext extends StObject {
  
  /**
    * Whether the container is privileged.
    */
  var Privileged: js.UndefOr[Boolean] = js.undefined
}
object SecurityContext {
  
  inline def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContext]
  }
  
  extension [Self <: SecurityContext](x: Self) {
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
  }
}
