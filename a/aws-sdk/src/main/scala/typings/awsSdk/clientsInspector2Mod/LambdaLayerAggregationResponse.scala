package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaLayerAggregationResponse extends StObject {
  
  /**
    * The account ID of the AWS Lambda function layer.
    */
  var accountId: AccountId
  
  /**
    * The names of the AWS Lambda functions associated with the layers.
    */
  var functionName: NonEmptyString
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
    */
  var layerArn: NonEmptyString
  
  /**
    * The Resource ID of the AWS Lambda function layer.
    */
  var resourceId: NonEmptyString
  
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object LambdaLayerAggregationResponse {
  
  inline def apply(
    accountId: AccountId,
    functionName: NonEmptyString,
    layerArn: NonEmptyString,
    resourceId: NonEmptyString
  ): LambdaLayerAggregationResponse = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], layerArn = layerArn.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaLayerAggregationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaLayerAggregationResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: NonEmptyString): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setLayerArn(value: NonEmptyString): Self = StObject.set(x, "layerArn", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
