package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntitiesDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with an entities detection job.
    */
  var EntitiesDetectionJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntitiesDetectionJobProperties] = js.undefined
}
object DescribeEntitiesDetectionJobResponse {
  
  inline def apply(): DescribeEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    
    inline def setEntitiesDetectionJobProperties(value: EntitiesDetectionJobProperties): Self = StObject.set(x, "EntitiesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setEntitiesDetectionJobPropertiesUndefined: Self = StObject.set(x, "EntitiesDetectionJobProperties", js.undefined)
  }
}
