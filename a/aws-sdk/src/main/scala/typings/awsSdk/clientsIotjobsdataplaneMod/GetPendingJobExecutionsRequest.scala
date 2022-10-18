package typings.awsSdk.clientsIotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPendingJobExecutionsRequest extends StObject {
  
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: ThingName
}
object GetPendingJobExecutionsRequest {
  
  inline def apply(thingName: ThingName): GetPendingJobExecutionsRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPendingJobExecutionsRequest]
  }
  
  extension [Self <: GetPendingJobExecutionsRequest](x: Self) {
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
