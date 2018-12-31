package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Transfer: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsTransferMod.TransferNs.ClientConfiguration = js.native
  /**
    * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns the ServerId property assigned by the service to the newly created server. Reference this ServerId property when you make updates to your server, or work with users. The response returns the ServerId value for the newly created server.
    */
  def createServer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns the ServerId property assigned by the service to the newly created server. Reference this ServerId property when you make updates to your server, or work with users. The response returns the ServerId value for the newly created server.
    */
  def createServer(params: awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createServer(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group and search for users. The response returns the UserName and ServerId values of the new user for that server.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group and search for users. The response returns the UserName and ServerId values of the new user for that server.
    */
  def createUser(params: awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUser(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the Secure File Transfer Protocol (SFTP) server that you specify. If you used SERVICE_MANAGED as your IdentityProviderType, you need to delete all users associated with this server before deleting the server itself No response returns from this call.
    */
  def deleteServer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteServer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the Secure File Transfer Protocol (SFTP) server that you specify. If you used SERVICE_MANAGED as your IdentityProviderType, you need to delete all users associated with this server before deleting the server itself No response returns from this call.
    */
  def deleteServer(params: awsDashSdkLib.clientsTransferMod.TransferNs.DeleteServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteServer(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.DeleteServerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user's Secure Shell (SSH) public key. No response is returned from this call.
    */
  def deleteSshPublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSshPublicKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user's Secure Shell (SSH) public key. No response is returned from this call.
    */
  def deleteSshPublicKey(params: awsDashSdkLib.clientsTransferMod.TransferNs.DeleteSshPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSshPublicKey(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.DeleteSshPublicKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the user belonging to the server you specify. No response returns from this call.  When you delete a user from a server, the user's information is lost. 
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the user belonging to the server you specify. No response returns from this call.  When you delete a user from a server, the user's information is lost. 
    */
  def deleteUser(params: awsDashSdkLib.clientsTransferMod.TransferNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the server that you specify by passing the ServerId parameter. The response contains a description of the server's properties.
    */
  def describeServer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the server that you specify by passing the ServerId parameter. The response contains a description of the server's properties.
    */
  def describeServer(params: awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeServer(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the user assigned to a specific server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
    */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the user assigned to a specific server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
    */
  def describeUser(params: awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUser(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a specific server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
    */
  def importSshPublicKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importSshPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a specific server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
    */
  def importSshPublicKey(params: awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importSshPublicKey(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ImportSshPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
    */
  def listServers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ListServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
    */
  def listServers(params: awsDashSdkLib.clientsTransferMod.TransferNs.ListServersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServers(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.ListServersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ListServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user, server, or role.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user, server, or role.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users for the server that you specify by passing the ServerId parameter.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users for the server that you specify by passing the ServerId parameter.
    */
  def listUsers(params: awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the state of a Secure File Transfer Protocol (SFTP) server from OFFLINE to ONLINE. It has no impact on an SFTP server that is already ONLINE. An ONLINE server can accept and process file transfer jobs. The state of STARTING indicates that the server is in an intermediate state, either not fully able to respond, or not fully online. The values of START_FAILED can indicate an error condition.  No response is returned from this call.
    */
  def startServer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startServer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the state of a Secure File Transfer Protocol (SFTP) server from OFFLINE to ONLINE. It has no impact on an SFTP server that is already ONLINE. An ONLINE server can accept and process file transfer jobs. The state of STARTING indicates that the server is in an intermediate state, either not fully able to respond, or not fully online. The values of START_FAILED can indicate an error condition.  No response is returned from this call.
    */
  def startServer(params: awsDashSdkLib.clientsTransferMod.TransferNs.StartServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startServer(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.StartServerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the state of an SFTP server from ONLINE to OFFLINE. An OFFLINE server cannot accept and process file transfer jobs. Information tied to your server such as server and user properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File Transfer Protocol (SFTP) endpoint billing. The states of STOPPING indicates that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition. No response is returned from this call.
    */
  def stopServer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopServer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the state of an SFTP server from ONLINE to OFFLINE. An OFFLINE server cannot accept and process file transfer jobs. Information tied to your server such as server and user properties are not affected by stopping your server. Stopping a server will not reduce or impact your Secure File Transfer Protocol (SFTP) endpoint billing. The states of STOPPING indicates that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of STOP_FAILED can indicate an error condition. No response is returned from this call.
    */
  def stopServer(params: awsDashSdkLib.clientsTransferMod.TransferNs.StopServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopServer(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.StopServerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. There is no response returned from this call.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. There is no response returned from this call.
    */
  def tagResource(params: awsDashSdkLib.clientsTransferMod.TransferNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * If the IdentityProviderType of the server is API_Gateway, tests whether your API Gateway is set up successfully. We highly recommend that you call this method to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to ensure that your users can successfully use the service.
    */
  def testIdentityProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * If the IdentityProviderType of the server is API_Gateway, tests whether your API Gateway is set up successfully. We highly recommend that you call this method to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to ensure that your users can successfully use the service.
    */
  def testIdentityProvider(params: awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testIdentityProvider(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.TestIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. No response is returned from this call.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users, servers, roles, and other entities. No response is returned from this call.
    */
  def untagResource(params: awsDashSdkLib.clientsTransferMod.TransferNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the server properties after that server has been created. The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP) server you updated.
    */
  def updateServer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the server properties after that server has been created. The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP) server you updated.
    */
  def updateServer(params: awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateServer(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory, role, and policy for the UserName and ServerId you specify. The response returns the ServerId and the UserName for the updated user.
    */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory, role, and policy for the UserName and ServerId you specify. The response returns the ServerId and the UserName for the updated user.
    */
  def updateUser(params: awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUser(
    params: awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTransferMod.TransferNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

