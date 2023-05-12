package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSearchFilter extends StObject {
  
  /**
    * The name of the value that you want to use as a filter, for example "Name": "QUICKSIGHT_OWNER". Valid values are defined as follows:    QUICKSIGHT_VIEWER_OR_OWNER: Provide an ARN of a user or group, and any analyses with that ARN listed as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups are considered.     QUICKSIGHT_OWNER: Provide an ARN of a user or group, and any analyses with that ARN listed as one of the owners of the analyses are returned. Implicit permissions from folders or groups are considered.    DIRECT_QUICKSIGHT_SOLE_OWNER: Provide an ARN of a user or group, and any analyses with that ARN listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are not considered.    DIRECT_QUICKSIGHT_OWNER: Provide an ARN of a user or group, and any analyses with that ARN listed as one of the owners of the analyses are returned. Implicit permissions from folders or groups are not considered.    DIRECT_QUICKSIGHT_VIEWER_OR_OWNER: Provide an ARN of a user or group, and any analyses with that ARN listed as one of the owners or viewers of the analyses are returned. Implicit permissions from folders or groups are not considered.     ANALYSIS_NAME: Any analyses whose names have a substring match to this value will be returned.  
    */
  var Name: js.UndefOr[AnalysisFilterAttribute] = js.undefined
  
  /**
    * The comparison operator that you want to use as a filter, for example "Operator": "StringEquals". Valid values are "StringEquals" and "StringLike". If you set the operator value to "StringEquals", you need to provide an ownership related filter in the "NAME" field and the arn of the user or group whose folders you want to search in the "Value" field. For example, "Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1". If you set the value to "StringLike", you need to provide the name of the folders you are searching for. For example, "Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test". The "StringLike" operator only supports the NAME value ANALYSIS_NAME.
    */
  var Operator: js.UndefOr[FilterOperator] = js.undefined
  
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter, for example "Value". An example is "arn:aws:quicksight:us-east-1:1:user/default/UserName1".
    */
  var Value: js.UndefOr[String] = js.undefined
}
object AnalysisSearchFilter {
  
  inline def apply(): AnalysisSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSearchFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisSearchFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: AnalysisFilterAttribute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperator(value: FilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
