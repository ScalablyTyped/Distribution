package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogAnomalyShowcase extends StObject {
  
  /**
    *  A list of anomalous log events that may be related. 
    */
  var LogAnomalyClasses: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.LogAnomalyClasses] = js.undefined
}
object LogAnomalyShowcase {
  
  inline def apply(): LogAnomalyShowcase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogAnomalyShowcase]
  }
  
  extension [Self <: LogAnomalyShowcase](x: Self) {
    
    inline def setLogAnomalyClasses(value: LogAnomalyClasses): Self = StObject.set(x, "LogAnomalyClasses", value.asInstanceOf[js.Any])
    
    inline def setLogAnomalyClassesUndefined: Self = StObject.set(x, "LogAnomalyClasses", js.undefined)
    
    inline def setLogAnomalyClassesVarargs(value: LogAnomalyClass*): Self = StObject.set(x, "LogAnomalyClasses", js.Array(value*))
  }
}
