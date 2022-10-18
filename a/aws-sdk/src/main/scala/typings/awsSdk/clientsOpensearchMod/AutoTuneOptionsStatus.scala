package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneOptionsStatus extends StObject {
  
  /**
    * Specifies Auto-Tune options for the domain.
    */
  var Options: js.UndefOr[AutoTuneOptions] = js.undefined
  
  /**
    * The status of the Auto-Tune options for the domain.
    */
  var Status: js.UndefOr[AutoTuneStatus] = js.undefined
}
object AutoTuneOptionsStatus {
  
  inline def apply(): AutoTuneOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneOptionsStatus]
  }
  
  extension [Self <: AutoTuneOptionsStatus](x: Self) {
    
    inline def setOptions(value: AutoTuneOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setStatus(value: AutoTuneStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
