package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchSegmentJobRequest extends StObject {
  
  /**
    * The ARN of the batch segment job to describe.
    */
  var batchSegmentJobArn: Arn
}
object DescribeBatchSegmentJobRequest {
  
  inline def apply(batchSegmentJobArn: Arn): DescribeBatchSegmentJobRequest = {
    val __obj = js.Dynamic.literal(batchSegmentJobArn = batchSegmentJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchSegmentJobRequest]
  }
  
  extension [Self <: DescribeBatchSegmentJobRequest](x: Self) {
    
    inline def setBatchSegmentJobArn(value: Arn): Self = StObject.set(x, "batchSegmentJobArn", value.asInstanceOf[js.Any])
  }
}
