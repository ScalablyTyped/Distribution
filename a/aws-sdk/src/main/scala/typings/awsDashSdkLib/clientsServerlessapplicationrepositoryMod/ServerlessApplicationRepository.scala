package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerlessApplicationRepository
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ServerlessApplicationRepository: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ClientConfiguration = js.native
  /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
     */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
     */
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
     */
  def createApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
     */
  def createApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application version.
     */
  def createApplicationVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application version.
     */
  def createApplicationVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application version.
     */
  def createApplicationVersion(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application version.
     */
  def createApplicationVersion(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateApplicationVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS CloudFormation change set for the given application.
     */
  def createCloudFormationChangeSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS CloudFormation change set for the given application.
     */
  def createCloudFormationChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS CloudFormation change set for the given application.
     */
  def createCloudFormationChangeSet(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an AWS CloudFormation change set for the given application.
     */
  def createCloudFormationChangeSet(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.CreateCloudFormationChangeSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified application.
     */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified application.
     */
  def deleteApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified application.
     */
  def deleteApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.DeleteApplicationRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified application.
     */
  def deleteApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.DeleteApplicationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Gets the specified application.
     */
  def getApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified application.
     */
  def getApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified application.
     */
  def getApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the specified application.
     */
  def getApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the policy for the application.
     */
  def getApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the policy for the application.
     */
  def getApplicationPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the policy for the application.
     */
  def getApplicationPolicy(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the policy for the application.
     */
  def getApplicationPolicy(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.GetApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists versions for the specified application.
     */
  def listApplicationVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists versions for the specified application.
     */
  def listApplicationVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists versions for the specified application.
     */
  def listApplicationVersions(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists versions for the specified application.
     */
  def listApplicationVersions(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists applications owned by the requester.
     */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists applications owned by the requester.
     */
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists applications owned by the requester.
     */
  def listApplications(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists applications owned by the requester.
     */
  def listApplications(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the permission policy for an application. See
   Application Permissions
   for the list of supported actions that can be used with this operation.
     */
  def putApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the permission policy for an application. See
   Application Permissions
   for the list of supported actions that can be used with this operation.
     */
  def putApplicationPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the permission policy for an application. See
   Application Permissions
   for the list of supported actions that can be used with this operation.
     */
  def putApplicationPolicy(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the permission policy for an application. See
   Application Permissions
   for the list of supported actions that can be used with this operation.
     */
  def putApplicationPolicy(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.PutApplicationPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified application.
     */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified application.
     */
  def updateApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified application.
     */
  def updateApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified application.
     */
  def updateApplication(
    params: awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsServerlessapplicationrepositoryMod.ServerlessApplicationRepositoryNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

