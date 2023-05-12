package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDraftAppVersionTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The version of the application.
    */
  var appVersion: js.UndefOr[EntityVersion] = js.undefined
}
object PutDraftAppVersionTemplateResponse {
  
  inline def apply(): PutDraftAppVersionTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDraftAppVersionTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDraftAppVersionTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
  }
}
