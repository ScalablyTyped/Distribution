package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksProperties extends StObject {
  
  /**
    * The properties for the Kubernetes pod resources of a job.
    */
  var podProperties: js.UndefOr[EksPodProperties] = js.undefined
}
object EksProperties {
  
  inline def apply(): EksProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksProperties]
  }
  
  extension [Self <: EksProperties](x: Self) {
    
    inline def setPodProperties(value: EksPodProperties): Self = StObject.set(x, "podProperties", value.asInstanceOf[js.Any])
    
    inline def setPodPropertiesUndefined: Self = StObject.set(x, "podProperties", js.undefined)
  }
}
