package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHostInput extends StObject {
  
  /**
    * The name of the host to be created. The name must be unique in the calling AWS account.
    */
  var Name: HostName
  
  /**
    * The endpoint of the infrastructure to be represented by the host after it is created.
    */
  var ProviderEndpoint: Url
  
  /**
    * The name of the installed provider to be associated with your connection. The host resource represents the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
    */
  var ProviderType: typings.awsSdk.clientsCodestarconnectionsMod.ProviderType
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The VPC configuration to be provisioned for the host. A VPC must be configured and the infrastructure to be represented by the host must already be connected to the VPC.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.VpcConfiguration] = js.undefined
}
object CreateHostInput {
  
  inline def apply(Name: HostName, ProviderEndpoint: Url, ProviderType: ProviderType): CreateHostInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ProviderEndpoint = ProviderEndpoint.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostInput]
  }
  
  extension [Self <: CreateHostInput](x: Self) {
    
    inline def setName(value: HostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProviderEndpoint(value: Url): Self = StObject.set(x, "ProviderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
