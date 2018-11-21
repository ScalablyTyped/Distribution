package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/codestar", "CodeStar")
@js.native
object CodeStarNs extends js.Object {
  
  trait AssociateTeamMemberRequest extends js.Object {
    /**
         * A user- or system-generated token that identifies the entity that requested the team member association to the project. This token can be used to repeat the request.
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * The ID of the project to which you will add the IAM user.
         */
    var projectId: ProjectId
    /**
         * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in an AWS CodeStar project.
         */
    var projectRole: Role
    /**
         * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources, for example Amazon EC2 instances.
         */
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
         */
    var userArn: UserArn
  }
  
  
  trait AssociateTeamMemberResult extends js.Object {
    /**
         * The user- or system-generated token from the initial request that can be used to repeat the request.
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateProjectRequest extends js.Object {
    /**
         * Reserved for future use.
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * Reserved for future use.
         */
    var description: js.UndefOr[ProjectDescription] = js.undefined
    /**
         * Reserved for future use.
         */
    var id: ProjectId
    /**
         * Reserved for future use.
         */
    var name: ProjectName
    /**
         * The tags created for the project.
         */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait CreateProjectResult extends js.Object {
    /**
         * Reserved for future use.
         */
    var arn: ProjectArn
    /**
         * Reserved for future use.
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * Reserved for future use.
         */
    var id: ProjectId
    /**
         * Reserved for future use.
         */
    var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
  }
  
  
  trait CreateUserProfileRequest extends js.Object {
    /**
         * The name that will be displayed as the friendly name for the user in AWS CodeStar. 
         */
    var displayName: UserProfileDisplayName
    /**
         * The email address that will be displayed as part of the user's profile in AWS CodeStar.
         */
    var emailAddress: Email
    /**
         * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
         */
    var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user in IAM.
         */
    var userArn: UserArn
  }
  
  
  trait CreateUserProfileResult extends js.Object {
    /**
         * The date the user profile was created, in timestamp format.
         */
    var createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined
    /**
         * The name that is displayed as the friendly name for the user in AWS CodeStar.
         */
    var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
    /**
         * The email address that is displayed as part of the user's profile in AWS CodeStar.
         */
    var emailAddress: js.UndefOr[Email] = js.undefined
    /**
         * The date the user profile was last modified, in timestamp format.
         */
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined
    /**
         * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private keypair the user can use to access project resources if a project owner allows the user remote access to those resources.
         */
    var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user in IAM.
         */
    var userArn: UserArn
  }
  
  
  trait DeleteProjectRequest extends js.Object {
    /**
         * A user- or system-generated token that identifies the entity that requested project deletion. This token can be used to repeat the request. 
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the project and its resources. This option will delete all AWS resources for the project (except for any buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
         */
    var deleteStack: js.UndefOr[DeleteStack] = js.undefined
    /**
         * The ID of the project to be deleted in AWS CodeStar.
         */
    var id: ProjectId
  }
  
  
  trait DeleteProjectResult extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the deleted project.
         */
    var projectArn: js.UndefOr[ProjectArn] = js.undefined
    /**
         * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its resources.
         */
    var stackId: js.UndefOr[StackId] = js.undefined
  }
  
  
  trait DeleteUserProfileRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
         */
    var userArn: UserArn
  }
  
  
  trait DeleteUserProfileResult extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the user deleted from AWS CodeStar.
         */
    var userArn: UserArn
  }
  
  
  trait DescribeProjectRequest extends js.Object {
    /**
         * The ID of the project.
         */
    var id: ProjectId
  }
  
  
  trait DescribeProjectResult extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the project.
         */
    var arn: js.UndefOr[ProjectArn] = js.undefined
    /**
         * A user- or system-generated token that identifies the entity that requested project creation. 
         */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * The date and time the project was created, in timestamp format.
         */
    var createdTimeStamp: js.UndefOr[CreatedTimestamp] = js.undefined
    /**
         * The description of the project, if any.
         */
    var description: js.UndefOr[ProjectDescription] = js.undefined
    /**
         * The ID of the project.
         */
    var id: js.UndefOr[ProjectId] = js.undefined
    /**
         * The display name for the project.
         */
    var name: js.UndefOr[ProjectName] = js.undefined
    /**
         * The ID for the AWS CodeStar project template used to create the project.
         */
    var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
    /**
         * The ID of the primary stack in AWS CloudFormation used to generate resources for the project.
         */
    var stackId: js.UndefOr[StackId] = js.undefined
    /**
         * The project creation or deletion status.
         */
    var status: js.UndefOr[ProjectStatus] = js.undefined
  }
  
  
  trait DescribeUserProfileRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the user.
         */
    var userArn: UserArn
  }
  
  
  trait DescribeUserProfileResult extends js.Object {
    /**
         * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
         */
    var createdTimestamp: CreatedTimestamp
    /**
         * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
         */
    var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
    /**
         * The email address for the user. Optional.
         */
    var emailAddress: js.UndefOr[Email] = js.undefined
    /**
         * The date and time when the user profile was last modified, in timestamp format.
         */
    var lastModifiedTimestamp: LastModifiedTimestamp
    /**
         * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be used in conjunction with the associated private key for access to project resources, such as Amazon EC2 instances, if a project owner grants remote access to those resources.
         */
    var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user.
         */
    var userArn: UserArn
  }
  
  
  trait DisassociateTeamMemberRequest extends js.Object {
    /**
         * The ID of the AWS CodeStar project from which you want to remove a team member.
         */
    var projectId: ProjectId
    /**
         * The Amazon Resource Name (ARN) of the IAM user or group whom you want to remove from the project.
         */
    var userArn: UserArn
  }
  
  
  trait DisassociateTeamMemberResult extends js.Object
  
  
  trait ListProjectsRequest extends js.Object {
    /**
         * The maximum amount of data that can be contained in a single set of results.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The continuation token to be used to return the next set of results, if the results cannot be returned in one response.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListProjectsResult extends js.Object {
    /**
         * The continuation token to use when requesting the next set of results, if there are more results to be returned.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * A list of projects.
         */
    var projects: ProjectsList
  }
  
  
  trait ListResourcesRequest extends js.Object {
    /**
         * The maximum amount of data that can be contained in a single set of results.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The continuation token for the next set of results, if the results cannot be returned in one response.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The ID of the project.
         */
    var projectId: ProjectId
  }
  
  
  trait ListResourcesResult extends js.Object {
    /**
         * The continuation token to use when requesting the next set of results, if there are more results to be returned.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * An array of resources associated with the project. 
         */
    var resources: js.UndefOr[ResourcesResult] = js.undefined
  }
  
  
  trait ListTagsForProjectRequest extends js.Object {
    /**
         * The ID of the project to get tags for.
         */
    var id: ProjectId
    /**
         * Reserved for future use.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Reserved for future use.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListTagsForProjectResult extends js.Object {
    /**
         * Reserved for future use.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The tags for the project.
         */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait ListTeamMembersRequest extends js.Object {
    /**
         * The maximum number of team members you want returned in a response.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The continuation token for the next set of results, if the results cannot be returned in one response.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The ID of the project for which you want to list team members.
         */
    var projectId: ProjectId
  }
  
  
  trait ListTeamMembersResult extends js.Object {
    /**
         * The continuation token to use when requesting the next set of results, if there are more results to be returned.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * A list of team member objects for the project.
         */
    var teamMembers: TeamMemberResult
  }
  
  
  trait ListUserProfilesRequest extends js.Object {
    /**
         * The maximum number of results to return in a response.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The continuation token for the next set of results, if the results cannot be returned in one response.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListUserProfilesResult extends js.Object {
    /**
         * The continuation token to use when requesting the next set of results, if there are more results to be returned.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * All the user profiles configured in AWS CodeStar for an AWS account.
         */
    var userProfiles: UserProfilesList
  }
  
  
  trait ProjectStatus extends js.Object {
    /**
         * In the case of a project creation or deletion failure, a reason for the failure.
         */
    var reason: js.UndefOr[Reason] = js.undefined
    /**
         * The phase of completion for a project creation or deletion.
         */
    var state: State
  }
  
  
  trait ProjectSummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the project.
         */
    var projectArn: js.UndefOr[ProjectArn] = js.undefined
    /**
         * The ID of the project.
         */
    var projectId: js.UndefOr[ProjectId] = js.undefined
  }
  
  
  trait Resource extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var id: ResourceId
  }
  
  
  trait TagProjectRequest extends js.Object {
    /**
         * The ID of the project you want to add a tag to.
         */
    var id: ProjectId
    /**
         * The tags you want to add to the project.
         */
    var tags: Tags
  }
  
  
  trait TagProjectResult extends js.Object {
    /**
         * The tags for the project.
         */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait Tags
    extends /* key */ ScalablyTyped.runtime.StringDictionary[TagValue]
  
  
  trait TeamMember extends js.Object {
    /**
         * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide. 
         */
    var projectRole: Role
    /**
         * Whether the user is allowed to remotely access project resources using an SSH public/private key pair.
         */
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user in IAM.
         */
    var userArn: UserArn
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds an IAM user to the team for an AWS CodeStar project.
       */
    def associateTeamMember(): awsDashSdkLib.libRequestMod.Request[AssociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an IAM user to the team for an AWS CodeStar project.
       */
    def associateTeamMember(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateTeamMemberResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an IAM user to the team for an AWS CodeStar project.
       */
    def associateTeamMember(params: AssociateTeamMemberRequest): awsDashSdkLib.libRequestMod.Request[AssociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an IAM user to the team for an AWS CodeStar project.
       */
    def associateTeamMember(
      params: AssociateTeamMemberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateTeamMemberResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reserved for future use. To create a project, use the AWS CodeStar console.
       */
    def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reserved for future use. To create a project, use the AWS CodeStar console.
       */
    def createProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reserved for future use. To create a project, use the AWS CodeStar console.
       */
    def createProject(params: CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reserved for future use. To create a project, use the AWS CodeStar console.
       */
    def createProject(
      params: CreateProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
       */
    def createUserProfile(): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
       */
    def createUserProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
       */
    def createUserProfile(params: CreateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
       */
    def createUserProfile(
      params: CreateUserProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
       */
    def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
       */
    def deleteProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
       */
    def deleteProject(params: DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
       */
    def deleteProject(
      params: DeleteProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
       */
    def deleteUserProfile(): awsDashSdkLib.libRequestMod.Request[DeleteUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
       */
    def deleteUserProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
       */
    def deleteUserProfile(params: DeleteUserProfileRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
       */
    def deleteUserProfile(
      params: DeleteUserProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a project and its resources.
       */
    def describeProject(): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a project and its resources.
       */
    def describeProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a project and its resources.
       */
    def describeProject(params: DescribeProjectRequest): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a project and its resources.
       */
    def describeProject(
      params: DescribeProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a user in AWS CodeStar and the user attributes across all projects.
       */
    def describeUserProfile(): awsDashSdkLib.libRequestMod.Request[DescribeUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a user in AWS CodeStar and the user attributes across all projects.
       */
    def describeUserProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a user in AWS CodeStar and the user attributes across all projects.
       */
    def describeUserProfile(params: DescribeUserProfileRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a user in AWS CodeStar and the user attributes across all projects.
       */
    def describeUserProfile(
      params: DescribeUserProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
       */
    def disassociateTeamMember(): awsDashSdkLib.libRequestMod.Request[DisassociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
       */
    def disassociateTeamMember(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateTeamMemberResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
       */
    def disassociateTeamMember(params: DisassociateTeamMemberRequest): awsDashSdkLib.libRequestMod.Request[DisassociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
       */
    def disassociateTeamMember(
      params: DisassociateTeamMemberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateTeamMemberResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all projects in AWS CodeStar associated with your AWS account.
       */
    def listProjects(): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all projects in AWS CodeStar associated with your AWS account.
       */
    def listProjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProjectsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all projects in AWS CodeStar associated with your AWS account.
       */
    def listProjects(params: ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all projects in AWS CodeStar associated with your AWS account.
       */
    def listProjects(
      params: ListProjectsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProjectsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists resources associated with a project in AWS CodeStar.
       */
    def listResources(): awsDashSdkLib.libRequestMod.Request[ListResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists resources associated with a project in AWS CodeStar.
       */
    def listResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourcesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists resources associated with a project in AWS CodeStar.
       */
    def listResources(params: ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists resources associated with a project in AWS CodeStar.
       */
    def listResources(
      params: ListResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourcesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the tags for a project.
       */
    def listTagsForProject(): awsDashSdkLib.libRequestMod.Request[ListTagsForProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the tags for a project.
       */
    def listTagsForProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the tags for a project.
       */
    def listTagsForProject(params: ListTagsForProjectRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the tags for a project.
       */
    def listTagsForProject(
      params: ListTagsForProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all team members associated with a project.
       */
    def listTeamMembers(): awsDashSdkLib.libRequestMod.Request[ListTeamMembersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all team members associated with a project.
       */
    def listTeamMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTeamMembersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTeamMembersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all team members associated with a project.
       */
    def listTeamMembers(params: ListTeamMembersRequest): awsDashSdkLib.libRequestMod.Request[ListTeamMembersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all team members associated with a project.
       */
    def listTeamMembers(
      params: ListTeamMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTeamMembersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTeamMembersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the user profiles configured for your AWS account in AWS CodeStar.
       */
    def listUserProfiles(): awsDashSdkLib.libRequestMod.Request[ListUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the user profiles configured for your AWS account in AWS CodeStar.
       */
    def listUserProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserProfilesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the user profiles configured for your AWS account in AWS CodeStar.
       */
    def listUserProfiles(params: ListUserProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the user profiles configured for your AWS account in AWS CodeStar.
       */
    def listUserProfiles(
      params: ListUserProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserProfilesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to a project.
       */
    def tagProject(): awsDashSdkLib.libRequestMod.Request[TagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to a project.
       */
    def tagProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to a project.
       */
    def tagProject(params: TagProjectRequest): awsDashSdkLib.libRequestMod.Request[TagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to a project.
       */
    def tagProject(
      params: TagProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a project.
       */
    def untagProject(): awsDashSdkLib.libRequestMod.Request[UntagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a project.
       */
    def untagProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a project.
       */
    def untagProject(params: UntagProjectRequest): awsDashSdkLib.libRequestMod.Request[UntagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from a project.
       */
    def untagProject(
      params: UntagProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a project in AWS CodeStar.
       */
    def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a project in AWS CodeStar.
       */
    def updateProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a project in AWS CodeStar.
       */
    def updateProject(params: UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a project in AWS CodeStar.
       */
    def updateProject(
      params: UpdateProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
       */
    def updateTeamMember(): awsDashSdkLib.libRequestMod.Request[UpdateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
       */
    def updateTeamMember(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTeamMemberResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
       */
    def updateTeamMember(params: UpdateTeamMemberRequest): awsDashSdkLib.libRequestMod.Request[UpdateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
       */
    def updateTeamMember(
      params: UpdateTeamMemberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTeamMemberResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTeamMemberResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
       */
    def updateUserProfile(): awsDashSdkLib.libRequestMod.Request[UpdateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
       */
    def updateUserProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
       */
    def updateUserProfile(params: UpdateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
       */
    def updateUserProfile(
      params: UpdateUserProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagProjectRequest extends js.Object {
    /**
         * The ID of the project to remove tags from.
         */
    var id: ProjectId
    /**
         * The tags to remove from the project.
         */
    var tags: TagKeys
  }
  
  
  trait UntagProjectResult extends js.Object
  
  
  trait UpdateProjectRequest extends js.Object {
    /**
         * The description of the project, if any.
         */
    var description: js.UndefOr[ProjectDescription] = js.undefined
    /**
         * The ID of the project you want to update.
         */
    var id: ProjectId
    /**
         * The name of the project you want to update.
         */
    var name: js.UndefOr[ProjectName] = js.undefined
  }
  
  
  trait UpdateProjectResult extends js.Object
  
  
  trait UpdateTeamMemberRequest extends js.Object {
    /**
         * The ID of the project.
         */
    var projectId: ProjectId
    /**
         * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide.
         */
    var projectRole: js.UndefOr[Role] = js.undefined
    /**
         * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile. Even if this is set to True, the user must associate a public key with their profile before the user can access resources.
         */
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user for whom you want to change team membership attributes.
         */
    var userArn: UserArn
  }
  
  
  trait UpdateTeamMemberResult extends js.Object {
    /**
         * The project role granted to the user.
         */
    var projectRole: js.UndefOr[Role] = js.undefined
    /**
         * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile.
         */
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
         */
    var userArn: js.UndefOr[UserArn] = js.undefined
  }
  
  
  trait UpdateUserProfileRequest extends js.Object {
    /**
         * The name that is displayed as the friendly name for the user in AWS CodeStar.
         */
    var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
    /**
         * The email address that is displayed as part of the user's profile in AWS CodeStar.
         */
    var emailAddress: js.UndefOr[Email] = js.undefined
    /**
         * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
         */
    var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    /**
         * The name that will be displayed as the friendly name for the user in AWS CodeStar.
         */
    var userArn: UserArn
  }
  
  
  trait UpdateUserProfileResult extends js.Object {
    /**
         * The date the user profile was created, in timestamp format.
         */
    var createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined
    /**
         * The name that is displayed as the friendly name for the user in AWS CodeStar.
         */
    var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
    /**
         * The email address that is displayed as part of the user's profile in AWS CodeStar.
         */
    var emailAddress: js.UndefOr[Email] = js.undefined
    /**
         * The date the user profile was last modified, in timestamp format.
         */
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined
    /**
         * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private keypair the user can use to access project resources if a project owner allows the user remote access to those resources.
         */
    var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user in IAM.
         */
    var userArn: UserArn
  }
  
  
  trait UserProfileSummary extends js.Object {
    /**
         * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
         */
    var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
    /**
         * The email address associated with the user.
         */
    var emailAddress: js.UndefOr[Email] = js.undefined
    /**
         * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
         */
    var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the user in IAM.
         */
    var userArn: js.UndefOr[UserArn] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreatedTimestamp = stdLib.Date
  type DeleteStack = scala.Boolean
  type Email = java.lang.String
  type LastModifiedTimestamp = stdLib.Date
  type MaxResults = scala.Double
  type PaginationToken = java.lang.String
  type ProjectArn = java.lang.String
  type ProjectDescription = java.lang.String
  type ProjectId = java.lang.String
  type ProjectName = java.lang.String
  type ProjectTemplateId = java.lang.String
  type ProjectsList = js.Array[ProjectSummary]
  type Reason = java.lang.String
  type RemoteAccessAllowed = scala.Boolean
  type ResourceId = java.lang.String
  type ResourcesResult = js.Array[Resource]
  type Role = java.lang.String
  type SshPublicKey = java.lang.String
  type StackId = java.lang.String
  type State = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type TeamMemberResult = js.Array[TeamMember]
  type UserArn = java.lang.String
  type UserProfileDisplayName = java.lang.String
  type UserProfilesList = js.Array[UserProfileSummary]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-04-19` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

