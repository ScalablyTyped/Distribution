package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudfrontResponseMod {
  type CloudFrontResponseCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.cloudfrontResponseMod.CloudFrontResponseResult]
  type CloudFrontResponseHandler = typings.awsLambda.handerMod.Handler[
    typings.awsLambda.cloudfrontResponseMod.CloudFrontResponseEvent, 
    typings.awsLambda.cloudfrontResponseMod.CloudFrontResponseResult
  ]
  type CloudFrontResponseResult = js.UndefOr[scala.Null | typings.awsLambda.cloudfrontMod.CloudFrontResultResponse]
}
