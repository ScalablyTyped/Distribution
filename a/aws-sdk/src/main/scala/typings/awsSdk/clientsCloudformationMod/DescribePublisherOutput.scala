package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePublisherOutput extends StObject {
  
  /**
    * The type of account used as the identity provider when registering this publisher with CloudFormation.
    */
  var IdentityProvider: js.UndefOr[typings.awsSdk.clientsCloudformationMod.IdentityProvider] = js.undefined
  
  /**
    * The ID of the extension publisher.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
  
  /**
    * The URL to the publisher's profile with the identity provider.
    */
  var PublisherProfile: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherProfile] = js.undefined
  
  /**
    * Whether the publisher is verified. Currently, all registered publishers are verified.
    */
  var PublisherStatus: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherStatus] = js.undefined
}
object DescribePublisherOutput {
  
  inline def apply(): DescribePublisherOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePublisherOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePublisherOutput] (val x: Self) extends AnyVal {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderUndefined: Self = StObject.set(x, "IdentityProvider", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setPublisherProfile(value: PublisherProfile): Self = StObject.set(x, "PublisherProfile", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileUndefined: Self = StObject.set(x, "PublisherProfile", js.undefined)
    
    inline def setPublisherStatus(value: PublisherStatus): Self = StObject.set(x, "PublisherStatus", value.asInstanceOf[js.Any])
    
    inline def setPublisherStatusUndefined: Self = StObject.set(x, "PublisherStatus", js.undefined)
  }
}
