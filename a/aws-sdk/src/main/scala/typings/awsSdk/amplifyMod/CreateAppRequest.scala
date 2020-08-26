package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    *  The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    *  The automated branch creation configuration for the Amplify app. 
    */
  var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.native
  /**
    *  The automated branch creation glob patterns for the Amplify app. 
    */
  var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.native
  /**
    *  The credentials for basic authorization for an Amplify app. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.native
  /**
    *  The build specification (build spec) for an Amplify app. 
    */
  var buildSpec: js.UndefOr[BuildSpec] = js.native
  /**
    *  The custom rewrite and redirect rules for an Amplify app. 
    */
  var customRules: js.UndefOr[CustomRules] = js.native
  /**
    *  The description for an Amplify app. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Enables automated branch creation for the Amplify app. 
    */
  var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.native
  /**
    *  Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app. 
    */
  var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.native
  /**
    *  Enables the auto building of branches for an Amplify app. 
    */
  var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.native
  /**
    *  Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository. 
    */
  var enableBranchAutoDeletion: js.UndefOr[EnableBranchAutoDeletion] = js.native
  /**
    *  The environment variables map for an Amplify app. 
    */
  var environmentVariables: js.UndefOr[EnvironmentVariables] = js.native
  /**
    *  The AWS Identity and Access Management (IAM) service role for an Amplify app. 
    */
  var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.native
  /**
    *  The name for the Amplify app. 
    */
  var name: Name = js.native
  /**
    *  The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored. 
    */
  var oauthToken: js.UndefOr[OauthToken] = js.native
  /**
    *  The platform or framework for an Amplify app. 
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    *  The repository for an Amplify app. 
    */
  var repository: js.UndefOr[Repository] = js.native
  /**
    *  The tag for an Amplify app. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(name: Name): CreateAppRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  @scala.inline
  implicit class CreateAppRequestOps[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessToken(value: AccessToken): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setAutoBranchCreationConfig(value: AutoBranchCreationConfig): Self = this.set("autoBranchCreationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBranchCreationConfig: Self = this.set("autoBranchCreationConfig", js.undefined)
    @scala.inline
    def setAutoBranchCreationPatternsVarargs(value: AutoBranchCreationPattern*): Self = this.set("autoBranchCreationPatterns", js.Array(value :_*))
    @scala.inline
    def setAutoBranchCreationPatterns(value: AutoBranchCreationPatterns): Self = this.set("autoBranchCreationPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBranchCreationPatterns: Self = this.set("autoBranchCreationPatterns", js.undefined)
    @scala.inline
    def setBasicAuthCredentials(value: BasicAuthCredentials): Self = this.set("basicAuthCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasicAuthCredentials: Self = this.set("basicAuthCredentials", js.undefined)
    @scala.inline
    def setBuildSpec(value: BuildSpec): Self = this.set("buildSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildSpec: Self = this.set("buildSpec", js.undefined)
    @scala.inline
    def setCustomRulesVarargs(value: CustomRule*): Self = this.set("customRules", js.Array(value :_*))
    @scala.inline
    def setCustomRules(value: CustomRules): Self = this.set("customRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRules: Self = this.set("customRules", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnableAutoBranchCreation(value: EnableAutoBranchCreation): Self = this.set("enableAutoBranchCreation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoBranchCreation: Self = this.set("enableAutoBranchCreation", js.undefined)
    @scala.inline
    def setEnableBasicAuth(value: EnableBasicAuth): Self = this.set("enableBasicAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBasicAuth: Self = this.set("enableBasicAuth", js.undefined)
    @scala.inline
    def setEnableBranchAutoBuild(value: EnableBranchAutoBuild): Self = this.set("enableBranchAutoBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBranchAutoBuild: Self = this.set("enableBranchAutoBuild", js.undefined)
    @scala.inline
    def setEnableBranchAutoDeletion(value: EnableBranchAutoDeletion): Self = this.set("enableBranchAutoDeletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBranchAutoDeletion: Self = this.set("enableBranchAutoDeletion", js.undefined)
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariables): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    @scala.inline
    def setIamServiceRoleArn(value: ServiceRoleArn): Self = this.set("iamServiceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamServiceRoleArn: Self = this.set("iamServiceRoleArn", js.undefined)
    @scala.inline
    def setOauthToken(value: OauthToken): Self = this.set("oauthToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthToken: Self = this.set("oauthToken", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

