package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Studio extends StObject {
  
  /**
    * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
    */
  var adminRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a studio resource and uniquely identifies it. ARNs are unique across all Regions.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A friendly name for the studio.
    */
  var displayName: js.UndefOr[StudioDisplayName] = js.undefined
  
  /**
    * The Amazon Web Services Region where the studio resource is located.
    */
  var homeRegion: js.UndefOr[Region] = js.undefined
  
  /**
    * The IAM Identity Center application client ID used to integrate with IAM Identity Center to enable IAM Identity Center users to log in to Nimble Studio portal.
    */
  var ssoClientId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the studio resource.
    */
  var state: js.UndefOr[StudioState] = js.undefined
  
  /**
    * Status codes that provide additional detail on the studio state.
    */
  var statusCode: js.UndefOr[StudioStatusCode] = js.undefined
  
  /**
    * Additional detail on the studio state.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration of the encryption method that is used for the studio.
    */
  var studioEncryptionConfiguration: js.UndefOr[StudioEncryptionConfiguration] = js.undefined
  
  /**
    * The unique identifier for a studio resource. In Nimble Studio, all other resources are contained in a studio resource.
    */
  var studioId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
    */
  var studioName: js.UndefOr[StudioName] = js.undefined
  
  /**
    * The address of the web page for the studio.
    */
  var studioUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IAM role that studio users assume when logging in to the Nimble Studio portal.
    */
  var userRoleArn: js.UndefOr[RoleArn] = js.undefined
}
object Studio {
  
  inline def apply(): Studio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Studio]
  }
  
  extension [Self <: Studio](x: Self) {
    
    inline def setAdminRoleArn(value: RoleArn): Self = StObject.set(x, "adminRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAdminRoleArnUndefined: Self = StObject.set(x, "adminRoleArn", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDisplayName(value: StudioDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHomeRegion(value: Region): Self = StObject.set(x, "homeRegion", value.asInstanceOf[js.Any])
    
    inline def setHomeRegionUndefined: Self = StObject.set(x, "homeRegion", js.undefined)
    
    inline def setSsoClientId(value: String): Self = StObject.set(x, "ssoClientId", value.asInstanceOf[js.Any])
    
    inline def setSsoClientIdUndefined: Self = StObject.set(x, "ssoClientId", js.undefined)
    
    inline def setState(value: StudioState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: StudioStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStudioEncryptionConfiguration(value: StudioEncryptionConfiguration): Self = StObject.set(x, "studioEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStudioEncryptionConfigurationUndefined: Self = StObject.set(x, "studioEncryptionConfiguration", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setStudioIdUndefined: Self = StObject.set(x, "studioId", js.undefined)
    
    inline def setStudioName(value: StudioName): Self = StObject.set(x, "studioName", value.asInstanceOf[js.Any])
    
    inline def setStudioNameUndefined: Self = StObject.set(x, "studioName", js.undefined)
    
    inline def setStudioUrl(value: String): Self = StObject.set(x, "studioUrl", value.asInstanceOf[js.Any])
    
    inline def setStudioUrlUndefined: Self = StObject.set(x, "studioUrl", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setUserRoleArn(value: RoleArn): Self = StObject.set(x, "userRoleArn", value.asInstanceOf[js.Any])
    
    inline def setUserRoleArnUndefined: Self = StObject.set(x, "userRoleArn", js.undefined)
  }
}
