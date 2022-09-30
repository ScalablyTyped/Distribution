package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostOptional extends StObject {
  
  var host: `true`
  
  var optional: `true`
}
object HostOptional {
  
  inline def apply(): HostOptional = {
    val __obj = js.Dynamic.literal(host = true, optional = true)
    __obj.asInstanceOf[HostOptional]
  }
  
  extension [Self <: HostOptional](x: Self) {
    
    inline def setHost(value: `true`): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
