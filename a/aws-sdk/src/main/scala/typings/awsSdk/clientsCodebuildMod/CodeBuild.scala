package typings.awsSdk.clientsCodebuildMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeBuild extends Service {
  
  /**
    * Deletes one or more builds.
    */
  def batchDeleteBuilds(): Request[BatchDeleteBuildsOutput, AWSError] = js.native
  def batchDeleteBuilds(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteBuildsOutput, Unit]): Request[BatchDeleteBuildsOutput, AWSError] = js.native
  /**
    * Deletes one or more builds.
    */
  def batchDeleteBuilds(params: BatchDeleteBuildsInput): Request[BatchDeleteBuildsOutput, AWSError] = js.native
  def batchDeleteBuilds(
    params: BatchDeleteBuildsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteBuildsOutput, Unit]
  ): Request[BatchDeleteBuildsOutput, AWSError] = js.native
  
  /**
    * Retrieves information about one or more batch builds.
    */
  def batchGetBuildBatches(): Request[BatchGetBuildBatchesOutput, AWSError] = js.native
  def batchGetBuildBatches(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetBuildBatchesOutput, Unit]): Request[BatchGetBuildBatchesOutput, AWSError] = js.native
  /**
    * Retrieves information about one or more batch builds.
    */
  def batchGetBuildBatches(params: BatchGetBuildBatchesInput): Request[BatchGetBuildBatchesOutput, AWSError] = js.native
  def batchGetBuildBatches(
    params: BatchGetBuildBatchesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetBuildBatchesOutput, Unit]
  ): Request[BatchGetBuildBatchesOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more builds.
    */
  def batchGetBuilds(): Request[BatchGetBuildsOutput, AWSError] = js.native
  def batchGetBuilds(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetBuildsOutput, Unit]): Request[BatchGetBuildsOutput, AWSError] = js.native
  /**
    * Gets information about one or more builds.
    */
  def batchGetBuilds(params: BatchGetBuildsInput): Request[BatchGetBuildsOutput, AWSError] = js.native
  def batchGetBuilds(
    params: BatchGetBuildsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetBuildsOutput, Unit]
  ): Request[BatchGetBuildsOutput, AWSError] = js.native
  
  /**
    * Gets information about one or more build projects.
    */
  def batchGetProjects(): Request[BatchGetProjectsOutput, AWSError] = js.native
  def batchGetProjects(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetProjectsOutput, Unit]): Request[BatchGetProjectsOutput, AWSError] = js.native
  /**
    * Gets information about one or more build projects.
    */
  def batchGetProjects(params: BatchGetProjectsInput): Request[BatchGetProjectsOutput, AWSError] = js.native
  def batchGetProjects(
    params: BatchGetProjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetProjectsOutput, Unit]
  ): Request[BatchGetProjectsOutput, AWSError] = js.native
  
  /**
    *  Returns an array of report groups. 
    */
  def batchGetReportGroups(): Request[BatchGetReportGroupsOutput, AWSError] = js.native
  def batchGetReportGroups(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetReportGroupsOutput, Unit]): Request[BatchGetReportGroupsOutput, AWSError] = js.native
  /**
    *  Returns an array of report groups. 
    */
  def batchGetReportGroups(params: BatchGetReportGroupsInput): Request[BatchGetReportGroupsOutput, AWSError] = js.native
  def batchGetReportGroups(
    params: BatchGetReportGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetReportGroupsOutput, Unit]
  ): Request[BatchGetReportGroupsOutput, AWSError] = js.native
  
  /**
    *  Returns an array of reports. 
    */
  def batchGetReports(): Request[BatchGetReportsOutput, AWSError] = js.native
  def batchGetReports(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetReportsOutput, Unit]): Request[BatchGetReportsOutput, AWSError] = js.native
  /**
    *  Returns an array of reports. 
    */
  def batchGetReports(params: BatchGetReportsInput): Request[BatchGetReportsOutput, AWSError] = js.native
  def batchGetReports(
    params: BatchGetReportsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetReportsOutput, Unit]
  ): Request[BatchGetReportsOutput, AWSError] = js.native
  
  @JSName("config")
  var config_CodeBuild: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a build project.
    */
  def createProject(): Request[CreateProjectOutput, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectOutput, Unit]): Request[CreateProjectOutput, AWSError] = js.native
  /**
    * Creates a build project.
    */
  def createProject(params: CreateProjectInput): Request[CreateProjectOutput, AWSError] = js.native
  def createProject(
    params: CreateProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectOutput, Unit]
  ): Request[CreateProjectOutput, AWSError] = js.native
  
  /**
    *  Creates a report group. A report group contains a collection of reports. 
    */
  def createReportGroup(): Request[CreateReportGroupOutput, AWSError] = js.native
  def createReportGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateReportGroupOutput, Unit]): Request[CreateReportGroupOutput, AWSError] = js.native
  /**
    *  Creates a report group. A report group contains a collection of reports. 
    */
  def createReportGroup(params: CreateReportGroupInput): Request[CreateReportGroupOutput, AWSError] = js.native
  def createReportGroup(
    params: CreateReportGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReportGroupOutput, Unit]
  ): Request[CreateReportGroupOutput, AWSError] = js.native
  
  /**
    * For an existing CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an CodeBuild project, and the project is used as a build step in CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using CodePipeline, we recommend that you disable webhooks in CodeBuild. In the CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(): Request[CreateWebhookOutput, AWSError] = js.native
  def createWebhook(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookOutput, Unit]): Request[CreateWebhookOutput, AWSError] = js.native
  /**
    * For an existing CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an CodeBuild project, and the project is used as a build step in CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using CodePipeline, we recommend that you disable webhooks in CodeBuild. In the CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(params: CreateWebhookInput): Request[CreateWebhookOutput, AWSError] = js.native
  def createWebhook(
    params: CreateWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookOutput, Unit]
  ): Request[CreateWebhookOutput, AWSError] = js.native
  
  /**
    * Deletes a batch build.
    */
  def deleteBuildBatch(): Request[DeleteBuildBatchOutput, AWSError] = js.native
  def deleteBuildBatch(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBuildBatchOutput, Unit]): Request[DeleteBuildBatchOutput, AWSError] = js.native
  /**
    * Deletes a batch build.
    */
  def deleteBuildBatch(params: DeleteBuildBatchInput): Request[DeleteBuildBatchOutput, AWSError] = js.native
  def deleteBuildBatch(
    params: DeleteBuildBatchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBuildBatchOutput, Unit]
  ): Request[DeleteBuildBatchOutput, AWSError] = js.native
  
  /**
    *  Deletes a build project. When you delete a project, its builds are not deleted. 
    */
  def deleteProject(): Request[DeleteProjectOutput, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectOutput, Unit]): Request[DeleteProjectOutput, AWSError] = js.native
  /**
    *  Deletes a build project. When you delete a project, its builds are not deleted. 
    */
  def deleteProject(params: DeleteProjectInput): Request[DeleteProjectOutput, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectOutput, Unit]
  ): Request[DeleteProjectOutput, AWSError] = js.native
  
  /**
    *  Deletes a report. 
    */
  def deleteReport(): Request[DeleteReportOutput, AWSError] = js.native
  def deleteReport(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportOutput, Unit]): Request[DeleteReportOutput, AWSError] = js.native
  /**
    *  Deletes a report. 
    */
  def deleteReport(params: DeleteReportInput): Request[DeleteReportOutput, AWSError] = js.native
  def deleteReport(
    params: DeleteReportInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportOutput, Unit]
  ): Request[DeleteReportOutput, AWSError] = js.native
  
  /**
    * Deletes a report group. Before you delete a report group, you must delete its reports. 
    */
  def deleteReportGroup(): Request[DeleteReportGroupOutput, AWSError] = js.native
  def deleteReportGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportGroupOutput, Unit]): Request[DeleteReportGroupOutput, AWSError] = js.native
  /**
    * Deletes a report group. Before you delete a report group, you must delete its reports. 
    */
  def deleteReportGroup(params: DeleteReportGroupInput): Request[DeleteReportGroupOutput, AWSError] = js.native
  def deleteReportGroup(
    params: DeleteReportGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportGroupOutput, Unit]
  ): Request[DeleteReportGroupOutput, AWSError] = js.native
  
  /**
    *  Deletes a resource policy that is identified by its resource ARN. 
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyOutput, Unit]): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  /**
    *  Deletes a resource policy that is identified by its resource ARN. 
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyInput): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyOutput, Unit]
  ): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  
  /**
    *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
    */
  def deleteSourceCredentials(): Request[DeleteSourceCredentialsOutput, AWSError] = js.native
  def deleteSourceCredentials(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceCredentialsOutput, Unit]): Request[DeleteSourceCredentialsOutput, AWSError] = js.native
  /**
    *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
    */
  def deleteSourceCredentials(params: DeleteSourceCredentialsInput): Request[DeleteSourceCredentialsOutput, AWSError] = js.native
  def deleteSourceCredentials(
    params: DeleteSourceCredentialsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceCredentialsOutput, Unit]
  ): Request[DeleteSourceCredentialsOutput, AWSError] = js.native
  
  /**
    * For an existing CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(): Request[DeleteWebhookOutput, AWSError] = js.native
  def deleteWebhook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookOutput, Unit]): Request[DeleteWebhookOutput, AWSError] = js.native
  /**
    * For an existing CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput, AWSError] = js.native
  def deleteWebhook(
    params: DeleteWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookOutput, Unit]
  ): Request[DeleteWebhookOutput, AWSError] = js.native
  
  /**
    * Retrieves one or more code coverage reports.
    */
  def describeCodeCoverages(): Request[DescribeCodeCoveragesOutput, AWSError] = js.native
  def describeCodeCoverages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeCoveragesOutput, Unit]): Request[DescribeCodeCoveragesOutput, AWSError] = js.native
  /**
    * Retrieves one or more code coverage reports.
    */
  def describeCodeCoverages(params: DescribeCodeCoveragesInput): Request[DescribeCodeCoveragesOutput, AWSError] = js.native
  def describeCodeCoverages(
    params: DescribeCodeCoveragesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeCoveragesOutput, Unit]
  ): Request[DescribeCodeCoveragesOutput, AWSError] = js.native
  
  /**
    *  Returns a list of details about test cases for a report. 
    */
  def describeTestCases(): Request[DescribeTestCasesOutput, AWSError] = js.native
  def describeTestCases(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTestCasesOutput, Unit]): Request[DescribeTestCasesOutput, AWSError] = js.native
  /**
    *  Returns a list of details about test cases for a report. 
    */
  def describeTestCases(params: DescribeTestCasesInput): Request[DescribeTestCasesOutput, AWSError] = js.native
  def describeTestCases(
    params: DescribeTestCasesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTestCasesOutput, Unit]
  ): Request[DescribeTestCasesOutput, AWSError] = js.native
  
  /**
    * Analyzes and accumulates test report values for the specified test reports.
    */
  def getReportGroupTrend(): Request[GetReportGroupTrendOutput, AWSError] = js.native
  def getReportGroupTrend(callback: js.Function2[/* err */ AWSError, /* data */ GetReportGroupTrendOutput, Unit]): Request[GetReportGroupTrendOutput, AWSError] = js.native
  /**
    * Analyzes and accumulates test report values for the specified test reports.
    */
  def getReportGroupTrend(params: GetReportGroupTrendInput): Request[GetReportGroupTrendOutput, AWSError] = js.native
  def getReportGroupTrend(
    params: GetReportGroupTrendInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReportGroupTrendOutput, Unit]
  ): Request[GetReportGroupTrendOutput, AWSError] = js.native
  
  /**
    *  Gets a resource policy that is identified by its resource ARN. 
    */
  def getResourcePolicy(): Request[GetResourcePolicyOutput, AWSError] = js.native
  def getResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyOutput, Unit]): Request[GetResourcePolicyOutput, AWSError] = js.native
  /**
    *  Gets a resource policy that is identified by its resource ARN. 
    */
  def getResourcePolicy(params: GetResourcePolicyInput): Request[GetResourcePolicyOutput, AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePolicyOutput, Unit]
  ): Request[GetResourcePolicyOutput, AWSError] = js.native
  
  /**
    *  Imports the source repository credentials for an CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(): Request[ImportSourceCredentialsOutput, AWSError] = js.native
  def importSourceCredentials(callback: js.Function2[/* err */ AWSError, /* data */ ImportSourceCredentialsOutput, Unit]): Request[ImportSourceCredentialsOutput, AWSError] = js.native
  /**
    *  Imports the source repository credentials for an CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(params: ImportSourceCredentialsInput): Request[ImportSourceCredentialsOutput, AWSError] = js.native
  def importSourceCredentials(
    params: ImportSourceCredentialsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportSourceCredentialsOutput, Unit]
  ): Request[ImportSourceCredentialsOutput, AWSError] = js.native
  
  /**
    * Resets the cache for a project.
    */
  def invalidateProjectCache(): Request[InvalidateProjectCacheOutput, AWSError] = js.native
  def invalidateProjectCache(callback: js.Function2[/* err */ AWSError, /* data */ InvalidateProjectCacheOutput, Unit]): Request[InvalidateProjectCacheOutput, AWSError] = js.native
  /**
    * Resets the cache for a project.
    */
  def invalidateProjectCache(params: InvalidateProjectCacheInput): Request[InvalidateProjectCacheOutput, AWSError] = js.native
  def invalidateProjectCache(
    params: InvalidateProjectCacheInput,
    callback: js.Function2[/* err */ AWSError, /* data */ InvalidateProjectCacheOutput, Unit]
  ): Request[InvalidateProjectCacheOutput, AWSError] = js.native
  
  /**
    * Retrieves the identifiers of your build batches in the current region.
    */
  def listBuildBatches(): Request[ListBuildBatchesOutput, AWSError] = js.native
  def listBuildBatches(callback: js.Function2[/* err */ AWSError, /* data */ ListBuildBatchesOutput, Unit]): Request[ListBuildBatchesOutput, AWSError] = js.native
  /**
    * Retrieves the identifiers of your build batches in the current region.
    */
  def listBuildBatches(params: ListBuildBatchesInput): Request[ListBuildBatchesOutput, AWSError] = js.native
  def listBuildBatches(
    params: ListBuildBatchesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuildBatchesOutput, Unit]
  ): Request[ListBuildBatchesOutput, AWSError] = js.native
  
  /**
    * Retrieves the identifiers of the build batches for a specific project.
    */
  def listBuildBatchesForProject(): Request[ListBuildBatchesForProjectOutput, AWSError] = js.native
  def listBuildBatchesForProject(callback: js.Function2[/* err */ AWSError, /* data */ ListBuildBatchesForProjectOutput, Unit]): Request[ListBuildBatchesForProjectOutput, AWSError] = js.native
  /**
    * Retrieves the identifiers of the build batches for a specific project.
    */
  def listBuildBatchesForProject(params: ListBuildBatchesForProjectInput): Request[ListBuildBatchesForProjectOutput, AWSError] = js.native
  def listBuildBatchesForProject(
    params: ListBuildBatchesForProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuildBatchesForProjectOutput, Unit]
  ): Request[ListBuildBatchesForProjectOutput, AWSError] = js.native
  
  /**
    * Gets a list of build IDs, with each build ID representing a single build.
    */
  def listBuilds(): Request[ListBuildsOutput, AWSError] = js.native
  def listBuilds(callback: js.Function2[/* err */ AWSError, /* data */ ListBuildsOutput, Unit]): Request[ListBuildsOutput, AWSError] = js.native
  /**
    * Gets a list of build IDs, with each build ID representing a single build.
    */
  def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput, AWSError] = js.native
  def listBuilds(
    params: ListBuildsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuildsOutput, Unit]
  ): Request[ListBuildsOutput, AWSError] = js.native
  
  /**
    * Gets a list of build identifiers for the specified build project, with each build identifier representing a single build.
    */
  def listBuildsForProject(): Request[ListBuildsForProjectOutput, AWSError] = js.native
  def listBuildsForProject(callback: js.Function2[/* err */ AWSError, /* data */ ListBuildsForProjectOutput, Unit]): Request[ListBuildsForProjectOutput, AWSError] = js.native
  /**
    * Gets a list of build identifiers for the specified build project, with each build identifier representing a single build.
    */
  def listBuildsForProject(params: ListBuildsForProjectInput): Request[ListBuildsForProjectOutput, AWSError] = js.native
  def listBuildsForProject(
    params: ListBuildsForProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuildsForProjectOutput, Unit]
  ): Request[ListBuildsForProjectOutput, AWSError] = js.native
  
  /**
    * Gets information about Docker images that are managed by CodeBuild.
    */
  def listCuratedEnvironmentImages(): Request[ListCuratedEnvironmentImagesOutput, AWSError] = js.native
  def listCuratedEnvironmentImages(callback: js.Function2[/* err */ AWSError, /* data */ ListCuratedEnvironmentImagesOutput, Unit]): Request[ListCuratedEnvironmentImagesOutput, AWSError] = js.native
  /**
    * Gets information about Docker images that are managed by CodeBuild.
    */
  def listCuratedEnvironmentImages(params: ListCuratedEnvironmentImagesInput): Request[ListCuratedEnvironmentImagesOutput, AWSError] = js.native
  def listCuratedEnvironmentImages(
    params: ListCuratedEnvironmentImagesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCuratedEnvironmentImagesOutput, Unit]
  ): Request[ListCuratedEnvironmentImagesOutput, AWSError] = js.native
  
  /**
    * Gets a list of build project names, with each build project name representing a single build project.
    */
  def listProjects(): Request[ListProjectsOutput, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsOutput, Unit]): Request[ListProjectsOutput, AWSError] = js.native
  /**
    * Gets a list of build project names, with each build project name representing a single build project.
    */
  def listProjects(params: ListProjectsInput): Request[ListProjectsOutput, AWSError] = js.native
  def listProjects(
    params: ListProjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsOutput, Unit]
  ): Request[ListProjectsOutput, AWSError] = js.native
  
  /**
    *  Gets a list ARNs for the report groups in the current Amazon Web Services account. 
    */
  def listReportGroups(): Request[ListReportGroupsOutput, AWSError] = js.native
  def listReportGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListReportGroupsOutput, Unit]): Request[ListReportGroupsOutput, AWSError] = js.native
  /**
    *  Gets a list ARNs for the report groups in the current Amazon Web Services account. 
    */
  def listReportGroups(params: ListReportGroupsInput): Request[ListReportGroupsOutput, AWSError] = js.native
  def listReportGroups(
    params: ListReportGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReportGroupsOutput, Unit]
  ): Request[ListReportGroupsOutput, AWSError] = js.native
  
  /**
    *  Returns a list of ARNs for the reports in the current Amazon Web Services account. 
    */
  def listReports(): Request[ListReportsOutput, AWSError] = js.native
  def listReports(callback: js.Function2[/* err */ AWSError, /* data */ ListReportsOutput, Unit]): Request[ListReportsOutput, AWSError] = js.native
  /**
    *  Returns a list of ARNs for the reports in the current Amazon Web Services account. 
    */
  def listReports(params: ListReportsInput): Request[ListReportsOutput, AWSError] = js.native
  def listReports(
    params: ListReportsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReportsOutput, Unit]
  ): Request[ListReportsOutput, AWSError] = js.native
  
  /**
    *  Returns a list of ARNs for the reports that belong to a ReportGroup. 
    */
  def listReportsForReportGroup(): Request[ListReportsForReportGroupOutput, AWSError] = js.native
  def listReportsForReportGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListReportsForReportGroupOutput, Unit]): Request[ListReportsForReportGroupOutput, AWSError] = js.native
  /**
    *  Returns a list of ARNs for the reports that belong to a ReportGroup. 
    */
  def listReportsForReportGroup(params: ListReportsForReportGroupInput): Request[ListReportsForReportGroupOutput, AWSError] = js.native
  def listReportsForReportGroup(
    params: ListReportsForReportGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReportsForReportGroupOutput, Unit]
  ): Request[ListReportsForReportGroupOutput, AWSError] = js.native
  
  /**
    *  Gets a list of projects that are shared with other Amazon Web Services accounts or users. 
    */
  def listSharedProjects(): Request[ListSharedProjectsOutput, AWSError] = js.native
  def listSharedProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListSharedProjectsOutput, Unit]): Request[ListSharedProjectsOutput, AWSError] = js.native
  /**
    *  Gets a list of projects that are shared with other Amazon Web Services accounts or users. 
    */
  def listSharedProjects(params: ListSharedProjectsInput): Request[ListSharedProjectsOutput, AWSError] = js.native
  def listSharedProjects(
    params: ListSharedProjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSharedProjectsOutput, Unit]
  ): Request[ListSharedProjectsOutput, AWSError] = js.native
  
  /**
    *  Gets a list of report groups that are shared with other Amazon Web Services accounts or users. 
    */
  def listSharedReportGroups(): Request[ListSharedReportGroupsOutput, AWSError] = js.native
  def listSharedReportGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListSharedReportGroupsOutput, Unit]): Request[ListSharedReportGroupsOutput, AWSError] = js.native
  /**
    *  Gets a list of report groups that are shared with other Amazon Web Services accounts or users. 
    */
  def listSharedReportGroups(params: ListSharedReportGroupsInput): Request[ListSharedReportGroupsOutput, AWSError] = js.native
  def listSharedReportGroups(
    params: ListSharedReportGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSharedReportGroupsOutput, Unit]
  ): Request[ListSharedReportGroupsOutput, AWSError] = js.native
  
  /**
    *  Returns a list of SourceCredentialsInfo objects. 
    */
  def listSourceCredentials(): Request[ListSourceCredentialsOutput, AWSError] = js.native
  def listSourceCredentials(callback: js.Function2[/* err */ AWSError, /* data */ ListSourceCredentialsOutput, Unit]): Request[ListSourceCredentialsOutput, AWSError] = js.native
  /**
    *  Returns a list of SourceCredentialsInfo objects. 
    */
  def listSourceCredentials(params: ListSourceCredentialsInput): Request[ListSourceCredentialsOutput, AWSError] = js.native
  def listSourceCredentials(
    params: ListSourceCredentialsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSourceCredentialsOutput, Unit]
  ): Request[ListSourceCredentialsOutput, AWSError] = js.native
  
  /**
    *  Stores a resource policy for the ARN of a Project or ReportGroup object. 
    */
  def putResourcePolicy(): Request[PutResourcePolicyOutput, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyOutput, Unit]): Request[PutResourcePolicyOutput, AWSError] = js.native
  /**
    *  Stores a resource policy for the ARN of a Project or ReportGroup object. 
    */
  def putResourcePolicy(params: PutResourcePolicyInput): Request[PutResourcePolicyOutput, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyOutput, Unit]
  ): Request[PutResourcePolicyOutput, AWSError] = js.native
  
  /**
    * Restarts a build.
    */
  def retryBuild(): Request[RetryBuildOutput, AWSError] = js.native
  def retryBuild(callback: js.Function2[/* err */ AWSError, /* data */ RetryBuildOutput, Unit]): Request[RetryBuildOutput, AWSError] = js.native
  /**
    * Restarts a build.
    */
  def retryBuild(params: RetryBuildInput): Request[RetryBuildOutput, AWSError] = js.native
  def retryBuild(
    params: RetryBuildInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RetryBuildOutput, Unit]
  ): Request[RetryBuildOutput, AWSError] = js.native
  
  /**
    * Restarts a failed batch build. Only batch builds that have failed can be retried.
    */
  def retryBuildBatch(): Request[RetryBuildBatchOutput, AWSError] = js.native
  def retryBuildBatch(callback: js.Function2[/* err */ AWSError, /* data */ RetryBuildBatchOutput, Unit]): Request[RetryBuildBatchOutput, AWSError] = js.native
  /**
    * Restarts a failed batch build. Only batch builds that have failed can be retried.
    */
  def retryBuildBatch(params: RetryBuildBatchInput): Request[RetryBuildBatchOutput, AWSError] = js.native
  def retryBuildBatch(
    params: RetryBuildBatchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RetryBuildBatchOutput, Unit]
  ): Request[RetryBuildBatchOutput, AWSError] = js.native
  
  /**
    * Starts running a build.
    */
  def startBuild(): Request[StartBuildOutput, AWSError] = js.native
  def startBuild(callback: js.Function2[/* err */ AWSError, /* data */ StartBuildOutput, Unit]): Request[StartBuildOutput, AWSError] = js.native
  /**
    * Starts running a build.
    */
  def startBuild(params: StartBuildInput): Request[StartBuildOutput, AWSError] = js.native
  def startBuild(
    params: StartBuildInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBuildOutput, Unit]
  ): Request[StartBuildOutput, AWSError] = js.native
  
  /**
    * Starts a batch build for a project.
    */
  def startBuildBatch(): Request[StartBuildBatchOutput, AWSError] = js.native
  def startBuildBatch(callback: js.Function2[/* err */ AWSError, /* data */ StartBuildBatchOutput, Unit]): Request[StartBuildBatchOutput, AWSError] = js.native
  /**
    * Starts a batch build for a project.
    */
  def startBuildBatch(params: StartBuildBatchInput): Request[StartBuildBatchOutput, AWSError] = js.native
  def startBuildBatch(
    params: StartBuildBatchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBuildBatchOutput, Unit]
  ): Request[StartBuildBatchOutput, AWSError] = js.native
  
  /**
    * Attempts to stop running a build.
    */
  def stopBuild(): Request[StopBuildOutput, AWSError] = js.native
  def stopBuild(callback: js.Function2[/* err */ AWSError, /* data */ StopBuildOutput, Unit]): Request[StopBuildOutput, AWSError] = js.native
  /**
    * Attempts to stop running a build.
    */
  def stopBuild(params: StopBuildInput): Request[StopBuildOutput, AWSError] = js.native
  def stopBuild(
    params: StopBuildInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopBuildOutput, Unit]
  ): Request[StopBuildOutput, AWSError] = js.native
  
  /**
    * Stops a running batch build.
    */
  def stopBuildBatch(): Request[StopBuildBatchOutput, AWSError] = js.native
  def stopBuildBatch(callback: js.Function2[/* err */ AWSError, /* data */ StopBuildBatchOutput, Unit]): Request[StopBuildBatchOutput, AWSError] = js.native
  /**
    * Stops a running batch build.
    */
  def stopBuildBatch(params: StopBuildBatchInput): Request[StopBuildBatchOutput, AWSError] = js.native
  def stopBuildBatch(
    params: StopBuildBatchInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopBuildBatchOutput, Unit]
  ): Request[StopBuildBatchOutput, AWSError] = js.native
  
  /**
    * Changes the settings of a build project.
    */
  def updateProject(): Request[UpdateProjectOutput, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectOutput, Unit]): Request[UpdateProjectOutput, AWSError] = js.native
  /**
    * Changes the settings of a build project.
    */
  def updateProject(params: UpdateProjectInput): Request[UpdateProjectOutput, AWSError] = js.native
  def updateProject(
    params: UpdateProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectOutput, Unit]
  ): Request[UpdateProjectOutput, AWSError] = js.native
  
  /**
    * Changes the public visibility for a project. The project's build results, logs, and artifacts are available to the general public. For more information, see Public build projects in the CodeBuild User Guide.  The following should be kept in mind when making your projects public:   All of a project's build results, logs, and artifacts, including builds that were run when the project was private, are available to the general public.   All build logs and artifacts are available to the public. Environment variables, source code, and other sensitive information may have been output to the build logs and artifacts. You must be careful about what information is output to the build logs. Some best practice are:   Do not store sensitive values, especially Amazon Web Services access key IDs and secret access keys, in environment variables. We recommend that you use an Amazon EC2 Systems Manager Parameter Store or Secrets Manager to store sensitive values.   Follow Best practices for using webhooks in the CodeBuild User Guide to limit which entities can trigger a build, and do not store the buildspec in the project itself, to ensure that your webhooks are as secure as possible.     A malicious user can use public builds to distribute malicious artifacts. We recommend that you review all pull requests to verify that the pull request is a legitimate change. We also recommend that you validate any artifacts with their checksums to make sure that the correct artifacts are being downloaded.   
    */
  def updateProjectVisibility(): Request[UpdateProjectVisibilityOutput, AWSError] = js.native
  def updateProjectVisibility(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectVisibilityOutput, Unit]): Request[UpdateProjectVisibilityOutput, AWSError] = js.native
  /**
    * Changes the public visibility for a project. The project's build results, logs, and artifacts are available to the general public. For more information, see Public build projects in the CodeBuild User Guide.  The following should be kept in mind when making your projects public:   All of a project's build results, logs, and artifacts, including builds that were run when the project was private, are available to the general public.   All build logs and artifacts are available to the public. Environment variables, source code, and other sensitive information may have been output to the build logs and artifacts. You must be careful about what information is output to the build logs. Some best practice are:   Do not store sensitive values, especially Amazon Web Services access key IDs and secret access keys, in environment variables. We recommend that you use an Amazon EC2 Systems Manager Parameter Store or Secrets Manager to store sensitive values.   Follow Best practices for using webhooks in the CodeBuild User Guide to limit which entities can trigger a build, and do not store the buildspec in the project itself, to ensure that your webhooks are as secure as possible.     A malicious user can use public builds to distribute malicious artifacts. We recommend that you review all pull requests to verify that the pull request is a legitimate change. We also recommend that you validate any artifacts with their checksums to make sure that the correct artifacts are being downloaded.   
    */
  def updateProjectVisibility(params: UpdateProjectVisibilityInput): Request[UpdateProjectVisibilityOutput, AWSError] = js.native
  def updateProjectVisibility(
    params: UpdateProjectVisibilityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectVisibilityOutput, Unit]
  ): Request[UpdateProjectVisibilityOutput, AWSError] = js.native
  
  /**
    *  Updates a report group. 
    */
  def updateReportGroup(): Request[UpdateReportGroupOutput, AWSError] = js.native
  def updateReportGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReportGroupOutput, Unit]): Request[UpdateReportGroupOutput, AWSError] = js.native
  /**
    *  Updates a report group. 
    */
  def updateReportGroup(params: UpdateReportGroupInput): Request[UpdateReportGroupOutput, AWSError] = js.native
  def updateReportGroup(
    params: UpdateReportGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReportGroupOutput, Unit]
  ): Request[UpdateReportGroupOutput, AWSError] = js.native
  
  /**
    *  Updates the webhook associated with an CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(): Request[UpdateWebhookOutput, AWSError] = js.native
  def updateWebhook(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookOutput, Unit]): Request[UpdateWebhookOutput, AWSError] = js.native
  /**
    *  Updates the webhook associated with an CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(params: UpdateWebhookInput): Request[UpdateWebhookOutput, AWSError] = js.native
  def updateWebhook(
    params: UpdateWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookOutput, Unit]
  ): Request[UpdateWebhookOutput, AWSError] = js.native
}
