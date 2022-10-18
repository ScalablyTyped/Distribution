package typings.awsSdk.anon

import typings.awsSdk.clientsSagemakerMod.ProcessingJobName
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeProcessingJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeProcessingJobRequ extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the processing job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var ProcessingJobName: typings.awsSdk.clientsSagemakerMod.ProcessingJobName
}
object DescribeProcessingJobRequ {
  
  inline def apply(ProcessingJobName: ProcessingJobName): DescribeProcessingJobRequ = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobRequ]
  }
  
  extension [Self <: DescribeProcessingJobRequ](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
  }
}
