package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerlessApplicationRepository extends Service {
  
  @JSName("config")
  var config_ServerlessApplicationRepository: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Creates an application version.
    */
  def createApplicationVersion(): Request[CreateApplicationVersionResponse, AWSError] = js.native
  def createApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationVersionResponse, Unit]): Request[CreateApplicationVersionResponse, AWSError] = js.native
  /**
    * Creates an application version.
    */
  def createApplicationVersion(params: CreateApplicationVersionRequest): Request[CreateApplicationVersionResponse, AWSError] = js.native
  def createApplicationVersion(
    params: CreateApplicationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationVersionResponse, Unit]
  ): Request[CreateApplicationVersionResponse, AWSError] = js.native
  
  /**
    * Creates an AWS CloudFormation change set for the given application.
    */
  def createCloudFormationChangeSet(): Request[CreateCloudFormationChangeSetResponse, AWSError] = js.native
  def createCloudFormationChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFormationChangeSetResponse, Unit]): Request[CreateCloudFormationChangeSetResponse, AWSError] = js.native
  /**
    * Creates an AWS CloudFormation change set for the given application.
    */
  def createCloudFormationChangeSet(params: CreateCloudFormationChangeSetRequest): Request[CreateCloudFormationChangeSetResponse, AWSError] = js.native
  def createCloudFormationChangeSet(
    params: CreateCloudFormationChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFormationChangeSetResponse, Unit]
  ): Request[CreateCloudFormationChangeSetResponse, AWSError] = js.native
  
  /**
    * Creates an AWS CloudFormation template.
    */
  def createCloudFormationTemplate(): Request[CreateCloudFormationTemplateResponse, AWSError] = js.native
  def createCloudFormationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFormationTemplateResponse, Unit]): Request[CreateCloudFormationTemplateResponse, AWSError] = js.native
  /**
    * Creates an AWS CloudFormation template.
    */
  def createCloudFormationTemplate(params: CreateCloudFormationTemplateRequest): Request[CreateCloudFormationTemplateResponse, AWSError] = js.native
  def createCloudFormationTemplate(
    params: CreateCloudFormationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFormationTemplateResponse, Unit]
  ): Request[CreateCloudFormationTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes the specified application.
    */
  def deleteApplication(): Request[js.Object, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[js.Object, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets the specified application.
    */
  def getApplication(): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]): Request[GetApplicationResponse, AWSError] = js.native
  /**
    * Gets the specified application.
    */
  def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]
  ): Request[GetApplicationResponse, AWSError] = js.native
  
  /**
    * Retrieves the policy for the application.
    */
  def getApplicationPolicy(): Request[GetApplicationPolicyResponse, AWSError] = js.native
  def getApplicationPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationPolicyResponse, Unit]): Request[GetApplicationPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the policy for the application.
    */
  def getApplicationPolicy(params: GetApplicationPolicyRequest): Request[GetApplicationPolicyResponse, AWSError] = js.native
  def getApplicationPolicy(
    params: GetApplicationPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationPolicyResponse, Unit]
  ): Request[GetApplicationPolicyResponse, AWSError] = js.native
  
  /**
    * Gets the specified AWS CloudFormation template.
    */
  def getCloudFormationTemplate(): Request[GetCloudFormationTemplateResponse, AWSError] = js.native
  def getCloudFormationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFormationTemplateResponse, Unit]): Request[GetCloudFormationTemplateResponse, AWSError] = js.native
  /**
    * Gets the specified AWS CloudFormation template.
    */
  def getCloudFormationTemplate(params: GetCloudFormationTemplateRequest): Request[GetCloudFormationTemplateResponse, AWSError] = js.native
  def getCloudFormationTemplate(
    params: GetCloudFormationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFormationTemplateResponse, Unit]
  ): Request[GetCloudFormationTemplateResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of applications nested in the containing application.
    */
  def listApplicationDependencies(): Request[ListApplicationDependenciesResponse, AWSError] = js.native
  def listApplicationDependencies(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationDependenciesResponse, Unit]): Request[ListApplicationDependenciesResponse, AWSError] = js.native
  /**
    * Retrieves the list of applications nested in the containing application.
    */
  def listApplicationDependencies(params: ListApplicationDependenciesRequest): Request[ListApplicationDependenciesResponse, AWSError] = js.native
  def listApplicationDependencies(
    params: ListApplicationDependenciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationDependenciesResponse, Unit]
  ): Request[ListApplicationDependenciesResponse, AWSError] = js.native
  
  /**
    * Lists versions for the specified application.
    */
  def listApplicationVersions(): Request[ListApplicationVersionsResponse, AWSError] = js.native
  def listApplicationVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationVersionsResponse, Unit]): Request[ListApplicationVersionsResponse, AWSError] = js.native
  /**
    * Lists versions for the specified application.
    */
  def listApplicationVersions(params: ListApplicationVersionsRequest): Request[ListApplicationVersionsResponse, AWSError] = js.native
  def listApplicationVersions(
    params: ListApplicationVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationVersionsResponse, Unit]
  ): Request[ListApplicationVersionsResponse, AWSError] = js.native
  
  /**
    * Lists applications owned by the requester.
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Lists applications owned by the requester.
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  
  /**
    * Sets the permission policy for an application. For the list of actions supported for this operation, see
    Application 
    Permissions
    .
    */
  def putApplicationPolicy(): Request[PutApplicationPolicyResponse, AWSError] = js.native
  def putApplicationPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutApplicationPolicyResponse, Unit]): Request[PutApplicationPolicyResponse, AWSError] = js.native
  /**
    * Sets the permission policy for an application. For the list of actions supported for this operation, see
    Application 
    Permissions
    .
    */
  def putApplicationPolicy(params: PutApplicationPolicyRequest): Request[PutApplicationPolicyResponse, AWSError] = js.native
  def putApplicationPolicy(
    params: PutApplicationPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutApplicationPolicyResponse, Unit]
  ): Request[PutApplicationPolicyResponse, AWSError] = js.native
  
  /**
    * Unshares an application from an AWS Organization.This operation can be called only from the organization's master account.
    */
  def unshareApplication(): Request[js.Object, AWSError] = js.native
  def unshareApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Unshares an application from an AWS Organization.This operation can be called only from the organization's master account.
    */
  def unshareApplication(params: UnshareApplicationRequest): Request[js.Object, AWSError] = js.native
  def unshareApplication(
    params: UnshareApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the specified application.
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates the specified application.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
}
