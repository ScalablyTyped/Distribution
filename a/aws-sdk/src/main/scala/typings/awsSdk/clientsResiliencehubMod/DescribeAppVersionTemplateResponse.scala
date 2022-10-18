package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppVersionTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The body of the template.
    */
  var appTemplateBody: AppTemplateBody
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
}
object DescribeAppVersionTemplateResponse {
  
  inline def apply(appArn: Arn, appTemplateBody: AppTemplateBody, appVersion: EntityVersion): DescribeAppVersionTemplateResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appTemplateBody = appTemplateBody.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppVersionTemplateResponse]
  }
  
  extension [Self <: DescribeAppVersionTemplateResponse](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppTemplateBody(value: AppTemplateBody): Self = StObject.set(x, "appTemplateBody", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
  }
}
