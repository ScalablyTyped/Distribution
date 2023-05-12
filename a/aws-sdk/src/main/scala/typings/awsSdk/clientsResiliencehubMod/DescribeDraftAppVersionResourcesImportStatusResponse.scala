package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDraftAppVersionResourcesImportStatusResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * The returned error message for the request.
    */
  var errorMessage: js.UndefOr[String500] = js.undefined
  
  /**
    * The status of the action.
    */
  var status: ResourceImportStatusType
  
  /**
    * The timestamp for when the status last changed.
    */
  var statusChangeTime: js.Date
}
object DescribeDraftAppVersionResourcesImportStatusResponse {
  
  inline def apply(
    appArn: Arn,
    appVersion: EntityVersion,
    status: ResourceImportStatusType,
    statusChangeTime: js.Date
  ): DescribeDraftAppVersionResourcesImportStatusResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangeTime = statusChangeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDraftAppVersionResourcesImportStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDraftAppVersionResourcesImportStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String500): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setStatus(value: ResourceImportStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusChangeTime(value: js.Date): Self = StObject.set(x, "statusChangeTime", value.asInstanceOf[js.Any])
  }
}
