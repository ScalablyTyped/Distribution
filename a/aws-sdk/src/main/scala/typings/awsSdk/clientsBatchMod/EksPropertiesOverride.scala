package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksPropertiesOverride extends StObject {
  
  /**
    * The overrides for the Kubernetes pod resources of a job.
    */
  var podProperties: js.UndefOr[EksPodPropertiesOverride] = js.undefined
}
object EksPropertiesOverride {
  
  inline def apply(): EksPropertiesOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksPropertiesOverride]
  }
  
  extension [Self <: EksPropertiesOverride](x: Self) {
    
    inline def setPodProperties(value: EksPodPropertiesOverride): Self = StObject.set(x, "podProperties", value.asInstanceOf[js.Any])
    
    inline def setPodPropertiesUndefined: Self = StObject.set(x, "podProperties", js.undefined)
  }
}
