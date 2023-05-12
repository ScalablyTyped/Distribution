package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalMetricsPreference extends StObject {
  
  /**
    *  Contains the source options for external metrics preferences. 
    */
  var source: js.UndefOr[ExternalMetricsSource] = js.undefined
}
object ExternalMetricsPreference {
  
  inline def apply(): ExternalMetricsPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalMetricsPreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalMetricsPreference] (val x: Self) extends AnyVal {
    
    inline def setSource(value: ExternalMetricsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
