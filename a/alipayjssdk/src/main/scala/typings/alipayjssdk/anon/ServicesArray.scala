package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicesArray extends StObject {
  
  /** service 对象 */
  var services: js.Array[IsPrimary]
}
object ServicesArray {
  
  inline def apply(services: js.Array[IsPrimary]): ServicesArray = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesArray]
  }
  
  extension [Self <: ServicesArray](x: Self) {
    
    inline def setServices(value: js.Array[IsPrimary]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: IsPrimary*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
