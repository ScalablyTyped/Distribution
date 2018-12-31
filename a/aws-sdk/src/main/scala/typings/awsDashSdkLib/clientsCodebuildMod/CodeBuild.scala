package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeBuild
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeBuild: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ClientConfiguration = js.native
  /**
    * Deletes one or more builds.
    */
  def batchDeleteBuilds(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more builds.
    */
  def batchDeleteBuilds(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteBuilds(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchDeleteBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about builds.
    */
  def batchGetBuilds(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about builds.
    */
  def batchGetBuilds(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetBuilds(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about build projects.
    */
  def batchGetProjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about build projects.
    */
  def batchGetProjects(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetProjects(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.BatchGetProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a build project.
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a build project.
    */
  def createProject(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProject(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
    */
  def createWebhook(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWebhook(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.CreateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a build project.
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a build project.
    */
  def deleteProject(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProject(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
    */
  def deleteSourceCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSourceCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
    */
  def deleteSourceCredentials(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSourceCredentials(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
    */
  def deleteWebhook(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWebhook(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.DeleteWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importSourceCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
    */
  def importSourceCredentials(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importSourceCredentials(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ImportSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the cache for a project.
    */
  def invalidateProjectCache(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invalidateProjectCache(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the cache for a project.
    */
  def invalidateProjectCache(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invalidateProjectCache(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.InvalidateProjectCacheOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of build IDs, with each build ID representing a single build.
    */
  def listBuilds(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of build IDs, with each build ID representing a single build.
    */
  def listBuilds(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuilds(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
    */
  def listBuildsForProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuildsForProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
    */
  def listBuildsForProject(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuildsForProject(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListBuildsForProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about Docker images that are managed by AWS CodeBuild.
    */
  def listCuratedEnvironmentImages(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCuratedEnvironmentImages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about Docker images that are managed by AWS CodeBuild.
    */
  def listCuratedEnvironmentImages(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCuratedEnvironmentImages(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListCuratedEnvironmentImagesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of build project names, with each build project name representing a single build project.
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of build project names, with each build project name representing a single build project.
    */
  def listProjects(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProjects(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListProjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of SourceCredentialsInfo objects. 
    */
  def listSourceCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSourceCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of SourceCredentialsInfo objects. 
    */
  def listSourceCredentials(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSourceCredentials(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.ListSourceCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts running a build.
    */
  def startBuild(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startBuild(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts running a build.
    */
  def startBuild(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startBuild(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StartBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attempts to stop running a build.
    */
  def stopBuild(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopBuild(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attempts to stop running a build.
    */
  def stopBuild(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopBuild(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.StopBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the settings of a build project.
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the settings of a build project.
    */
  def updateProject(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateProject(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateProjectOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateWebhook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
    */
  def updateWebhook(params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateWebhook(
    params: awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodebuildMod.CodeBuildNs.UpdateWebhookOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

