package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The ARN of the dataset.
    */
  var DatasetArn: ComprehendDatasetArn
}
object DescribeDatasetRequest {
  
  inline def apply(DatasetArn: ComprehendDatasetArn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: ComprehendDatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
