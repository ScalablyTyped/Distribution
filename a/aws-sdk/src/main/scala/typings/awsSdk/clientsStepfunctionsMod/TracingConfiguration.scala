package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingConfiguration extends StObject {
  
  /**
    * When set to true, AWS X-Ray tracing is enabled.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
}
object TracingConfiguration {
  
  inline def apply(): TracingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfiguration]
  }
  
  extension [Self <: TracingConfiguration](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
