package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/amplify", "Amplify")
@js.native
object AmplifyNs extends js.Object {
  
  trait App extends js.Object {
    /**
         *  ARN for the Amplify App. 
         */
    var appArn: AppArn
    /**
         *  Unique Id for the Amplify App. 
         */
    var appId: AppId
    /**
         *  Basic Authorization credentials for branches for the Amplify App. 
         */
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
    /**
         *  BuildSpec content for Amplify App. 
         */
    var buildSpec: js.UndefOr[BuildSpec] = js.undefined
    /**
         *  Create date / time for the Amplify App. 
         */
    var createTime: CreateTime
    /**
         *  Custom redirect / rewrite rules for the Amplify App. 
         */
    var customRules: js.UndefOr[CustomRules] = js.undefined
    /**
         *  Default domain for the Amplify App. 
         */
    var defaultDomain: DefaultDomain
    /**
         *  Description for the Amplify App. 
         */
    var description: Description
    /**
         *  Enables Basic Authorization for branches for the Amplify App. 
         */
    var enableBasicAuth: EnableBasicAuth
    /**
         *  Enables auto-building of branches for the Amplify App. 
         */
    var enableBranchAutoBuild: EnableBranchAutoBuild
    /**
         *  Environment Variables for the Amplify App. 
         */
    var environmentVariables: EnvironmentVariables
    /**
         *  IAM service role ARN for the Amplify App. 
         */
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
    /**
         *  Name for the Amplify App. 
         */
    var name: Name
    /**
         *  Platform for the Amplify App. 
         */
    var platform: Platform
    /**
         *  Structure with Production Branch information. 
         */
    var productionBranch: js.UndefOr[ProductionBranch] = js.undefined
    /**
         *  Repository for the Amplify App. 
         */
    var repository: Repository
    /**
         *  Tag for Amplify App. 
         */
    var tags: js.UndefOr[Tags] = js.undefined
    /**
         *  Update date / time for the Amplify App. 
         */
    var updateTime: UpdateTime
  }
  
  
  trait Branch extends js.Object {
    /**
         *  Id of the active job for a branch, part of an Amplify App. 
         */
    var activeJobId: ActiveJobId
    /**
         *  Basic Authorization credentials for a branch, part of an Amplify App. 
         */
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
    /**
         *  ARN for a branch, part of an Amplify App. 
         */
    var branchArn: BranchArn
    /**
         *  Name for a branch, part of an Amplify App. 
         */
    var branchName: BranchName
    /**
         *  BuildSpec content for branch for Amplify App. 
         */
    var buildSpec: js.UndefOr[BuildSpec] = js.undefined
    /**
         *  Creation date and time for a branch, part of an Amplify App. 
         */
    var createTime: CreateTime
    /**
         *  Custom domains for a branch, part of an Amplify App. 
         */
    var customDomains: CustomDomains
    /**
         *  Description for a branch, part of an Amplify App. 
         */
    var description: Description
    /**
         *  Display name for a branch, part of an Amplify App. 
         */
    var displayName: js.UndefOr[DisplayName] = js.undefined
    /**
         *  Enables auto-building on push for a branch, part of an Amplify App. 
         */
    var enableAutoBuild: EnableAutoBuild
    /**
         *  Enables Basic Authorization for a branch, part of an Amplify App. 
         */
    var enableBasicAuth: EnableBasicAuth
    /**
         *  Enables notifications for a branch, part of an Amplify App. 
         */
    var enableNotification: EnableNotification
    /**
         *  Environment Variables specific to a branch, part of an Amplify App. 
         */
    var environmentVariables: EnvironmentVariables
    /**
         *  Framework for a branch, part of an Amplify App. 
         */
    var framework: Framework
    /**
         *  Stage for a branch, part of an Amplify App. 
         */
    var stage: Stage
    /**
         *  Tag for branch for Amplify App. 
         */
    var tags: js.UndefOr[Tags] = js.undefined
    /**
         *  Thumbnail Url for the branch. 
         */
    var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
    /**
         *  Total number of Jobs part of an Amplify App. 
         */
    var totalNumberOfJobs: TotalNumberOfJobs
    /**
         *  The content TTL for the website in seconds. 
         */
    var ttl: TTL
    /**
         *  Last updated date and time for a branch, part of an Amplify App. 
         */
    var updateTime: UpdateTime
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateAppRequest extends js.Object {
    /**
         *  Credentials for Basic Authorization for an Amplify App. 
         */
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
    /**
         *  BuildSpec for an Amplify App 
         */
    var buildSpec: js.UndefOr[BuildSpec] = js.undefined
    /**
         *  Custom rewrite / redirect rules for an Amplify App. 
         */
    var customRules: js.UndefOr[CustomRules] = js.undefined
    /**
         *  Description for an Amplify App 
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         *  Enable Basic Authorization for an Amplify App, this will apply to all branches part of this App. 
         */
    var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
    /**
         *  Enable the auto building of branches for an Amplify App. 
         */
    var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined
    /**
         *  Environment variables map for an Amplify App. 
         */
    var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
         *  AWS IAM service role for an Amplify App 
         */
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
    /**
         *  Name for the Amplify App 
         */
    var name: Name
    /**
         *  OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy key. OAuth token is not stored. 
         */
    var oauthToken: OauthToken
    /**
         *  Platform / framework for an Amplify App 
         */
    var platform: Platform
    /**
         *  Repository for an Amplify App 
         */
    var repository: Repository
    /**
         *  Tag for an Amplify App 
         */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait CreateAppResult extends js.Object {
    var app: App
  }
  
  
  trait CreateBranchRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Basic Authorization credentials for the branch. 
         */
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
    /**
         *  Name for the branch. 
         */
    var branchName: BranchName
    /**
         *  BuildSpec for the branch. 
         */
    var buildSpec: js.UndefOr[BuildSpec] = js.undefined
    /**
         *  Description for the branch. 
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         *  Enables auto building for the branch. 
         */
    var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
    /**
         *  Enables Basic Auth for the branch. 
         */
    var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
    /**
         *  Enables notifications for the branch. 
         */
    var enableNotification: js.UndefOr[EnableNotification] = js.undefined
    /**
         *  Environment Variables for the branch. 
         */
    var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
         *  Framework for the branch. 
         */
    var framework: js.UndefOr[Framework] = js.undefined
    /**
         *  Stage for the branch. 
         */
    var stage: js.UndefOr[Stage] = js.undefined
    /**
         *  Tag for the branch. 
         */
    var tags: js.UndefOr[Tags] = js.undefined
    /**
         *  The content TTL for the website in seconds. 
         */
    var ttl: js.UndefOr[TTL] = js.undefined
  }
  
  
  trait CreateBranchResult extends js.Object {
    /**
         *  Branch structure for an Amplify App. 
         */
    var branch: Branch
  }
  
  
  trait CreateDomainAssociationRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Domain name for the Domain Association. 
         */
    var domainName: DomainName
    /**
         *  Enables automated creation of Subdomains for branches. 
         */
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
    /**
         *  Setting structure for the Subdomain. 
         */
    var subDomainSettings: SubDomainSettings
  }
  
  
  trait CreateDomainAssociationResult extends js.Object {
    /**
         *  Domain Association structure. 
         */
    var domainAssociation: DomainAssociation
  }
  
  
  trait CustomRule extends js.Object {
    /**
         *  The condition for a URL rewrite or redirect rule, e.g. country code. 
         */
    var condition: js.UndefOr[Condition] = js.undefined
    /**
         *  The source pattern for a URL rewrite or redirect rule. 
         */
    var source: Source
    /**
         *  The status code for a URL rewrite or redirect rule. 
         */
    var status: js.UndefOr[Status] = js.undefined
    /**
         *  The target pattern for a URL rewrite or redirect rule. 
         */
    var target: Target
  }
  
  
  trait DeleteAppRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
  }
  
  
  trait DeleteAppResult extends js.Object {
    var app: App
  }
  
  
  trait DeleteBranchRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for the branch. 
         */
    var branchName: BranchName
  }
  
  
  trait DeleteBranchResult extends js.Object {
    /**
         *  Branch structure for an Amplify App. 
         */
    var branch: Branch
  }
  
  
  trait DeleteDomainAssociationRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name of the domain. 
         */
    var domainName: DomainName
  }
  
  
  trait DeleteDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }
  
  
  trait DeleteJobRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for the branch, for the Job. 
         */
    var branchName: BranchName
    /**
         *  Unique Id for the Job. 
         */
    var jobId: JobId
  }
  
  
  trait DeleteJobResult extends js.Object {
    var jobSummary: JobSummary
  }
  
  
  trait DomainAssociation extends js.Object {
    /**
         *  DNS Record for certificate verification. 
         */
    var certificateVerificationDNSRecord: CertificateVerificationDNSRecord
    /**
         *  ARN for the Domain Association. 
         */
    var domainAssociationArn: DomainAssociationArn
    /**
         *  Name of the domain. 
         */
    var domainName: DomainName
    /**
         *  Status fo the Domain Association. 
         */
    var domainStatus: DomainStatus
    /**
         *  Enables automated creation of Subdomains for branches. 
         */
    var enableAutoSubDomain: EnableAutoSubDomain
    /**
         *  Reason for the current status of the Domain Association. 
         */
    var statusReason: StatusReason
    /**
         *  Subdomains for the Domain Association. 
         */
    var subDomains: SubDomains
  }
  
  
  trait EnvironmentVariables
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EnvValue]
  
  
  trait GetAppRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
  }
  
  
  trait GetAppResult extends js.Object {
    var app: App
  }
  
  
  trait GetBranchRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for the branch. 
         */
    var branchName: BranchName
  }
  
  
  trait GetBranchResult extends js.Object {
    var branch: Branch
  }
  
  
  trait GetDomainAssociationRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name of the domain. 
         */
    var domainName: DomainName
  }
  
  
  trait GetDomainAssociationResult extends js.Object {
    /**
         *  Domain Association structure. 
         */
    var domainAssociation: DomainAssociation
  }
  
  
  trait GetJobRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for the branch, for the Job. 
         */
    var branchName: BranchName
    /**
         *  Unique Id for the Job. 
         */
    var jobId: JobId
  }
  
  
  trait GetJobResult extends js.Object {
    var job: Job
  }
  
  
  trait Job extends js.Object {
    /**
         *  Execution steps for an execution job, for an Amplify App. 
         */
    var steps: Steps
    /**
         *  Summary for an execution job for an Amplify App. 
         */
    var summary: JobSummary
  }
  
  
  trait JobSummary extends js.Object {
    /**
         *  Commit Id from 3rd party repository provider for the Job. 
         */
    var commitId: CommitId
    /**
         *  Commit message from 3rd party repository provider for the Job. 
         */
    var commitMessage: CommitMessage
    /**
         *  Commit date / time for the Job. 
         */
    var commitTime: CommitTime
    /**
         *  End date / time for the Job. 
         */
    var endTime: js.UndefOr[EndTime] = js.undefined
    /**
         *  Arn for the Job. 
         */
    var jobArn: JobArn
    /**
         *  Unique Id for the Job. 
         */
    var jobId: JobId
    /**
         *  Type for the Job. 
         */
    var jobType: JobType
    /**
         *  Start date / time for the Job. 
         */
    var startTime: StartTime
    /**
         *  Status for the Job. 
         */
    var status: JobStatus
  }
  
  
  trait ListAppsRequest extends js.Object {
    /**
         *  Maximum number of records to list in a single response. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListAppsResult extends js.Object {
    /**
         *  List of Amplify Apps. 
         */
    var apps: Apps
    /**
         *  Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a result, then pass its value in here to list more projects. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListBranchesRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Maximum number of records to list in a single response. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  Pagination token. Set to null to start listing branches from start. If a non-null pagination token is returned in a result, then pass its value in here to list more branches. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListBranchesResult extends js.Object {
    /**
         *  List of branches for an Amplify App. 
         */
    var branches: Branches
    /**
         *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListDomainAssociationsRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Maximum number of records to list in a single response. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a result, then pass its value in here to list more projects. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListDomainAssociationsResult extends js.Object {
    /**
         *  List of Domain Associations. 
         */
    var domainAssociations: DomainAssociations
    /**
         *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListJobsRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for a branch. 
         */
    var branchName: BranchName
    /**
         *  Maximum number of records to list in a single response. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         *  Pagination token. Set to null to start listing steps from start. If a non-null pagination token is returned in a result, then pass its value in here to list more steps. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListJobsResult extends js.Object {
    /**
         *  Result structure for list job result request. 
         */
    var jobSummaries: JobSummaries
    /**
         *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ProductionBranch extends js.Object {
    /**
         *  Branch Name for Production Branch. 
         */
    var branchName: js.UndefOr[BranchName] = js.undefined
    /**
         *  Last Deploy Time of Production Branch. 
         */
    var lastDeployTime: js.UndefOr[LastDeployTime] = js.undefined
    /**
         *  Status of Production Branch. 
         */
    var status: js.UndefOr[Status] = js.undefined
    /**
         *  Thumbnail Url for Production Branch. 
         */
    var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
  }
  
  
  trait Screenshots
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ThumbnailUrl]
  
  
  trait StartJobRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for the branch, for the Job. 
         */
    var branchName: BranchName
    /**
         *  Commit Id from 3rd party repository provider for the Job. 
         */
    var commitId: js.UndefOr[CommitId] = js.undefined
    /**
         *  Commit message from 3rd party repository provider for the Job. 
         */
    var commitMessage: js.UndefOr[CommitMessage] = js.undefined
    /**
         *  Commit date / time for the Job. 
         */
    var commitTime: js.UndefOr[CommitTime] = js.undefined
    /**
         *  Unique Id for the Job. 
         */
    var jobId: js.UndefOr[JobId] = js.undefined
    /**
         *  Reason for the Job. 
         */
    var jobReason: js.UndefOr[JobReason] = js.undefined
    /**
         *  Type for the Job. 
         */
    var jobType: JobType
  }
  
  
  trait StartJobResult extends js.Object {
    /**
         *  Summary for the Job. 
         */
    var jobSummary: JobSummary
  }
  
  
  trait Step extends js.Object {
    /**
         *  Url to teh artifact for the execution step. 
         */
    var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined
    /**
         *  End date/ time of the execution step. 
         */
    var endTime: EndTime
    /**
         *  Url to the logs for the execution step. 
         */
    var logUrl: js.UndefOr[LogUrl] = js.undefined
    /**
         *  List of screenshot Urls for the execution step, if relevant. 
         */
    var screenshots: js.UndefOr[Screenshots] = js.undefined
    /**
         *  Start date/ time of the execution step. 
         */
    var startTime: StartTime
    /**
         *  Status of the execution step. 
         */
    var status: JobStatus
    /**
         *  Name of the execution step. 
         */
    var stepName: StepName
  }
  
  
  trait StopJobRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name for the branch, for the Job. 
         */
    var branchName: BranchName
    /**
         *  Unique Id for the Job. 
         */
    var jobId: JobId
  }
  
  
  trait StopJobResult extends js.Object {
    /**
         *  Summary for the Job. 
         */
    var jobSummary: JobSummary
  }
  
  
  trait SubDomain extends js.Object {
    /**
         *  DNS record for the Subdomain. 
         */
    var dnsRecord: DNSRecord
    /**
         *  Setting structure for the Subdomain. 
         */
    var subDomainSetting: SubDomainSetting
    /**
         *  Verified status of the Subdomain 
         */
    var verified: Verified
  }
  
  
  trait SubDomainSetting extends js.Object {
    /**
         *  Branch name setting for the Subdomain. 
         */
    var branchName: BranchName
    /**
         *  Prefix setting for the Subdomain. 
         */
    var prefix: DomainPrefix
  }
  
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       *  Creates a new Amplify App. 
       */
    def createApp(): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Amplify App. 
       */
    def createApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Amplify App. 
       */
    def createApp(params: CreateAppRequest): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Amplify App. 
       */
    def createApp(
      params: CreateAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ CreateAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[CreateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Branch for an Amplify App. 
       */
    def createBranch(): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Branch for an Amplify App. 
       */
    def createBranch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBranchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Branch for an Amplify App. 
       */
    def createBranch(params: CreateBranchRequest): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Creates a new Branch for an Amplify App. 
       */
    def createBranch(
      params: CreateBranchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBranchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def createDomainAssociation(): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def createDomainAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def createDomainAssociation(params: CreateDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def createDomainAssociation(
      params: CreateDomainAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete an existing Amplify App by appId. 
       */
    def deleteApp(): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete an existing Amplify App by appId. 
       */
    def deleteApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete an existing Amplify App by appId. 
       */
    def deleteApp(params: DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete an existing Amplify App by appId. 
       */
    def deleteApp(
      params: DeleteAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a branch for an Amplify App. 
       */
    def deleteBranch(): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a branch for an Amplify App. 
       */
    def deleteBranch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBranchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a branch for an Amplify App. 
       */
    def deleteBranch(params: DeleteBranchRequest): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a branch for an Amplify App. 
       */
    def deleteBranch(
      params: DeleteBranchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBranchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a DomainAssociation. 
       */
    def deleteDomainAssociation(): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a DomainAssociation. 
       */
    def deleteDomainAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a DomainAssociation. 
       */
    def deleteDomainAssociation(params: DeleteDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a DomainAssociation. 
       */
    def deleteDomainAssociation(
      params: DeleteDomainAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete a job, for an Amplify branch, part of Amplify App. 
       */
    def deleteJob(): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete a job, for an Amplify branch, part of Amplify App. 
       */
    def deleteJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete a job, for an Amplify branch, part of Amplify App. 
       */
    def deleteJob(params: DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Delete a job, for an Amplify branch, part of Amplify App. 
       */
    def deleteJob(
      params: DeleteJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves an existing Amplify App by appId. 
       */
    def getApp(): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves an existing Amplify App by appId. 
       */
    def getApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves an existing Amplify App by appId. 
       */
    def getApp(params: GetAppRequest): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves an existing Amplify App by appId. 
       */
    def getApp(
      params: GetAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves a branch for an Amplify App. 
       */
    def getBranch(): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves a branch for an Amplify App. 
       */
    def getBranch(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBranchResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves a branch for an Amplify App. 
       */
    def getBranch(params: GetBranchRequest): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves a branch for an Amplify App. 
       */
    def getBranch(
      params: GetBranchRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBranchResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves domain info that corresponds to an appId and domainName. 
       */
    def getDomainAssociation(): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves domain info that corresponds to an appId and domainName. 
       */
    def getDomainAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves domain info that corresponds to an appId and domainName. 
       */
    def getDomainAssociation(params: GetDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Retrieves domain info that corresponds to an appId and domainName. 
       */
    def getDomainAssociation(
      params: GetDomainAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Get a job for a branch, part of an Amplify App. 
       */
    def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Get a job for a branch, part of an Amplify App. 
       */
    def getJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Get a job for a branch, part of an Amplify App. 
       */
    def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Get a job for a branch, part of an Amplify App. 
       */
    def getJob(
      params: GetJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists existing Amplify Apps. 
       */
    def listApps(): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists existing Amplify Apps. 
       */
    def listApps(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListAppsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists existing Amplify Apps. 
       */
    def listApps(params: ListAppsRequest): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists existing Amplify Apps. 
       */
    def listApps(
      params: ListAppsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListAppsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListAppsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists branches for an Amplify App. 
       */
    def listBranches(): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists branches for an Amplify App. 
       */
    def listBranches(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBranchesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists branches for an Amplify App. 
       */
    def listBranches(params: ListBranchesRequest): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Lists branches for an Amplify App. 
       */
    def listBranches(
      params: ListBranchesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBranchesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBranchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List domains with an app 
       */
    def listDomainAssociations(): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List domains with an app 
       */
    def listDomainAssociations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List domains with an app 
       */
    def listDomainAssociations(params: ListDomainAssociationsRequest): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List domains with an app 
       */
    def listDomainAssociations(
      params: ListDomainAssociationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List Jobs for a branch, part of an Amplify App. 
       */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List Jobs for a branch, part of an Amplify App. 
       */
    def listJobs(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List Jobs for a branch, part of an Amplify App. 
       */
    def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  List Jobs for a branch, part of an Amplify App. 
       */
    def listJobs(
      params: ListJobsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts a new job for a branch, part of an Amplify App. 
       */
    def startJob(): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts a new job for a branch, part of an Amplify App. 
       */
    def startJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StartJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts a new job for a branch, part of an Amplify App. 
       */
    def startJob(params: StartJobRequest): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Starts a new job for a branch, part of an Amplify App. 
       */
    def startJob(
      params: StartJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StartJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StartJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
       */
    def stopJob(): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
       */
    def stopJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
       */
    def stopJob(params: StopJobRequest): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
       */
    def stopJob(
      params: StopJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopJobResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates an existing Amplify App. 
       */
    def updateApp(): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates an existing Amplify App. 
       */
    def updateApp(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates an existing Amplify App. 
       */
    def updateApp(params: UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates an existing Amplify App. 
       */
    def updateApp(
      params: UpdateAppRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UpdateAppResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAppResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates a branch for an Amplify App. 
       */
    def updateBranch(): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates a branch for an Amplify App. 
       */
    def updateBranch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBranchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates a branch for an Amplify App. 
       */
    def updateBranch(params: UpdateBranchRequest): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates a branch for an Amplify App. 
       */
    def updateBranch(
      params: UpdateBranchRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBranchResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBranchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def updateDomainAssociation(): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def updateDomainAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def updateDomainAssociation(params: UpdateDomainAssociationRequest): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Create a new DomainAssociation on an App 
       */
    def updateDomainAssociation(
      params: UpdateDomainAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDomainAssociationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDomainAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateAppRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Basic Authorization credentials for an Amplify App. 
         */
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
    /**
         *  BuildSpec for an Amplify App. 
         */
    var buildSpec: js.UndefOr[BuildSpec] = js.undefined
    /**
         *  Custom redirect / rewrite rules for an Amplify App. 
         */
    var customRules: js.UndefOr[CustomRules] = js.undefined
    /**
         *  Description for an Amplify App. 
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         *  Enables Basic Authorization for an Amplify App. 
         */
    var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
    /**
         *  Enables branch auto-building for an Amplify App. 
         */
    var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
    /**
         *  Environment Variables for an Amplify App. 
         */
    var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
         *  IAM service role for an Amplify App. 
         */
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined
    /**
         *  Name for an Amplify App. 
         */
    var name: js.UndefOr[Name] = js.undefined
    /**
         *  Platform for an Amplify App. 
         */
    var platform: js.UndefOr[Platform] = js.undefined
  }
  
  
  trait UpdateAppResult extends js.Object {
    /**
         *  App structure for the updated App. 
         */
    var app: App
  }
  
  
  trait UpdateBranchRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Basic Authorization credentials for the branch. 
         */
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
    /**
         *  Name for the branch. 
         */
    var branchName: BranchName
    /**
         *  BuildSpec for the branch. 
         */
    var buildSpec: js.UndefOr[BuildSpec] = js.undefined
    /**
         *  Description for the branch. 
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         *  Enables auto building for the branch. 
         */
    var enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined
    /**
         *  Enables Basic Auth for the branch. 
         */
    var enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined
    /**
         *  Enables notifications for the branch. 
         */
    var enableNotification: js.UndefOr[EnableNotification] = js.undefined
    /**
         *  Environment Variables for the branch. 
         */
    var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
         *  Framework for the branch. 
         */
    var framework: js.UndefOr[Framework] = js.undefined
    /**
         *  Stage for the branch. 
         */
    var stage: js.UndefOr[Stage] = js.undefined
    /**
         *  The content TTL for the website in seconds. 
         */
    var ttl: js.UndefOr[TTL] = js.undefined
  }
  
  
  trait UpdateBranchResult extends js.Object {
    /**
         *  Branch structure for an Amplify App. 
         */
    var branch: Branch
  }
  
  
  trait UpdateDomainAssociationRequest extends js.Object {
    /**
         *  Unique Id for an Amplify App. 
         */
    var appId: AppId
    /**
         *  Name of the domain. 
         */
    var domainName: DomainName
    /**
         *  Enables automated creation of Subdomains for branches. 
         */
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
    /**
         *  Setting structure for the Subdomain. 
         */
    var subDomainSettings: SubDomainSettings
  }
  
  
  trait UpdateDomainAssociationResult extends js.Object {
    /**
         *  Domain Association structure. 
         */
    var domainAssociation: DomainAssociation
  }
  
  val TypesNs: this.type = js.native
  type ActiveJobId = java.lang.String
  type AppArn = java.lang.String
  type AppId = java.lang.String
  type Apps = js.Array[App]
  type ArtifactsUrl = java.lang.String
  type BasicAuthCredentials = java.lang.String
  type BranchArn = java.lang.String
  type BranchName = java.lang.String
  type Branches = js.Array[Branch]
  type BuildSpec = java.lang.String
  type CertificateVerificationDNSRecord = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CommitId = java.lang.String
  type CommitMessage = java.lang.String
  type CommitTime = stdLib.Date
  type Condition = java.lang.String
  type CreateTime = stdLib.Date
  type CustomDomain = java.lang.String
  type CustomDomains = js.Array[CustomDomain]
  type CustomRules = js.Array[CustomRule]
  type DNSRecord = java.lang.String
  type DefaultDomain = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type DomainAssociationArn = java.lang.String
  type DomainAssociations = js.Array[DomainAssociation]
  type DomainName = java.lang.String
  type DomainPrefix = java.lang.String
  type DomainStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING_VERIFICATION | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.PENDING_DEPLOYMENT | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type EnableAutoBuild = scala.Boolean
  type EnableAutoSubDomain = scala.Boolean
  type EnableBasicAuth = scala.Boolean
  type EnableBranchAutoBuild = scala.Boolean
  type EnableNotification = scala.Boolean
  type EndTime = stdLib.Date
  type EnvKey = java.lang.String
  type EnvValue = java.lang.String
  type Framework = java.lang.String
  type JobArn = java.lang.String
  type JobId = java.lang.String
  type JobReason = java.lang.String
  type JobStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.SUCCEED | awsDashSdkLib.awsDashSdkLibStrings.CANCELLING | awsDashSdkLib.awsDashSdkLibStrings.CANCELLED | java.lang.String
  type JobSummaries = js.Array[JobSummary]
  type JobType = awsDashSdkLib.awsDashSdkLibStrings.RELEASE | awsDashSdkLib.awsDashSdkLibStrings.RETRY | awsDashSdkLib.awsDashSdkLibStrings.WEB_HOOK | java.lang.String
  type LastDeployTime = stdLib.Date
  type LogUrl = java.lang.String
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OauthToken = java.lang.String
  type Platform = awsDashSdkLib.awsDashSdkLibStrings.IOS | awsDashSdkLib.awsDashSdkLibStrings.ANDROID | awsDashSdkLib.awsDashSdkLibStrings.WEB | awsDashSdkLib.awsDashSdkLibStrings.REACT_NATIVE | java.lang.String
  type Repository = java.lang.String
  type ServiceRoleArn = java.lang.String
  type Source = java.lang.String
  type Stage = awsDashSdkLib.awsDashSdkLibStrings.PRODUCTION | awsDashSdkLib.awsDashSdkLibStrings.BETA | awsDashSdkLib.awsDashSdkLibStrings.DEVELOPMENT | awsDashSdkLib.awsDashSdkLibStrings.EXPERIMENTAL | java.lang.String
  type StartTime = stdLib.Date
  type Status = java.lang.String
  type StatusReason = java.lang.String
  type StepName = java.lang.String
  type Steps = js.Array[Step]
  type SubDomainSettings = js.Array[SubDomainSetting]
  type SubDomains = js.Array[SubDomain]
  type TTL = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Target = java.lang.String
  type ThumbnailName = java.lang.String
  type ThumbnailUrl = java.lang.String
  type TotalNumberOfJobs = java.lang.String
  type UpdateTime = stdLib.Date
  type Verified = scala.Boolean
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

