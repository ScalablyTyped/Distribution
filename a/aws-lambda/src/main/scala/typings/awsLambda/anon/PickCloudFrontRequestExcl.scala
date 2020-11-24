package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontHeaders
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>> */
@js.native
trait PickCloudFrontRequestExcl extends js.Object {
  
  var clientIp: String = js.native
  
  var headers: CloudFrontHeaders = js.native
  
  var method: String = js.native
  
  var origin: js.UndefOr[CloudFrontOrigin] = js.native
  
  var querystring: String = js.native
  
  var uri: String = js.native
}
object PickCloudFrontRequestExcl {
  
  @scala.inline
  def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): PickCloudFrontRequestExcl = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCloudFrontRequestExcl]
  }
  
  @scala.inline
  implicit class PickCloudFrontRequestExclOps[Self <: PickCloudFrontRequestExcl] (val x: Self) extends AnyVal {
    
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
    def setClientIp(value: String): Self = this.set("clientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: CloudFrontHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerystring(value: String): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: CloudFrontOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
}
