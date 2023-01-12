package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightsailDistribution extends StObject {
  
  /**
    * Indicates whether the bundle that is currently applied to your distribution, specified using the distributionName parameter, can be changed to another bundle. Use the UpdateDistributionBundle action to change your distribution's bundle.
    */
  var ableToUpdateBundle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The alternate domain names of the distribution.
    */
  var alternativeDomainNames: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the distribution.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the bundle currently applied to the distribution.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * An object that describes the cache behavior settings of the distribution.
    */
  var cacheBehaviorSettings: js.UndefOr[CacheSettings] = js.undefined
  
  /**
    * An array of objects that describe the per-path cache behavior of the distribution.
    */
  var cacheBehaviors: js.UndefOr[CacheBehaviorList] = js.undefined
  
  /**
    * The name of the SSL/TLS certificate attached to the distribution, if any.
    */
  var certificateName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The timestamp when the distribution was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that describes the default cache behavior of the distribution.
    */
  var defaultCacheBehavior: js.UndefOr[CacheBehavior] = js.undefined
  
  /**
    * The domain name of the distribution.
    */
  var domainName: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address type of the distribution. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6.
    */
  var ipAddressType: js.UndefOr[IpAddressType] = js.undefined
  
  /**
    * Indicates whether the distribution is enabled.
    */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that describes the location of the distribution, such as the Amazon Web Services Region and Availability Zone.  Lightsail distributions are global resources that can reference an origin in any Amazon Web Services Region, and distribute its content globally. However, all distributions are located in the us-east-1 Region. 
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the distribution.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * An object that describes the origin resource of the distribution, such as a Lightsail instance, bucket, or load balancer. The distribution pulls, caches, and serves content from the origin.
    */
  var origin: js.UndefOr[Origin] = js.undefined
  
  /**
    * The public DNS of the origin.
    */
  var originPublicDNS: js.UndefOr[String] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., Distribution).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The status of the distribution.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail distribution. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object LightsailDistribution {
  
  inline def apply(): LightsailDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightsailDistribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightsailDistribution] (val x: Self) extends AnyVal {
    
    inline def setAbleToUpdateBundle(value: Boolean): Self = StObject.set(x, "ableToUpdateBundle", value.asInstanceOf[js.Any])
    
    inline def setAbleToUpdateBundleUndefined: Self = StObject.set(x, "ableToUpdateBundle", js.undefined)
    
    inline def setAlternativeDomainNames(value: StringList): Self = StObject.set(x, "alternativeDomainNames", value.asInstanceOf[js.Any])
    
    inline def setAlternativeDomainNamesUndefined: Self = StObject.set(x, "alternativeDomainNames", js.undefined)
    
    inline def setAlternativeDomainNamesVarargs(value: String*): Self = StObject.set(x, "alternativeDomainNames", js.Array(value*))
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setCacheBehaviorSettings(value: CacheSettings): Self = StObject.set(x, "cacheBehaviorSettings", value.asInstanceOf[js.Any])
    
    inline def setCacheBehaviorSettingsUndefined: Self = StObject.set(x, "cacheBehaviorSettings", js.undefined)
    
    inline def setCacheBehaviors(value: CacheBehaviorList): Self = StObject.set(x, "cacheBehaviors", value.asInstanceOf[js.Any])
    
    inline def setCacheBehaviorsUndefined: Self = StObject.set(x, "cacheBehaviors", js.undefined)
    
    inline def setCacheBehaviorsVarargs(value: CacheBehaviorPerPath*): Self = StObject.set(x, "cacheBehaviors", js.Array(value*))
    
    inline def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDefaultCacheBehavior(value: CacheBehavior): Self = StObject.set(x, "defaultCacheBehavior", value.asInstanceOf[js.Any])
    
    inline def setDefaultCacheBehaviorUndefined: Self = StObject.set(x, "defaultCacheBehavior", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: Origin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginPublicDNS(value: String): Self = StObject.set(x, "originPublicDNS", value.asInstanceOf[js.Any])
    
    inline def setOriginPublicDNSUndefined: Self = StObject.set(x, "originPublicDNS", js.undefined)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
