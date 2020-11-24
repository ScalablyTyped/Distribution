package typings.awsLambda.cloudfrontMod

import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.text_
import typings.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFrontResultResponse extends _CloudFrontRequestResult {
  
  var body: js.UndefOr[String] = js.native
  
  var bodyEncoding: js.UndefOr[text_ | base64] = js.native
  
  var headers: js.UndefOr[CloudFrontHeaders] = js.native
  
  var status: String = js.native
  
  var statusDescription: js.UndefOr[String] = js.native
}
object CloudFrontResultResponse {
  
  @scala.inline
  def apply(status: String): CloudFrontResultResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResultResponse]
  }
  
  @scala.inline
  implicit class CloudFrontResultResponseOps[Self <: CloudFrontResultResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyEncoding(value: text_ | base64): Self = this.set("bodyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyEncoding: Self = this.set("bodyEncoding", js.undefined)
    
    @scala.inline
    def setHeaders(value: CloudFrontHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setStatusDescription(value: String): Self = this.set("statusDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDescription: Self = this.set("statusDescription", js.undefined)
  }
}
