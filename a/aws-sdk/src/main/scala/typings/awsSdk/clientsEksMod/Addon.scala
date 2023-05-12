package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addon extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the add-on.
    */
  var addonArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the add-on.
    */
  var addonName: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the add-on.
    */
  var addonVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var clusterName: js.UndefOr[ClusterName] = js.undefined
  
  /**
    * The configuration values that you provided.
    */
  var configurationValues: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the add-on was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that represents the health of the add-on.
    */
  var health: js.UndefOr[AddonHealth] = js.undefined
  
  /**
    * Information about an Amazon EKS add-on from the Amazon Web Services Marketplace.
    */
  var marketplaceInformation: js.UndefOr[MarketplaceInformation] = js.undefined
  
  /**
    * The date and time that the add-on was last modified.
    */
  var modifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The owner of the add-on.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * The publisher of the add-on.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that's bound to the Kubernetes service account that the add-on uses.
    */
  var serviceAccountRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the add-on.
    */
  var status: js.UndefOr[AddonStatus] = js.undefined
  
  /**
    * The metadata that you apply to the add-on to assist with categorization and organization. Each tag consists of a key and an optional value. You define both. Add-on tags do not propagate to any other resources associated with the cluster. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object Addon {
  
  inline def apply(): Addon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Addon] (val x: Self) extends AnyVal {
    
    inline def setAddonArn(value: String): Self = StObject.set(x, "addonArn", value.asInstanceOf[js.Any])
    
    inline def setAddonArnUndefined: Self = StObject.set(x, "addonArn", js.undefined)
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonNameUndefined: Self = StObject.set(x, "addonName", js.undefined)
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionUndefined: Self = StObject.set(x, "addonVersion", js.undefined)
    
    inline def setClusterName(value: ClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setConfigurationValues(value: String): Self = StObject.set(x, "configurationValues", value.asInstanceOf[js.Any])
    
    inline def setConfigurationValuesUndefined: Self = StObject.set(x, "configurationValues", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setHealth(value: AddonHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setMarketplaceInformation(value: MarketplaceInformation): Self = StObject.set(x, "marketplaceInformation", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceInformationUndefined: Self = StObject.set(x, "marketplaceInformation", js.undefined)
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "modifiedAt", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setServiceAccountRoleArn(value: String): Self = StObject.set(x, "serviceAccountRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountRoleArnUndefined: Self = StObject.set(x, "serviceAccountRoleArn", js.undefined)
    
    inline def setStatus(value: AddonStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
