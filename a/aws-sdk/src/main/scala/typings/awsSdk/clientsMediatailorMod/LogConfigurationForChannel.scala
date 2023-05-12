package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigurationForChannel extends StObject {
  
  /**
    * The log types.
    */
  var LogTypes: js.UndefOr[typings.awsSdk.clientsMediatailorMod.LogTypes] = js.undefined
}
object LogConfigurationForChannel {
  
  inline def apply(): LogConfigurationForChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigurationForChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogConfigurationForChannel] (val x: Self) extends AnyVal {
    
    inline def setLogTypes(value: LogTypes): Self = StObject.set(x, "LogTypes", value.asInstanceOf[js.Any])
    
    inline def setLogTypesUndefined: Self = StObject.set(x, "LogTypes", js.undefined)
    
    inline def setLogTypesVarargs(value: LogType*): Self = StObject.set(x, "LogTypes", js.Array(value*))
  }
}
