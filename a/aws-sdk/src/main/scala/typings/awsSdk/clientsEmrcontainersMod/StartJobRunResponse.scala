package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunResponse extends StObject {
  
  /**
    * This output lists the ARN of job run.
    */
  var arn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * This output displays the started job run ID.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * This output displays the name of the started job run.
    */
  var name: js.UndefOr[ResourceNameString] = js.undefined
  
  /**
    * This output displays the virtual cluster ID for which the job run was submitted.
    */
  var virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
}
object StartJobRunResponse {
  
  inline def apply(): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: JobArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterIdUndefined: Self = StObject.set(x, "virtualClusterId", js.undefined)
  }
}
