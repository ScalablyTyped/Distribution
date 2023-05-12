package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingConfiguration extends StObject {
  
  /**
    * When set to true, X-Ray tracing is enabled.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
}
object TracingConfiguration {
  
  inline def apply(): TracingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TracingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
