package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDPUSizes extends StObject {
  
  /**
    * The name of the supported application runtime (for example, Athena notebook version 1).
    */
  var ApplicationRuntimeId: js.UndefOr[NameString] = js.undefined
  
  /**
    * A list of the supported DPU sizes that the application runtime supports.
    */
  var SupportedDPUSizes: js.UndefOr[SupportedDPUSizeList] = js.undefined
}
object ApplicationDPUSizes {
  
  inline def apply(): ApplicationDPUSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDPUSizes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationDPUSizes] (val x: Self) extends AnyVal {
    
    inline def setApplicationRuntimeId(value: NameString): Self = StObject.set(x, "ApplicationRuntimeId", value.asInstanceOf[js.Any])
    
    inline def setApplicationRuntimeIdUndefined: Self = StObject.set(x, "ApplicationRuntimeId", js.undefined)
    
    inline def setSupportedDPUSizes(value: SupportedDPUSizeList): Self = StObject.set(x, "SupportedDPUSizes", value.asInstanceOf[js.Any])
    
    inline def setSupportedDPUSizesUndefined: Self = StObject.set(x, "SupportedDPUSizes", js.undefined)
    
    inline def setSupportedDPUSizesVarargs(value: Integer*): Self = StObject.set(x, "SupportedDPUSizes", js.Array(value*))
  }
}
