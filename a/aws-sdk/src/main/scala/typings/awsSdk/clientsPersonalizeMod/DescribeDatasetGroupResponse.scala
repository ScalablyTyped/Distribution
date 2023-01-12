package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetGroupResponse extends StObject {
  
  /**
    * A listing of the dataset group's properties.
    */
  var datasetGroup: js.UndefOr[DatasetGroup] = js.undefined
}
object DescribeDatasetGroupResponse {
  
  inline def apply(): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDatasetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetGroup(value: DatasetGroup): Self = StObject.set(x, "datasetGroup", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupUndefined: Self = StObject.set(x, "datasetGroup", js.undefined)
  }
}
