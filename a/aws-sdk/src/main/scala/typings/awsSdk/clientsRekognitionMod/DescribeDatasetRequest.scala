package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the dataset that you want to describe. 
    */
  var DatasetArn: typings.awsSdk.clientsRekognitionMod.DatasetArn
}
object DescribeDatasetRequest {
  
  inline def apply(DatasetArn: DatasetArn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  extension [Self <: DescribeDatasetRequest](x: Self) {
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
