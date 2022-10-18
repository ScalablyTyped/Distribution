package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  var reason: js.UndefOr[String] = js.undefined
}
object Reason {
  
  inline def apply(): Reason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
