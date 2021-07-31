package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontHeaders
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>> */
trait PickCloudFrontRequestExcl extends StObject {
  
  var clientIp: String
  
  var headers: CloudFrontHeaders
  
  var method: String
  
  var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  
  var querystring: String
  
  var uri: String
}
object PickCloudFrontRequestExcl {
  
  @scala.inline
  def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): PickCloudFrontRequestExcl = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCloudFrontRequestExcl]
  }
  
  @scala.inline
  implicit class PickCloudFrontRequestExclMutableBuilder[Self <: PickCloudFrontRequestExcl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: CloudFrontOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
