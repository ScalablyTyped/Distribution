package typings.awsSdk.clientsIotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationResponse extends StObject {
  
  /**
    * The ARN of the web application.
    */
  var applicationArn: Arn
  
  /**
    * The date (in Unix epoch time) when the application was created.
    */
  var applicationCreationDate: Timestamp
  
  /**
    * An optional description of the web application.
    */
  var applicationDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The unique Id of the web application.
    */
  var applicationId: Id
  
  /**
    * The date (in Unix epoch time) when the application was last updated.
    */
  var applicationLastUpdateDate: Timestamp
  
  /**
    * The name of the web application.
    */
  var applicationName: Name
  
  /**
    * The current state of the web application.
    */
  var applicationState: ApplicationState
  
  /**
    * The URL of the web application.
    */
  var applicationUrl: Url
  
  /**
    * A message indicating why the DescribeApplication API failed.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The ARN of the role that the web application assumes when it interacts with AWS IoT Core.
    */
  var roleArn: Arn
  
  /**
    * The Id of the single sign-on client that you use to authenticate and authorize users on the web application.
    */
  var ssoClientId: js.UndefOr[SsoClientId] = js.undefined
  
  /**
    * A set of key/value pairs that you can use to manage the web application resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeApplicationResponse {
  
  inline def apply(
    applicationArn: Arn,
    applicationCreationDate: Timestamp,
    applicationId: Id,
    applicationLastUpdateDate: Timestamp,
    applicationName: Name,
    applicationState: ApplicationState,
    applicationUrl: Url,
    roleArn: Arn
  ): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal(applicationArn = applicationArn.asInstanceOf[js.Any], applicationCreationDate = applicationCreationDate.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any], applicationLastUpdateDate = applicationLastUpdateDate.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], applicationState = applicationState.asInstanceOf[js.Any], applicationUrl = applicationUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationCreationDate(value: Timestamp): Self = StObject.set(x, "applicationCreationDate", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescription(value: Description): Self = StObject.set(x, "applicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "applicationDescription", js.undefined)
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationLastUpdateDate(value: Timestamp): Self = StObject.set(x, "applicationLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setApplicationName(value: Name): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationState(value: ApplicationState): Self = StObject.set(x, "applicationState", value.asInstanceOf[js.Any])
    
    inline def setApplicationUrl(value: Url): Self = StObject.set(x, "applicationUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSsoClientId(value: SsoClientId): Self = StObject.set(x, "ssoClientId", value.asInstanceOf[js.Any])
    
    inline def setSsoClientIdUndefined: Self = StObject.set(x, "ssoClientId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
