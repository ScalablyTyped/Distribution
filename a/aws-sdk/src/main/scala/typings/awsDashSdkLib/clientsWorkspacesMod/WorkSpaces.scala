package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkSpaces
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkSpaces: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ClientConfiguration = js.native
  /**
    * Associates the specified IP access control group with the specified directory.
    */
  def associateIpGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateIpGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified IP access control group with the specified directory.
    */
  def associateIpGroups(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateIpGroups(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AssociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
    */
  def authorizeIpRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeIpRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
    */
  def authorizeIpRules(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def authorizeIpRules(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.AuthorizeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
    */
  def createIpGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createIpGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
    */
  def createIpGroup(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createIpGroup(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the specified tags for the specified WorkSpace.
    */
  def createTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the specified tags for the specified WorkSpace.
    */
  def createTags(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTags(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
    */
  def createWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
    */
  def createWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.CreateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
    */
  def deleteIpGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteIpGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
    */
  def deleteIpGroup(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteIpGroup(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified tags from the specified WorkSpace.
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified tags from the specified WorkSpace.
    */
  def deleteTags(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTags(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image. 
    */
  def deleteWorkspaceImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWorkspaceImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image. 
    */
  def deleteWorkspaceImage(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWorkspaceImage(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DeleteWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
    */
  def describeAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
    */
  def describeAccount(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccount(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the specified account.
    */
  def describeAccountModifications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountModifications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the specified account.
    */
  def describeAccountModifications(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountModifications(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeAccountModificationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
    */
  def describeClientProperties(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientProperties(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
    */
  def describeClientProperties(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClientProperties(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your IP access control groups.
    */
  def describeIpGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIpGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your IP access control groups.
    */
  def describeIpGroups(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIpGroups(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified tags for the specified WorkSpace.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified tags for the specified WorkSpace.
    */
  def describeTags(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
    */
  def describeWorkspaceBundles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaceBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
    */
  def describeWorkspaceBundles(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaceBundles(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
    */
  def describeWorkspaceDirectories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaceDirectories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
    */
  def describeWorkspaceDirectories(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaceDirectories(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceDirectoriesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
    */
  def describeWorkspaceImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaceImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
    */
  def describeWorkspaceImages(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaceImages(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspaceImagesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
    */
  def describeWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
    */
  def describeWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the connection status of the specified WorkSpaces.
    */
  def describeWorkspacesConnectionStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspacesConnectionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the connection status of the specified WorkSpaces.
    */
  def describeWorkspacesConnectionStatus(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWorkspacesConnectionStatus(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DescribeWorkspacesConnectionStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified IP access control group from the specified directory.
    */
  def disassociateIpGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateIpGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified IP access control group from the specified directory.
    */
  def disassociateIpGroups(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateIpGroups(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DisassociateIpGroupsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The image must be an already licensed EC2 image that is in your AWS account, and you must own the image. 
    */
  def importWorkspaceImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importWorkspaceImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The image must be an already licensed EC2 image that is in your AWS account, and you must own the image. 
    */
  def importWorkspaceImage(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importWorkspaceImage(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ImportWorkspaceImageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable bring your own license (BYOL).  The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  def listAvailableManagementCidrRanges(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAvailableManagementCidrRanges(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable bring your own license (BYOL).  The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  def listAvailableManagementCidrRanges(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAvailableManagementCidrRanges(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ListAvailableManagementCidrRangesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the configuration of bring your own license (BYOL) for the specified account.
    */
  def modifyAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the configuration of bring your own license (BYOL) for the specified account.
    */
  def modifyAccount(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyAccount(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyAccountResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the properties of the specified Amazon WorkSpaces client.
    */
  def modifyClientProperties(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyClientProperties(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the properties of the specified Amazon WorkSpaces client.
    */
  def modifyClientProperties(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyClientProperties(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyClientPropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified WorkSpace properties.
    */
  def modifyWorkspaceProperties(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyWorkspaceProperties(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified WorkSpace properties.
    */
  def modifyWorkspaceProperties(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyWorkspaceProperties(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspacePropertiesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, or rebuild. An AutoStop WorkSpace in this state is not stopped. Users can log into a WorkSpace in the ADMIN_MAINTENANCE state.
    */
  def modifyWorkspaceState(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyWorkspaceState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, or rebuild. An AutoStop WorkSpace in this state is not stopped. Users can log into a WorkSpace in the ADMIN_MAINTENANCE state.
    */
  def modifyWorkspaceState(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyWorkspaceState(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ModifyWorkspaceStateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
    */
  def rebootWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
    */
  def rebootWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or UNHEALTHY. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
    */
  def rebuildWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebuildWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or UNHEALTHY. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
    */
  def rebuildWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebuildWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more rules from the specified IP access control group.
    */
  def revokeIpRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeIpRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more rules from the specified IP access control group.
    */
  def revokeIpRules(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeIpRules(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RevokeIpRulesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
    */
  def startWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
    */
  def startWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
    */
  def stopWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
    */
  def stopWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates the specified WorkSpaces. Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace. You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
    */
  def terminateWorkspaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateWorkspaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates the specified WorkSpaces. Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace. You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
    */
  def terminateWorkspaces(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateWorkspaces(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspacesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces the current rules of the specified IP access control group with the specified rules.
    */
  def updateRulesOfIpGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRulesOfIpGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Replaces the current rules of the specified IP access control group with the specified rules.
    */
  def updateRulesOfIpGroup(params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRulesOfIpGroup(
    params: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UpdateRulesOfIpGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

