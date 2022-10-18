package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalSummary extends StObject {
  
  /**
    * The date the portal was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The portal's description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the portal.
    */
  var id: ID
  
  /**
    * The date the portal was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the portal.
    */
  var name: Name
  
  /**
    * The ARN of the service role that allows the portal's users to access your IoT SiteWise resources on your behalf. For more information, see Using service roles for IoT SiteWise Monitor in the IoT SiteWise User Guide.
    */
  var roleArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The URL for the IoT SiteWise Monitor portal. You can use this URL to access portals that use Amazon Web Services SSO for authentication. For portals that use IAM for authentication, you must use the IoT SiteWise console to get a URL that you can use to access the portal.
    */
  var startUrl: Url
  
  var status: PortalStatus
}
object PortalSummary {
  
  inline def apply(id: ID, name: Name, startUrl: Url, status: PortalStatus): PortalSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalSummary]
  }
  
  extension [Self <: PortalSummary](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStartUrl(value: Url): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PortalStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
