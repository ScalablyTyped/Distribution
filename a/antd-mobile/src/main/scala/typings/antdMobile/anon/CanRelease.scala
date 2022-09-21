package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanRelease extends StObject {
  
  var canRelease: String
  
  var complete: String
  
  var pulling: String
}
object CanRelease {
  
  inline def apply(canRelease: String, complete: String, pulling: String): CanRelease = {
    val __obj = js.Dynamic.literal(canRelease = canRelease.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], pulling = pulling.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanRelease]
  }
  
  extension [Self <: CanRelease](x: Self) {
    
    inline def setCanRelease(value: String): Self = StObject.set(x, "canRelease", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setPulling(value: String): Self = StObject.set(x, "pulling", value.asInstanceOf[js.Any])
  }
}
