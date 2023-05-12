package typings.awsSdk.clientsServicecatalogappregistryMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCatalogAppRegistry extends Service {
  
  /**
    * Associates an attribute group with an application to augment the application's metadata with the group's attributes. This feature enables applications to be described with user-defined details that are machine-readable, such as third-party integrations.
    */
  def associateAttributeGroup(): Request[AssociateAttributeGroupResponse, AWSError] = js.native
  def associateAttributeGroup(callback: js.Function2[/* err */ AWSError, /* data */ AssociateAttributeGroupResponse, Unit]): Request[AssociateAttributeGroupResponse, AWSError] = js.native
  /**
    * Associates an attribute group with an application to augment the application's metadata with the group's attributes. This feature enables applications to be described with user-defined details that are machine-readable, such as third-party integrations.
    */
  def associateAttributeGroup(params: AssociateAttributeGroupRequest): Request[AssociateAttributeGroupResponse, AWSError] = js.native
  def associateAttributeGroup(
    params: AssociateAttributeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAttributeGroupResponse, Unit]
  ): Request[AssociateAttributeGroupResponse, AWSError] = js.native
  
  /**
    *  Associates a resource with an application. The resource can be specified by its ARN or name. The application can be specified by ARN, ID, or name. 
    */
  def associateResource(): Request[AssociateResourceResponse, AWSError] = js.native
  def associateResource(callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceResponse, Unit]): Request[AssociateResourceResponse, AWSError] = js.native
  /**
    *  Associates a resource with an application. The resource can be specified by its ARN or name. The application can be specified by ARN, ID, or name. 
    */
  def associateResource(params: AssociateResourceRequest): Request[AssociateResourceResponse, AWSError] = js.native
  def associateResource(
    params: AssociateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateResourceResponse, Unit]
  ): Request[AssociateResourceResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ServiceCatalogAppRegistry: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new application that is the top-level node in a hierarchy of related cloud resource abstractions.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates a new application that is the top-level node in a hierarchy of related cloud resource abstractions.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Creates a new attribute group as a container for user-defined attributes. This feature enables users to have full control over their cloud application's metadata in a rich machine-readable format to facilitate integration with automated workflows and third-party tools.
    */
  def createAttributeGroup(): Request[CreateAttributeGroupResponse, AWSError] = js.native
  def createAttributeGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateAttributeGroupResponse, Unit]): Request[CreateAttributeGroupResponse, AWSError] = js.native
  /**
    * Creates a new attribute group as a container for user-defined attributes. This feature enables users to have full control over their cloud application's metadata in a rich machine-readable format to facilitate integration with automated workflows and third-party tools.
    */
  def createAttributeGroup(params: CreateAttributeGroupRequest): Request[CreateAttributeGroupResponse, AWSError] = js.native
  def createAttributeGroup(
    params: CreateAttributeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAttributeGroupResponse, Unit]
  ): Request[CreateAttributeGroupResponse, AWSError] = js.native
  
  /**
    * Deletes an application that is specified either by its application ID, name, or ARN. All associated attribute groups and resources must be disassociated from it before deleting an application.
    */
  def deleteApplication(): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Deletes an application that is specified either by its application ID, name, or ARN. All associated attribute groups and resources must be disassociated from it before deleting an application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]
  ): Request[DeleteApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes an attribute group, specified either by its attribute group ID, name, or ARN.
    */
  def deleteAttributeGroup(): Request[DeleteAttributeGroupResponse, AWSError] = js.native
  def deleteAttributeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAttributeGroupResponse, Unit]): Request[DeleteAttributeGroupResponse, AWSError] = js.native
  /**
    * Deletes an attribute group, specified either by its attribute group ID, name, or ARN.
    */
  def deleteAttributeGroup(params: DeleteAttributeGroupRequest): Request[DeleteAttributeGroupResponse, AWSError] = js.native
  def deleteAttributeGroup(
    params: DeleteAttributeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAttributeGroupResponse, Unit]
  ): Request[DeleteAttributeGroupResponse, AWSError] = js.native
  
  /**
    * Disassociates an attribute group from an application to remove the extra attributes contained in the attribute group from the application's metadata. This operation reverts AssociateAttributeGroup.
    */
  def disassociateAttributeGroup(): Request[DisassociateAttributeGroupResponse, AWSError] = js.native
  def disassociateAttributeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateAttributeGroupResponse, Unit]): Request[DisassociateAttributeGroupResponse, AWSError] = js.native
  /**
    * Disassociates an attribute group from an application to remove the extra attributes contained in the attribute group from the application's metadata. This operation reverts AssociateAttributeGroup.
    */
  def disassociateAttributeGroup(params: DisassociateAttributeGroupRequest): Request[DisassociateAttributeGroupResponse, AWSError] = js.native
  def disassociateAttributeGroup(
    params: DisassociateAttributeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateAttributeGroupResponse, Unit]
  ): Request[DisassociateAttributeGroupResponse, AWSError] = js.native
  
  /**
    * Disassociates a resource from application. Both the resource and the application can be specified either by ID or name.
    */
  def disassociateResource(): Request[DisassociateResourceResponse, AWSError] = js.native
  def disassociateResource(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceResponse, Unit]): Request[DisassociateResourceResponse, AWSError] = js.native
  /**
    * Disassociates a resource from application. Both the resource and the application can be specified either by ID or name.
    */
  def disassociateResource(params: DisassociateResourceRequest): Request[DisassociateResourceResponse, AWSError] = js.native
  def disassociateResource(
    params: DisassociateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateResourceResponse, Unit]
  ): Request[DisassociateResourceResponse, AWSError] = js.native
  
  /**
    *  Retrieves metadata information about one of your applications. The application can be specified by its ARN, ID, or name (which is unique within one account in one region at a given point in time). Specify by ARN or ID in automated workflows if you want to make sure that the exact same application is returned or a ResourceNotFoundException is thrown, avoiding the ABA addressing problem. 
    */
  def getApplication(): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]): Request[GetApplicationResponse, AWSError] = js.native
  /**
    *  Retrieves metadata information about one of your applications. The application can be specified by its ARN, ID, or name (which is unique within one account in one region at a given point in time). Specify by ARN or ID in automated workflows if you want to make sure that the exact same application is returned or a ResourceNotFoundException is thrown, avoiding the ABA addressing problem. 
    */
  def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]
  ): Request[GetApplicationResponse, AWSError] = js.native
  
  /**
    * Gets the resource associated with the application.
    */
  def getAssociatedResource(): Request[GetAssociatedResourceResponse, AWSError] = js.native
  def getAssociatedResource(callback: js.Function2[/* err */ AWSError, /* data */ GetAssociatedResourceResponse, Unit]): Request[GetAssociatedResourceResponse, AWSError] = js.native
  /**
    * Gets the resource associated with the application.
    */
  def getAssociatedResource(params: GetAssociatedResourceRequest): Request[GetAssociatedResourceResponse, AWSError] = js.native
  def getAssociatedResource(
    params: GetAssociatedResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssociatedResourceResponse, Unit]
  ): Request[GetAssociatedResourceResponse, AWSError] = js.native
  
  /**
    *  Retrieves an attribute group by its ARN, ID, or name. The attribute group can be specified by its ARN, ID, or name. 
    */
  def getAttributeGroup(): Request[GetAttributeGroupResponse, AWSError] = js.native
  def getAttributeGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeGroupResponse, Unit]): Request[GetAttributeGroupResponse, AWSError] = js.native
  /**
    *  Retrieves an attribute group by its ARN, ID, or name. The attribute group can be specified by its ARN, ID, or name. 
    */
  def getAttributeGroup(params: GetAttributeGroupRequest): Request[GetAttributeGroupResponse, AWSError] = js.native
  def getAttributeGroup(
    params: GetAttributeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeGroupResponse, Unit]
  ): Request[GetAttributeGroupResponse, AWSError] = js.native
  
  /**
    *  Retrieves a TagKey configuration from an account. 
    */
  def getConfiguration(): Request[GetConfigurationResponse, AWSError] = js.native
  def getConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationResponse, Unit]): Request[GetConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of all of your applications. Results are paginated.
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Retrieves a list of all of your applications. Results are paginated.
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  
  /**
    * Lists all attribute groups that are associated with specified application. Results are paginated.
    */
  def listAssociatedAttributeGroups(): Request[ListAssociatedAttributeGroupsResponse, AWSError] = js.native
  def listAssociatedAttributeGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedAttributeGroupsResponse, Unit]): Request[ListAssociatedAttributeGroupsResponse, AWSError] = js.native
  /**
    * Lists all attribute groups that are associated with specified application. Results are paginated.
    */
  def listAssociatedAttributeGroups(params: ListAssociatedAttributeGroupsRequest): Request[ListAssociatedAttributeGroupsResponse, AWSError] = js.native
  def listAssociatedAttributeGroups(
    params: ListAssociatedAttributeGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedAttributeGroupsResponse, Unit]
  ): Request[ListAssociatedAttributeGroupsResponse, AWSError] = js.native
  
  /**
    *  Lists all of the resources that are associated with the specified application. Results are paginated.    If you share an application, and a consumer account associates a tag query to the application, all of the users who can access the application can also view the tag values in all accounts that are associated with it using this API.  
    */
  def listAssociatedResources(): Request[ListAssociatedResourcesResponse, AWSError] = js.native
  def listAssociatedResources(callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedResourcesResponse, Unit]): Request[ListAssociatedResourcesResponse, AWSError] = js.native
  /**
    *  Lists all of the resources that are associated with the specified application. Results are paginated.    If you share an application, and a consumer account associates a tag query to the application, all of the users who can access the application can also view the tag values in all accounts that are associated with it using this API.  
    */
  def listAssociatedResources(params: ListAssociatedResourcesRequest): Request[ListAssociatedResourcesResponse, AWSError] = js.native
  def listAssociatedResources(
    params: ListAssociatedResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociatedResourcesResponse, Unit]
  ): Request[ListAssociatedResourcesResponse, AWSError] = js.native
  
  /**
    * Lists all attribute groups which you have access to. Results are paginated.
    */
  def listAttributeGroups(): Request[ListAttributeGroupsResponse, AWSError] = js.native
  def listAttributeGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListAttributeGroupsResponse, Unit]): Request[ListAttributeGroupsResponse, AWSError] = js.native
  /**
    * Lists all attribute groups which you have access to. Results are paginated.
    */
  def listAttributeGroups(params: ListAttributeGroupsRequest): Request[ListAttributeGroupsResponse, AWSError] = js.native
  def listAttributeGroups(
    params: ListAttributeGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttributeGroupsResponse, Unit]
  ): Request[ListAttributeGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the details of all attribute groups associated with a specific application. The results display in pages.
    */
  def listAttributeGroupsForApplication(): Request[ListAttributeGroupsForApplicationResponse, AWSError] = js.native
  def listAttributeGroupsForApplication(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttributeGroupsForApplicationResponse, Unit]
  ): Request[ListAttributeGroupsForApplicationResponse, AWSError] = js.native
  /**
    * Lists the details of all attribute groups associated with a specific application. The results display in pages.
    */
  def listAttributeGroupsForApplication(params: ListAttributeGroupsForApplicationRequest): Request[ListAttributeGroupsForApplicationResponse, AWSError] = js.native
  def listAttributeGroupsForApplication(
    params: ListAttributeGroupsForApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttributeGroupsForApplicationResponse, Unit]
  ): Request[ListAttributeGroupsForApplicationResponse, AWSError] = js.native
  
  /**
    * Lists all of the tags on the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all of the tags on the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  Associates a TagKey configuration to an account. 
    */
  def putConfiguration(): Request[js.Object, AWSError] = js.native
  def putConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Associates a TagKey configuration to an account. 
    */
  def putConfiguration(params: PutConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putConfiguration(
    params: PutConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Syncs the resource with current AppRegistry records. Specifically, the resource’s AppRegistry system tags sync with its associated application. We remove the resource's AppRegistry system tags if it does not associate with the application. The caller must have permissions to read and update the resource.
    */
  def syncResource(): Request[SyncResourceResponse, AWSError] = js.native
  def syncResource(callback: js.Function2[/* err */ AWSError, /* data */ SyncResourceResponse, Unit]): Request[SyncResourceResponse, AWSError] = js.native
  /**
    * Syncs the resource with current AppRegistry records. Specifically, the resource’s AppRegistry system tags sync with its associated application. We remove the resource's AppRegistry system tags if it does not associate with the application. The caller must have permissions to read and update the resource.
    */
  def syncResource(params: SyncResourceRequest): Request[SyncResourceResponse, AWSError] = js.native
  def syncResource(
    params: SyncResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SyncResourceResponse, Unit]
  ): Request[SyncResourceResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified resource. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value. This operation returns an empty response if the call was successful.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified resource. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value. This operation returns an empty response if the call was successful.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a resource. This operation returns an empty response if the call was successful.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource. This operation returns an empty response if the call was successful.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing application with new attributes.
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates an existing application with new attributes.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
  
  /**
    * Updates an existing attribute group with new details. 
    */
  def updateAttributeGroup(): Request[UpdateAttributeGroupResponse, AWSError] = js.native
  def updateAttributeGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAttributeGroupResponse, Unit]): Request[UpdateAttributeGroupResponse, AWSError] = js.native
  /**
    * Updates an existing attribute group with new details. 
    */
  def updateAttributeGroup(params: UpdateAttributeGroupRequest): Request[UpdateAttributeGroupResponse, AWSError] = js.native
  def updateAttributeGroup(
    params: UpdateAttributeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAttributeGroupResponse, Unit]
  ): Request[UpdateAttributeGroupResponse, AWSError] = js.native
}
