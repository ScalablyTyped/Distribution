package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEdgePackagingJobRequest extends StObject {
  
  /**
    * The name of the edge packaging job.
    */
  var EdgePackagingJobName: EntityName
}
object DescribeEdgePackagingJobRequest {
  
  inline def apply(EdgePackagingJobName: EntityName): DescribeEdgePackagingJobRequest = {
    val __obj = js.Dynamic.literal(EdgePackagingJobName = EdgePackagingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEdgePackagingJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEdgePackagingJobRequest] (val x: Self) extends AnyVal {
    
    inline def setEdgePackagingJobName(value: EntityName): Self = StObject.set(x, "EdgePackagingJobName", value.asInstanceOf[js.Any])
  }
}
