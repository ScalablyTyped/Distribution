package typings.awsLambda.anon

import typings.awsLambda.commonCloudfrontMod.CloudFrontResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-lambda.aws-lambda/common/cloudfront.CloudFrontEvent & { readonly request :std.Pick<aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, std.Exclude<keyof aws-lambda.aws-lambda/common/cloudfront.CloudFrontRequest, 'body'>>,   response :aws-lambda.aws-lambda/common/cloudfront.CloudFrontResponse} */
trait CloudFrontEventreadonlyre extends StObject {
  
  var config: DistributionDomainName
  
  val request: PickCloudFrontRequestExcl
  
  var response: CloudFrontResponse
}
object CloudFrontEventreadonlyre {
  
  inline def apply(config: DistributionDomainName, request: PickCloudFrontRequestExcl, response: CloudFrontResponse): CloudFrontEventreadonlyre = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEventreadonlyre]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudFrontEventreadonlyre] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: DistributionDomainName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PickCloudFrontRequestExcl): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: CloudFrontResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
