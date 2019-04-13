package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionAssociation extends js.Object {
  /**
    * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:    viewer-request: The function executes when CloudFront receives a request from a viewer and before it checks to see whether the requested object is in the edge cache.     origin-request: The function executes only when CloudFront forwards a request to your origin. When the requested object is in the edge cache, the function doesn't execute.    origin-response: The function executes after CloudFront receives a response from the origin and before it caches the object in the response. When the requested object is in the edge cache, the function doesn't execute.    viewer-response: The function executes before CloudFront returns the requested object to the viewer. The function executes regardless of whether the object was already in the edge cache. If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.  
    */
  var EventType: awsDashSdkLib.clientsCloudfrontMod.EventType
  /**
    * A flag that allows a Lambda function to have read access to the body content. For more information, see Accessing the Request Body by Choosing the Include Body Option in the Amazon CloudFront Developer Guide.
    */
  var IncludeBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias or $LATEST.
    */
  var LambdaFunctionARN: awsDashSdkLib.clientsCloudfrontMod.LambdaFunctionARN
}

object LambdaFunctionAssociation {
  @scala.inline
  def apply(
    EventType: EventType,
    LambdaFunctionARN: LambdaFunctionARN,
    IncludeBody: js.UndefOr[scala.Boolean] = js.undefined
  ): LambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], LambdaFunctionARN = LambdaFunctionARN)
    if (!js.isUndefined(IncludeBody)) __obj.updateDynamic("IncludeBody")(IncludeBody)
    __obj.asInstanceOf[LambdaFunctionAssociation]
  }
}

