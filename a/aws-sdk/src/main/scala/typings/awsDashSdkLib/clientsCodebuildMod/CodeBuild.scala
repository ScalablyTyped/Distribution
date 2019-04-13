package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeBuild
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeBuild: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes one or more builds.
    */
  def batchDeleteBuilds(): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes one or more builds.
    */
  def batchDeleteBuilds(params: BatchDeleteBuildsInput): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteBuilds(
    params: BatchDeleteBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about builds.
    */
  def batchGetBuilds(): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about builds.
    */
  def batchGetBuilds(params: BatchGetBuildsInput): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetBuilds(
    params: BatchGetBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about build projects.
    */
  def batchGetProjects(): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about build projects.
    */
  def batchGetProjects(params: BatchGetProjectsInput): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetProjects(
    params: BatchGetProjectsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a build project.
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a build project.
    */
  def createProject(params: CreateProjectInput): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    params: CreateProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(params: CreateWebhookInput): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWebhook(
    params: CreateWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a build project.
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a build project.
    */
  def deleteProject(params: DeleteProjectInput): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    params: DeleteProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
    */
  def deleteSourceCredentials(): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSourceCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
    */
  def deleteSourceCredentials(params: DeleteSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSourceCredentials(
    params: DeleteSourceCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(params: DeleteWebhookInput): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWebhook(
    params: DeleteWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importSourceCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(params: ImportSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importSourceCredentials(
    params: ImportSourceCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the cache for a project.
    */
  def invalidateProjectCache(): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def invalidateProjectCache(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InvalidateProjectCacheOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the cache for a project.
    */
  def invalidateProjectCache(params: InvalidateProjectCacheInput): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def invalidateProjectCache(
    params: InvalidateProjectCacheInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InvalidateProjectCacheOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of build IDs, with each build ID representing a single build.
    */
  def listBuilds(): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of build IDs, with each build ID representing a single build.
    */
  def listBuilds(params: ListBuildsInput): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBuilds(
    params: ListBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
    */
  def listBuildsForProject(): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBuildsForProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBuildsForProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
    */
  def listBuildsForProject(params: ListBuildsForProjectInput): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBuildsForProject(
    params: ListBuildsForProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBuildsForProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about Docker images that are managed by AWS CodeBuild.
    */
  def listCuratedEnvironmentImages(): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCuratedEnvironmentImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCuratedEnvironmentImagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about Docker images that are managed by AWS CodeBuild.
    */
  def listCuratedEnvironmentImages(params: ListCuratedEnvironmentImagesInput): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCuratedEnvironmentImages(
    params: ListCuratedEnvironmentImagesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCuratedEnvironmentImagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of build project names, with each build project name representing a single build project.
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of build project names, with each build project name representing a single build project.
    */
  def listProjects(params: ListProjectsInput): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    params: ListProjectsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of SourceCredentialsInfo objects. 
    */
  def listSourceCredentials(): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSourceCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns a list of SourceCredentialsInfo objects. 
    */
  def listSourceCredentials(params: ListSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSourceCredentials(
    params: ListSourceCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts running a build.
    */
  def startBuild(): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startBuild(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts running a build.
    */
  def startBuild(params: StartBuildInput): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startBuild(
    params: StartBuildInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to stop running a build.
    */
  def stopBuild(): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBuild(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopBuildOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to stop running a build.
    */
  def stopBuild(params: StopBuildInput): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBuild(
    params: StopBuildInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopBuildOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the settings of a build project.
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the settings of a build project.
    */
  def updateProject(params: UpdateProjectInput): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    params: UpdateProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(params: UpdateWebhookInput): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWebhook(
    params: UpdateWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

