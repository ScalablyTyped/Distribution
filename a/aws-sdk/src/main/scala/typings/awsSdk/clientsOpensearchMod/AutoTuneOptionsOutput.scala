package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneOptionsOutput extends StObject {
  
  /**
    * Any errors that occurred while enabling or disabling Auto-Tune.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of Auto-Tune on the domain.
    */
  var State: js.UndefOr[AutoTuneState] = js.undefined
  
  /**
    * Whether the domain's off-peak window will be used to deploy Auto-Tune changes rather than a maintenance schedule.
    */
  var UseOffPeakWindow: js.UndefOr[Boolean] = js.undefined
}
object AutoTuneOptionsOutput {
  
  inline def apply(): AutoTuneOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneOptionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTuneOptionsOutput] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setState(value: AutoTuneState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUseOffPeakWindow(value: Boolean): Self = StObject.set(x, "UseOffPeakWindow", value.asInstanceOf[js.Any])
    
    inline def setUseOffPeakWindowUndefined: Self = StObject.set(x, "UseOffPeakWindow", js.undefined)
  }
}
