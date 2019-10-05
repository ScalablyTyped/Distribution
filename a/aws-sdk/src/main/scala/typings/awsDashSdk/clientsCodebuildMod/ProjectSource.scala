package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Your code should not get or set this information directly.
    */
  var auth: js.UndefOr[SourceAuth] = js.undefined
  /**
    * The build spec declaration to use for the builds in this build project. If this value is not specified, a build spec must be included along with the source code to be built.
    */
  var buildspec: js.UndefOr[String] = js.undefined
  /**
    * Information about the Git clone depth for the build project.
    */
  var gitCloneDepth: js.UndefOr[GitCloneDepth] = js.undefined
  /**
    *  Information about the Git submodules configuration for the build project. 
    */
  var gitSubmodulesConfig: js.UndefOr[GitSubmodulesConfig] = js.undefined
  /**
    * Enable this flag to ignore SSL warnings while connecting to the project source code.
    */
  var insecureSsl: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    * Information about the location of the source code to be built. Valid values include:   For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.   For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source code and the build spec (for example, https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name ).   For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, one of the following.     The path to the ZIP file that contains the source code (for example,  bucket-name/path/to/object-name.zip).     The path to the folder that contains the source code (for example,  bucket-name/path/to/source-code/folder/).      For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the build spec. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub Authorize application page, for Organization access, choose Request access next to each repository you want to allow AWS CodeBuild to have access to, and then choose Authorize application. (After you have connected to your GitHub account, you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the source object, set the auth object's type value to OAUTH.   For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the build spec. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the Bitbucket Confirm access to your account page, choose Grant access. (After you have connected to your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the source object, set the auth object's type value to OAUTH.  
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    *  Set to true to report the status of a build's start and finish to your source provider. This option is valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different source provider, an invalidInputException is thrown. 
    */
  var reportBuildStatus: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    *  An identifier for this project source. 
    */
  var sourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The type of repository that contains the source code to be built. Valid values include:    BITBUCKET: The source code is in a Bitbucket repository.    CODECOMMIT: The source code is in an AWS CodeCommit repository.    CODEPIPELINE: The source code settings are specified in the source action of a pipeline in AWS CodePipeline.    GITHUB: The source code is in a GitHub repository.    NO_SOURCE: The project does not have input source code.    S3: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.  
    */
  var `type`: SourceType
}

object ProjectSource {
  @scala.inline
  def apply(
    `type`: SourceType,
    auth: SourceAuth = null,
    buildspec: String = null,
    gitCloneDepth: Int | Double = null,
    gitSubmodulesConfig: GitSubmodulesConfig = null,
    insecureSsl: js.UndefOr[scala.Boolean] = js.undefined,
    location: String = null,
    reportBuildStatus: js.UndefOr[scala.Boolean] = js.undefined,
    sourceIdentifier: String = null
  ): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec)
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (gitSubmodulesConfig != null) __obj.updateDynamic("gitSubmodulesConfig")(gitSubmodulesConfig)
    if (!js.isUndefined(insecureSsl)) __obj.updateDynamic("insecureSsl")(insecureSsl)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(reportBuildStatus)) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus)
    if (sourceIdentifier != null) __obj.updateDynamic("sourceIdentifier")(sourceIdentifier)
    __obj.asInstanceOf[ProjectSource]
  }
}

