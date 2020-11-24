package typings.awsLambda.cloudfrontRequestMod

import typings.awsLambda.cloudfrontMod.CloudFrontHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CloudFrontRequestResult extends js.Object
object _CloudFrontRequestResult {
  
  @scala.inline
  def CloudFrontResultResponse(status: String): _CloudFrontRequestResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CloudFrontRequestResult]
  }
  
  @scala.inline
  def CloudFrontRequest(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): _CloudFrontRequestResult = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CloudFrontRequestResult]
  }
}
