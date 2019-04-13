package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mobile
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Mobile: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    *  Creates an AWS Mobile Hub project. 
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates an AWS Mobile Hub project. 
    */
  def createProject(params: CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Delets a project in AWS Mobile Hub. 
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Delets a project in AWS Mobile Hub. 
    */
  def deleteProject(params: DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Get the bundle details for the requested bundle id. 
    */
  def describeBundle(): awsDashSdkLib.libRequestMod.Request[DescribeBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBundle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Get the bundle details for the requested bundle id. 
    */
  def describeBundle(params: DescribeBundleRequest): awsDashSdkLib.libRequestMod.Request[DescribeBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBundle(
    params: DescribeBundleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Gets details about a project in AWS Mobile Hub. 
    */
  def describeProject(): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Gets details about a project in AWS Mobile Hub. 
    */
  def describeProject(params: DescribeProjectRequest): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
    */
  def exportBundle(): awsDashSdkLib.libRequestMod.Request[ExportBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportBundle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
    */
  def exportBundle(params: ExportBundleRequest): awsDashSdkLib.libRequestMod.Request[ExportBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportBundle(
    params: ExportBundleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
    */
  def exportProject(): awsDashSdkLib.libRequestMod.Request[ExportProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
    */
  def exportProject(params: ExportProjectRequest): awsDashSdkLib.libRequestMod.Request[ExportProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exportProject(
    params: ExportProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExportProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExportProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List all available bundles. 
    */
  def listBundles(): awsDashSdkLib.libRequestMod.Request[ListBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  List all available bundles. 
    */
  def listBundles(params: ListBundlesRequest): awsDashSdkLib.libRequestMod.Request[ListBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBundles(
    params: ListBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists projects in AWS Mobile Hub. 
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Lists projects in AWS Mobile Hub. 
    */
  def listProjects(params: ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Update an existing project. 
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Update an existing project. 
    */
  def updateProject(params: UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

