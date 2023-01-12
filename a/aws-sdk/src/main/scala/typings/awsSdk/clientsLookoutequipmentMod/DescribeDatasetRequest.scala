package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to be described. 
    */
  var DatasetName: DatasetIdentifier
}
object DescribeDatasetRequest {
  
  inline def apply(DatasetName: DatasetIdentifier): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetName(value: DatasetIdentifier): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
  }
}
