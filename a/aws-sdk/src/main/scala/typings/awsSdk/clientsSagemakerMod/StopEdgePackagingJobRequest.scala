package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEdgePackagingJobRequest extends StObject {
  
  /**
    * The name of the edge packaging job.
    */
  var EdgePackagingJobName: EntityName
}
object StopEdgePackagingJobRequest {
  
  inline def apply(EdgePackagingJobName: EntityName): StopEdgePackagingJobRequest = {
    val __obj = js.Dynamic.literal(EdgePackagingJobName = EdgePackagingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEdgePackagingJobRequest]
  }
  
  extension [Self <: StopEdgePackagingJobRequest](x: Self) {
    
    inline def setEdgePackagingJobName(value: EntityName): Self = StObject.set(x, "EdgePackagingJobName", value.asInstanceOf[js.Any])
  }
}
