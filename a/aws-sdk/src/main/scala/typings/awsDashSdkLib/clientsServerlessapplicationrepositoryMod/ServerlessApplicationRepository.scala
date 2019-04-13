package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerlessApplicationRepository
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ServerlessApplicationRepository: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
    */
  def createApplication(params: CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an application version.
    */
  def createApplicationVersion(): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an application version.
    */
  def createApplicationVersion(params: CreateApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplicationVersion(
    params: CreateApplicationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS CloudFormation change set for the given application.
    */
  def createCloudFormationChangeSet(): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFormationChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFormationChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS CloudFormation change set for the given application.
    */
  def createCloudFormationChangeSet(params: CreateCloudFormationChangeSetRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFormationChangeSet(
    params: CreateCloudFormationChangeSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFormationChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS CloudFormation template.
    */
  def createCloudFormationTemplate(): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFormationTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFormationTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS CloudFormation template.
    */
  def createCloudFormationTemplate(params: CreateCloudFormationTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCloudFormationTemplate(
    params: CreateCloudFormationTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCloudFormationTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified application.
    */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified application.
    */
  def deleteApplication(params: DeleteApplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified application.
    */
  def getApplication(): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified application.
    */
  def getApplication(params: GetApplicationRequest): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the policy for the application.
    */
  def getApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplicationPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the policy for the application.
    */
  def getApplicationPolicy(params: GetApplicationPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplicationPolicy(
    params: GetApplicationPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified AWS CloudFormation template.
    */
  def getCloudFormationTemplate(): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFormationTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFormationTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified AWS CloudFormation template.
    */
  def getCloudFormationTemplate(params: GetCloudFormationTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCloudFormationTemplate(
    params: GetCloudFormationTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCloudFormationTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the list of applications nested in the containing application.
    */
  def listApplicationDependencies(): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplicationDependencies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationDependenciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the list of applications nested in the containing application.
    */
  def listApplicationDependencies(params: ListApplicationDependenciesRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplicationDependencies(
    params: ListApplicationDependenciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationDependenciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists versions for the specified application.
    */
  def listApplicationVersions(): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplicationVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists versions for the specified application.
    */
  def listApplicationVersions(params: ListApplicationVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplicationVersions(
    params: ListApplicationVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists applications owned by the requester.
    */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists applications owned by the requester.
    */
  def listApplications(params: ListApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the permission policy for an application. For the list of actions supported for this operation, see
    Application 
    Permissions
    .
    */
  def putApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putApplicationPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the permission policy for an application. For the list of actions supported for this operation, see
    Application 
    Permissions
    .
    */
  def putApplicationPolicy(params: PutApplicationPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putApplicationPolicy(
    params: PutApplicationPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified application.
    */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified application.
    */
  def updateApplication(params: UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

