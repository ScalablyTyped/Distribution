package typings.awsDashSdk.clientsCodebuildMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeBuild extends Service {
  @JSName("config")
  var config_CodeBuild: ConfigBase with ClientConfiguration = js.native
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
    * Gets information about builds.
    */
  def batchGetBuilds(): Request[BatchGetBuildsOutput, AWSError] = js.native
  def batchGetBuilds(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetBuildsOutput, Unit]): Request[BatchGetBuildsOutput, AWSError] = js.native
  /**
    * Gets information about builds.
    */
  def batchGetBuilds(params: BatchGetBuildsInput): Request[BatchGetBuildsOutput, AWSError] = js.native
  def batchGetBuilds(
    params: BatchGetBuildsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetBuildsOutput, Unit]
  ): Request[BatchGetBuildsOutput, AWSError] = js.native
  /**
    * Gets information about build projects.
    */
  def batchGetProjects(): Request[BatchGetProjectsOutput, AWSError] = js.native
  def batchGetProjects(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetProjectsOutput, Unit]): Request[BatchGetProjectsOutput, AWSError] = js.native
  /**
    * Gets information about build projects.
    */
  def batchGetProjects(params: BatchGetProjectsInput): Request[BatchGetProjectsOutput, AWSError] = js.native
  def batchGetProjects(
    params: BatchGetProjectsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetProjectsOutput, Unit]
  ): Request[BatchGetProjectsOutput, AWSError] = js.native
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
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(): Request[CreateWebhookOutput, AWSError] = js.native
  def createWebhook(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookOutput, Unit]): Request[CreateWebhookOutput, AWSError] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(params: CreateWebhookInput): Request[CreateWebhookOutput, AWSError] = js.native
  def createWebhook(
    params: CreateWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookOutput, Unit]
  ): Request[CreateWebhookOutput, AWSError] = js.native
  /**
    * Deletes a build project.
    */
  def deleteProject(): Request[DeleteProjectOutput, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectOutput, Unit]): Request[DeleteProjectOutput, AWSError] = js.native
  /**
    * Deletes a build project.
    */
  def deleteProject(params: DeleteProjectInput): Request[DeleteProjectOutput, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectOutput, Unit]
  ): Request[DeleteProjectOutput, AWSError] = js.native
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
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(): Request[DeleteWebhookOutput, AWSError] = js.native
  def deleteWebhook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookOutput, Unit]): Request[DeleteWebhookOutput, AWSError] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput, AWSError] = js.native
  def deleteWebhook(
    params: DeleteWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookOutput, Unit]
  ): Request[DeleteWebhookOutput, AWSError] = js.native
  /**
    *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(): Request[ImportSourceCredentialsOutput, AWSError] = js.native
  def importSourceCredentials(callback: js.Function2[/* err */ AWSError, /* data */ ImportSourceCredentialsOutput, Unit]): Request[ImportSourceCredentialsOutput, AWSError] = js.native
  /**
    *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
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
    * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
    */
  def listBuildsForProject(): Request[ListBuildsForProjectOutput, AWSError] = js.native
  def listBuildsForProject(callback: js.Function2[/* err */ AWSError, /* data */ ListBuildsForProjectOutput, Unit]): Request[ListBuildsForProjectOutput, AWSError] = js.native
  /**
    * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
    */
  def listBuildsForProject(params: ListBuildsForProjectInput): Request[ListBuildsForProjectOutput, AWSError] = js.native
  def listBuildsForProject(
    params: ListBuildsForProjectInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuildsForProjectOutput, Unit]
  ): Request[ListBuildsForProjectOutput, AWSError] = js.native
  /**
    * Gets information about Docker images that are managed by AWS CodeBuild.
    */
  def listCuratedEnvironmentImages(): Request[ListCuratedEnvironmentImagesOutput, AWSError] = js.native
  def listCuratedEnvironmentImages(callback: js.Function2[/* err */ AWSError, /* data */ ListCuratedEnvironmentImagesOutput, Unit]): Request[ListCuratedEnvironmentImagesOutput, AWSError] = js.native
  /**
    * Gets information about Docker images that are managed by AWS CodeBuild.
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
    *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(): Request[UpdateWebhookOutput, AWSError] = js.native
  def updateWebhook(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookOutput, Unit]): Request[UpdateWebhookOutput, AWSError] = js.native
  /**
    *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(params: UpdateWebhookInput): Request[UpdateWebhookOutput, AWSError] = js.native
  def updateWebhook(
    params: UpdateWebhookInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookOutput, Unit]
  ): Request[UpdateWebhookOutput, AWSError] = js.native
}

