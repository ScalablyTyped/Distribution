package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group to describe.
    */
  var datasetGroupArn: Arn
}
object DescribeDatasetGroupRequest {
  
  inline def apply(datasetGroupArn: Arn): DescribeDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetGroupRequest]
  }
  
  extension [Self <: DescribeDatasetGroupRequest](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
  }
}
