package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudfrontRequestMod {
  
  type CloudFrontRequestCallback = typings.awsLambda.handlerMod.Callback[typings.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult]
  
  type CloudFrontRequestHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.cloudfrontRequestMod.CloudFrontRequestEvent, 
    typings.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult
  ]
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.awsLambda.cloudfrontMod.CloudFrontResultResponse
    - typings.awsLambda.cloudfrontMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[typings.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult | scala.Null]
}
