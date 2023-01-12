package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksPodPropertiesOverride extends StObject {
  
  /**
    * The overrides for the container that's used on the Amazon EKS pod.
    */
  var containers: js.UndefOr[EksContainerOverrideList] = js.undefined
}
object EksPodPropertiesOverride {
  
  inline def apply(): EksPodPropertiesOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksPodPropertiesOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksPodPropertiesOverride] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: EksContainerOverrideList): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: EksContainerOverride*): Self = StObject.set(x, "containers", js.Array(value*))
  }
}
