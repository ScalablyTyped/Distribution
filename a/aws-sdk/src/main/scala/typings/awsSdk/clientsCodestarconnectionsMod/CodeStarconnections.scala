package typings.awsSdk.clientsCodestarconnectionsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeStarconnections extends Service {
  
  @JSName("config")
  var config_CodeStarconnections: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a connection that can then be given to other AWS services like CodePipeline so that it can access third-party code repositories. The connection is in pending status until the third-party connection handshake is completed from the console.
    */
  def createConnection(): Request[CreateConnectionOutput, AWSError] = js.native
  def createConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionOutput, Unit]): Request[CreateConnectionOutput, AWSError] = js.native
  /**
    * Creates a connection that can then be given to other AWS services like CodePipeline so that it can access third-party code repositories. The connection is in pending status until the third-party connection handshake is completed from the console.
    */
  def createConnection(params: CreateConnectionInput): Request[CreateConnectionOutput, AWSError] = js.native
  def createConnection(
    params: CreateConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectionOutput, Unit]
  ): Request[CreateConnectionOutput, AWSError] = js.native
  
  /**
    * Creates a resource that represents the infrastructure where a third-party provider is installed. The host is used when you create connections to an installed third-party provider type, such as GitHub Enterprise Server. You create one host for all connections to that provider.  A host created through the CLI or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE` by setting up the host in the console. 
    */
  def createHost(): Request[CreateHostOutput, AWSError] = js.native
  def createHost(callback: js.Function2[/* err */ AWSError, /* data */ CreateHostOutput, Unit]): Request[CreateHostOutput, AWSError] = js.native
  /**
    * Creates a resource that represents the infrastructure where a third-party provider is installed. The host is used when you create connections to an installed third-party provider type, such as GitHub Enterprise Server. You create one host for all connections to that provider.  A host created through the CLI or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE` by setting up the host in the console. 
    */
  def createHost(params: CreateHostInput): Request[CreateHostOutput, AWSError] = js.native
  def createHost(
    params: CreateHostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHostOutput, Unit]
  ): Request[CreateHostOutput, AWSError] = js.native
  
  /**
    * The connection to be deleted.
    */
  def deleteConnection(): Request[DeleteConnectionOutput, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionOutput, Unit]): Request[DeleteConnectionOutput, AWSError] = js.native
  /**
    * The connection to be deleted.
    */
  def deleteConnection(params: DeleteConnectionInput): Request[DeleteConnectionOutput, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectionOutput, Unit]
  ): Request[DeleteConnectionOutput, AWSError] = js.native
  
  /**
    * The host to be deleted. Before you delete a host, all connections associated to the host must be deleted.  A host cannot be deleted if it is in the VPC_CONFIG_INITIALIZING or VPC_CONFIG_DELETING state. 
    */
  def deleteHost(): Request[DeleteHostOutput, AWSError] = js.native
  def deleteHost(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHostOutput, Unit]): Request[DeleteHostOutput, AWSError] = js.native
  /**
    * The host to be deleted. Before you delete a host, all connections associated to the host must be deleted.  A host cannot be deleted if it is in the VPC_CONFIG_INITIALIZING or VPC_CONFIG_DELETING state. 
    */
  def deleteHost(params: DeleteHostInput): Request[DeleteHostOutput, AWSError] = js.native
  def deleteHost(
    params: DeleteHostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHostOutput, Unit]
  ): Request[DeleteHostOutput, AWSError] = js.native
  
  /**
    * Returns the connection ARN and details such as status, owner, and provider type.
    */
  def getConnection(): Request[GetConnectionOutput, AWSError] = js.native
  def getConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionOutput, Unit]): Request[GetConnectionOutput, AWSError] = js.native
  /**
    * Returns the connection ARN and details such as status, owner, and provider type.
    */
  def getConnection(params: GetConnectionInput): Request[GetConnectionOutput, AWSError] = js.native
  def getConnection(
    params: GetConnectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionOutput, Unit]
  ): Request[GetConnectionOutput, AWSError] = js.native
  
  /**
    * Returns the host ARN and details such as status, provider type, endpoint, and, if applicable, the VPC configuration.
    */
  def getHost(): Request[GetHostOutput, AWSError] = js.native
  def getHost(callback: js.Function2[/* err */ AWSError, /* data */ GetHostOutput, Unit]): Request[GetHostOutput, AWSError] = js.native
  /**
    * Returns the host ARN and details such as status, provider type, endpoint, and, if applicable, the VPC configuration.
    */
  def getHost(params: GetHostInput): Request[GetHostOutput, AWSError] = js.native
  def getHost(params: GetHostInput, callback: js.Function2[/* err */ AWSError, /* data */ GetHostOutput, Unit]): Request[GetHostOutput, AWSError] = js.native
  
  /**
    * Lists the connections associated with your account.
    */
  def listConnections(): Request[ListConnectionsOutput, AWSError] = js.native
  def listConnections(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectionsOutput, Unit]): Request[ListConnectionsOutput, AWSError] = js.native
  /**
    * Lists the connections associated with your account.
    */
  def listConnections(params: ListConnectionsInput): Request[ListConnectionsOutput, AWSError] = js.native
  def listConnections(
    params: ListConnectionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectionsOutput, Unit]
  ): Request[ListConnectionsOutput, AWSError] = js.native
  
  /**
    * Lists the hosts associated with your account.
    */
  def listHosts(): Request[ListHostsOutput, AWSError] = js.native
  def listHosts(callback: js.Function2[/* err */ AWSError, /* data */ ListHostsOutput, Unit]): Request[ListHostsOutput, AWSError] = js.native
  /**
    * Lists the hosts associated with your account.
    */
  def listHosts(params: ListHostsInput): Request[ListHostsOutput, AWSError] = js.native
  def listHosts(
    params: ListHostsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHostsOutput, Unit]
  ): Request[ListHostsOutput, AWSError] = js.native
  
  /**
    * Gets the set of key-value pairs (metadata) that are used to manage the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Gets the set of key-value pairs (metadata) that are used to manage the resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes tags from an AWS resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes tags from an AWS resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates a specified host with the provided configurations.
    */
  def updateHost(): Request[UpdateHostOutput, AWSError] = js.native
  def updateHost(callback: js.Function2[/* err */ AWSError, /* data */ UpdateHostOutput, Unit]): Request[UpdateHostOutput, AWSError] = js.native
  /**
    * Updates a specified host with the provided configurations.
    */
  def updateHost(params: UpdateHostInput): Request[UpdateHostOutput, AWSError] = js.native
  def updateHost(
    params: UpdateHostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateHostOutput, Unit]
  ): Request[UpdateHostOutput, AWSError] = js.native
}
