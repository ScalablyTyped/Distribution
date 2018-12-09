package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloud9", "Cloud9")
@js.native
object Cloud9Ns extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateEnvironmentEC2Request extends js.Object {
    /**
         * The number of minutes until the running instance is shut down after the environment has last been used.
         */
    var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.undefined
    /**
         * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time. For more information, see Client Tokens in the Amazon EC2 API Reference.
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * The description of the environment to create.
         */
    var description: js.UndefOr[EnvironmentDescription] = js.undefined
    /**
         * The type of instance to connect to the environment (for example, t2.micro).
         */
    var instanceType: InstanceType
    /**
         * The name of the environment to create. This name is visible to other AWS IAM users in the same AWS account.
         */
    var name: EnvironmentName
    /**
         * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If this value is not specified, the ARN defaults to this environment's creator.
         */
    var ownerArn: js.UndefOr[UserArn] = js.undefined
    /**
         * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
         */
    var subnetId: js.UndefOr[SubnetId] = js.undefined
  }
  
  
  trait CreateEnvironmentEC2Result extends js.Object {
    /**
         * The ID of the environment that was created.
         */
    var environmentId: js.UndefOr[EnvironmentId] = js.undefined
  }
  
  
  trait CreateEnvironmentMembershipRequest extends js.Object {
    /**
         * The ID of the environment that contains the environment member you want to add.
         */
    var environmentId: EnvironmentId
    /**
         * The type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
         */
    var permissions: MemberPermissions
    /**
         * The Amazon Resource Name (ARN) of the environment member you want to add.
         */
    var userArn: UserArn
  }
  
  
  trait CreateEnvironmentMembershipResult extends js.Object {
    /**
         * Information about the environment member that was added.
         */
    var membership: js.UndefOr[EnvironmentMember] = js.undefined
  }
  
  
  trait DeleteEnvironmentMembershipRequest extends js.Object {
    /**
         * The ID of the environment to delete the environment member from.
         */
    var environmentId: EnvironmentId
    /**
         * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
         */
    var userArn: UserArn
  }
  
  
  trait DeleteEnvironmentMembershipResult extends js.Object
  
  
  trait DeleteEnvironmentRequest extends js.Object {
    /**
         * The ID of the environment to delete.
         */
    var environmentId: EnvironmentId
  }
  
  
  trait DeleteEnvironmentResult extends js.Object
  
  
  trait DescribeEnvironmentMembershipsRequest extends js.Object {
    /**
         * The ID of the environment to get environment member information about.
         */
    var environmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
         * The maximum number of environment members to get information about.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The type of environment member permissions to get information about. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.   If no value is specified, information about all environment members are returned.
         */
    var permissions: js.UndefOr[PermissionsList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is specified, information about all environment members are returned.
         */
    var userArn: js.UndefOr[UserArn] = js.undefined
  }
  
  
  trait DescribeEnvironmentMembershipsResult extends js.Object {
    /**
         * Information about the environment members for the environment.
         */
    var memberships: js.UndefOr[EnvironmentMembersList] = js.undefined
    /**
         * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeEnvironmentStatusRequest extends js.Object {
    /**
         * The ID of the environment to get status information about.
         */
    var environmentId: EnvironmentId
  }
  
  
  trait DescribeEnvironmentStatusResult extends js.Object {
    /**
         * Any informational message about the status of the environment.
         */
    var message: js.UndefOr[String] = js.undefined
    /**
         * The status of the environment. Available values include:    connecting: The environment is connecting.    creating: The environment is being created.    deleting: The environment is being deleted.    error: The environment is in an error state.    ready: The environment is ready.    stopped: The environment is stopped.    stopping: The environment is stopping.  
         */
    var status: js.UndefOr[EnvironmentStatus] = js.undefined
  }
  
  
  trait DescribeEnvironmentsRequest extends js.Object {
    /**
         * The IDs of individual environments to get information about.
         */
    var environmentIds: BoundedEnvironmentIdList
  }
  
  
  trait DescribeEnvironmentsResult extends js.Object {
    /**
         * Information about the environments that are returned.
         */
    var environments: js.UndefOr[EnvironmentList] = js.undefined
  }
  
  
  trait Environment extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the environment.
         */
    var arn: js.UndefOr[String] = js.undefined
    /**
         * The description for the environment.
         */
    var description: js.UndefOr[EnvironmentDescription] = js.undefined
    /**
         * The ID of the environment.
         */
    var id: js.UndefOr[EnvironmentId] = js.undefined
    /**
         * The name of the environment.
         */
    var name: js.UndefOr[EnvironmentName] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the environment owner.
         */
    var ownerArn: js.UndefOr[String] = js.undefined
    /**
         * The type of environment. Valid values include the following:    ec2: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.    ssh: Your own server connects to the environment.  
         */
    var `type`: js.UndefOr[EnvironmentType] = js.undefined
  }
  
  
  trait EnvironmentMember extends js.Object {
    /**
         * The ID of the environment for the environment member.
         */
    var environmentId: js.UndefOr[EnvironmentId] = js.undefined
    /**
         * The time, expressed in epoch time format, when the environment member last opened the environment.
         */
    var lastAccess: js.UndefOr[Timestamp] = js.undefined
    /**
         * The type of environment member permissions associated with this environment member. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
         */
    var permissions: js.UndefOr[Permissions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the environment member.
         */
    var userArn: js.UndefOr[UserArn] = js.undefined
    /**
         * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
         */
    var userId: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListEnvironmentsRequest extends js.Object {
    /**
         * The maximum number of environments to get identifiers for.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListEnvironmentsResult extends js.Object {
    /**
         * The list of environment identifiers.
         */
    var environmentIds: js.UndefOr[EnvironmentIdList] = js.undefined
    /**
         * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
       */
    def createEnvironmentEC2(): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
       */
    def createEnvironmentEC2(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEnvironmentEC2Result, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
       */
    def createEnvironmentEC2(params: CreateEnvironmentEC2Request): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
       */
    def createEnvironmentEC2(
      params: CreateEnvironmentEC2Request,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEnvironmentEC2Result, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an environment member to an AWS Cloud9 development environment.
       */
    def createEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an environment member to an AWS Cloud9 development environment.
       */
    def createEnvironmentMembership(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEnvironmentMembershipResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an environment member to an AWS Cloud9 development environment.
       */
    def createEnvironmentMembership(params: CreateEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an environment member to an AWS Cloud9 development environment.
       */
    def createEnvironmentMembership(
      params: CreateEnvironmentMembershipRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEnvironmentMembershipResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
       */
    def deleteEnvironment(): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
       */
    def deleteEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEnvironmentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
       */
    def deleteEnvironment(params: DeleteEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
       */
    def deleteEnvironment(
      params: DeleteEnvironmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEnvironmentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an environment member from an AWS Cloud9 development environment.
       */
    def deleteEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an environment member from an AWS Cloud9 development environment.
       */
    def deleteEnvironmentMembership(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEnvironmentMembershipResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an environment member from an AWS Cloud9 development environment.
       */
    def deleteEnvironmentMembership(params: DeleteEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an environment member from an AWS Cloud9 development environment.
       */
    def deleteEnvironmentMembership(
      params: DeleteEnvironmentMembershipRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEnvironmentMembershipResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about environment members for an AWS Cloud9 development environment.
       */
    def describeEnvironmentMemberships(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about environment members for an AWS Cloud9 development environment.
       */
    def describeEnvironmentMemberships(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentMembershipsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about environment members for an AWS Cloud9 development environment.
       */
    def describeEnvironmentMemberships(params: DescribeEnvironmentMembershipsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about environment members for an AWS Cloud9 development environment.
       */
    def describeEnvironmentMemberships(
      params: DescribeEnvironmentMembershipsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentMembershipsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets status information for an AWS Cloud9 development environment.
       */
    def describeEnvironmentStatus(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets status information for an AWS Cloud9 development environment.
       */
    def describeEnvironmentStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets status information for an AWS Cloud9 development environment.
       */
    def describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets status information for an AWS Cloud9 development environment.
       */
    def describeEnvironmentStatus(
      params: DescribeEnvironmentStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about AWS Cloud9 development environments.
       */
    def describeEnvironments(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about AWS Cloud9 development environments.
       */
    def describeEnvironments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about AWS Cloud9 development environments.
       */
    def describeEnvironments(params: DescribeEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about AWS Cloud9 development environments.
       */
    def describeEnvironments(
      params: DescribeEnvironmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEnvironmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of AWS Cloud9 development environment identifiers.
       */
    def listEnvironments(): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of AWS Cloud9 development environment identifiers.
       */
    def listEnvironments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEnvironmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of AWS Cloud9 development environment identifiers.
       */
    def listEnvironments(params: ListEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of AWS Cloud9 development environment identifiers.
       */
    def listEnvironments(
      params: ListEnvironmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEnvironmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing AWS Cloud9 development environment.
       */
    def updateEnvironment(): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing AWS Cloud9 development environment.
       */
    def updateEnvironment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEnvironmentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing AWS Cloud9 development environment.
       */
    def updateEnvironment(params: UpdateEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing AWS Cloud9 development environment.
       */
    def updateEnvironment(
      params: UpdateEnvironmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEnvironmentResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
       */
    def updateEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
       */
    def updateEnvironmentMembership(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEnvironmentMembershipResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
       */
    def updateEnvironmentMembership(params: UpdateEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
       */
    def updateEnvironmentMembership(
      params: UpdateEnvironmentMembershipRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEnvironmentMembershipResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateEnvironmentMembershipRequest extends js.Object {
    /**
         * The ID of the environment for the environment member whose settings you want to change.
         */
    var environmentId: EnvironmentId
    /**
         * The replacement type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
         */
    var permissions: MemberPermissions
    /**
         * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
         */
    var userArn: UserArn
  }
  
  
  trait UpdateEnvironmentMembershipResult extends js.Object {
    /**
         * Information about the environment member whose settings were changed.
         */
    var membership: js.UndefOr[EnvironmentMember] = js.undefined
  }
  
  
  trait UpdateEnvironmentRequest extends js.Object {
    /**
         * Any new or replacement description for the environment.
         */
    var description: js.UndefOr[EnvironmentDescription] = js.undefined
    /**
         * The ID of the environment to change settings.
         */
    var environmentId: EnvironmentId
    /**
         * A replacement name for the environment.
         */
    var name: js.UndefOr[EnvironmentName] = js.undefined
  }
  
  
  trait UpdateEnvironmentResult extends js.Object
  
  val TypesNs: this.type = js.native
  type AutomaticStopTimeMinutes = scala.Double
  type BoundedEnvironmentIdList = js.Array[EnvironmentId]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type EnvironmentDescription = java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentList = js.Array[Environment]
  type EnvironmentMembersList = js.Array[EnvironmentMember]
  type EnvironmentName = java.lang.String
  type EnvironmentStatus = awsDashSdkLib.awsDashSdkLibStrings.error | awsDashSdkLib.awsDashSdkLibStrings.creating | awsDashSdkLib.awsDashSdkLibStrings.connecting | awsDashSdkLib.awsDashSdkLibStrings.ready | awsDashSdkLib.awsDashSdkLibStrings.stopping | awsDashSdkLib.awsDashSdkLibStrings.stopped | awsDashSdkLib.awsDashSdkLibStrings.deleting | java.lang.String
  type EnvironmentType = awsDashSdkLib.awsDashSdkLibStrings.ssh | awsDashSdkLib.awsDashSdkLibStrings.ec2 | java.lang.String
  type InstanceType = java.lang.String
  type MaxResults = scala.Double
  type MemberPermissions = awsDashSdkLib.awsDashSdkLibStrings.`read-write` | awsDashSdkLib.awsDashSdkLibStrings.`read-only` | java.lang.String
  type Permissions = awsDashSdkLib.awsDashSdkLibStrings.owner | awsDashSdkLib.awsDashSdkLibStrings.`read-write` | awsDashSdkLib.awsDashSdkLibStrings.`read-only` | java.lang.String
  type PermissionsList = js.Array[Permissions]
  type String = java.lang.String
  type SubnetId = java.lang.String
  type Timestamp = stdLib.Date
  type UserArn = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-09-23` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

