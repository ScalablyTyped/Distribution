package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mobile
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Mobile: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMobileMod.MobileNs.ClientConfiguration = js.native
  /**
    *  Creates an AWS Mobile Hub project. 
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Creates an AWS Mobile Hub project. 
    */
  def createProject(params: awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProject(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Delets a project in AWS Mobile Hub. 
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Delets a project in AWS Mobile Hub. 
    */
  def deleteProject(params: awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProject(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Get the bundle details for the requested bundle id. 
    */
  def describeBundle(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBundle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Get the bundle details for the requested bundle id. 
    */
  def describeBundle(params: awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBundle(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Gets details about a project in AWS Mobile Hub. 
    */
  def describeProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Gets details about a project in AWS Mobile Hub. 
    */
  def describeProject(params: awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProject(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.DescribeProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
    */
  def exportBundle(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportBundle(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
    */
  def exportBundle(params: awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportBundle(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportBundleResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
    */
  def exportProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
    */
  def exportProject(params: awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def exportProject(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ExportProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  List all available bundles. 
    */
  def listBundles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBundles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  List all available bundles. 
    */
  def listBundles(params: awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBundles(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListBundlesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Lists projects in AWS Mobile Hub. 
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Lists projects in AWS Mobile Hub. 
    */
  def listProjects(params: awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProjects(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Update an existing project. 
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Update an existing project. 
    */
  def updateProject(params: awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateProject(
    params: awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMobileMod.MobileNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

