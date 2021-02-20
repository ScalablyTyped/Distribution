package typings.awsLambda.anon

import typings.awsLambda.cloudfrontMod.CloudFrontResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & { readonly request :std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>>,   response :aws-lambda.aws-lambda/common/cloudfront.CloudFrontResponse} */
@js.native
trait CloudFrontEventreadonlyre extends StObject {
  
  var config: DistributionDomainName = js.native
  
  val request: PickCloudFrontRequestExcl = js.native
  
  var response: CloudFrontResponse = js.native
}
object CloudFrontEventreadonlyre {
  
  @scala.inline
  def apply(config: DistributionDomainName, request: PickCloudFrontRequestExcl, response: CloudFrontResponse): CloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventreadonlyre]
  }
  
  @scala.inline
  implicit class CloudFrontEventreadonlyreMutableBuilder[Self <: CloudFrontEventreadonlyre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: DistributionDomainName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PickCloudFrontRequestExcl): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: CloudFrontResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
