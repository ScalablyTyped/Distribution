package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDraftAppVersionTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * A JSON string that contains the body of the app template.
    */
  var appTemplateBody: AppTemplateBody
}
object PutDraftAppVersionTemplateRequest {
  
  inline def apply(appArn: Arn, appTemplateBody: AppTemplateBody): PutDraftAppVersionTemplateRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appTemplateBody = appTemplateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDraftAppVersionTemplateRequest]
  }
  
  extension [Self <: PutDraftAppVersionTemplateRequest](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppTemplateBody(value: AppTemplateBody): Self = StObject.set(x, "appTemplateBody", value.asInstanceOf[js.Any])
  }
}
