package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTopicsDetectionJobResponse extends StObject {
  
  /**
    * The list of properties for the requested job.
    */
  var TopicsDetectionJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.TopicsDetectionJobProperties] = js.undefined
}
object DescribeTopicsDetectionJobResponse {
  
  inline def apply(): DescribeTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTopicsDetectionJobResponse] (val x: Self) extends AnyVal {
    
    inline def setTopicsDetectionJobProperties(value: TopicsDetectionJobProperties): Self = StObject.set(x, "TopicsDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setTopicsDetectionJobPropertiesUndefined: Self = StObject.set(x, "TopicsDetectionJobProperties", js.undefined)
  }
}
