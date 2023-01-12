package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePiiEntitiesDetectionJobResponse extends StObject {
  
  var PiiEntitiesDetectionJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.PiiEntitiesDetectionJobProperties] = js.undefined
}
object DescribePiiEntitiesDetectionJobResponse {
  
  inline def apply(): DescribePiiEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePiiEntitiesDetectionJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePiiEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    
    inline def setPiiEntitiesDetectionJobProperties(value: PiiEntitiesDetectionJobProperties): Self = StObject.set(x, "PiiEntitiesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setPiiEntitiesDetectionJobPropertiesUndefined: Self = StObject.set(x, "PiiEntitiesDetectionJobProperties", js.undefined)
  }
}
