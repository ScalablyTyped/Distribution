package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logging extends StObject {
  
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[AccessLog] = js.undefined
}
object Logging {
  
  inline def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  extension [Self <: Logging](x: Self) {
    
    inline def setAccessLog(value: AccessLog): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
