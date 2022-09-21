package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var host: `true`
  
  var optional: `true`
}
object Host {
  
  inline def apply(): Host = {
    val __obj = js.Dynamic.literal(host = true, optional = true)
    __obj.asInstanceOf[Host]
  }
  
  extension [Self <: Host](x: Self) {
    
    inline def setHost(value: `true`): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
