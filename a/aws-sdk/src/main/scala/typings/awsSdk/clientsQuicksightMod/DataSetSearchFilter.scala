package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetSearchFilter extends StObject {
  
  /**
    * The name of the value that you want to use as a filter, for example, "Name": "QUICKSIGHT_OWNER". Valid values are defined as follows:    QUICKSIGHT_VIEWER_OR_OWNER: Provide an ARN of a user or group, and any datasets with that ARN listed as one of the dataset owners or viewers are returned. Implicit permissions from folders or groups are considered.    QUICKSIGHT_OWNER: Provide an ARN of a user or group, and any datasets with that ARN listed as one of the owners of the dataset are returned. Implicit permissions from folders or groups are considered.    DIRECT_QUICKSIGHT_SOLE_OWNER: Provide an ARN of a user or group, and any datasets with that ARN listed as the only owner of the dataset are returned. Implicit permissions from folders or groups are not considered.    DIRECT_QUICKSIGHT_OWNER: Provide an ARN of a user or group, and any datasets with that ARN listed as one of the owners if the dataset are returned. Implicit permissions from folders or groups are not considered.    DIRECT_QUICKSIGHT_VIEWER_OR_OWNER: Provide an ARN of a user or group, and any datasets with that ARN listed as one of the owners or viewers of the dataset are returned. Implicit permissions from folders or groups are not considered.    DATASET_NAME: Any datasets whose names have a substring match to this value will be returned.  
    */
  var Name: DataSetFilterAttribute
  
  /**
    * The comparison operator that you want to use as a filter, for example "Operator": "StringEquals". Valid values are "StringEquals" and "StringLike". If you set the operator value to "StringEquals", you need to provide an ownership related filter in the "NAME" field and the arn of the user or group whose datasets you want to search in the "Value" field. For example, "Name":"QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east- 1:1:user/default/UserName1". If you set the value to "StringLike", you need to provide the name of the datasets you are searching for. For example, "Name":"DATASET_NAME", "Operator": "StringLike", "Value": "Test". The "StringLike" operator only supports the NAME value DATASET_NAME.
    */
  var Operator: FilterOperator
  
  /**
    * The value of the named item, in this case QUICKSIGHT_OWNER, that you want to use as a filter, for example, "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1".
    */
  var Value: String
}
object DataSetSearchFilter {
  
  inline def apply(Name: DataSetFilterAttribute, Operator: FilterOperator, Value: String): DataSetSearchFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetSearchFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSetSearchFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: DataSetFilterAttribute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: FilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
