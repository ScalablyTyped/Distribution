package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mobile", "Mobile")
@js.native
object MobileNs extends js.Object {
  
  trait Attributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  
  trait BundleDetails extends js.Object {
    var availablePlatforms: js.UndefOr[Platforms] = js.undefined
    var bundleId: js.UndefOr[BundleId] = js.undefined
    var description: js.UndefOr[BundleDescription] = js.undefined
    var iconUrl: js.UndefOr[IconUrl] = js.undefined
    var title: js.UndefOr[BundleTitle] = js.undefined
    var version: js.UndefOr[BundleVersion] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateProjectRequest extends js.Object {
    /**
         *  ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the contents of the file downloaded from the URL provided in an export project operation. 
         */
    var contents: js.UndefOr[Contents] = js.undefined
    /**
         *  Name of the project. 
         */
    var name: js.UndefOr[ProjectName] = js.undefined
    /**
         *  Default region where project resources should be created. 
         */
    var region: js.UndefOr[ProjectRegion] = js.undefined
    /**
         *  Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the share URL when a project is exported. 
         */
    var snapshotId: js.UndefOr[SnapshotId] = js.undefined
  }
  
  
  trait CreateProjectResult extends js.Object {
    /**
         *  Detailed information about the created AWS Mobile Hub project. 
         */
    var details: js.UndefOr[ProjectDetails] = js.undefined
  }
  
  
  trait DeleteProjectRequest extends js.Object {
    /**
         *  Unique project identifier. 
         */
    var projectId: ProjectId
  }
  
  
  trait DeleteProjectResult extends js.Object {
    /**
         *  Resources which were deleted. 
         */
    var deletedResources: js.UndefOr[Resources] = js.undefined
    /**
         *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
         */
    var orphanedResources: js.UndefOr[Resources] = js.undefined
  }
  
  
  trait DescribeBundleRequest extends js.Object {
    /**
         *  Unique bundle identifier. 
         */
    var bundleId: BundleId
  }
  
  
  trait DescribeBundleResult extends js.Object {
    /**
         *  The details of the bundle. 
         */
    var details: js.UndefOr[BundleDetails] = js.undefined
  }
  
  
  trait DescribeProjectRequest extends js.Object {
    /**
         *  Unique project identifier. 
         */
    var projectId: ProjectId
    /**
         *  If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS CloudFormation stacks in the AWS Mobile Hub project. 
         */
    var syncFromResources: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait DescribeProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails] = js.undefined
  }
  
  
  trait ExportBundleRequest extends js.Object {
    /**
         *  Unique bundle identifier. 
         */
    var bundleId: BundleId
    /**
         *  Developer desktop or target application platform. 
         */
    var platform: js.UndefOr[Platform] = js.undefined
    /**
         *  Unique project identifier. 
         */
    var projectId: js.UndefOr[ProjectId] = js.undefined
  }
  
  
  trait ExportBundleResult extends js.Object {
    /**
         *  URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app with the AWS resources created by the AWS Mobile Hub project. 
         */
    var downloadUrl: js.UndefOr[DownloadUrl] = js.undefined
  }
  
  
  trait ExportProjectRequest extends js.Object {
    /**
         *  Unique project identifier. 
         */
    var projectId: ProjectId
  }
  
  
  trait ExportProjectResult extends js.Object {
    /**
         *  URL which can be used to download the exported project configuation file(s). 
         */
    var downloadUrl: js.UndefOr[DownloadUrl] = js.undefined
    /**
         *  URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that is created when this API is called. If you want to share additional changes to your project configuration, then you will need to create and share a new snapshot by calling this method again. 
         */
    var shareUrl: js.UndefOr[ShareUrl] = js.undefined
    /**
         *  Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in the share URL. 
         */
    var snapshotId: js.UndefOr[SnapshotId] = js.undefined
  }
  
  
  trait ListBundlesRequest extends js.Object {
    /**
         *  Maximum number of records to list in a single response. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  Pagination token. Set to null to start listing bundles from start. If non-null pagination token is returned in a result, then pass its value in here in another request to list more bundles. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListBundlesResult extends js.Object {
    /**
         *  A list of bundles. 
         */
    var bundleList: js.UndefOr[BundleList] = js.undefined
    /**
         *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListProjectsRequest extends js.Object {
    /**
         *  Maximum number of records to list in a single response. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  Pagination token. Set to null to start listing projects from start. If non-null pagination token is returned in a result, then pass its value in here in another request to list more projects. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListProjectsResult extends js.Object {
    var nextToken: js.UndefOr[NextToken] = js.undefined
    var projects: js.UndefOr[ProjectSummaries] = js.undefined
  }
  
  
  trait ProjectDetails extends js.Object {
    /**
         *  Website URL for this project in the AWS Mobile Hub console. 
         */
    var consoleUrl: js.UndefOr[ConsoleUrl] = js.undefined
    /**
         *  Date the project was created. 
         */
    var createdDate: js.UndefOr[_Date] = js.undefined
    /**
         *  Date of the last modification of the project. 
         */
    var lastUpdatedDate: js.UndefOr[_Date] = js.undefined
    var name: js.UndefOr[ProjectName] = js.undefined
    var projectId: js.UndefOr[ProjectId] = js.undefined
    var region: js.UndefOr[ProjectRegion] = js.undefined
    var resources: js.UndefOr[Resources] = js.undefined
    var state: js.UndefOr[ProjectState] = js.undefined
  }
  
  
  trait ProjectSummary extends js.Object {
    /**
         *  Name of the project. 
         */
    var name: js.UndefOr[ProjectName] = js.undefined
    /**
         *  Unique project identifier. 
         */
    var projectId: js.UndefOr[ProjectId] = js.undefined
  }
  
  
  trait Resource extends js.Object {
    var arn: js.UndefOr[ResourceArn] = js.undefined
    var attributes: js.UndefOr[Attributes] = js.undefined
    var feature: js.UndefOr[Feature] = js.undefined
    var name: js.UndefOr[ResourceName] = js.undefined
    var `type`: js.UndefOr[ResourceType] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       *  Creates an AWS Mobile Hub project. 
       */
    def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates an AWS Mobile Hub project. 
       */
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
    /**
       *  Creates an AWS Mobile Hub project. 
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
       *  Delets a project in AWS Mobile Hub. 
       */
    def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delets a project in AWS Mobile Hub. 
       */
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
    /**
       *  Delets a project in AWS Mobile Hub. 
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
       *  Get the bundle details for the requested bundle id. 
       */
    def describeBundle(): awsDashSdkLib.libRequestMod.Request[DescribeBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Get the bundle details for the requested bundle id. 
       */
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
    /**
       *  Get the bundle details for the requested bundle id. 
       */
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
    /**
       *  Gets details about a project in AWS Mobile Hub. 
       */
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
    /**
       *  Gets details about a project in AWS Mobile Hub. 
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
       *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
       */
    def exportBundle(): awsDashSdkLib.libRequestMod.Request[ExportBundleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
       */
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
    /**
       *  Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile app clients with backend AWS resources. 
       */
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
    /**
       *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
       */
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
    /**
       *  Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS account. 
       */
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
    /**
       *  List all available bundles. 
       */
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
    /**
       *  List all available bundles. 
       */
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
    /**
       *  Lists projects in AWS Mobile Hub. 
       */
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
    /**
       *  Lists projects in AWS Mobile Hub. 
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
       *  Update an existing project. 
       */
    def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Update an existing project. 
       */
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
    /**
       *  Update an existing project. 
       */
    def updateProject(
      params: UpdateProjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProjectResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateProjectRequest extends js.Object {
    /**
         *  ZIP or YAML file which contains project configuration to be updated. This should be the contents of the file downloaded from the URL provided in an export project operation. 
         */
    var contents: js.UndefOr[Contents] = js.undefined
    /**
         *  Unique project identifier. 
         */
    var projectId: ProjectId
  }
  
  
  trait UpdateProjectResult extends js.Object {
    /**
         *  Detailed information about the updated AWS Mobile Hub project. 
         */
    var details: js.UndefOr[ProjectDetails] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AttributeKey = java.lang.String
  type AttributeValue = java.lang.String
  type Boolean = scala.Boolean
  type BundleDescription = java.lang.String
  type BundleId = java.lang.String
  type BundleList = js.Array[BundleDetails]
  type BundleTitle = java.lang.String
  type BundleVersion = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsoleUrl = java.lang.String
  type Contents = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsMobileMod.Blob | java.lang.String
  type DownloadUrl = java.lang.String
  type Feature = java.lang.String
  type IconUrl = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Platform = awsDashSdkLib.awsDashSdkLibStrings.OSX | awsDashSdkLib.awsDashSdkLibStrings.WINDOWS | awsDashSdkLib.awsDashSdkLibStrings.LINUX | awsDashSdkLib.awsDashSdkLibStrings.OBJC | awsDashSdkLib.awsDashSdkLibStrings.SWIFT | awsDashSdkLib.awsDashSdkLibStrings.ANDROID | awsDashSdkLib.awsDashSdkLibStrings.JAVASCRIPT | java.lang.String
  type Platforms = js.Array[Platform]
  type ProjectId = java.lang.String
  type ProjectName = java.lang.String
  type ProjectRegion = java.lang.String
  type ProjectState = awsDashSdkLib.awsDashSdkLibStrings.NORMAL | awsDashSdkLib.awsDashSdkLibStrings.SYNCING | awsDashSdkLib.awsDashSdkLibStrings.IMPORTING | java.lang.String
  type ProjectSummaries = js.Array[ProjectSummary]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceType = java.lang.String
  type Resources = js.Array[Resource]
  type ShareUrl = java.lang.String
  type SnapshotId = java.lang.String
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

