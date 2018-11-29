package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amplify
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Amplify: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ClientConfiguration = js.native
  /**
     *  Creates a new Amplify App. 
     */
  def createApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Amplify App. 
     */
  def createApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Amplify App. 
     */
  def createApp(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Amplify App. 
     */
  def createApp(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Branch for an Amplify App. 
     */
  def createBranch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Branch for an Amplify App. 
     */
  def createBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Branch for an Amplify App. 
     */
  def createBranch(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new Branch for an Amplify App. 
     */
  def createBranch(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def createDomainAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def createDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def createDomainAssociation(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def createDomainAssociation(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.CreateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete an existing Amplify App by appId. 
     */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete an existing Amplify App by appId. 
     */
  def deleteApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete an existing Amplify App by appId. 
     */
  def deleteApp(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete an existing Amplify App by appId. 
     */
  def deleteApp(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a branch for an Amplify App. 
     */
  def deleteBranch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a branch for an Amplify App. 
     */
  def deleteBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a branch for an Amplify App. 
     */
  def deleteBranch(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a branch for an Amplify App. 
     */
  def deleteBranch(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a DomainAssociation. 
     */
  def deleteDomainAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a DomainAssociation. 
     */
  def deleteDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a DomainAssociation. 
     */
  def deleteDomainAssociation(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Deletes a DomainAssociation. 
     */
  def deleteDomainAssociation(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete a job, for an Amplify branch, part of Amplify App. 
     */
  def deleteJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete a job, for an Amplify branch, part of Amplify App. 
     */
  def deleteJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete a job, for an Amplify branch, part of Amplify App. 
     */
  def deleteJob(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Delete a job, for an Amplify branch, part of Amplify App. 
     */
  def deleteJob(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.DeleteJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves an existing Amplify App by appId. 
     */
  def getApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves an existing Amplify App by appId. 
     */
  def getApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves an existing Amplify App by appId. 
     */
  def getApp(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves an existing Amplify App by appId. 
     */
  def getApp(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves a branch for an Amplify App. 
     */
  def getBranch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves a branch for an Amplify App. 
     */
  def getBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves a branch for an Amplify App. 
     */
  def getBranch(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves a branch for an Amplify App. 
     */
  def getBranch(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves domain info that corresponds to an appId and domainName. 
     */
  def getDomainAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves domain info that corresponds to an appId and domainName. 
     */
  def getDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves domain info that corresponds to an appId and domainName. 
     */
  def getDomainAssociation(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves domain info that corresponds to an appId and domainName. 
     */
  def getDomainAssociation(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Get a job for a branch, part of an Amplify App. 
     */
  def getJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Get a job for a branch, part of an Amplify App. 
     */
  def getJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Get a job for a branch, part of an Amplify App. 
     */
  def getJob(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Get a job for a branch, part of an Amplify App. 
     */
  def getJob(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists existing Amplify Apps. 
     */
  def listApps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists existing Amplify Apps. 
     */
  def listApps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists existing Amplify Apps. 
     */
  def listApps(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists existing Amplify Apps. 
     */
  def listApps(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists branches for an Amplify App. 
     */
  def listBranches(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists branches for an Amplify App. 
     */
  def listBranches(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists branches for an Amplify App. 
     */
  def listBranches(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Lists branches for an Amplify App. 
     */
  def listBranches(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListBranchesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List domains with an app 
     */
  def listDomainAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List domains with an app 
     */
  def listDomainAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List domains with an app 
     */
  def listDomainAssociations(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List domains with an app 
     */
  def listDomainAssociations(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListDomainAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List Jobs for a branch, part of an Amplify App. 
     */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List Jobs for a branch, part of an Amplify App. 
     */
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List Jobs for a branch, part of an Amplify App. 
     */
  def listJobs(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  List Jobs for a branch, part of an Amplify App. 
     */
  def listJobs(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts a new job for a branch, part of an Amplify App. 
     */
  def startJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts a new job for a branch, part of an Amplify App. 
     */
  def startJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts a new job for a branch, part of an Amplify App. 
     */
  def startJob(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Starts a new job for a branch, part of an Amplify App. 
     */
  def startJob(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StartJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
     */
  def stopJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
     */
  def stopJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
     */
  def stopJob(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
     */
  def stopJob(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates an existing Amplify App. 
     */
  def updateApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates an existing Amplify App. 
     */
  def updateApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates an existing Amplify App. 
     */
  def updateApp(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates an existing Amplify App. 
     */
  def updateApp(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates a branch for an Amplify App. 
     */
  def updateBranch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates a branch for an Amplify App. 
     */
  def updateBranch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates a branch for an Amplify App. 
     */
  def updateBranch(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Updates a branch for an Amplify App. 
     */
  def updateBranch(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateBranchResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def updateDomainAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def updateDomainAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def updateDomainAssociation(params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Create a new DomainAssociation on an App 
     */
  def updateDomainAssociation(
    params: awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAmplifyMod.AmplifyNs.UpdateDomainAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

