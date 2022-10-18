package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsS3outpostsMod {
  
  @JSImport("aws-sdk/clients/s3outposts", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends S3Outposts {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  type CidrBlock = String
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  trait CreateEndpointRequest extends StObject {
    
    /**
      * The type of access for the network connectivity for the Amazon S3 on Outposts endpoint. To use the Amazon Web Services VPC, choose Private. To use the endpoint with an on-premises network, choose CustomerOwnedIp. If you choose CustomerOwnedIp, you must also provide the customer-owned IP address pool (CoIP pool).   Private is the default access type value. 
      */
    var AccessType: js.UndefOr[EndpointAccessType] = js.undefined
    
    /**
      * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint. IP addresses are allocated from this pool for the endpoint.
      */
    var CustomerOwnedIpv4Pool: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CustomerOwnedIpv4Pool] = js.undefined
    
    /**
      * The ID of the Outposts. 
      */
    var OutpostId: typings.awsSdk.clientsS3outpostsMod.OutpostId
    
    /**
      * The ID of the security group to use with the endpoint.
      */
    var SecurityGroupId: typings.awsSdk.clientsS3outpostsMod.SecurityGroupId
    
    /**
      * The ID of the subnet in the selected VPC. The endpoint subnet must belong to the Outpost that has Amazon S3 on Outposts provisioned.
      */
    var SubnetId: typings.awsSdk.clientsS3outpostsMod.SubnetId
  }
  object CreateEndpointRequest {
    
    inline def apply(OutpostId: OutpostId, SecurityGroupId: SecurityGroupId, SubnetId: SubnetId): CreateEndpointRequest = {
      val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any], SecurityGroupId = SecurityGroupId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateEndpointRequest]
    }
    
    extension [Self <: CreateEndpointRequest](x: Self) {
      
      inline def setAccessType(value: EndpointAccessType): Self = StObject.set(x, "AccessType", value.asInstanceOf[js.Any])
      
      inline def setAccessTypeUndefined: Self = StObject.set(x, "AccessType", js.undefined)
      
      inline def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
      
      inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateEndpointResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint.
      */
    var EndpointArn: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.EndpointArn] = js.undefined
  }
  object CreateEndpointResult {
    
    inline def apply(): CreateEndpointResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEndpointResult]
    }
    
    extension [Self <: CreateEndpointResult](x: Self) {
      
      inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
      
      inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    }
  }
  
  type CreationTime = js.Date
  
  type CustomerOwnedIpv4Pool = String
  
  trait DeleteEndpointRequest extends StObject {
    
    /**
      * The ID of the endpoint.
      */
    var EndpointId: typings.awsSdk.clientsS3outpostsMod.EndpointId
    
    /**
      * The ID of the Outposts. 
      */
    var OutpostId: typings.awsSdk.clientsS3outpostsMod.OutpostId
  }
  object DeleteEndpointRequest {
    
    inline def apply(EndpointId: EndpointId, OutpostId: OutpostId): DeleteEndpointRequest = {
      val __obj = js.Dynamic.literal(EndpointId = EndpointId.asInstanceOf[js.Any], OutpostId = OutpostId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEndpointRequest]
    }
    
    extension [Self <: DeleteEndpointRequest](x: Self) {
      
      inline def setEndpointId(value: EndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
      
      inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Endpoint extends StObject {
    
    /**
      * The type of connectivity used to access the Amazon S3 on Outposts endpoint.
      */
    var AccessType: js.UndefOr[EndpointAccessType] = js.undefined
    
    /**
      * The VPC CIDR committed by this endpoint.
      */
    var CidrBlock: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CidrBlock] = js.undefined
    
    /**
      * The time the endpoint was created.
      */
    var CreationTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The ID of the customer-owned IPv4 address pool used for the endpoint.
      */
    var CustomerOwnedIpv4Pool: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CustomerOwnedIpv4Pool] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint.
      */
    var EndpointArn: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.EndpointArn] = js.undefined
    
    /**
      * The network interface of the endpoint.
      */
    var NetworkInterfaces: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NetworkInterfaces] = js.undefined
    
    /**
      * The ID of the Outposts.
      */
    var OutpostsId: js.UndefOr[OutpostId] = js.undefined
    
    /**
      * The ID of the security group used for the endpoint.
      */
    var SecurityGroupId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.SecurityGroupId] = js.undefined
    
    /**
      * The status of the endpoint.
      */
    var Status: js.UndefOr[EndpointStatus] = js.undefined
    
    /**
      * The ID of the subnet used for the endpoint.
      */
    var SubnetId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.SubnetId] = js.undefined
    
    /**
      * The ID of the VPC used for the endpoint.
      */
    var VpcId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.VpcId] = js.undefined
  }
  object Endpoint {
    
    inline def apply(): Endpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setAccessType(value: EndpointAccessType): Self = StObject.set(x, "AccessType", value.asInstanceOf[js.Any])
      
      inline def setAccessTypeUndefined: Self = StObject.set(x, "AccessType", js.undefined)
      
      inline def setCidrBlock(value: CidrBlock): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
      
      inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
      
      inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
      
      inline def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
      
      inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
      
      inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
      
      inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
      
      inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
      
      inline def setOutpostsId(value: OutpostId): Self = StObject.set(x, "OutpostsId", value.asInstanceOf[js.Any])
      
      inline def setOutpostsIdUndefined: Self = StObject.set(x, "OutpostsId", js.undefined)
      
      inline def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
      
      inline def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
      
      inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
      
      inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Private_
    - typings.awsSdk.awsSdkStrings.CustomerOwnedIp
    - java.lang.String
  */
  type EndpointAccessType = _EndpointAccessType | String
  
  type EndpointArn = String
  
  type EndpointId = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Available_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | String
  
  type Endpoints = js.Array[Endpoint]
  
  trait ListEndpointsRequest extends StObject {
    
    /**
      * The maximum number of endpoints that will be returned in the response.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.MaxResults] = js.undefined
    
    /**
      * If a previous response from this operation included a NextToken value, provide that value here to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
  }
  object ListEndpointsRequest {
    
    inline def apply(): ListEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListEndpointsRequest]
    }
    
    extension [Self <: ListEndpointsRequest](x: Self) {
      
      inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListEndpointsResult extends StObject {
    
    /**
      * The list of endpoints associated with the specified Outpost.
      */
    var Endpoints: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.Endpoints] = js.undefined
    
    /**
      * If the number of endpoints associated with the specified Outpost exceeds MaxResults, you can include this value in subsequent calls to this operation to retrieve more results.
      */
    var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
  }
  object ListEndpointsResult {
    
    inline def apply(): ListEndpointsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListEndpointsResult]
    }
    
    extension [Self <: ListEndpointsResult](x: Self) {
      
      inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
      
      inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait ListSharedEndpointsRequest extends StObject {
    
    /**
      * The maximum number of endpoints that will be returned in the response.
      */
    var MaxResults: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.MaxResults] = js.undefined
    
    /**
      * If a previous response from this operation included a NextToken value, you can provide that value here to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
    
    /**
      * The ID of the Amazon Web Services Outpost.
      */
    var OutpostId: typings.awsSdk.clientsS3outpostsMod.OutpostId
  }
  object ListSharedEndpointsRequest {
    
    inline def apply(OutpostId: OutpostId): ListSharedEndpointsRequest = {
      val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSharedEndpointsRequest]
    }
    
    extension [Self <: ListSharedEndpointsRequest](x: Self) {
      
      inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListSharedEndpointsResult extends StObject {
    
    /**
      * The list of endpoints associated with the specified Outpost that have been shared by Amazon Web Services Resource Access Manager (RAM).
      */
    var Endpoints: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.Endpoints] = js.undefined
    
    /**
      * If the number of endpoints associated with the specified Outpost exceeds MaxResults, you can include this value in subsequent calls to this operation to retrieve more results.
      */
    var NextToken: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NextToken] = js.undefined
  }
  object ListSharedEndpointsResult {
    
    inline def apply(): ListSharedEndpointsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSharedEndpointsResult]
    }
    
    extension [Self <: ListSharedEndpointsResult](x: Self) {
      
      inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
      
      inline def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type MaxResults = Double
  
  trait NetworkInterface extends StObject {
    
    /**
      * The ID for the network interface.
      */
    var NetworkInterfaceId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.NetworkInterfaceId] = js.undefined
  }
  object NetworkInterface {
    
    inline def apply(): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInterface]
    }
    
    extension [Self <: NetworkInterface](x: Self) {
      
      inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    }
  }
  
  type NetworkInterfaceId = String
  
  type NetworkInterfaces = js.Array[NetworkInterface]
  
  type NextToken = String
  
  type OutpostId = String
  
  @js.native
  trait S3Outposts extends Service {
    
    @JSName("config")
    var config_S3Outposts: ConfigBase & ClientConfiguration = js.native
    
    /**
      * Creates an endpoint and associates it with the specified Outpost.  It can take up to 5 minutes for this action to finish.   Related actions include:    DeleteEndpoint     ListEndpoints   
      */
    def createEndpoint(): Request[CreateEndpointResult, AWSError] = js.native
    def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResult, Unit]): Request[CreateEndpointResult, AWSError] = js.native
    /**
      * Creates an endpoint and associates it with the specified Outpost.  It can take up to 5 minutes for this action to finish.   Related actions include:    DeleteEndpoint     ListEndpoints   
      */
    def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResult, AWSError] = js.native
    def createEndpoint(
      params: CreateEndpointRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResult, Unit]
    ): Request[CreateEndpointResult, AWSError] = js.native
    
    /**
      * Deletes an endpoint.  It can take up to 5 minutes for this action to finish.   Related actions include:    CreateEndpoint     ListEndpoints   
      */
    def deleteEndpoint(): Request[js.Object, AWSError] = js.native
    def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Deletes an endpoint.  It can take up to 5 minutes for this action to finish.   Related actions include:    CreateEndpoint     ListEndpoints   
      */
    def deleteEndpoint(params: DeleteEndpointRequest): Request[js.Object, AWSError] = js.native
    def deleteEndpoint(
      params: DeleteEndpointRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
    ): Request[js.Object, AWSError] = js.native
    
    /**
      * Lists endpoints associated with the specified Outpost.  Related actions include:    CreateEndpoint     DeleteEndpoint   
      */
    def listEndpoints(): Request[ListEndpointsResult, AWSError] = js.native
    def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResult, Unit]): Request[ListEndpointsResult, AWSError] = js.native
    /**
      * Lists endpoints associated with the specified Outpost.  Related actions include:    CreateEndpoint     DeleteEndpoint   
      */
    def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResult, AWSError] = js.native
    def listEndpoints(
      params: ListEndpointsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResult, Unit]
    ): Request[ListEndpointsResult, AWSError] = js.native
    
    /**
      * Lists all endpoints associated with an Outpost that has been shared by Amazon Web Services Resource Access Manager (RAM). Related actions include:    CreateEndpoint     DeleteEndpoint   
      */
    def listSharedEndpoints(): Request[ListSharedEndpointsResult, AWSError] = js.native
    def listSharedEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListSharedEndpointsResult, Unit]): Request[ListSharedEndpointsResult, AWSError] = js.native
    /**
      * Lists all endpoints associated with an Outpost that has been shared by Amazon Web Services Resource Access Manager (RAM). Related actions include:    CreateEndpoint     DeleteEndpoint   
      */
    def listSharedEndpoints(params: ListSharedEndpointsRequest): Request[ListSharedEndpointsResult, AWSError] = js.native
    def listSharedEndpoints(
      params: ListSharedEndpointsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListSharedEndpointsResult, Unit]
    ): Request[ListSharedEndpointsResult, AWSError] = js.native
  }
  
  type SecurityGroupId = String
  
  type SubnetId = String
  
  type VpcId = String
  
  trait _EndpointAccessType extends StObject
  
  trait _EndpointStatus extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
