package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeStar
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeStar: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCodestarMod.CodeStarNs.ClientConfiguration = js.native
  /**
     * Adds an IAM user to the team for an AWS CodeStar project.
     */
  def associateTeamMember(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an IAM user to the team for an AWS CodeStar project.
     */
  def associateTeamMember(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an IAM user to the team for an AWS CodeStar project.
     */
  def associateTeamMember(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an IAM user to the team for an AWS CodeStar project.
     */
  def associateTeamMember(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.AssociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reserved for future use. To create a project, use the AWS CodeStar console.
     */
  def createProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reserved for future use. To create a project, use the AWS CodeStar console.
     */
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reserved for future use. To create a project, use the AWS CodeStar console.
     */
  def createProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reserved for future use. To create a project, use the AWS CodeStar console.
     */
  def createProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     */
  def createUserProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     */
  def createUserProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     */
  def createUserProfile(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     */
  def createUserProfile(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
     */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
     */
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
     */
  def deleteProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
     */
  def deleteProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
     */
  def deleteUserProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
     */
  def deleteUserProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
     */
  def deleteUserProfile(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
     */
  def deleteUserProfile(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DeleteUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a project and its resources.
     */
  def describeProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a project and its resources.
     */
  def describeProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a project and its resources.
     */
  def describeProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a project and its resources.
     */
  def describeProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     */
  def describeUserProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     */
  def describeUserProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     */
  def describeUserProfile(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     */
  def describeUserProfile(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DescribeUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
     */
  def disassociateTeamMember(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
     */
  def disassociateTeamMember(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
     */
  def disassociateTeamMember(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
     */
  def disassociateTeamMember(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.DisassociateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all projects in AWS CodeStar associated with your AWS account.
     */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all projects in AWS CodeStar associated with your AWS account.
     */
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all projects in AWS CodeStar associated with your AWS account.
     */
  def listProjects(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all projects in AWS CodeStar associated with your AWS account.
     */
  def listProjects(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists resources associated with a project in AWS CodeStar.
     */
  def listResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists resources associated with a project in AWS CodeStar.
     */
  def listResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists resources associated with a project in AWS CodeStar.
     */
  def listResources(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists resources associated with a project in AWS CodeStar.
     */
  def listResources(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the tags for a project.
     */
  def listTagsForProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the tags for a project.
     */
  def listTagsForProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the tags for a project.
     */
  def listTagsForProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the tags for a project.
     */
  def listTagsForProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTagsForProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all team members associated with a project.
     */
  def listTeamMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all team members associated with a project.
     */
  def listTeamMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all team members associated with a project.
     */
  def listTeamMembers(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all team members associated with a project.
     */
  def listTeamMembers(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListTeamMembersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     */
  def listUserProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     */
  def listUserProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     */
  def listUserProfiles(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     */
  def listUserProfiles(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.ListUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds tags to a project.
     */
  def tagProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds tags to a project.
     */
  def tagProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds tags to a project.
     */
  def tagProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds tags to a project.
     */
  def tagProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.TagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes tags from a project.
     */
  def untagProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes tags from a project.
     */
  def untagProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes tags from a project.
     */
  def untagProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes tags from a project.
     */
  def untagProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UntagProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a project in AWS CodeStar.
     */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a project in AWS CodeStar.
     */
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a project in AWS CodeStar.
     */
  def updateProject(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a project in AWS CodeStar.
     */
  def updateProject(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
     */
  def updateTeamMember(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
     */
  def updateTeamMember(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
     */
  def updateTeamMember(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
     */
  def updateTeamMember(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateTeamMemberResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
     */
  def updateUserProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
     */
  def updateUserProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
     */
  def updateUserProfile(params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
     */
  def updateUserProfile(
    params: awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodestarMod.CodeStarNs.UpdateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

