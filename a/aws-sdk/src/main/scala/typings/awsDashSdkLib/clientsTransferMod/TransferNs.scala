package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/transfer", "Transfer")
@js.native
object TransferNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateServerRequest extends js.Object {
    /**
      * An array containing all of the information required to call a customer-supplied authentication API. This parameter is not required when the IdentityProviderType value of server that is created uses the SERVICE_MANAGED authentication method.
      */
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
    /**
      * The mode of authentication enabled for this service. The default value is SERVICE_MANAGED, which allows you to store and access SFTP user credentials within the service. An IdentityProviderType value of API_GATEWAY indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
      */
    var IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    /**
      * A value that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
      */
    var LoggingRole: js.UndefOr[Role] = js.undefined
    /**
      * Key-value pairs that can be used to group and search for servers.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateServerResponse extends js.Object {
    /**
      * The service-assigned ID of the SFTP server that is created.
      */
    var ServerId: ServerId
  }
  
  trait CreateUserRequest extends js.Object {
    /**
      * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is /home/username .
      */
    var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
    /**
      * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down user access to portions of their Amazon S3 bucket. Variables you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
    /**
      * The IAM role that controls your user’s access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user’s transfer requests.
      */
    var Role: Role
    /**
      * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added your user to.
      */
    var ServerId: ServerId
    /**
      * The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
      */
    var SshPublicKeyBody: js.UndefOr[SshPublicKeyBody] = js.undefined
    /**
      * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any purpose.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * A unique string that identifies a user and is associated with a server as specified by the ServerId.
      */
    var UserName: UserName
  }
  
  trait CreateUserResponse extends js.Object {
    /**
      * The ID of the SFTP server that the user is attached to.
      */
    var ServerId: ServerId
    /**
      * A unique string that identifies a user account associated with an SFTP server.
      */
    var UserName: UserName
  }
  
  trait DeleteServerRequest extends js.Object {
    /**
      * A unique system-assigned identifier for an SFTP server instance.
      */
    var ServerId: ServerId
  }
  
  trait DeleteSshPublicKeyRequest extends js.Object {
    /**
      * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server instance that has the user assigned to it.
      */
    var ServerId: ServerId
    /**
      * A unique identifier used to reference your user’s specific SSH key.
      */
    var SshPublicKeyId: SshPublicKeyId
    /**
      * A unique string that identifies a user whose public key is being deleted.
      */
    var UserName: UserName
  }
  
  trait DeleteUserRequest extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server instance that has the user assigned to it.
      */
    var ServerId: ServerId
    /**
      * A unique string that identifies a user that is being deleted from the server.
      */
    var UserName: UserName
  }
  
  trait DescribeServerRequest extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server.
      */
    var ServerId: ServerId
  }
  
  trait DescribeServerResponse extends js.Object {
    /**
      * An array containing the properties of the server with the ServerID you specified.
      */
    var Server: DescribedServer
  }
  
  trait DescribeUserRequest extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server that has this user assigned.
      */
    var ServerId: ServerId
    /**
      * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the AWS Transfer service and perform file transfer tasks.
      */
    var UserName: UserName
  }
  
  trait DescribeUserResponse extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server that has this user assigned.
      */
    var ServerId: ServerId
    /**
      * An array containing the properties of the user account for the ServerID value that you specified.
      */
    var User: DescribedUser
  }
  
  trait DescribedServer extends js.Object {
    /**
      * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
      */
    var Arn: Arn
    /**
      * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of the server is SERVICE_MANAGED&gt;.
      */
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
    /**
      * This property defines the mode of authentication method enabled for this service. A value of SERVICE_MANAGED, means that you are using this Server to store and access SFTP user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
      */
    var IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    /**
      * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch logs.
      */
    var LoggingRole: js.UndefOr[Role] = js.undefined
    /**
      * This property is a unique system assigned identifier for the SFTP server that you instantiate.
      */
    var ServerId: js.UndefOr[ServerId] = js.undefined
    /**
      * The condition of the SFTP server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicated that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
      */
    var State: js.UndefOr[State] = js.undefined
    /**
      * This property contains the key-value pairs that you can use to search for and group servers that were assigned to the server that was described.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The number of users that are assigned to the SFTP server you specified with the ServerId.
      */
    var UserCount: js.UndefOr[UserCount] = js.undefined
  }
  
  trait DescribedUser extends js.Object {
    /**
      * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
      */
    var Arn: Arn
    /**
      * This property specifies the landing directory (or folder) which is the location that files are written to or read from in an Amazon S3 bucket for the described user. An example would be: /bucket_name/home/username .
      */
    var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
    /**
      * Specifies the name of the policy in use for the described user.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
    /**
      * This property specifies the IAM role that controls your user’s access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user’s transfer requests.
      */
    var Role: js.UndefOr[Role] = js.undefined
    /**
      * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
      */
    var SshPublicKeys: js.UndefOr[SshPublicKeys] = js.undefined
    /**
      * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users for a variety of purposes.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * This property is the name of the user that was requested to be described. User names are used for authentication purposes. This is the string that will be used by your user when they log in to your SFTP server.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
  }
  
  trait IdentityProviderDetails extends js.Object {
    /**
      * The Role parameter provides the type of InvocationRole used to authenticate the user account.
      */
    var InvocationRole: js.UndefOr[Role] = js.undefined
    /**
      * The IdentityProviderDetail parameter contains the location of the service endpoint used to authenticate users.
      */
    var Url: js.UndefOr[Url] = js.undefined
  }
  
  trait ImportSshPublicKeyRequest extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server.
      */
    var ServerId: ServerId
    /**
      * The public key portion of an SSH key pair.
      */
    var SshPublicKeyBody: SshPublicKeyBody
    /**
      * The name of the user account that is assigned to one or more servers.
      */
    var UserName: UserName
  }
  
  trait ImportSshPublicKeyResponse extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server.
      */
    var ServerId: ServerId
    /**
      * This identifier is the name given to a public key by the system that was imported.
      */
    var SshPublicKeyId: SshPublicKeyId
    /**
      * A user name assigned to the ServerID value that you specified.
      */
    var UserName: UserName
  }
  
  trait ListServersRequest extends js.Object {
    /**
      * Specifies the number of servers to return as a response to the ListServers query.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * When additional results are obtained from the ListServers command, a NextToken parameter is returned in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional servers.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListServersResponse extends js.Object {
    /**
      * When you can get additional results from the ListServers operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing additional servers.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of servers that were listed.
      */
    var Servers: ListedServers
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific AWS resource, such as a server, user, or role.
      */
    var Arn: Arn
    /**
      * Specifies the number of tags to return as a response to the ListTagsForResource request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * When you request additional results from the ListTagsForResource call, a NextToken parameter is returned in the input. You can then pass in a subsequent command the NextToken parameter to continue listing additional tags.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * This value is the ARN you specified to list the tags of.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * When you can get additional results from the ListTagsForResource call, a NextToken parameter is returned in the output. You can then pass in a subsequent command the NextToken parameter to continue listing additional tags.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items. Tags are metadata that you define that you can use for any purpose.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * Specifies the number of users to return as a response to the ListUsers request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command the NextToken parameter to continue listing additional users.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are assigned to it.
      */
    var ServerId: ServerId
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command the NextToken parameter to continue listing additional users.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A system-assigned unique identifier for an SFTP server that the users are assigned to.
      */
    var ServerId: ServerId
    /**
      * Returns the user accounts and their properties for the ServerId value that you specify.
      */
    var Users: ListedUsers
  }
  
  trait ListedServer extends js.Object {
    /**
      * The unique Amazon Resource Name (ARN) for the server to be listed.
      */
    var Arn: Arn
    /**
      * The authentication method used to validate a user for the server that was specified. listed. This can include Secure Shell (SSH), user name and password combinations, or your own custom authentication method. Valid values include SERVICE_MANAGED or API_GATEWAY.
      */
    var IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    /**
      * The AWS Identity and Access Management entity that allows the server to turn on Amazon CloudWatch logging.
      */
    var LoggingRole: js.UndefOr[Role] = js.undefined
    /**
      * This value is the unique system assigned identifier for the SFTP servers that were listed.
      */
    var ServerId: js.UndefOr[ServerId] = js.undefined
    /**
      * This property describes the condition of the SFTP server for the server that was described. A value of ONLINE&gt; indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicated that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
      */
    var State: js.UndefOr[State] = js.undefined
    /**
      * This property is a numeric value that indicates the number of users that are assigned to the SFTP server you specified with the ServerId.
      */
    var UserCount: js.UndefOr[UserCount] = js.undefined
  }
  
  trait ListedUser extends js.Object {
    /**
      * This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
      */
    var Arn: Arn
    /**
      * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
      */
    var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
    /**
      * The role in use by this user. A role is an AWS Identity and Access Management (IAM) entity that in this case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
      */
    var Role: js.UndefOr[Role] = js.undefined
    /**
      * This value is the number of SSH public keys stored for the user you specified.
      */
    var SshPublicKeyCount: js.UndefOr[SshPublicKeyCount] = js.undefined
    /**
      * The name of the user whose ARN was specified. User names are used for authentication purposes.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
  }
  
  trait SshPublicKey extends js.Object {
    /**
      * The date that the public key was added to the user account.
      */
    var DateImported: DateImported
    /**
      * The content of the SSH public key as specified by the PublicKeyId.
      */
    var SshPublicKeyBody: SshPublicKeyBody
    /**
      * The SshPublicKeyId parameter contains the identifier of the public key.
      */
    var SshPublicKeyId: SshPublicKeyId
  }
  
  trait StartServerRequest extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server that you start.
      */
    var ServerId: ServerId
  }
  
  trait StopServerRequest extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server that you stopped.
      */
    var ServerId: ServerId
  }
  
  trait Tag extends js.Object {
    /**
      * The name assigned to the tag that you create.
      */
    var Key: TagKey
    /**
      * This property contains one or more values that you assigned to the key name you create.
      */
    var Value: TagValue
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
      */
    var Arn: Arn
    /**
      * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this metadata to user accounts for any purpose.
      */
    var Tags: Tags
  }
  
  trait TestIdentityProviderRequest extends js.Object {
    /**
      * A system assigned identifier for a specific server. That server's user authentication method is tested with a user name and password.
      */
    var ServerId: ServerId
    /**
      * This request parameter is name of the user account to be tested.
      */
    var UserName: UserName
    /**
      * The password of the user account to be tested.
      */
    var UserPassword: js.UndefOr[UserPassword] = js.undefined
  }
  
  trait TestIdentityProviderResponse extends js.Object {
    /**
      * The result of the authorization test as a message. 
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * The HTTP status code that is the response from your API Gateway.
      */
    var StatusCode: StatusCode
    /**
      * The endpoint of the service used to authenticate a user.
      */
    var Url: Url
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns the ServerId property assigned by the service to the newly created server. Reference this ServerId property when you make updates to your server, or work with users. The response returns the ServerId value for the newly created server.
      */
    def createServer(): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Instantiates an autoscaling virtual server based on Secure File Transfer Protocol (SFTP) in AWS. The call returns the ServerId property assigned by the service to the newly created server. Reference this ServerId property when you make updates to your server, or work with users. The response returns the ServerId value for the newly created server.
      */
    def createServer(params: CreateServerRequest): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServer(
      params: CreateServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group and search for users. The response returns the UserName and ServerId values of the new user for that server.
      */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a user and associate them with an existing Secure File Transfer Protocol (SFTP) server. Using parameters for CreateUser, you can specify the user name, set the home directory, store the user's public key, and assign the user's AWS Identity and Access Management (IAM) role. You can also optionally add a scope-down policy, and assign metadata with tags that can be used to group and search for users. The response returns the UserName and ServerId values of the new user for that server.
      */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def deleteServer(params: DeleteServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServer(
      params: DeleteServerRequest,
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
    def deleteSshPublicKey(params: DeleteSshPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSshPublicKey(
      params: DeleteSshPublicKeyRequest,
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
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the server that you specify by passing the ServerId parameter. The response contains a description of the server's properties.
      */
    def describeServer(): awsDashSdkLib.libRequestMod.Request[DescribeServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the server that you specify by passing the ServerId parameter. The response contains a description of the server's properties.
      */
    def describeServer(params: DescribeServerRequest): awsDashSdkLib.libRequestMod.Request[DescribeServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServer(
      params: DescribeServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the user assigned to a specific server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
      */
    def describeUser(): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the user assigned to a specific server, as identified by its ServerId property. The response from this call returns the properties of the user associated with the ServerId value that was specified.
      */
    def describeUser(params: DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUser(
      params: DescribeUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a specific server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
      */
    def importSshPublicKey(): awsDashSdkLib.libRequestMod.Request[ImportSshPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importSshPublicKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportSshPublicKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportSshPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a Secure Shell (SSH) public key to a user account identified by a UserName value assigned to a specific server, identified by ServerId. The response returns the UserName value, the ServerId value, and the name of the SshPublicKeyId.
      */
    def importSshPublicKey(params: ImportSshPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[ImportSshPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importSshPublicKey(
      params: ImportSshPublicKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportSshPublicKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportSshPublicKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
      */
    def listServers(): awsDashSdkLib.libRequestMod.Request[ListServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Secure File Transfer Protocol (SFTP) servers that are associated with your AWS account.
      */
    def listServers(params: ListServersRequest): awsDashSdkLib.libRequestMod.Request[ListServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listServers(
      params: ListServersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListServersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user, server, or role.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the tags associated with the Amazon Resource Number (ARN) you specify. The resource can be a user, server, or role.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the users for the server that you specify by passing the ServerId parameter.
      */
    def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the users for the server that you specify by passing the ServerId parameter.
      */
    def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      params: ListUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def startServer(params: StartServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startServer(
      params: StartServerRequest,
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
    def stopServer(params: StopServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopServer(
      params: StopServerRequest,
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
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * If the IdentityProviderType of the server is API_Gateway, tests whether your API Gateway is set up successfully. We highly recommend that you call this method to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to ensure that your users can successfully use the service.
      */
    def testIdentityProvider(): awsDashSdkLib.libRequestMod.Request[TestIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testIdentityProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestIdentityProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * If the IdentityProviderType of the server is API_Gateway, tests whether your API Gateway is set up successfully. We highly recommend that you call this method to test your authentication method as soon as you create your server. By doing so, you can troubleshoot issues with the API Gateway integration to ensure that your users can successfully use the service.
      */
    def testIdentityProvider(params: TestIdentityProviderRequest): awsDashSdkLib.libRequestMod.Request[TestIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testIdentityProvider(
      params: TestIdentityProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestIdentityProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the server properties after that server has been created. The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP) server you updated.
      */
    def updateServer(): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the server properties after that server has been created. The UpdateServer call returns the ServerId of the Secure File Transfer Protocol (SFTP) server you updated.
      */
    def updateServer(params: UpdateServerRequest): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServer(
      params: UpdateServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory, role, and policy for the UserName and ServerId you specify. The response returns the ServerId and the UserName for the updated user.
      */
    def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory, role, and policy for the UserName and ServerId you specify. The response returns the ServerId and the UserName for the updated user.
      */
    def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      params: UpdateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * This is the value of the resource that will have the tag removed. An Amazon Resource Name (ARN) is an identifier for a specific AWS resource, such as a server, user, or role.
      */
    var Arn: Arn
    /**
      * TagKeys are key-value pairs assigned to ARNs that can be used to group and search for resources by type. This metadata can be attached to resources for any purpose.
      */
    var TagKeys: TagKeys
  }
  
  trait UpdateServerRequest extends js.Object {
    /**
      * This response parameter is an array containing all of the information required to call a customer's authentication API method.
      */
    var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
    /**
      * Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in Amazon CloudWatch, turning logging on or off.
      */
    var LoggingRole: js.UndefOr[NullableRole] = js.undefined
    /**
      * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
      */
    var ServerId: ServerId
  }
  
  trait UpdateServerResponse extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server that the user account is assigned to.
      */
    var ServerId: ServerId
  }
  
  trait UpdateUserRequest extends js.Object {
    /**
      * The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the server using their client. An example would be: /home/username .
      */
    var HomeDirectory: js.UndefOr[HomeDirectory] = js.undefined
    /**
      * Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access Management (IAM) role across multiple users. The policy scopes down users access to portions of your Amazon S3 bucket. Variables you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
    /**
      * The IAM role that controls your user’s access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the Secure File Transfer Protocol (SFTP) server to access your resources when servicing your SFTP user’s transfer requests.
      */
    var Role: js.UndefOr[Role] = js.undefined
    /**
      * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
      */
    var ServerId: ServerId
    /**
      * A unique string that identifies a user and is associated with a server as specified by the ServerId. This is the string that will be used by your user when they log in to your SFTP server.
      */
    var UserName: UserName
  }
  
  trait UpdateUserResponse extends js.Object {
    /**
      * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
      */
    var ServerId: ServerId
    /**
      * The unique identifier for a user that is assigned to the SFTP server instance that was specified in the request.
      */
    var UserName: UserName
  }
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DateImported = stdLib.Date
  type HomeDirectory = java.lang.String
  type IdentityProviderType = awsDashSdkLib.awsDashSdkLibStrings.SERVICE_MANAGED | awsDashSdkLib.awsDashSdkLibStrings.API_GATEWAY | java.lang.String
  type ListedServers = js.Array[ListedServer]
  type ListedUsers = js.Array[ListedUser]
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NullableRole = java.lang.String
  type Policy = java.lang.String
  type Role = java.lang.String
  type ServerId = java.lang.String
  type SshPublicKeyBody = java.lang.String
  type SshPublicKeyCount = scala.Double
  type SshPublicKeyId = java.lang.String
  type SshPublicKeys = js.Array[SshPublicKey]
  type State = awsDashSdkLib.awsDashSdkLibStrings.OFFLINE | awsDashSdkLib.awsDashSdkLibStrings.ONLINE | awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.START_FAILED | awsDashSdkLib.awsDashSdkLibStrings.STOP_FAILED | java.lang.String
  type StatusCode = scala.Double
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type Url = java.lang.String
  type UserCount = scala.Double
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-11-05` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

