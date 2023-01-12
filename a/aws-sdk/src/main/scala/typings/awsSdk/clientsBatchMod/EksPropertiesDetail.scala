package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksPropertiesDetail extends StObject {
  
  /**
    * The properties for the Kubernetes pod resources of a job.
    */
  var podProperties: js.UndefOr[EksPodPropertiesDetail] = js.undefined
}
object EksPropertiesDetail {
  
  inline def apply(): EksPropertiesDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksPropertiesDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksPropertiesDetail] (val x: Self) extends AnyVal {
    
    inline def setPodProperties(value: EksPodPropertiesDetail): Self = StObject.set(x, "podProperties", value.asInstanceOf[js.Any])
    
    inline def setPodPropertiesUndefined: Self = StObject.set(x, "podProperties", js.undefined)
  }
}
