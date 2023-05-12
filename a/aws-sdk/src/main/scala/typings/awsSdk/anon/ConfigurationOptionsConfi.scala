package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.latest_
import typings.awsSdk.awsSdkStrings.legacy_
import typings.awsSdk.awsSdkStrings.regional_
import typings.awsSdk.awsSdkStrings.v2_
import typings.awsSdk.awsSdkStrings.v3
import typings.awsSdk.awsSdkStrings.v4
import typings.awsSdk.clientsAccessanalyzerMod.ClientConfiguration
import typings.awsSdk.libConfigBaseMod.HTTPOptions
import typings.awsSdk.libConfigBaseMod.Logger
import typings.awsSdk.libConfigBaseMod.ParamValidation
import typings.awsSdk.libConfigBaseMod.RetryDelayOptions
import typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk.libCredentialsCredentialProviderChainMod.CredentialProviderChain
import typings.awsSdk.libCredentialsMod.Credentials
import typings.awsSdk.libCredentialsMod.CredentialsOptions
import typings.awsSdk.libTokenMod.Token
import typings.awsSdk.libTokenTokenProviderChainMod.TokenProviderChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config-base.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
trait ConfigurationOptionsConfi
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  var accessanalyzer: js.UndefOr[ClientConfiguration] = js.undefined
  
  var account: js.UndefOr[typings.awsSdk.clientsAccountMod.ClientConfiguration] = js.undefined
  
  var acm: js.UndefOr[typings.awsSdk.clientsAcmMod.ClientConfiguration] = js.undefined
  
  var acmpca: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.ClientConfiguration] = js.undefined
  
  var alexaforbusiness: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ClientConfiguration] = js.undefined
  
  var amp: js.UndefOr[typings.awsSdk.clientsAmpMod.ClientConfiguration] = js.undefined
  
  var amplify: js.UndefOr[typings.awsSdk.clientsAmplifyMod.ClientConfiguration] = js.undefined
  
  var amplifybackend: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.ClientConfiguration] = js.undefined
  
  var amplifyuibuilder: js.UndefOr[typings.awsSdk.clientsAmplifyuibuilderMod.ClientConfiguration] = js.undefined
  
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest_ | String] = js.undefined
  
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  
  var apigateway: js.UndefOr[typings.awsSdk.clientsApigatewayMod.ClientConfiguration] = js.undefined
  
  var apigatewaymanagementapi: js.UndefOr[typings.awsSdk.clientsApigatewaymanagementapiMod.ClientConfiguration] = js.undefined
  
  var apigatewayv2: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.ClientConfiguration] = js.undefined
  
  var appconfig: js.UndefOr[typings.awsSdk.clientsAppconfigMod.ClientConfiguration] = js.undefined
  
  var appconfigdata: js.UndefOr[typings.awsSdk.clientsAppconfigdataMod.ClientConfiguration] = js.undefined
  
  var appflow: js.UndefOr[typings.awsSdk.clientsAppflowMod.ClientConfiguration] = js.undefined
  
  var appintegrations: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.ClientConfiguration] = js.undefined
  
  var applicationautoscaling: js.UndefOr[typings.awsSdk.clientsApplicationautoscalingMod.ClientConfiguration] = js.undefined
  
  var applicationcostprofiler: js.UndefOr[typings.awsSdk.clientsApplicationcostprofilerMod.ClientConfiguration] = js.undefined
  
  var applicationinsights: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ClientConfiguration] = js.undefined
  
  var appmesh: js.UndefOr[typings.awsSdk.clientsAppmeshMod.ClientConfiguration] = js.undefined
  
  var apprunner: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ClientConfiguration] = js.undefined
  
  var appstream: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ClientConfiguration] = js.undefined
  
  var appsync: js.UndefOr[typings.awsSdk.clientsAppsyncMod.ClientConfiguration] = js.undefined
  
  var arczonalshift: js.UndefOr[typings.awsSdk.clientsArczonalshiftMod.ClientConfiguration] = js.undefined
  
  var athena: js.UndefOr[typings.awsSdk.clientsAthenaMod.ClientConfiguration] = js.undefined
  
  var auditmanager: js.UndefOr[typings.awsSdk.clientsAuditmanagerMod.ClientConfiguration] = js.undefined
  
  var augmentedairuntime: js.UndefOr[typings.awsSdk.clientsAugmentedairuntimeMod.ClientConfiguration] = js.undefined
  
  var autoscaling: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.ClientConfiguration] = js.undefined
  
  var autoscalingplans: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ClientConfiguration] = js.undefined
  
  var backup: js.UndefOr[typings.awsSdk.clientsBackupMod.ClientConfiguration] = js.undefined
  
  var backupgateway: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.ClientConfiguration] = js.undefined
  
  var backupstorage: js.UndefOr[typings.awsSdk.clientsBackupstorageMod.ClientConfiguration] = js.undefined
  
  var batch: js.UndefOr[typings.awsSdk.clientsBatchMod.ClientConfiguration] = js.undefined
  
  var billingconductor: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ClientConfiguration] = js.undefined
  
  var braket: js.UndefOr[typings.awsSdk.clientsBraketMod.ClientConfiguration] = js.undefined
  
  var budgets: js.UndefOr[typings.awsSdk.clientsBudgetsMod.ClientConfiguration] = js.undefined
  
  var chime: js.UndefOr[typings.awsSdk.clientsChimeMod.ClientConfiguration] = js.undefined
  
  var chimesdkidentity: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.ClientConfiguration] = js.undefined
  
  var chimesdkmediapipelines: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientConfiguration] = js.undefined
  
  var chimesdkmeetings: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.ClientConfiguration] = js.undefined
  
  var chimesdkmessaging: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ClientConfiguration] = js.undefined
  
  var chimesdkvoice: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ClientConfiguration] = js.undefined
  
  var cleanrooms: js.UndefOr[typings.awsSdk.clientsCleanroomsMod.ClientConfiguration] = js.undefined
  
  var cloud9: js.UndefOr[typings.awsSdk.clientsCloud9Mod.ClientConfiguration] = js.undefined
  
  var cloudcontrol: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ClientConfiguration] = js.undefined
  
  var clouddirectory: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ClientConfiguration] = js.undefined
  
  var cloudformation: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ClientConfiguration] = js.undefined
  
  var cloudfront: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ClientConfiguration] = js.undefined
  
  var cloudhsm: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.ClientConfiguration] = js.undefined
  
  var cloudhsmv2: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.ClientConfiguration] = js.undefined
  
  var cloudsearch: js.UndefOr[typings.awsSdk.clientsCloudsearchMod.ClientConfiguration] = js.undefined
  
  var cloudsearchdomain: js.UndefOr[typings.awsSdk.clientsCloudsearchdomainMod.ClientConfiguration] = js.undefined
  
  var cloudtrail: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ClientConfiguration] = js.undefined
  
  var cloudtraildata: js.UndefOr[typings.awsSdk.clientsCloudtraildataMod.ClientConfiguration] = js.undefined
  
  var cloudwatch: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ClientConfiguration] = js.undefined
  
  var cloudwatchevents: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ClientConfiguration] = js.undefined
  
  var cloudwatchlogs: js.UndefOr[typings.awsSdk.clientsCloudwatchlogsMod.ClientConfiguration] = js.undefined
  
  var codeartifact: js.UndefOr[typings.awsSdk.clientsCodeartifactMod.ClientConfiguration] = js.undefined
  
  var codebuild: js.UndefOr[typings.awsSdk.clientsCodebuildMod.ClientConfiguration] = js.undefined
  
  var codecatalyst: js.UndefOr[typings.awsSdk.clientsCodecatalystMod.ClientConfiguration] = js.undefined
  
  var codecommit: js.UndefOr[typings.awsSdk.clientsCodecommitMod.ClientConfiguration] = js.undefined
  
  var codedeploy: js.UndefOr[typings.awsSdk.clientsCodedeployMod.ClientConfiguration] = js.undefined
  
  var codeguruprofiler: js.UndefOr[typings.awsSdk.clientsCodeguruprofilerMod.ClientConfiguration] = js.undefined
  
  var codegurureviewer: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ClientConfiguration] = js.undefined
  
  var codepipeline: js.UndefOr[typings.awsSdk.clientsCodepipelineMod.ClientConfiguration] = js.undefined
  
  var codestar: js.UndefOr[typings.awsSdk.clientsCodestarMod.ClientConfiguration] = js.undefined
  
  var codestarconnections: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.ClientConfiguration] = js.undefined
  
  var codestarnotifications: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.ClientConfiguration] = js.undefined
  
  var cognitoidentity: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.ClientConfiguration] = js.undefined
  
  var cognitoidentityserviceprovider: js.UndefOr[typings.awsSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration] = js.undefined
  
  var cognitosync: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.ClientConfiguration] = js.undefined
  
  var comprehend: js.UndefOr[typings.awsSdk.clientsComprehendMod.ClientConfiguration] = js.undefined
  
  var comprehendmedical: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.undefined
  
  var computeoptimizer: js.UndefOr[typings.awsSdk.clientsComputeoptimizerMod.ClientConfiguration] = js.undefined
  
  var configservice: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ClientConfiguration] = js.undefined
  
  var connect: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientConfiguration] = js.undefined
  
  var connectcampaigns: js.UndefOr[typings.awsSdk.clientsConnectcampaignsMod.ClientConfiguration] = js.undefined
  
  var connectcases: js.UndefOr[typings.awsSdk.clientsConnectcasesMod.ClientConfiguration] = js.undefined
  
  var connectcontactlens: js.UndefOr[typings.awsSdk.clientsConnectcontactlensMod.ClientConfiguration] = js.undefined
  
  var connectparticipant: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ClientConfiguration] = js.undefined
  
  var controltower: js.UndefOr[typings.awsSdk.clientsControltowerMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.undefined
  
  var costexplorer: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.ClientConfiguration] = js.undefined
  
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.undefined
  
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.undefined
  
  var cur: js.UndefOr[typings.awsSdk.clientsCurMod.ClientConfiguration] = js.undefined
  
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.undefined
  
  var customerprofiles: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ClientConfiguration] = js.undefined
  
  var databrew: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ClientConfiguration] = js.undefined
  
  var dataexchange: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ClientConfiguration] = js.undefined
  
  var datapipeline: js.UndefOr[typings.awsSdk.clientsDatapipelineMod.ClientConfiguration] = js.undefined
  
  var datasync: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ClientConfiguration] = js.undefined
  
  var dax: js.UndefOr[typings.awsSdk.clientsDaxMod.ClientConfiguration] = js.undefined
  
  var detective: js.UndefOr[typings.awsSdk.clientsDetectiveMod.ClientConfiguration] = js.undefined
  
  var devicefarm: js.UndefOr[typings.awsSdk.clientsDevicefarmMod.ClientConfiguration] = js.undefined
  
  var devopsguru: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ClientConfiguration] = js.undefined
  
  var directconnect: js.UndefOr[typings.awsSdk.clientsDirectconnectMod.ClientConfiguration] = js.undefined
  
  var directoryservice: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ClientConfiguration] = js.undefined
  
  var discovery: js.UndefOr[typings.awsSdk.clientsDiscoveryMod.ClientConfiguration] = js.undefined
  
  var dlm: js.UndefOr[typings.awsSdk.clientsDlmMod.ClientConfiguration] = js.undefined
  
  var dms: js.UndefOr[typings.awsSdk.clientsDmsMod.ClientConfiguration] = js.undefined
  
  var docdb: js.UndefOr[typings.awsSdk.clientsDocdbMod.ClientConfiguration] = js.undefined
  
  var docdbelastic: js.UndefOr[typings.awsSdk.clientsDocdbelasticMod.ClientConfiguration] = js.undefined
  
  var drs: js.UndefOr[typings.awsSdk.clientsDrsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined
  
  var dynamodb: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientConfiguration] = js.undefined
  
  var dynamodbstreams: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.ClientConfiguration] = js.undefined
  
  var ebs: js.UndefOr[typings.awsSdk.clientsEbsMod.ClientConfiguration] = js.undefined
  
  var ec2: js.UndefOr[typings.awsSdk.clientsEc2Mod.ClientConfiguration] = js.undefined
  
  var ec2instanceconnect: js.UndefOr[typings.awsSdk.clientsEc2instanceconnectMod.ClientConfiguration] = js.undefined
  
  var ecr: js.UndefOr[typings.awsSdk.clientsEcrMod.ClientConfiguration] = js.undefined
  
  var ecrpublic: js.UndefOr[typings.awsSdk.clientsEcrpublicMod.ClientConfiguration] = js.undefined
  
  var ecs: js.UndefOr[typings.awsSdk.clientsEcsMod.ClientConfiguration] = js.undefined
  
  var efs: js.UndefOr[typings.awsSdk.clientsEfsMod.ClientConfiguration] = js.undefined
  
  var eks: js.UndefOr[typings.awsSdk.clientsEksMod.ClientConfiguration] = js.undefined
  
  var elasticache: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ClientConfiguration] = js.undefined
  
  var elasticbeanstalk: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ClientConfiguration] = js.undefined
  
  var elasticinference: js.UndefOr[typings.awsSdk.clientsElasticinferenceMod.ClientConfiguration] = js.undefined
  
  var elastictranscoder: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.ClientConfiguration] = js.undefined
  
  var elb: js.UndefOr[typings.awsSdk.clientsElbMod.ClientConfiguration] = js.undefined
  
  var elbv2: js.UndefOr[typings.awsSdk.clientsElbv2Mod.ClientConfiguration] = js.undefined
  
  var emr: js.UndefOr[typings.awsSdk.clientsEmrMod.ClientConfiguration] = js.undefined
  
  var emrcontainers: js.UndefOr[typings.awsSdk.clientsEmrcontainersMod.ClientConfiguration] = js.undefined
  
  var emrserverless: js.UndefOr[typings.awsSdk.clientsEmrserverlessMod.ClientConfiguration] = js.undefined
  
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined
  
  var es: js.UndefOr[typings.awsSdk.clientsEsMod.ClientConfiguration] = js.undefined
  
  var eventbridge: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ClientConfiguration] = js.undefined
  
  var evidently: js.UndefOr[typings.awsSdk.clientsEvidentlyMod.ClientConfiguration] = js.undefined
  
  var finspace: js.UndefOr[typings.awsSdk.clientsFinspaceMod.ClientConfiguration] = js.undefined
  
  var finspacedata: js.UndefOr[typings.awsSdk.clientsFinspacedataMod.ClientConfiguration] = js.undefined
  
  var firehose: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ClientConfiguration] = js.undefined
  
  var fis: js.UndefOr[typings.awsSdk.clientsFisMod.ClientConfiguration] = js.undefined
  
  var fms: js.UndefOr[typings.awsSdk.clientsFmsMod.ClientConfiguration] = js.undefined
  
  var forecastqueryservice: js.UndefOr[typings.awsSdk.clientsForecastqueryserviceMod.ClientConfiguration] = js.undefined
  
  var forecastservice: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ClientConfiguration] = js.undefined
  
  var frauddetector: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.ClientConfiguration] = js.undefined
  
  var fsx: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientConfiguration] = js.undefined
  
  var gamelift: js.UndefOr[typings.awsSdk.clientsGameliftMod.ClientConfiguration] = js.undefined
  
  var gamesparks: js.UndefOr[typings.awsSdk.clientsGamesparksMod.ClientConfiguration] = js.undefined
  
  var glacier: js.UndefOr[typings.awsSdk.clientsGlacierMod.ClientConfiguration] = js.undefined
  
  var globalaccelerator: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.ClientConfiguration] = js.undefined
  
  var glue: js.UndefOr[typings.awsSdk.clientsGlueMod.ClientConfiguration] = js.undefined
  
  var grafana: js.UndefOr[typings.awsSdk.clientsGrafanaMod.ClientConfiguration] = js.undefined
  
  var greengrass: js.UndefOr[typings.awsSdk.clientsGreengrassMod.ClientConfiguration] = js.undefined
  
  var greengrassv2: js.UndefOr[typings.awsSdk.clientsGreengrassv2Mod.ClientConfiguration] = js.undefined
  
  var groundstation: js.UndefOr[typings.awsSdk.clientsGroundstationMod.ClientConfiguration] = js.undefined
  
  var guardduty: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ClientConfiguration] = js.undefined
  
  var health: js.UndefOr[typings.awsSdk.clientsHealthMod.ClientConfiguration] = js.undefined
  
  var healthlake: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.ClientConfiguration] = js.undefined
  
  var honeycode: js.UndefOr[typings.awsSdk.clientsHoneycodeMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
  
  var iam: js.UndefOr[typings.awsSdk.clientsIamMod.ClientConfiguration] = js.undefined
  
  var identitystore: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.ClientConfiguration] = js.undefined
  
  var imagebuilder: js.UndefOr[typings.awsSdk.clientsImagebuilderMod.ClientConfiguration] = js.undefined
  
  var importexport: js.UndefOr[typings.awsSdk.clientsImportexportMod.ClientConfiguration] = js.undefined
  
  var inspector: js.UndefOr[typings.awsSdk.clientsInspectorMod.ClientConfiguration] = js.undefined
  
  var inspector2: js.UndefOr[typings.awsSdk.clientsInspector2Mod.ClientConfiguration] = js.undefined
  
  var internetmonitor: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.ClientConfiguration] = js.undefined
  
  var iot: js.UndefOr[typings.awsSdk.clientsIotMod.ClientConfiguration] = js.undefined
  
  var iot1clickdevicesservice: js.UndefOr[typings.awsSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration] = js.undefined
  
  var iot1clickprojects: js.UndefOr[typings.awsSdk.clientsIot1clickprojectsMod.ClientConfiguration] = js.undefined
  
  var iotanalytics: js.UndefOr[typings.awsSdk.clientsIotanalyticsMod.ClientConfiguration] = js.undefined
  
  var iotdata: js.UndefOr[typings.awsSdk.clientsIotdataMod.ClientConfiguration] = js.undefined
  
  var iotdeviceadvisor: js.UndefOr[typings.awsSdk.clientsIotdeviceadvisorMod.ClientConfiguration] = js.undefined
  
  var iotevents: js.UndefOr[typings.awsSdk.clientsIoteventsMod.ClientConfiguration] = js.undefined
  
  var ioteventsdata: js.UndefOr[typings.awsSdk.clientsIoteventsdataMod.ClientConfiguration] = js.undefined
  
  var iotfleethub: js.UndefOr[typings.awsSdk.clientsIotfleethubMod.ClientConfiguration] = js.undefined
  
  var iotfleetwise: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.ClientConfiguration] = js.undefined
  
  var iotjobsdataplane: js.UndefOr[typings.awsSdk.clientsIotjobsdataplaneMod.ClientConfiguration] = js.undefined
  
  var iotroborunner: js.UndefOr[typings.awsSdk.clientsIotroborunnerMod.ClientConfiguration] = js.undefined
  
  var iotsecuretunneling: js.UndefOr[typings.awsSdk.clientsIotsecuretunnelingMod.ClientConfiguration] = js.undefined
  
  var iotsitewise: js.UndefOr[typings.awsSdk.clientsIotsitewiseMod.ClientConfiguration] = js.undefined
  
  var iotthingsgraph: js.UndefOr[typings.awsSdk.clientsIotthingsgraphMod.ClientConfiguration] = js.undefined
  
  var iottwinmaker: js.UndefOr[typings.awsSdk.clientsIottwinmakerMod.ClientConfiguration] = js.undefined
  
  var iotwireless: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientConfiguration] = js.undefined
  
  var ivs: js.UndefOr[typings.awsSdk.clientsIvsMod.ClientConfiguration] = js.undefined
  
  var ivschat: js.UndefOr[typings.awsSdk.clientsIvschatMod.ClientConfiguration] = js.undefined
  
  var ivsrealtime: js.UndefOr[typings.awsSdk.clientsIvsrealtimeMod.ClientConfiguration] = js.undefined
  
  var kafka: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClientConfiguration] = js.undefined
  
  var kafkaconnect: js.UndefOr[typings.awsSdk.clientsKafkaconnectMod.ClientConfiguration] = js.undefined
  
  var kendra: js.UndefOr[typings.awsSdk.clientsKendraMod.ClientConfiguration] = js.undefined
  
  var kendraranking: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.ClientConfiguration] = js.undefined
  
  var keyspaces: js.UndefOr[typings.awsSdk.clientsKeyspacesMod.ClientConfiguration] = js.undefined
  
  var kinesis: js.UndefOr[typings.awsSdk.clientsKinesisMod.ClientConfiguration] = js.undefined
  
  var kinesisanalytics: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ClientConfiguration] = js.undefined
  
  var kinesisanalyticsv2: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration] = js.undefined
  
  var kinesisvideo: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ClientConfiguration] = js.undefined
  
  var kinesisvideoarchivedmedia: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration] = js.undefined
  
  var kinesisvideomedia: js.UndefOr[typings.awsSdk.clientsKinesisvideomediaMod.ClientConfiguration] = js.undefined
  
  var kinesisvideosignalingchannels: js.UndefOr[typings.awsSdk.clientsKinesisvideosignalingchannelsMod.ClientConfiguration] = js.undefined
  
  var kinesisvideowebrtcstorage: js.UndefOr[typings.awsSdk.clientsKinesisvideowebrtcstorageMod.ClientConfiguration] = js.undefined
  
  var kms: js.UndefOr[typings.awsSdk.clientsKmsMod.ClientConfiguration] = js.undefined
  
  var lakeformation: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ClientConfiguration] = js.undefined
  
  var lambda: js.UndefOr[typings.awsSdk.clientsLambdaMod.ClientConfiguration] = js.undefined
  
  var lexmodelbuildingservice: js.UndefOr[typings.awsSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration] = js.undefined
  
  var lexmodelsv2: js.UndefOr[typings.awsSdk.clientsLexmodelsv2Mod.ClientConfiguration] = js.undefined
  
  var lexruntime: js.UndefOr[typings.awsSdk.clientsLexruntimeMod.ClientConfiguration] = js.undefined
  
  var lexruntimev2: js.UndefOr[typings.awsSdk.clientsLexruntimev2Mod.ClientConfiguration] = js.undefined
  
  var licensemanager: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ClientConfiguration] = js.undefined
  
  var licensemanagerlinuxsubscriptions: js.UndefOr[typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.ClientConfiguration] = js.undefined
  
  var licensemanagerusersubscriptions: js.UndefOr[typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.ClientConfiguration] = js.undefined
  
  var lightsail: js.UndefOr[typings.awsSdk.clientsLightsailMod.ClientConfiguration] = js.undefined
  
  var location: js.UndefOr[typings.awsSdk.clientsLocationMod.ClientConfiguration] = js.undefined
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  var lookoutequipment: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ClientConfiguration] = js.undefined
  
  var lookoutmetrics: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.ClientConfiguration] = js.undefined
  
  var lookoutvision: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ClientConfiguration] = js.undefined
  
  var m2: js.UndefOr[typings.awsSdk.clientsM2Mod.ClientConfiguration] = js.undefined
  
  var machinelearning: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.ClientConfiguration] = js.undefined
  
  var macie: js.UndefOr[typings.awsSdk.clientsMacieMod.ClientConfiguration] = js.undefined
  
  var macie2: js.UndefOr[typings.awsSdk.clientsMacie2Mod.ClientConfiguration] = js.undefined
  
  var managedblockchain: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.ClientConfiguration] = js.undefined
  
  var marketplacecatalog: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.ClientConfiguration] = js.undefined
  
  var marketplacecommerceanalytics: js.UndefOr[typings.awsSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration] = js.undefined
  
  var marketplaceentitlementservice: js.UndefOr[typings.awsSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration] = js.undefined
  
  var marketplacemetering: js.UndefOr[typings.awsSdk.clientsMarketplacemeteringMod.ClientConfiguration] = js.undefined
  
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var mediaconnect: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.ClientConfiguration] = js.undefined
  
  var mediaconvert: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ClientConfiguration] = js.undefined
  
  var medialive: js.UndefOr[typings.awsSdk.clientsMedialiveMod.ClientConfiguration] = js.undefined
  
  var mediapackage: js.UndefOr[typings.awsSdk.clientsMediapackageMod.ClientConfiguration] = js.undefined
  
  var mediapackagevod: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.ClientConfiguration] = js.undefined
  
  var mediastore: js.UndefOr[typings.awsSdk.clientsMediastoreMod.ClientConfiguration] = js.undefined
  
  var mediastoredata: js.UndefOr[typings.awsSdk.clientsMediastoredataMod.ClientConfiguration] = js.undefined
  
  var mediatailor: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ClientConfiguration] = js.undefined
  
  var memorydb: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ClientConfiguration] = js.undefined
  
  var mgn: js.UndefOr[typings.awsSdk.clientsMgnMod.ClientConfiguration] = js.undefined
  
  var migrationhub: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ClientConfiguration] = js.undefined
  
  var migrationhubconfig: js.UndefOr[typings.awsSdk.clientsMigrationhubconfigMod.ClientConfiguration] = js.undefined
  
  var migrationhuborchestrator: js.UndefOr[typings.awsSdk.clientsMigrationhuborchestratorMod.ClientConfiguration] = js.undefined
  
  var migrationhubrefactorspaces: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientConfiguration] = js.undefined
  
  var migrationhubstrategy: js.UndefOr[typings.awsSdk.clientsMigrationhubstrategyMod.ClientConfiguration] = js.undefined
  
  var mobile: js.UndefOr[typings.awsSdk.clientsMobileMod.ClientConfiguration] = js.undefined
  
  var mobileanalytics: js.UndefOr[typings.awsSdk.clientsMobileanalyticsMod.ClientConfiguration] = js.undefined
  
  var mq: js.UndefOr[typings.awsSdk.clientsMqMod.ClientConfiguration] = js.undefined
  
  var mturk: js.UndefOr[typings.awsSdk.clientsMturkMod.ClientConfiguration] = js.undefined
  
  var mwaa: js.UndefOr[typings.awsSdk.clientsMwaaMod.ClientConfiguration] = js.undefined
  
  var neptune: js.UndefOr[typings.awsSdk.clientsNeptuneMod.ClientConfiguration] = js.undefined
  
  var networkfirewall: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.ClientConfiguration] = js.undefined
  
  var networkmanager: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientConfiguration] = js.undefined
  
  var nimble: js.UndefOr[typings.awsSdk.clientsNimbleMod.ClientConfiguration] = js.undefined
  
  var oam: js.UndefOr[typings.awsSdk.clientsOamMod.ClientConfiguration] = js.undefined
  
  var omics: js.UndefOr[typings.awsSdk.clientsOmicsMod.ClientConfiguration] = js.undefined
  
  var opensearch: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ClientConfiguration] = js.undefined
  
  var opensearchserverless: js.UndefOr[typings.awsSdk.clientsOpensearchserverlessMod.ClientConfiguration] = js.undefined
  
  var opsworks: js.UndefOr[typings.awsSdk.clientsOpsworksMod.ClientConfiguration] = js.undefined
  
  var opsworkscm: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.ClientConfiguration] = js.undefined
  
  var organizations: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.ClientConfiguration] = js.undefined
  
  var osis: js.UndefOr[typings.awsSdk.clientsOsisMod.ClientConfiguration] = js.undefined
  
  var outposts: js.UndefOr[typings.awsSdk.clientsOutpostsMod.ClientConfiguration] = js.undefined
  
  var panorama: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.undefined
  
  var personalize: js.UndefOr[typings.awsSdk.clientsPersonalizeMod.ClientConfiguration] = js.undefined
  
  var personalizeevents: js.UndefOr[typings.awsSdk.clientsPersonalizeeventsMod.ClientConfiguration] = js.undefined
  
  var personalizeruntime: js.UndefOr[typings.awsSdk.clientsPersonalizeruntimeMod.ClientConfiguration] = js.undefined
  
  var pi: js.UndefOr[typings.awsSdk.clientsPiMod.ClientConfiguration] = js.undefined
  
  var pinpoint: js.UndefOr[typings.awsSdk.clientsPinpointMod.ClientConfiguration] = js.undefined
  
  var pinpointemail: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.ClientConfiguration] = js.undefined
  
  var pinpointsmsvoice: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoiceMod.ClientConfiguration] = js.undefined
  
  var pinpointsmsvoicev2: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientConfiguration] = js.undefined
  
  var pipes: js.UndefOr[typings.awsSdk.clientsPipesMod.ClientConfiguration] = js.undefined
  
  var polly: js.UndefOr[typings.awsSdk.clientsPollyMod.ClientConfiguration] = js.undefined
  
  var pricing: js.UndefOr[typings.awsSdk.clientsPricingMod.ClientConfiguration] = js.undefined
  
  var privatenetworks: js.UndefOr[typings.awsSdk.clientsPrivatenetworksMod.ClientConfiguration] = js.undefined
  
  var proton: js.UndefOr[typings.awsSdk.clientsProtonMod.ClientConfiguration] = js.undefined
  
  var qldb: js.UndefOr[typings.awsSdk.clientsQldbMod.ClientConfiguration] = js.undefined
  
  var qldbsession: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.ClientConfiguration] = js.undefined
  
  var quicksight: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ClientConfiguration] = js.undefined
  
  var ram: js.UndefOr[typings.awsSdk.clientsRamMod.ClientConfiguration] = js.undefined
  
  var rbin: js.UndefOr[typings.awsSdk.clientsRbinMod.ClientConfiguration] = js.undefined
  
  var rds: js.UndefOr[typings.awsSdk.clientsRdsMod.ClientConfiguration] = js.undefined
  
  var rdsdataservice: js.UndefOr[typings.awsSdk.clientsRdsdataserviceMod.ClientConfiguration] = js.undefined
  
  var redshift: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClientConfiguration] = js.undefined
  
  var redshiftdata: js.UndefOr[typings.awsSdk.clientsRedshiftdataMod.ClientConfiguration] = js.undefined
  
  var redshiftserverless: js.UndefOr[typings.awsSdk.clientsRedshiftserverlessMod.ClientConfiguration] = js.undefined
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.undefined
  
  var rekognition: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ClientConfiguration] = js.undefined
  
  var resiliencehub: js.UndefOr[typings.awsSdk.clientsResiliencehubMod.ClientConfiguration] = js.undefined
  
  var resourceexplorer2: js.UndefOr[typings.awsSdk.clientsResourceexplorer2Mod.ClientConfiguration] = js.undefined
  
  var resourcegroups: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ClientConfiguration] = js.undefined
  
  var resourcegroupstaggingapi: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined
  
  var robomaker: js.UndefOr[typings.awsSdk.clientsRobomakerMod.ClientConfiguration] = js.undefined
  
  var rolesanywhere: js.UndefOr[typings.awsSdk.clientsRolesanywhereMod.ClientConfiguration] = js.undefined
  
  var route53: js.UndefOr[typings.awsSdk.clientsRoute53Mod.ClientConfiguration] = js.undefined
  
  var route53domains: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.ClientConfiguration] = js.undefined
  
  var route53recoverycluster: js.UndefOr[typings.awsSdk.clientsRoute53recoveryclusterMod.ClientConfiguration] = js.undefined
  
  var route53recoverycontrolconfig: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.ClientConfiguration] = js.undefined
  
  var route53recoveryreadiness: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.ClientConfiguration] = js.undefined
  
  var route53resolver: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ClientConfiguration] = js.undefined
  
  var rum: js.UndefOr[typings.awsSdk.clientsRumMod.ClientConfiguration] = js.undefined
  
  var s3: js.UndefOr[typings.awsSdk.clientsS3Mod.ClientConfiguration] = js.undefined
  
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.undefined
  
  /**
    * Whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.undefined
  
  var s3control: js.UndefOr[typings.awsSdk.clientsS3controlMod.ClientConfiguration] = js.undefined
  
  var s3outposts: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.ClientConfiguration] = js.undefined
  
  var sagemaker: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ClientConfiguration] = js.undefined
  
  var sagemakeredge: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.ClientConfiguration] = js.undefined
  
  var sagemakerfeaturestoreruntime: js.UndefOr[typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ClientConfiguration] = js.undefined
  
  var sagemakergeospatial: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ClientConfiguration] = js.undefined
  
  var sagemakermetrics: js.UndefOr[typings.awsSdk.clientsSagemakermetricsMod.ClientConfiguration] = js.undefined
  
  var sagemakerruntime: js.UndefOr[typings.awsSdk.clientsSagemakerruntimeMod.ClientConfiguration] = js.undefined
  
  var savingsplans: js.UndefOr[typings.awsSdk.clientsSavingsplansMod.ClientConfiguration] = js.undefined
  
  var scheduler: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ClientConfiguration] = js.undefined
  
  var schemas: js.UndefOr[typings.awsSdk.clientsSchemasMod.ClientConfiguration] = js.undefined
  
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.undefined
  
  var secretsmanager: js.UndefOr[typings.awsSdk.clientsSecretsmanagerMod.ClientConfiguration] = js.undefined
  
  var securityhub: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.ClientConfiguration] = js.undefined
  
  var securitylake: js.UndefOr[typings.awsSdk.clientsSecuritylakeMod.ClientConfiguration] = js.undefined
  
  var serverlessapplicationrepository: js.UndefOr[typings.awsSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration] = js.undefined
  
  var servicecatalog: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ClientConfiguration] = js.undefined
  
  var servicecatalogappregistry: js.UndefOr[typings.awsSdk.clientsServicecatalogappregistryMod.ClientConfiguration] = js.undefined
  
  var servicediscovery: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.ClientConfiguration] = js.undefined
  
  var servicequotas: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ClientConfiguration] = js.undefined
  
  var ses: js.UndefOr[typings.awsSdk.clientsSesMod.ClientConfiguration] = js.undefined
  
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.undefined
  
  var sesv2: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ClientConfiguration] = js.undefined
  
  var shield: js.UndefOr[typings.awsSdk.clientsShieldMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.undefined
  
  var signer: js.UndefOr[typings.awsSdk.clientsSignerMod.ClientConfiguration] = js.undefined
  
  var simpledb: js.UndefOr[typings.awsSdk.clientsSimpledbMod.ClientConfiguration] = js.undefined
  
  var simspaceweaver: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.ClientConfiguration] = js.undefined
  
  var sms: js.UndefOr[typings.awsSdk.clientsSmsMod.ClientConfiguration] = js.undefined
  
  var snowball: js.UndefOr[typings.awsSdk.clientsSnowballMod.ClientConfiguration] = js.undefined
  
  var snowdevicemanagement: js.UndefOr[typings.awsSdk.clientsSnowdevicemanagementMod.ClientConfiguration] = js.undefined
  
  var sns: js.UndefOr[typings.awsSdk.clientsSnsMod.ClientConfiguration] = js.undefined
  
  var sqs: js.UndefOr[typings.awsSdk.clientsSqsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ssm: js.UndefOr[typings.awsSdk.clientsSsmMod.ClientConfiguration] = js.undefined
  
  var ssmcontacts: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.ClientConfiguration] = js.undefined
  
  var ssmincidents: js.UndefOr[typings.awsSdk.clientsSsmincidentsMod.ClientConfiguration] = js.undefined
  
  var ssmsap: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ClientConfiguration] = js.undefined
  
  var sso: js.UndefOr[typings.awsSdk.clientsSsoMod.ClientConfiguration] = js.undefined
  
  var ssoadmin: js.UndefOr[typings.awsSdk.clientsSsoadminMod.ClientConfiguration] = js.undefined
  
  var ssooidc: js.UndefOr[typings.awsSdk.clientsSsooidcMod.ClientConfiguration] = js.undefined
  
  var stepfunctions: js.UndefOr[typings.awsSdk.clientsStepfunctionsMod.ClientConfiguration] = js.undefined
  
  var storagegateway: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.ClientConfiguration] = js.undefined
  
  var sts: js.UndefOr[typings.awsSdk.clientsStsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.undefined
  
  var support: js.UndefOr[typings.awsSdk.clientsSupportMod.ClientConfiguration] = js.undefined
  
  var supportapp: js.UndefOr[typings.awsSdk.clientsSupportappMod.ClientConfiguration] = js.undefined
  
  var swf: js.UndefOr[typings.awsSdk.clientsSwfMod.ClientConfiguration] = js.undefined
  
  var synthetics: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.ClientConfiguration] = js.undefined
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.undefined
  
  var textract: js.UndefOr[typings.awsSdk.clientsTextractMod.ClientConfiguration] = js.undefined
  
  var timestreamquery: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.ClientConfiguration] = js.undefined
  
  var timestreamwrite: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.ClientConfiguration] = js.undefined
  
  var tnb: js.UndefOr[typings.awsSdk.clientsTnbMod.ClientConfiguration] = js.undefined
  
  /**
    * The Token to authenticate requests with.
    */
  var token: js.UndefOr[Token | Null] = js.undefined
  
  /**
    * The provider chain used to resolve token if no static token property is set.
    */
  var tokenProvider: js.UndefOr[TokenProviderChain] = js.undefined
  
  var transcribeservice: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ClientConfiguration] = js.undefined
  
  var transfer: js.UndefOr[typings.awsSdk.clientsTransferMod.ClientConfiguration] = js.undefined
  
  var translate: js.UndefOr[typings.awsSdk.clientsTranslateMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables IPv6 dualstack endpoint.
    */
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables FIPS compatible endpoints.
    */
  var useFipsEndpoint: js.UndefOr[Boolean] = js.undefined
  
  var voiceid: js.UndefOr[typings.awsSdk.clientsVoiceidMod.ClientConfiguration] = js.undefined
  
  var vpclattice: js.UndefOr[typings.awsSdk.clientsVpclatticeMod.ClientConfiguration] = js.undefined
  
  var waf: js.UndefOr[typings.awsSdk.clientsWafMod.ClientConfiguration] = js.undefined
  
  var wafregional: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ClientConfiguration] = js.undefined
  
  var wafv2: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ClientConfiguration] = js.undefined
  
  var wellarchitected: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ClientConfiguration] = js.undefined
  
  var wisdom: js.UndefOr[typings.awsSdk.clientsWisdomMod.ClientConfiguration] = js.undefined
  
  var workdocs: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.ClientConfiguration] = js.undefined
  
  var worklink: js.UndefOr[typings.awsSdk.clientsWorklinkMod.ClientConfiguration] = js.undefined
  
  var workmail: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ClientConfiguration] = js.undefined
  
  var workmailmessageflow: js.UndefOr[typings.awsSdk.clientsWorkmailmessageflowMod.ClientConfiguration] = js.undefined
  
  var workspaces: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ClientConfiguration] = js.undefined
  
  var workspacesweb: js.UndefOr[typings.awsSdk.clientsWorkspaceswebMod.ClientConfiguration] = js.undefined
  
  var xray: js.UndefOr[typings.awsSdk.clientsXrayMod.ClientConfiguration] = js.undefined
}
object ConfigurationOptionsConfi {
  
  inline def apply(Object: js.Object): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Object)
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationOptionsConfi] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setAccessanalyzer(value: ClientConfiguration): Self = StObject.set(x, "accessanalyzer", value.asInstanceOf[js.Any])
    
    inline def setAccessanalyzerUndefined: Self = StObject.set(x, "accessanalyzer", js.undefined)
    
    inline def setAccount(value: typings.awsSdk.clientsAccountMod.ClientConfiguration): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAcm(value: typings.awsSdk.clientsAcmMod.ClientConfiguration): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setAcmpca(value: typings.awsSdk.clientsAcmpcaMod.ClientConfiguration): Self = StObject.set(x, "acmpca", value.asInstanceOf[js.Any])
    
    inline def setAcmpcaUndefined: Self = StObject.set(x, "acmpca", js.undefined)
    
    inline def setAlexaforbusiness(value: typings.awsSdk.clientsAlexaforbusinessMod.ClientConfiguration): Self = StObject.set(x, "alexaforbusiness", value.asInstanceOf[js.Any])
    
    inline def setAlexaforbusinessUndefined: Self = StObject.set(x, "alexaforbusiness", js.undefined)
    
    inline def setAmp(value: typings.awsSdk.clientsAmpMod.ClientConfiguration): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
    
    inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
    
    inline def setAmplify(value: typings.awsSdk.clientsAmplifyMod.ClientConfiguration): Self = StObject.set(x, "amplify", value.asInstanceOf[js.Any])
    
    inline def setAmplifyUndefined: Self = StObject.set(x, "amplify", js.undefined)
    
    inline def setAmplifybackend(value: typings.awsSdk.clientsAmplifybackendMod.ClientConfiguration): Self = StObject.set(x, "amplifybackend", value.asInstanceOf[js.Any])
    
    inline def setAmplifybackendUndefined: Self = StObject.set(x, "amplifybackend", js.undefined)
    
    inline def setAmplifyuibuilder(value: typings.awsSdk.clientsAmplifyuibuilderMod.ClientConfiguration): Self = StObject.set(x, "amplifyuibuilder", value.asInstanceOf[js.Any])
    
    inline def setAmplifyuibuilderUndefined: Self = StObject.set(x, "amplifyuibuilder", js.undefined)
    
    inline def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    inline def setApigateway(value: typings.awsSdk.clientsApigatewayMod.ClientConfiguration): Self = StObject.set(x, "apigateway", value.asInstanceOf[js.Any])
    
    inline def setApigatewayUndefined: Self = StObject.set(x, "apigateway", js.undefined)
    
    inline def setApigatewaymanagementapi(value: typings.awsSdk.clientsApigatewaymanagementapiMod.ClientConfiguration): Self = StObject.set(x, "apigatewaymanagementapi", value.asInstanceOf[js.Any])
    
    inline def setApigatewaymanagementapiUndefined: Self = StObject.set(x, "apigatewaymanagementapi", js.undefined)
    
    inline def setApigatewayv2(value: typings.awsSdk.clientsApigatewayv2Mod.ClientConfiguration): Self = StObject.set(x, "apigatewayv2", value.asInstanceOf[js.Any])
    
    inline def setApigatewayv2Undefined: Self = StObject.set(x, "apigatewayv2", js.undefined)
    
    inline def setAppconfig(value: typings.awsSdk.clientsAppconfigMod.ClientConfiguration): Self = StObject.set(x, "appconfig", value.asInstanceOf[js.Any])
    
    inline def setAppconfigUndefined: Self = StObject.set(x, "appconfig", js.undefined)
    
    inline def setAppconfigdata(value: typings.awsSdk.clientsAppconfigdataMod.ClientConfiguration): Self = StObject.set(x, "appconfigdata", value.asInstanceOf[js.Any])
    
    inline def setAppconfigdataUndefined: Self = StObject.set(x, "appconfigdata", js.undefined)
    
    inline def setAppflow(value: typings.awsSdk.clientsAppflowMod.ClientConfiguration): Self = StObject.set(x, "appflow", value.asInstanceOf[js.Any])
    
    inline def setAppflowUndefined: Self = StObject.set(x, "appflow", js.undefined)
    
    inline def setAppintegrations(value: typings.awsSdk.clientsAppintegrationsMod.ClientConfiguration): Self = StObject.set(x, "appintegrations", value.asInstanceOf[js.Any])
    
    inline def setAppintegrationsUndefined: Self = StObject.set(x, "appintegrations", js.undefined)
    
    inline def setApplicationautoscaling(value: typings.awsSdk.clientsApplicationautoscalingMod.ClientConfiguration): Self = StObject.set(x, "applicationautoscaling", value.asInstanceOf[js.Any])
    
    inline def setApplicationautoscalingUndefined: Self = StObject.set(x, "applicationautoscaling", js.undefined)
    
    inline def setApplicationcostprofiler(value: typings.awsSdk.clientsApplicationcostprofilerMod.ClientConfiguration): Self = StObject.set(x, "applicationcostprofiler", value.asInstanceOf[js.Any])
    
    inline def setApplicationcostprofilerUndefined: Self = StObject.set(x, "applicationcostprofiler", js.undefined)
    
    inline def setApplicationinsights(value: typings.awsSdk.clientsApplicationinsightsMod.ClientConfiguration): Self = StObject.set(x, "applicationinsights", value.asInstanceOf[js.Any])
    
    inline def setApplicationinsightsUndefined: Self = StObject.set(x, "applicationinsights", js.undefined)
    
    inline def setAppmesh(value: typings.awsSdk.clientsAppmeshMod.ClientConfiguration): Self = StObject.set(x, "appmesh", value.asInstanceOf[js.Any])
    
    inline def setAppmeshUndefined: Self = StObject.set(x, "appmesh", js.undefined)
    
    inline def setApprunner(value: typings.awsSdk.clientsApprunnerMod.ClientConfiguration): Self = StObject.set(x, "apprunner", value.asInstanceOf[js.Any])
    
    inline def setApprunnerUndefined: Self = StObject.set(x, "apprunner", js.undefined)
    
    inline def setAppstream(value: typings.awsSdk.clientsAppstreamMod.ClientConfiguration): Self = StObject.set(x, "appstream", value.asInstanceOf[js.Any])
    
    inline def setAppstreamUndefined: Self = StObject.set(x, "appstream", js.undefined)
    
    inline def setAppsync(value: typings.awsSdk.clientsAppsyncMod.ClientConfiguration): Self = StObject.set(x, "appsync", value.asInstanceOf[js.Any])
    
    inline def setAppsyncUndefined: Self = StObject.set(x, "appsync", js.undefined)
    
    inline def setArczonalshift(value: typings.awsSdk.clientsArczonalshiftMod.ClientConfiguration): Self = StObject.set(x, "arczonalshift", value.asInstanceOf[js.Any])
    
    inline def setArczonalshiftUndefined: Self = StObject.set(x, "arczonalshift", js.undefined)
    
    inline def setAthena(value: typings.awsSdk.clientsAthenaMod.ClientConfiguration): Self = StObject.set(x, "athena", value.asInstanceOf[js.Any])
    
    inline def setAthenaUndefined: Self = StObject.set(x, "athena", js.undefined)
    
    inline def setAuditmanager(value: typings.awsSdk.clientsAuditmanagerMod.ClientConfiguration): Self = StObject.set(x, "auditmanager", value.asInstanceOf[js.Any])
    
    inline def setAuditmanagerUndefined: Self = StObject.set(x, "auditmanager", js.undefined)
    
    inline def setAugmentedairuntime(value: typings.awsSdk.clientsAugmentedairuntimeMod.ClientConfiguration): Self = StObject.set(x, "augmentedairuntime", value.asInstanceOf[js.Any])
    
    inline def setAugmentedairuntimeUndefined: Self = StObject.set(x, "augmentedairuntime", js.undefined)
    
    inline def setAutoscaling(value: typings.awsSdk.clientsAutoscalingMod.ClientConfiguration): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setAutoscalingplans(value: typings.awsSdk.clientsAutoscalingplansMod.ClientConfiguration): Self = StObject.set(x, "autoscalingplans", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingplansUndefined: Self = StObject.set(x, "autoscalingplans", js.undefined)
    
    inline def setBackup(value: typings.awsSdk.clientsBackupMod.ClientConfiguration): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setBackupgateway(value: typings.awsSdk.clientsBackupgatewayMod.ClientConfiguration): Self = StObject.set(x, "backupgateway", value.asInstanceOf[js.Any])
    
    inline def setBackupgatewayUndefined: Self = StObject.set(x, "backupgateway", js.undefined)
    
    inline def setBackupstorage(value: typings.awsSdk.clientsBackupstorageMod.ClientConfiguration): Self = StObject.set(x, "backupstorage", value.asInstanceOf[js.Any])
    
    inline def setBackupstorageUndefined: Self = StObject.set(x, "backupstorage", js.undefined)
    
    inline def setBatch(value: typings.awsSdk.clientsBatchMod.ClientConfiguration): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setBillingconductor(value: typings.awsSdk.clientsBillingconductorMod.ClientConfiguration): Self = StObject.set(x, "billingconductor", value.asInstanceOf[js.Any])
    
    inline def setBillingconductorUndefined: Self = StObject.set(x, "billingconductor", js.undefined)
    
    inline def setBraket(value: typings.awsSdk.clientsBraketMod.ClientConfiguration): Self = StObject.set(x, "braket", value.asInstanceOf[js.Any])
    
    inline def setBraketUndefined: Self = StObject.set(x, "braket", js.undefined)
    
    inline def setBudgets(value: typings.awsSdk.clientsBudgetsMod.ClientConfiguration): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setChime(value: typings.awsSdk.clientsChimeMod.ClientConfiguration): Self = StObject.set(x, "chime", value.asInstanceOf[js.Any])
    
    inline def setChimeUndefined: Self = StObject.set(x, "chime", js.undefined)
    
    inline def setChimesdkidentity(value: typings.awsSdk.clientsChimesdkidentityMod.ClientConfiguration): Self = StObject.set(x, "chimesdkidentity", value.asInstanceOf[js.Any])
    
    inline def setChimesdkidentityUndefined: Self = StObject.set(x, "chimesdkidentity", js.undefined)
    
    inline def setChimesdkmediapipelines(value: typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmediapipelines", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmediapipelinesUndefined: Self = StObject.set(x, "chimesdkmediapipelines", js.undefined)
    
    inline def setChimesdkmeetings(value: typings.awsSdk.clientsChimesdkmeetingsMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmeetings", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmeetingsUndefined: Self = StObject.set(x, "chimesdkmeetings", js.undefined)
    
    inline def setChimesdkmessaging(value: typings.awsSdk.clientsChimesdkmessagingMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmessaging", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmessagingUndefined: Self = StObject.set(x, "chimesdkmessaging", js.undefined)
    
    inline def setChimesdkvoice(value: typings.awsSdk.clientsChimesdkvoiceMod.ClientConfiguration): Self = StObject.set(x, "chimesdkvoice", value.asInstanceOf[js.Any])
    
    inline def setChimesdkvoiceUndefined: Self = StObject.set(x, "chimesdkvoice", js.undefined)
    
    inline def setCleanrooms(value: typings.awsSdk.clientsCleanroomsMod.ClientConfiguration): Self = StObject.set(x, "cleanrooms", value.asInstanceOf[js.Any])
    
    inline def setCleanroomsUndefined: Self = StObject.set(x, "cleanrooms", js.undefined)
    
    inline def setCloud9(value: typings.awsSdk.clientsCloud9Mod.ClientConfiguration): Self = StObject.set(x, "cloud9", value.asInstanceOf[js.Any])
    
    inline def setCloud9Undefined: Self = StObject.set(x, "cloud9", js.undefined)
    
    inline def setCloudcontrol(value: typings.awsSdk.clientsCloudcontrolMod.ClientConfiguration): Self = StObject.set(x, "cloudcontrol", value.asInstanceOf[js.Any])
    
    inline def setCloudcontrolUndefined: Self = StObject.set(x, "cloudcontrol", js.undefined)
    
    inline def setClouddirectory(value: typings.awsSdk.clientsClouddirectoryMod.ClientConfiguration): Self = StObject.set(x, "clouddirectory", value.asInstanceOf[js.Any])
    
    inline def setClouddirectoryUndefined: Self = StObject.set(x, "clouddirectory", js.undefined)
    
    inline def setCloudformation(value: typings.awsSdk.clientsCloudformationMod.ClientConfiguration): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
    
    inline def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
    
    inline def setCloudfront(value: typings.awsSdk.clientsCloudfrontMod.ClientConfiguration): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
    
    inline def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
    
    inline def setCloudhsm(value: typings.awsSdk.clientsCloudhsmMod.ClientConfiguration): Self = StObject.set(x, "cloudhsm", value.asInstanceOf[js.Any])
    
    inline def setCloudhsmUndefined: Self = StObject.set(x, "cloudhsm", js.undefined)
    
    inline def setCloudhsmv2(value: typings.awsSdk.clientsCloudhsmv2Mod.ClientConfiguration): Self = StObject.set(x, "cloudhsmv2", value.asInstanceOf[js.Any])
    
    inline def setCloudhsmv2Undefined: Self = StObject.set(x, "cloudhsmv2", js.undefined)
    
    inline def setCloudsearch(value: typings.awsSdk.clientsCloudsearchMod.ClientConfiguration): Self = StObject.set(x, "cloudsearch", value.asInstanceOf[js.Any])
    
    inline def setCloudsearchUndefined: Self = StObject.set(x, "cloudsearch", js.undefined)
    
    inline def setCloudsearchdomain(value: typings.awsSdk.clientsCloudsearchdomainMod.ClientConfiguration): Self = StObject.set(x, "cloudsearchdomain", value.asInstanceOf[js.Any])
    
    inline def setCloudsearchdomainUndefined: Self = StObject.set(x, "cloudsearchdomain", js.undefined)
    
    inline def setCloudtrail(value: typings.awsSdk.clientsCloudtrailMod.ClientConfiguration): Self = StObject.set(x, "cloudtrail", value.asInstanceOf[js.Any])
    
    inline def setCloudtrailUndefined: Self = StObject.set(x, "cloudtrail", js.undefined)
    
    inline def setCloudtraildata(value: typings.awsSdk.clientsCloudtraildataMod.ClientConfiguration): Self = StObject.set(x, "cloudtraildata", value.asInstanceOf[js.Any])
    
    inline def setCloudtraildataUndefined: Self = StObject.set(x, "cloudtraildata", js.undefined)
    
    inline def setCloudwatch(value: typings.awsSdk.clientsCloudwatchMod.ClientConfiguration): Self = StObject.set(x, "cloudwatch", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchUndefined: Self = StObject.set(x, "cloudwatch", js.undefined)
    
    inline def setCloudwatchevents(value: typings.awsSdk.clientsCloudwatcheventsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchevents", value.asInstanceOf[js.Any])
    
    inline def setCloudwatcheventsUndefined: Self = StObject.set(x, "cloudwatchevents", js.undefined)
    
    inline def setCloudwatchlogs(value: typings.awsSdk.clientsCloudwatchlogsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchlogs", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchlogsUndefined: Self = StObject.set(x, "cloudwatchlogs", js.undefined)
    
    inline def setCodeartifact(value: typings.awsSdk.clientsCodeartifactMod.ClientConfiguration): Self = StObject.set(x, "codeartifact", value.asInstanceOf[js.Any])
    
    inline def setCodeartifactUndefined: Self = StObject.set(x, "codeartifact", js.undefined)
    
    inline def setCodebuild(value: typings.awsSdk.clientsCodebuildMod.ClientConfiguration): Self = StObject.set(x, "codebuild", value.asInstanceOf[js.Any])
    
    inline def setCodebuildUndefined: Self = StObject.set(x, "codebuild", js.undefined)
    
    inline def setCodecatalyst(value: typings.awsSdk.clientsCodecatalystMod.ClientConfiguration): Self = StObject.set(x, "codecatalyst", value.asInstanceOf[js.Any])
    
    inline def setCodecatalystUndefined: Self = StObject.set(x, "codecatalyst", js.undefined)
    
    inline def setCodecommit(value: typings.awsSdk.clientsCodecommitMod.ClientConfiguration): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
    
    inline def setCodecommitUndefined: Self = StObject.set(x, "codecommit", js.undefined)
    
    inline def setCodedeploy(value: typings.awsSdk.clientsCodedeployMod.ClientConfiguration): Self = StObject.set(x, "codedeploy", value.asInstanceOf[js.Any])
    
    inline def setCodedeployUndefined: Self = StObject.set(x, "codedeploy", js.undefined)
    
    inline def setCodeguruprofiler(value: typings.awsSdk.clientsCodeguruprofilerMod.ClientConfiguration): Self = StObject.set(x, "codeguruprofiler", value.asInstanceOf[js.Any])
    
    inline def setCodeguruprofilerUndefined: Self = StObject.set(x, "codeguruprofiler", js.undefined)
    
    inline def setCodegurureviewer(value: typings.awsSdk.clientsCodegurureviewerMod.ClientConfiguration): Self = StObject.set(x, "codegurureviewer", value.asInstanceOf[js.Any])
    
    inline def setCodegurureviewerUndefined: Self = StObject.set(x, "codegurureviewer", js.undefined)
    
    inline def setCodepipeline(value: typings.awsSdk.clientsCodepipelineMod.ClientConfiguration): Self = StObject.set(x, "codepipeline", value.asInstanceOf[js.Any])
    
    inline def setCodepipelineUndefined: Self = StObject.set(x, "codepipeline", js.undefined)
    
    inline def setCodestar(value: typings.awsSdk.clientsCodestarMod.ClientConfiguration): Self = StObject.set(x, "codestar", value.asInstanceOf[js.Any])
    
    inline def setCodestarUndefined: Self = StObject.set(x, "codestar", js.undefined)
    
    inline def setCodestarconnections(value: typings.awsSdk.clientsCodestarconnectionsMod.ClientConfiguration): Self = StObject.set(x, "codestarconnections", value.asInstanceOf[js.Any])
    
    inline def setCodestarconnectionsUndefined: Self = StObject.set(x, "codestarconnections", js.undefined)
    
    inline def setCodestarnotifications(value: typings.awsSdk.clientsCodestarnotificationsMod.ClientConfiguration): Self = StObject.set(x, "codestarnotifications", value.asInstanceOf[js.Any])
    
    inline def setCodestarnotificationsUndefined: Self = StObject.set(x, "codestarnotifications", js.undefined)
    
    inline def setCognitoidentity(value: typings.awsSdk.clientsCognitoidentityMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentity", value.asInstanceOf[js.Any])
    
    inline def setCognitoidentityUndefined: Self = StObject.set(x, "cognitoidentity", js.undefined)
    
    inline def setCognitoidentityserviceprovider(value: typings.awsSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentityserviceprovider", value.asInstanceOf[js.Any])
    
    inline def setCognitoidentityserviceproviderUndefined: Self = StObject.set(x, "cognitoidentityserviceprovider", js.undefined)
    
    inline def setCognitosync(value: typings.awsSdk.clientsCognitosyncMod.ClientConfiguration): Self = StObject.set(x, "cognitosync", value.asInstanceOf[js.Any])
    
    inline def setCognitosyncUndefined: Self = StObject.set(x, "cognitosync", js.undefined)
    
    inline def setComprehend(value: typings.awsSdk.clientsComprehendMod.ClientConfiguration): Self = StObject.set(x, "comprehend", value.asInstanceOf[js.Any])
    
    inline def setComprehendUndefined: Self = StObject.set(x, "comprehend", js.undefined)
    
    inline def setComprehendmedical(value: typings.awsSdk.clientsComprehendmedicalMod.ClientConfiguration): Self = StObject.set(x, "comprehendmedical", value.asInstanceOf[js.Any])
    
    inline def setComprehendmedicalUndefined: Self = StObject.set(x, "comprehendmedical", js.undefined)
    
    inline def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    inline def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    inline def setComputeoptimizer(value: typings.awsSdk.clientsComputeoptimizerMod.ClientConfiguration): Self = StObject.set(x, "computeoptimizer", value.asInstanceOf[js.Any])
    
    inline def setComputeoptimizerUndefined: Self = StObject.set(x, "computeoptimizer", js.undefined)
    
    inline def setConfigservice(value: typings.awsSdk.clientsConfigserviceMod.ClientConfiguration): Self = StObject.set(x, "configservice", value.asInstanceOf[js.Any])
    
    inline def setConfigserviceUndefined: Self = StObject.set(x, "configservice", js.undefined)
    
    inline def setConnect(value: typings.awsSdk.clientsConnectMod.ClientConfiguration): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnectcampaigns(value: typings.awsSdk.clientsConnectcampaignsMod.ClientConfiguration): Self = StObject.set(x, "connectcampaigns", value.asInstanceOf[js.Any])
    
    inline def setConnectcampaignsUndefined: Self = StObject.set(x, "connectcampaigns", js.undefined)
    
    inline def setConnectcases(value: typings.awsSdk.clientsConnectcasesMod.ClientConfiguration): Self = StObject.set(x, "connectcases", value.asInstanceOf[js.Any])
    
    inline def setConnectcasesUndefined: Self = StObject.set(x, "connectcases", js.undefined)
    
    inline def setConnectcontactlens(value: typings.awsSdk.clientsConnectcontactlensMod.ClientConfiguration): Self = StObject.set(x, "connectcontactlens", value.asInstanceOf[js.Any])
    
    inline def setConnectcontactlensUndefined: Self = StObject.set(x, "connectcontactlens", js.undefined)
    
    inline def setConnectparticipant(value: typings.awsSdk.clientsConnectparticipantMod.ClientConfiguration): Self = StObject.set(x, "connectparticipant", value.asInstanceOf[js.Any])
    
    inline def setConnectparticipantUndefined: Self = StObject.set(x, "connectparticipant", js.undefined)
    
    inline def setControltower(value: typings.awsSdk.clientsControltowerMod.ClientConfiguration): Self = StObject.set(x, "controltower", value.asInstanceOf[js.Any])
    
    inline def setControltowerUndefined: Self = StObject.set(x, "controltower", js.undefined)
    
    inline def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    inline def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    inline def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    inline def setCostexplorer(value: typings.awsSdk.clientsCostexplorerMod.ClientConfiguration): Self = StObject.set(x, "costexplorer", value.asInstanceOf[js.Any])
    
    inline def setCostexplorerUndefined: Self = StObject.set(x, "costexplorer", js.undefined)
    
    inline def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    inline def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    inline def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCur(value: typings.awsSdk.clientsCurMod.ClientConfiguration): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    inline def setCurUndefined: Self = StObject.set(x, "cur", js.undefined)
    
    inline def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    inline def setCustomerprofiles(value: typings.awsSdk.clientsCustomerprofilesMod.ClientConfiguration): Self = StObject.set(x, "customerprofiles", value.asInstanceOf[js.Any])
    
    inline def setCustomerprofilesUndefined: Self = StObject.set(x, "customerprofiles", js.undefined)
    
    inline def setDatabrew(value: typings.awsSdk.clientsDatabrewMod.ClientConfiguration): Self = StObject.set(x, "databrew", value.asInstanceOf[js.Any])
    
    inline def setDatabrewUndefined: Self = StObject.set(x, "databrew", js.undefined)
    
    inline def setDataexchange(value: typings.awsSdk.clientsDataexchangeMod.ClientConfiguration): Self = StObject.set(x, "dataexchange", value.asInstanceOf[js.Any])
    
    inline def setDataexchangeUndefined: Self = StObject.set(x, "dataexchange", js.undefined)
    
    inline def setDatapipeline(value: typings.awsSdk.clientsDatapipelineMod.ClientConfiguration): Self = StObject.set(x, "datapipeline", value.asInstanceOf[js.Any])
    
    inline def setDatapipelineUndefined: Self = StObject.set(x, "datapipeline", js.undefined)
    
    inline def setDatasync(value: typings.awsSdk.clientsDatasyncMod.ClientConfiguration): Self = StObject.set(x, "datasync", value.asInstanceOf[js.Any])
    
    inline def setDatasyncUndefined: Self = StObject.set(x, "datasync", js.undefined)
    
    inline def setDax(value: typings.awsSdk.clientsDaxMod.ClientConfiguration): Self = StObject.set(x, "dax", value.asInstanceOf[js.Any])
    
    inline def setDaxUndefined: Self = StObject.set(x, "dax", js.undefined)
    
    inline def setDetective(value: typings.awsSdk.clientsDetectiveMod.ClientConfiguration): Self = StObject.set(x, "detective", value.asInstanceOf[js.Any])
    
    inline def setDetectiveUndefined: Self = StObject.set(x, "detective", js.undefined)
    
    inline def setDevicefarm(value: typings.awsSdk.clientsDevicefarmMod.ClientConfiguration): Self = StObject.set(x, "devicefarm", value.asInstanceOf[js.Any])
    
    inline def setDevicefarmUndefined: Self = StObject.set(x, "devicefarm", js.undefined)
    
    inline def setDevopsguru(value: typings.awsSdk.clientsDevopsguruMod.ClientConfiguration): Self = StObject.set(x, "devopsguru", value.asInstanceOf[js.Any])
    
    inline def setDevopsguruUndefined: Self = StObject.set(x, "devopsguru", js.undefined)
    
    inline def setDirectconnect(value: typings.awsSdk.clientsDirectconnectMod.ClientConfiguration): Self = StObject.set(x, "directconnect", value.asInstanceOf[js.Any])
    
    inline def setDirectconnectUndefined: Self = StObject.set(x, "directconnect", js.undefined)
    
    inline def setDirectoryservice(value: typings.awsSdk.clientsDirectoryserviceMod.ClientConfiguration): Self = StObject.set(x, "directoryservice", value.asInstanceOf[js.Any])
    
    inline def setDirectoryserviceUndefined: Self = StObject.set(x, "directoryservice", js.undefined)
    
    inline def setDiscovery(value: typings.awsSdk.clientsDiscoveryMod.ClientConfiguration): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setDlm(value: typings.awsSdk.clientsDlmMod.ClientConfiguration): Self = StObject.set(x, "dlm", value.asInstanceOf[js.Any])
    
    inline def setDlmUndefined: Self = StObject.set(x, "dlm", js.undefined)
    
    inline def setDms(value: typings.awsSdk.clientsDmsMod.ClientConfiguration): Self = StObject.set(x, "dms", value.asInstanceOf[js.Any])
    
    inline def setDmsUndefined: Self = StObject.set(x, "dms", js.undefined)
    
    inline def setDocdb(value: typings.awsSdk.clientsDocdbMod.ClientConfiguration): Self = StObject.set(x, "docdb", value.asInstanceOf[js.Any])
    
    inline def setDocdbUndefined: Self = StObject.set(x, "docdb", js.undefined)
    
    inline def setDocdbelastic(value: typings.awsSdk.clientsDocdbelasticMod.ClientConfiguration): Self = StObject.set(x, "docdbelastic", value.asInstanceOf[js.Any])
    
    inline def setDocdbelasticUndefined: Self = StObject.set(x, "docdbelastic", js.undefined)
    
    inline def setDrs(value: typings.awsSdk.clientsDrsMod.ClientConfiguration): Self = StObject.set(x, "drs", value.asInstanceOf[js.Any])
    
    inline def setDrsUndefined: Self = StObject.set(x, "drs", js.undefined)
    
    inline def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    inline def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    inline def setDynamodb(value: typings.awsSdk.clientsDynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setDynamodbstreams(value: typings.awsSdk.clientsDynamodbstreamsMod.ClientConfiguration): Self = StObject.set(x, "dynamodbstreams", value.asInstanceOf[js.Any])
    
    inline def setDynamodbstreamsUndefined: Self = StObject.set(x, "dynamodbstreams", js.undefined)
    
    inline def setEbs(value: typings.awsSdk.clientsEbsMod.ClientConfiguration): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    inline def setEc2(value: typings.awsSdk.clientsEc2Mod.ClientConfiguration): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
    
    inline def setEc2instanceconnect(value: typings.awsSdk.clientsEc2instanceconnectMod.ClientConfiguration): Self = StObject.set(x, "ec2instanceconnect", value.asInstanceOf[js.Any])
    
    inline def setEc2instanceconnectUndefined: Self = StObject.set(x, "ec2instanceconnect", js.undefined)
    
    inline def setEcr(value: typings.awsSdk.clientsEcrMod.ClientConfiguration): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
    
    inline def setEcrUndefined: Self = StObject.set(x, "ecr", js.undefined)
    
    inline def setEcrpublic(value: typings.awsSdk.clientsEcrpublicMod.ClientConfiguration): Self = StObject.set(x, "ecrpublic", value.asInstanceOf[js.Any])
    
    inline def setEcrpublicUndefined: Self = StObject.set(x, "ecrpublic", js.undefined)
    
    inline def setEcs(value: typings.awsSdk.clientsEcsMod.ClientConfiguration): Self = StObject.set(x, "ecs", value.asInstanceOf[js.Any])
    
    inline def setEcsUndefined: Self = StObject.set(x, "ecs", js.undefined)
    
    inline def setEfs(value: typings.awsSdk.clientsEfsMod.ClientConfiguration): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
    
    inline def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
    
    inline def setEks(value: typings.awsSdk.clientsEksMod.ClientConfiguration): Self = StObject.set(x, "eks", value.asInstanceOf[js.Any])
    
    inline def setEksUndefined: Self = StObject.set(x, "eks", js.undefined)
    
    inline def setElasticache(value: typings.awsSdk.clientsElasticacheMod.ClientConfiguration): Self = StObject.set(x, "elasticache", value.asInstanceOf[js.Any])
    
    inline def setElasticacheUndefined: Self = StObject.set(x, "elasticache", js.undefined)
    
    inline def setElasticbeanstalk(value: typings.awsSdk.clientsElasticbeanstalkMod.ClientConfiguration): Self = StObject.set(x, "elasticbeanstalk", value.asInstanceOf[js.Any])
    
    inline def setElasticbeanstalkUndefined: Self = StObject.set(x, "elasticbeanstalk", js.undefined)
    
    inline def setElasticinference(value: typings.awsSdk.clientsElasticinferenceMod.ClientConfiguration): Self = StObject.set(x, "elasticinference", value.asInstanceOf[js.Any])
    
    inline def setElasticinferenceUndefined: Self = StObject.set(x, "elasticinference", js.undefined)
    
    inline def setElastictranscoder(value: typings.awsSdk.clientsElastictranscoderMod.ClientConfiguration): Self = StObject.set(x, "elastictranscoder", value.asInstanceOf[js.Any])
    
    inline def setElastictranscoderUndefined: Self = StObject.set(x, "elastictranscoder", js.undefined)
    
    inline def setElb(value: typings.awsSdk.clientsElbMod.ClientConfiguration): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
    
    inline def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
    
    inline def setElbv2(value: typings.awsSdk.clientsElbv2Mod.ClientConfiguration): Self = StObject.set(x, "elbv2", value.asInstanceOf[js.Any])
    
    inline def setElbv2Undefined: Self = StObject.set(x, "elbv2", js.undefined)
    
    inline def setEmr(value: typings.awsSdk.clientsEmrMod.ClientConfiguration): Self = StObject.set(x, "emr", value.asInstanceOf[js.Any])
    
    inline def setEmrUndefined: Self = StObject.set(x, "emr", js.undefined)
    
    inline def setEmrcontainers(value: typings.awsSdk.clientsEmrcontainersMod.ClientConfiguration): Self = StObject.set(x, "emrcontainers", value.asInstanceOf[js.Any])
    
    inline def setEmrcontainersUndefined: Self = StObject.set(x, "emrcontainers", js.undefined)
    
    inline def setEmrserverless(value: typings.awsSdk.clientsEmrserverlessMod.ClientConfiguration): Self = StObject.set(x, "emrserverless", value.asInstanceOf[js.Any])
    
    inline def setEmrserverlessUndefined: Self = StObject.set(x, "emrserverless", js.undefined)
    
    inline def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    inline def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    inline def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    inline def setEs(value: typings.awsSdk.clientsEsMod.ClientConfiguration): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    inline def setEventbridge(value: typings.awsSdk.clientsEventbridgeMod.ClientConfiguration): Self = StObject.set(x, "eventbridge", value.asInstanceOf[js.Any])
    
    inline def setEventbridgeUndefined: Self = StObject.set(x, "eventbridge", js.undefined)
    
    inline def setEvidently(value: typings.awsSdk.clientsEvidentlyMod.ClientConfiguration): Self = StObject.set(x, "evidently", value.asInstanceOf[js.Any])
    
    inline def setEvidentlyUndefined: Self = StObject.set(x, "evidently", js.undefined)
    
    inline def setFinspace(value: typings.awsSdk.clientsFinspaceMod.ClientConfiguration): Self = StObject.set(x, "finspace", value.asInstanceOf[js.Any])
    
    inline def setFinspaceUndefined: Self = StObject.set(x, "finspace", js.undefined)
    
    inline def setFinspacedata(value: typings.awsSdk.clientsFinspacedataMod.ClientConfiguration): Self = StObject.set(x, "finspacedata", value.asInstanceOf[js.Any])
    
    inline def setFinspacedataUndefined: Self = StObject.set(x, "finspacedata", js.undefined)
    
    inline def setFirehose(value: typings.awsSdk.clientsFirehoseMod.ClientConfiguration): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setFis(value: typings.awsSdk.clientsFisMod.ClientConfiguration): Self = StObject.set(x, "fis", value.asInstanceOf[js.Any])
    
    inline def setFisUndefined: Self = StObject.set(x, "fis", js.undefined)
    
    inline def setFms(value: typings.awsSdk.clientsFmsMod.ClientConfiguration): Self = StObject.set(x, "fms", value.asInstanceOf[js.Any])
    
    inline def setFmsUndefined: Self = StObject.set(x, "fms", js.undefined)
    
    inline def setForecastqueryservice(value: typings.awsSdk.clientsForecastqueryserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastqueryservice", value.asInstanceOf[js.Any])
    
    inline def setForecastqueryserviceUndefined: Self = StObject.set(x, "forecastqueryservice", js.undefined)
    
    inline def setForecastservice(value: typings.awsSdk.clientsForecastserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastservice", value.asInstanceOf[js.Any])
    
    inline def setForecastserviceUndefined: Self = StObject.set(x, "forecastservice", js.undefined)
    
    inline def setFrauddetector(value: typings.awsSdk.clientsFrauddetectorMod.ClientConfiguration): Self = StObject.set(x, "frauddetector", value.asInstanceOf[js.Any])
    
    inline def setFrauddetectorUndefined: Self = StObject.set(x, "frauddetector", js.undefined)
    
    inline def setFsx(value: typings.awsSdk.clientsFsxMod.ClientConfiguration): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
    
    inline def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
    
    inline def setGamelift(value: typings.awsSdk.clientsGameliftMod.ClientConfiguration): Self = StObject.set(x, "gamelift", value.asInstanceOf[js.Any])
    
    inline def setGameliftUndefined: Self = StObject.set(x, "gamelift", js.undefined)
    
    inline def setGamesparks(value: typings.awsSdk.clientsGamesparksMod.ClientConfiguration): Self = StObject.set(x, "gamesparks", value.asInstanceOf[js.Any])
    
    inline def setGamesparksUndefined: Self = StObject.set(x, "gamesparks", js.undefined)
    
    inline def setGlacier(value: typings.awsSdk.clientsGlacierMod.ClientConfiguration): Self = StObject.set(x, "glacier", value.asInstanceOf[js.Any])
    
    inline def setGlacierUndefined: Self = StObject.set(x, "glacier", js.undefined)
    
    inline def setGlobalaccelerator(value: typings.awsSdk.clientsGlobalacceleratorMod.ClientConfiguration): Self = StObject.set(x, "globalaccelerator", value.asInstanceOf[js.Any])
    
    inline def setGlobalacceleratorUndefined: Self = StObject.set(x, "globalaccelerator", js.undefined)
    
    inline def setGlue(value: typings.awsSdk.clientsGlueMod.ClientConfiguration): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    inline def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
    
    inline def setGrafana(value: typings.awsSdk.clientsGrafanaMod.ClientConfiguration): Self = StObject.set(x, "grafana", value.asInstanceOf[js.Any])
    
    inline def setGrafanaUndefined: Self = StObject.set(x, "grafana", js.undefined)
    
    inline def setGreengrass(value: typings.awsSdk.clientsGreengrassMod.ClientConfiguration): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
    
    inline def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
    
    inline def setGreengrassv2(value: typings.awsSdk.clientsGreengrassv2Mod.ClientConfiguration): Self = StObject.set(x, "greengrassv2", value.asInstanceOf[js.Any])
    
    inline def setGreengrassv2Undefined: Self = StObject.set(x, "greengrassv2", js.undefined)
    
    inline def setGroundstation(value: typings.awsSdk.clientsGroundstationMod.ClientConfiguration): Self = StObject.set(x, "groundstation", value.asInstanceOf[js.Any])
    
    inline def setGroundstationUndefined: Self = StObject.set(x, "groundstation", js.undefined)
    
    inline def setGuardduty(value: typings.awsSdk.clientsGuarddutyMod.ClientConfiguration): Self = StObject.set(x, "guardduty", value.asInstanceOf[js.Any])
    
    inline def setGuarddutyUndefined: Self = StObject.set(x, "guardduty", js.undefined)
    
    inline def setHealth(value: typings.awsSdk.clientsHealthMod.ClientConfiguration): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setHealthlake(value: typings.awsSdk.clientsHealthlakeMod.ClientConfiguration): Self = StObject.set(x, "healthlake", value.asInstanceOf[js.Any])
    
    inline def setHealthlakeUndefined: Self = StObject.set(x, "healthlake", js.undefined)
    
    inline def setHoneycode(value: typings.awsSdk.clientsHoneycodeMod.ClientConfiguration): Self = StObject.set(x, "honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "honeycode", js.undefined)
    
    inline def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    inline def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setIam(value: typings.awsSdk.clientsIamMod.ClientConfiguration): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    inline def setIdentitystore(value: typings.awsSdk.clientsIdentitystoreMod.ClientConfiguration): Self = StObject.set(x, "identitystore", value.asInstanceOf[js.Any])
    
    inline def setIdentitystoreUndefined: Self = StObject.set(x, "identitystore", js.undefined)
    
    inline def setImagebuilder(value: typings.awsSdk.clientsImagebuilderMod.ClientConfiguration): Self = StObject.set(x, "imagebuilder", value.asInstanceOf[js.Any])
    
    inline def setImagebuilderUndefined: Self = StObject.set(x, "imagebuilder", js.undefined)
    
    inline def setImportexport(value: typings.awsSdk.clientsImportexportMod.ClientConfiguration): Self = StObject.set(x, "importexport", value.asInstanceOf[js.Any])
    
    inline def setImportexportUndefined: Self = StObject.set(x, "importexport", js.undefined)
    
    inline def setInspector(value: typings.awsSdk.clientsInspectorMod.ClientConfiguration): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    inline def setInspector2(value: typings.awsSdk.clientsInspector2Mod.ClientConfiguration): Self = StObject.set(x, "inspector2", value.asInstanceOf[js.Any])
    
    inline def setInspector2Undefined: Self = StObject.set(x, "inspector2", js.undefined)
    
    inline def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    
    inline def setInternetmonitor(value: typings.awsSdk.clientsInternetmonitorMod.ClientConfiguration): Self = StObject.set(x, "internetmonitor", value.asInstanceOf[js.Any])
    
    inline def setInternetmonitorUndefined: Self = StObject.set(x, "internetmonitor", js.undefined)
    
    inline def setIot(value: typings.awsSdk.clientsIotMod.ClientConfiguration): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    inline def setIot1clickdevicesservice(value: typings.awsSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration): Self = StObject.set(x, "iot1clickdevicesservice", value.asInstanceOf[js.Any])
    
    inline def setIot1clickdevicesserviceUndefined: Self = StObject.set(x, "iot1clickdevicesservice", js.undefined)
    
    inline def setIot1clickprojects(value: typings.awsSdk.clientsIot1clickprojectsMod.ClientConfiguration): Self = StObject.set(x, "iot1clickprojects", value.asInstanceOf[js.Any])
    
    inline def setIot1clickprojectsUndefined: Self = StObject.set(x, "iot1clickprojects", js.undefined)
    
    inline def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    inline def setIotanalytics(value: typings.awsSdk.clientsIotanalyticsMod.ClientConfiguration): Self = StObject.set(x, "iotanalytics", value.asInstanceOf[js.Any])
    
    inline def setIotanalyticsUndefined: Self = StObject.set(x, "iotanalytics", js.undefined)
    
    inline def setIotdata(value: typings.awsSdk.clientsIotdataMod.ClientConfiguration): Self = StObject.set(x, "iotdata", value.asInstanceOf[js.Any])
    
    inline def setIotdataUndefined: Self = StObject.set(x, "iotdata", js.undefined)
    
    inline def setIotdeviceadvisor(value: typings.awsSdk.clientsIotdeviceadvisorMod.ClientConfiguration): Self = StObject.set(x, "iotdeviceadvisor", value.asInstanceOf[js.Any])
    
    inline def setIotdeviceadvisorUndefined: Self = StObject.set(x, "iotdeviceadvisor", js.undefined)
    
    inline def setIotevents(value: typings.awsSdk.clientsIoteventsMod.ClientConfiguration): Self = StObject.set(x, "iotevents", value.asInstanceOf[js.Any])
    
    inline def setIoteventsUndefined: Self = StObject.set(x, "iotevents", js.undefined)
    
    inline def setIoteventsdata(value: typings.awsSdk.clientsIoteventsdataMod.ClientConfiguration): Self = StObject.set(x, "ioteventsdata", value.asInstanceOf[js.Any])
    
    inline def setIoteventsdataUndefined: Self = StObject.set(x, "ioteventsdata", js.undefined)
    
    inline def setIotfleethub(value: typings.awsSdk.clientsIotfleethubMod.ClientConfiguration): Self = StObject.set(x, "iotfleethub", value.asInstanceOf[js.Any])
    
    inline def setIotfleethubUndefined: Self = StObject.set(x, "iotfleethub", js.undefined)
    
    inline def setIotfleetwise(value: typings.awsSdk.clientsIotfleetwiseMod.ClientConfiguration): Self = StObject.set(x, "iotfleetwise", value.asInstanceOf[js.Any])
    
    inline def setIotfleetwiseUndefined: Self = StObject.set(x, "iotfleetwise", js.undefined)
    
    inline def setIotjobsdataplane(value: typings.awsSdk.clientsIotjobsdataplaneMod.ClientConfiguration): Self = StObject.set(x, "iotjobsdataplane", value.asInstanceOf[js.Any])
    
    inline def setIotjobsdataplaneUndefined: Self = StObject.set(x, "iotjobsdataplane", js.undefined)
    
    inline def setIotroborunner(value: typings.awsSdk.clientsIotroborunnerMod.ClientConfiguration): Self = StObject.set(x, "iotroborunner", value.asInstanceOf[js.Any])
    
    inline def setIotroborunnerUndefined: Self = StObject.set(x, "iotroborunner", js.undefined)
    
    inline def setIotsecuretunneling(value: typings.awsSdk.clientsIotsecuretunnelingMod.ClientConfiguration): Self = StObject.set(x, "iotsecuretunneling", value.asInstanceOf[js.Any])
    
    inline def setIotsecuretunnelingUndefined: Self = StObject.set(x, "iotsecuretunneling", js.undefined)
    
    inline def setIotsitewise(value: typings.awsSdk.clientsIotsitewiseMod.ClientConfiguration): Self = StObject.set(x, "iotsitewise", value.asInstanceOf[js.Any])
    
    inline def setIotsitewiseUndefined: Self = StObject.set(x, "iotsitewise", js.undefined)
    
    inline def setIotthingsgraph(value: typings.awsSdk.clientsIotthingsgraphMod.ClientConfiguration): Self = StObject.set(x, "iotthingsgraph", value.asInstanceOf[js.Any])
    
    inline def setIotthingsgraphUndefined: Self = StObject.set(x, "iotthingsgraph", js.undefined)
    
    inline def setIottwinmaker(value: typings.awsSdk.clientsIottwinmakerMod.ClientConfiguration): Self = StObject.set(x, "iottwinmaker", value.asInstanceOf[js.Any])
    
    inline def setIottwinmakerUndefined: Self = StObject.set(x, "iottwinmaker", js.undefined)
    
    inline def setIotwireless(value: typings.awsSdk.clientsIotwirelessMod.ClientConfiguration): Self = StObject.set(x, "iotwireless", value.asInstanceOf[js.Any])
    
    inline def setIotwirelessUndefined: Self = StObject.set(x, "iotwireless", js.undefined)
    
    inline def setIvs(value: typings.awsSdk.clientsIvsMod.ClientConfiguration): Self = StObject.set(x, "ivs", value.asInstanceOf[js.Any])
    
    inline def setIvsUndefined: Self = StObject.set(x, "ivs", js.undefined)
    
    inline def setIvschat(value: typings.awsSdk.clientsIvschatMod.ClientConfiguration): Self = StObject.set(x, "ivschat", value.asInstanceOf[js.Any])
    
    inline def setIvschatUndefined: Self = StObject.set(x, "ivschat", js.undefined)
    
    inline def setIvsrealtime(value: typings.awsSdk.clientsIvsrealtimeMod.ClientConfiguration): Self = StObject.set(x, "ivsrealtime", value.asInstanceOf[js.Any])
    
    inline def setIvsrealtimeUndefined: Self = StObject.set(x, "ivsrealtime", js.undefined)
    
    inline def setKafka(value: typings.awsSdk.clientsKafkaMod.ClientConfiguration): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    inline def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    inline def setKafkaconnect(value: typings.awsSdk.clientsKafkaconnectMod.ClientConfiguration): Self = StObject.set(x, "kafkaconnect", value.asInstanceOf[js.Any])
    
    inline def setKafkaconnectUndefined: Self = StObject.set(x, "kafkaconnect", js.undefined)
    
    inline def setKendra(value: typings.awsSdk.clientsKendraMod.ClientConfiguration): Self = StObject.set(x, "kendra", value.asInstanceOf[js.Any])
    
    inline def setKendraUndefined: Self = StObject.set(x, "kendra", js.undefined)
    
    inline def setKendraranking(value: typings.awsSdk.clientsKendrarankingMod.ClientConfiguration): Self = StObject.set(x, "kendraranking", value.asInstanceOf[js.Any])
    
    inline def setKendrarankingUndefined: Self = StObject.set(x, "kendraranking", js.undefined)
    
    inline def setKeyspaces(value: typings.awsSdk.clientsKeyspacesMod.ClientConfiguration): Self = StObject.set(x, "keyspaces", value.asInstanceOf[js.Any])
    
    inline def setKeyspacesUndefined: Self = StObject.set(x, "keyspaces", js.undefined)
    
    inline def setKinesis(value: typings.awsSdk.clientsKinesisMod.ClientConfiguration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setKinesisanalytics(value: typings.awsSdk.clientsKinesisanalyticsMod.ClientConfiguration): Self = StObject.set(x, "kinesisanalytics", value.asInstanceOf[js.Any])
    
    inline def setKinesisanalyticsUndefined: Self = StObject.set(x, "kinesisanalytics", js.undefined)
    
    inline def setKinesisanalyticsv2(value: typings.awsSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration): Self = StObject.set(x, "kinesisanalyticsv2", value.asInstanceOf[js.Any])
    
    inline def setKinesisanalyticsv2Undefined: Self = StObject.set(x, "kinesisanalyticsv2", js.undefined)
    
    inline def setKinesisvideo(value: typings.awsSdk.clientsKinesisvideoMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideo", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideoUndefined: Self = StObject.set(x, "kinesisvideo", js.undefined)
    
    inline def setKinesisvideoarchivedmedia(value: typings.awsSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideoarchivedmedia", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideoarchivedmediaUndefined: Self = StObject.set(x, "kinesisvideoarchivedmedia", js.undefined)
    
    inline def setKinesisvideomedia(value: typings.awsSdk.clientsKinesisvideomediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideomedia", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideomediaUndefined: Self = StObject.set(x, "kinesisvideomedia", js.undefined)
    
    inline def setKinesisvideosignalingchannels(value: typings.awsSdk.clientsKinesisvideosignalingchannelsMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideosignalingchannels", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideosignalingchannelsUndefined: Self = StObject.set(x, "kinesisvideosignalingchannels", js.undefined)
    
    inline def setKinesisvideowebrtcstorage(value: typings.awsSdk.clientsKinesisvideowebrtcstorageMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideowebrtcstorage", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideowebrtcstorageUndefined: Self = StObject.set(x, "kinesisvideowebrtcstorage", js.undefined)
    
    inline def setKms(value: typings.awsSdk.clientsKmsMod.ClientConfiguration): Self = StObject.set(x, "kms", value.asInstanceOf[js.Any])
    
    inline def setKmsUndefined: Self = StObject.set(x, "kms", js.undefined)
    
    inline def setLakeformation(value: typings.awsSdk.clientsLakeformationMod.ClientConfiguration): Self = StObject.set(x, "lakeformation", value.asInstanceOf[js.Any])
    
    inline def setLakeformationUndefined: Self = StObject.set(x, "lakeformation", js.undefined)
    
    inline def setLambda(value: typings.awsSdk.clientsLambdaMod.ClientConfiguration): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setLexmodelbuildingservice(value: typings.awsSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration): Self = StObject.set(x, "lexmodelbuildingservice", value.asInstanceOf[js.Any])
    
    inline def setLexmodelbuildingserviceUndefined: Self = StObject.set(x, "lexmodelbuildingservice", js.undefined)
    
    inline def setLexmodelsv2(value: typings.awsSdk.clientsLexmodelsv2Mod.ClientConfiguration): Self = StObject.set(x, "lexmodelsv2", value.asInstanceOf[js.Any])
    
    inline def setLexmodelsv2Undefined: Self = StObject.set(x, "lexmodelsv2", js.undefined)
    
    inline def setLexruntime(value: typings.awsSdk.clientsLexruntimeMod.ClientConfiguration): Self = StObject.set(x, "lexruntime", value.asInstanceOf[js.Any])
    
    inline def setLexruntimeUndefined: Self = StObject.set(x, "lexruntime", js.undefined)
    
    inline def setLexruntimev2(value: typings.awsSdk.clientsLexruntimev2Mod.ClientConfiguration): Self = StObject.set(x, "lexruntimev2", value.asInstanceOf[js.Any])
    
    inline def setLexruntimev2Undefined: Self = StObject.set(x, "lexruntimev2", js.undefined)
    
    inline def setLicensemanager(value: typings.awsSdk.clientsLicensemanagerMod.ClientConfiguration): Self = StObject.set(x, "licensemanager", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerUndefined: Self = StObject.set(x, "licensemanager", js.undefined)
    
    inline def setLicensemanagerlinuxsubscriptions(value: typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.ClientConfiguration): Self = StObject.set(x, "licensemanagerlinuxsubscriptions", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerlinuxsubscriptionsUndefined: Self = StObject.set(x, "licensemanagerlinuxsubscriptions", js.undefined)
    
    inline def setLicensemanagerusersubscriptions(value: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.ClientConfiguration): Self = StObject.set(x, "licensemanagerusersubscriptions", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerusersubscriptionsUndefined: Self = StObject.set(x, "licensemanagerusersubscriptions", js.undefined)
    
    inline def setLightsail(value: typings.awsSdk.clientsLightsailMod.ClientConfiguration): Self = StObject.set(x, "lightsail", value.asInstanceOf[js.Any])
    
    inline def setLightsailUndefined: Self = StObject.set(x, "lightsail", js.undefined)
    
    inline def setLocation(value: typings.awsSdk.clientsLocationMod.ClientConfiguration): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setLookoutequipment(value: typings.awsSdk.clientsLookoutequipmentMod.ClientConfiguration): Self = StObject.set(x, "lookoutequipment", value.asInstanceOf[js.Any])
    
    inline def setLookoutequipmentUndefined: Self = StObject.set(x, "lookoutequipment", js.undefined)
    
    inline def setLookoutmetrics(value: typings.awsSdk.clientsLookoutmetricsMod.ClientConfiguration): Self = StObject.set(x, "lookoutmetrics", value.asInstanceOf[js.Any])
    
    inline def setLookoutmetricsUndefined: Self = StObject.set(x, "lookoutmetrics", js.undefined)
    
    inline def setLookoutvision(value: typings.awsSdk.clientsLookoutvisionMod.ClientConfiguration): Self = StObject.set(x, "lookoutvision", value.asInstanceOf[js.Any])
    
    inline def setLookoutvisionUndefined: Self = StObject.set(x, "lookoutvision", js.undefined)
    
    inline def setM2(value: typings.awsSdk.clientsM2Mod.ClientConfiguration): Self = StObject.set(x, "m2", value.asInstanceOf[js.Any])
    
    inline def setM2Undefined: Self = StObject.set(x, "m2", js.undefined)
    
    inline def setMachinelearning(value: typings.awsSdk.clientsMachinelearningMod.ClientConfiguration): Self = StObject.set(x, "machinelearning", value.asInstanceOf[js.Any])
    
    inline def setMachinelearningUndefined: Self = StObject.set(x, "machinelearning", js.undefined)
    
    inline def setMacie(value: typings.awsSdk.clientsMacieMod.ClientConfiguration): Self = StObject.set(x, "macie", value.asInstanceOf[js.Any])
    
    inline def setMacie2(value: typings.awsSdk.clientsMacie2Mod.ClientConfiguration): Self = StObject.set(x, "macie2", value.asInstanceOf[js.Any])
    
    inline def setMacie2Undefined: Self = StObject.set(x, "macie2", js.undefined)
    
    inline def setMacieUndefined: Self = StObject.set(x, "macie", js.undefined)
    
    inline def setManagedblockchain(value: typings.awsSdk.clientsManagedblockchainMod.ClientConfiguration): Self = StObject.set(x, "managedblockchain", value.asInstanceOf[js.Any])
    
    inline def setManagedblockchainUndefined: Self = StObject.set(x, "managedblockchain", js.undefined)
    
    inline def setMarketplacecatalog(value: typings.awsSdk.clientsMarketplacecatalogMod.ClientConfiguration): Self = StObject.set(x, "marketplacecatalog", value.asInstanceOf[js.Any])
    
    inline def setMarketplacecatalogUndefined: Self = StObject.set(x, "marketplacecatalog", js.undefined)
    
    inline def setMarketplacecommerceanalytics(value: typings.awsSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration): Self = StObject.set(x, "marketplacecommerceanalytics", value.asInstanceOf[js.Any])
    
    inline def setMarketplacecommerceanalyticsUndefined: Self = StObject.set(x, "marketplacecommerceanalytics", js.undefined)
    
    inline def setMarketplaceentitlementservice(value: typings.awsSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration): Self = StObject.set(x, "marketplaceentitlementservice", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceentitlementserviceUndefined: Self = StObject.set(x, "marketplaceentitlementservice", js.undefined)
    
    inline def setMarketplacemetering(value: typings.awsSdk.clientsMarketplacemeteringMod.ClientConfiguration): Self = StObject.set(x, "marketplacemetering", value.asInstanceOf[js.Any])
    
    inline def setMarketplacemeteringUndefined: Self = StObject.set(x, "marketplacemetering", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMediaconnect(value: typings.awsSdk.clientsMediaconnectMod.ClientConfiguration): Self = StObject.set(x, "mediaconnect", value.asInstanceOf[js.Any])
    
    inline def setMediaconnectUndefined: Self = StObject.set(x, "mediaconnect", js.undefined)
    
    inline def setMediaconvert(value: typings.awsSdk.clientsMediaconvertMod.ClientConfiguration): Self = StObject.set(x, "mediaconvert", value.asInstanceOf[js.Any])
    
    inline def setMediaconvertUndefined: Self = StObject.set(x, "mediaconvert", js.undefined)
    
    inline def setMedialive(value: typings.awsSdk.clientsMedialiveMod.ClientConfiguration): Self = StObject.set(x, "medialive", value.asInstanceOf[js.Any])
    
    inline def setMedialiveUndefined: Self = StObject.set(x, "medialive", js.undefined)
    
    inline def setMediapackage(value: typings.awsSdk.clientsMediapackageMod.ClientConfiguration): Self = StObject.set(x, "mediapackage", value.asInstanceOf[js.Any])
    
    inline def setMediapackageUndefined: Self = StObject.set(x, "mediapackage", js.undefined)
    
    inline def setMediapackagevod(value: typings.awsSdk.clientsMediapackagevodMod.ClientConfiguration): Self = StObject.set(x, "mediapackagevod", value.asInstanceOf[js.Any])
    
    inline def setMediapackagevodUndefined: Self = StObject.set(x, "mediapackagevod", js.undefined)
    
    inline def setMediastore(value: typings.awsSdk.clientsMediastoreMod.ClientConfiguration): Self = StObject.set(x, "mediastore", value.asInstanceOf[js.Any])
    
    inline def setMediastoreUndefined: Self = StObject.set(x, "mediastore", js.undefined)
    
    inline def setMediastoredata(value: typings.awsSdk.clientsMediastoredataMod.ClientConfiguration): Self = StObject.set(x, "mediastoredata", value.asInstanceOf[js.Any])
    
    inline def setMediastoredataUndefined: Self = StObject.set(x, "mediastoredata", js.undefined)
    
    inline def setMediatailor(value: typings.awsSdk.clientsMediatailorMod.ClientConfiguration): Self = StObject.set(x, "mediatailor", value.asInstanceOf[js.Any])
    
    inline def setMediatailorUndefined: Self = StObject.set(x, "mediatailor", js.undefined)
    
    inline def setMemorydb(value: typings.awsSdk.clientsMemorydbMod.ClientConfiguration): Self = StObject.set(x, "memorydb", value.asInstanceOf[js.Any])
    
    inline def setMemorydbUndefined: Self = StObject.set(x, "memorydb", js.undefined)
    
    inline def setMgn(value: typings.awsSdk.clientsMgnMod.ClientConfiguration): Self = StObject.set(x, "mgn", value.asInstanceOf[js.Any])
    
    inline def setMgnUndefined: Self = StObject.set(x, "mgn", js.undefined)
    
    inline def setMigrationhub(value: typings.awsSdk.clientsMigrationhubMod.ClientConfiguration): Self = StObject.set(x, "migrationhub", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubUndefined: Self = StObject.set(x, "migrationhub", js.undefined)
    
    inline def setMigrationhubconfig(value: typings.awsSdk.clientsMigrationhubconfigMod.ClientConfiguration): Self = StObject.set(x, "migrationhubconfig", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubconfigUndefined: Self = StObject.set(x, "migrationhubconfig", js.undefined)
    
    inline def setMigrationhuborchestrator(value: typings.awsSdk.clientsMigrationhuborchestratorMod.ClientConfiguration): Self = StObject.set(x, "migrationhuborchestrator", value.asInstanceOf[js.Any])
    
    inline def setMigrationhuborchestratorUndefined: Self = StObject.set(x, "migrationhuborchestrator", js.undefined)
    
    inline def setMigrationhubrefactorspaces(value: typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientConfiguration): Self = StObject.set(x, "migrationhubrefactorspaces", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubrefactorspacesUndefined: Self = StObject.set(x, "migrationhubrefactorspaces", js.undefined)
    
    inline def setMigrationhubstrategy(value: typings.awsSdk.clientsMigrationhubstrategyMod.ClientConfiguration): Self = StObject.set(x, "migrationhubstrategy", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubstrategyUndefined: Self = StObject.set(x, "migrationhubstrategy", js.undefined)
    
    inline def setMobile(value: typings.awsSdk.clientsMobileMod.ClientConfiguration): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setMobileanalytics(value: typings.awsSdk.clientsMobileanalyticsMod.ClientConfiguration): Self = StObject.set(x, "mobileanalytics", value.asInstanceOf[js.Any])
    
    inline def setMobileanalyticsUndefined: Self = StObject.set(x, "mobileanalytics", js.undefined)
    
    inline def setMq(value: typings.awsSdk.clientsMqMod.ClientConfiguration): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
    
    inline def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
    
    inline def setMturk(value: typings.awsSdk.clientsMturkMod.ClientConfiguration): Self = StObject.set(x, "mturk", value.asInstanceOf[js.Any])
    
    inline def setMturkUndefined: Self = StObject.set(x, "mturk", js.undefined)
    
    inline def setMwaa(value: typings.awsSdk.clientsMwaaMod.ClientConfiguration): Self = StObject.set(x, "mwaa", value.asInstanceOf[js.Any])
    
    inline def setMwaaUndefined: Self = StObject.set(x, "mwaa", js.undefined)
    
    inline def setNeptune(value: typings.awsSdk.clientsNeptuneMod.ClientConfiguration): Self = StObject.set(x, "neptune", value.asInstanceOf[js.Any])
    
    inline def setNeptuneUndefined: Self = StObject.set(x, "neptune", js.undefined)
    
    inline def setNetworkfirewall(value: typings.awsSdk.clientsNetworkfirewallMod.ClientConfiguration): Self = StObject.set(x, "networkfirewall", value.asInstanceOf[js.Any])
    
    inline def setNetworkfirewallUndefined: Self = StObject.set(x, "networkfirewall", js.undefined)
    
    inline def setNetworkmanager(value: typings.awsSdk.clientsNetworkmanagerMod.ClientConfiguration): Self = StObject.set(x, "networkmanager", value.asInstanceOf[js.Any])
    
    inline def setNetworkmanagerUndefined: Self = StObject.set(x, "networkmanager", js.undefined)
    
    inline def setNimble(value: typings.awsSdk.clientsNimbleMod.ClientConfiguration): Self = StObject.set(x, "nimble", value.asInstanceOf[js.Any])
    
    inline def setNimbleUndefined: Self = StObject.set(x, "nimble", js.undefined)
    
    inline def setOam(value: typings.awsSdk.clientsOamMod.ClientConfiguration): Self = StObject.set(x, "oam", value.asInstanceOf[js.Any])
    
    inline def setOamUndefined: Self = StObject.set(x, "oam", js.undefined)
    
    inline def setOmics(value: typings.awsSdk.clientsOmicsMod.ClientConfiguration): Self = StObject.set(x, "omics", value.asInstanceOf[js.Any])
    
    inline def setOmicsUndefined: Self = StObject.set(x, "omics", js.undefined)
    
    inline def setOpensearch(value: typings.awsSdk.clientsOpensearchMod.ClientConfiguration): Self = StObject.set(x, "opensearch", value.asInstanceOf[js.Any])
    
    inline def setOpensearchUndefined: Self = StObject.set(x, "opensearch", js.undefined)
    
    inline def setOpensearchserverless(value: typings.awsSdk.clientsOpensearchserverlessMod.ClientConfiguration): Self = StObject.set(x, "opensearchserverless", value.asInstanceOf[js.Any])
    
    inline def setOpensearchserverlessUndefined: Self = StObject.set(x, "opensearchserverless", js.undefined)
    
    inline def setOpsworks(value: typings.awsSdk.clientsOpsworksMod.ClientConfiguration): Self = StObject.set(x, "opsworks", value.asInstanceOf[js.Any])
    
    inline def setOpsworksUndefined: Self = StObject.set(x, "opsworks", js.undefined)
    
    inline def setOpsworkscm(value: typings.awsSdk.clientsOpsworkscmMod.ClientConfiguration): Self = StObject.set(x, "opsworkscm", value.asInstanceOf[js.Any])
    
    inline def setOpsworkscmUndefined: Self = StObject.set(x, "opsworkscm", js.undefined)
    
    inline def setOrganizations(value: typings.awsSdk.clientsOrganizationsMod.ClientConfiguration): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOsis(value: typings.awsSdk.clientsOsisMod.ClientConfiguration): Self = StObject.set(x, "osis", value.asInstanceOf[js.Any])
    
    inline def setOsisUndefined: Self = StObject.set(x, "osis", js.undefined)
    
    inline def setOutposts(value: typings.awsSdk.clientsOutpostsMod.ClientConfiguration): Self = StObject.set(x, "outposts", value.asInstanceOf[js.Any])
    
    inline def setOutpostsUndefined: Self = StObject.set(x, "outposts", js.undefined)
    
    inline def setPanorama(value: typings.awsSdk.clientsPanoramaMod.ClientConfiguration): Self = StObject.set(x, "panorama", value.asInstanceOf[js.Any])
    
    inline def setPanoramaUndefined: Self = StObject.set(x, "panorama", js.undefined)
    
    inline def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    inline def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    inline def setPersonalize(value: typings.awsSdk.clientsPersonalizeMod.ClientConfiguration): Self = StObject.set(x, "personalize", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeUndefined: Self = StObject.set(x, "personalize", js.undefined)
    
    inline def setPersonalizeevents(value: typings.awsSdk.clientsPersonalizeeventsMod.ClientConfiguration): Self = StObject.set(x, "personalizeevents", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeeventsUndefined: Self = StObject.set(x, "personalizeevents", js.undefined)
    
    inline def setPersonalizeruntime(value: typings.awsSdk.clientsPersonalizeruntimeMod.ClientConfiguration): Self = StObject.set(x, "personalizeruntime", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeruntimeUndefined: Self = StObject.set(x, "personalizeruntime", js.undefined)
    
    inline def setPi(value: typings.awsSdk.clientsPiMod.ClientConfiguration): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
    
    inline def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
    
    inline def setPinpoint(value: typings.awsSdk.clientsPinpointMod.ClientConfiguration): Self = StObject.set(x, "pinpoint", value.asInstanceOf[js.Any])
    
    inline def setPinpointUndefined: Self = StObject.set(x, "pinpoint", js.undefined)
    
    inline def setPinpointemail(value: typings.awsSdk.clientsPinpointemailMod.ClientConfiguration): Self = StObject.set(x, "pinpointemail", value.asInstanceOf[js.Any])
    
    inline def setPinpointemailUndefined: Self = StObject.set(x, "pinpointemail", js.undefined)
    
    inline def setPinpointsmsvoice(value: typings.awsSdk.clientsPinpointsmsvoiceMod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoice", value.asInstanceOf[js.Any])
    
    inline def setPinpointsmsvoiceUndefined: Self = StObject.set(x, "pinpointsmsvoice", js.undefined)
    
    inline def setPinpointsmsvoicev2(value: typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoicev2", value.asInstanceOf[js.Any])
    
    inline def setPinpointsmsvoicev2Undefined: Self = StObject.set(x, "pinpointsmsvoicev2", js.undefined)
    
    inline def setPipes(value: typings.awsSdk.clientsPipesMod.ClientConfiguration): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    inline def setPipesUndefined: Self = StObject.set(x, "pipes", js.undefined)
    
    inline def setPolly(value: typings.awsSdk.clientsPollyMod.ClientConfiguration): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    
    inline def setPollyUndefined: Self = StObject.set(x, "polly", js.undefined)
    
    inline def setPricing(value: typings.awsSdk.clientsPricingMod.ClientConfiguration): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    inline def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    inline def setPrivatenetworks(value: typings.awsSdk.clientsPrivatenetworksMod.ClientConfiguration): Self = StObject.set(x, "privatenetworks", value.asInstanceOf[js.Any])
    
    inline def setPrivatenetworksUndefined: Self = StObject.set(x, "privatenetworks", js.undefined)
    
    inline def setProton(value: typings.awsSdk.clientsProtonMod.ClientConfiguration): Self = StObject.set(x, "proton", value.asInstanceOf[js.Any])
    
    inline def setProtonUndefined: Self = StObject.set(x, "proton", js.undefined)
    
    inline def setQldb(value: typings.awsSdk.clientsQldbMod.ClientConfiguration): Self = StObject.set(x, "qldb", value.asInstanceOf[js.Any])
    
    inline def setQldbUndefined: Self = StObject.set(x, "qldb", js.undefined)
    
    inline def setQldbsession(value: typings.awsSdk.clientsQldbsessionMod.ClientConfiguration): Self = StObject.set(x, "qldbsession", value.asInstanceOf[js.Any])
    
    inline def setQldbsessionUndefined: Self = StObject.set(x, "qldbsession", js.undefined)
    
    inline def setQuicksight(value: typings.awsSdk.clientsQuicksightMod.ClientConfiguration): Self = StObject.set(x, "quicksight", value.asInstanceOf[js.Any])
    
    inline def setQuicksightUndefined: Self = StObject.set(x, "quicksight", js.undefined)
    
    inline def setRam(value: typings.awsSdk.clientsRamMod.ClientConfiguration): Self = StObject.set(x, "ram", value.asInstanceOf[js.Any])
    
    inline def setRamUndefined: Self = StObject.set(x, "ram", js.undefined)
    
    inline def setRbin(value: typings.awsSdk.clientsRbinMod.ClientConfiguration): Self = StObject.set(x, "rbin", value.asInstanceOf[js.Any])
    
    inline def setRbinUndefined: Self = StObject.set(x, "rbin", js.undefined)
    
    inline def setRds(value: typings.awsSdk.clientsRdsMod.ClientConfiguration): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    inline def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    inline def setRdsdataservice(value: typings.awsSdk.clientsRdsdataserviceMod.ClientConfiguration): Self = StObject.set(x, "rdsdataservice", value.asInstanceOf[js.Any])
    
    inline def setRdsdataserviceUndefined: Self = StObject.set(x, "rdsdataservice", js.undefined)
    
    inline def setRedshift(value: typings.awsSdk.clientsRedshiftMod.ClientConfiguration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    inline def setRedshiftdata(value: typings.awsSdk.clientsRedshiftdataMod.ClientConfiguration): Self = StObject.set(x, "redshiftdata", value.asInstanceOf[js.Any])
    
    inline def setRedshiftdataUndefined: Self = StObject.set(x, "redshiftdata", js.undefined)
    
    inline def setRedshiftserverless(value: typings.awsSdk.clientsRedshiftserverlessMod.ClientConfiguration): Self = StObject.set(x, "redshiftserverless", value.asInstanceOf[js.Any])
    
    inline def setRedshiftserverlessUndefined: Self = StObject.set(x, "redshiftserverless", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRekognition(value: typings.awsSdk.clientsRekognitionMod.ClientConfiguration): Self = StObject.set(x, "rekognition", value.asInstanceOf[js.Any])
    
    inline def setRekognitionUndefined: Self = StObject.set(x, "rekognition", js.undefined)
    
    inline def setResiliencehub(value: typings.awsSdk.clientsResiliencehubMod.ClientConfiguration): Self = StObject.set(x, "resiliencehub", value.asInstanceOf[js.Any])
    
    inline def setResiliencehubUndefined: Self = StObject.set(x, "resiliencehub", js.undefined)
    
    inline def setResourceexplorer2(value: typings.awsSdk.clientsResourceexplorer2Mod.ClientConfiguration): Self = StObject.set(x, "resourceexplorer2", value.asInstanceOf[js.Any])
    
    inline def setResourceexplorer2Undefined: Self = StObject.set(x, "resourceexplorer2", js.undefined)
    
    inline def setResourcegroups(value: typings.awsSdk.clientsResourcegroupsMod.ClientConfiguration): Self = StObject.set(x, "resourcegroups", value.asInstanceOf[js.Any])
    
    inline def setResourcegroupsUndefined: Self = StObject.set(x, "resourcegroups", js.undefined)
    
    inline def setResourcegroupstaggingapi(value: typings.awsSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration): Self = StObject.set(x, "resourcegroupstaggingapi", value.asInstanceOf[js.Any])
    
    inline def setResourcegroupstaggingapiUndefined: Self = StObject.set(x, "resourcegroupstaggingapi", js.undefined)
    
    inline def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    inline def setRobomaker(value: typings.awsSdk.clientsRobomakerMod.ClientConfiguration): Self = StObject.set(x, "robomaker", value.asInstanceOf[js.Any])
    
    inline def setRobomakerUndefined: Self = StObject.set(x, "robomaker", js.undefined)
    
    inline def setRolesanywhere(value: typings.awsSdk.clientsRolesanywhereMod.ClientConfiguration): Self = StObject.set(x, "rolesanywhere", value.asInstanceOf[js.Any])
    
    inline def setRolesanywhereUndefined: Self = StObject.set(x, "rolesanywhere", js.undefined)
    
    inline def setRoute53(value: typings.awsSdk.clientsRoute53Mod.ClientConfiguration): Self = StObject.set(x, "route53", value.asInstanceOf[js.Any])
    
    inline def setRoute53Undefined: Self = StObject.set(x, "route53", js.undefined)
    
    inline def setRoute53domains(value: typings.awsSdk.clientsRoute53domainsMod.ClientConfiguration): Self = StObject.set(x, "route53domains", value.asInstanceOf[js.Any])
    
    inline def setRoute53domainsUndefined: Self = StObject.set(x, "route53domains", js.undefined)
    
    inline def setRoute53recoverycluster(value: typings.awsSdk.clientsRoute53recoveryclusterMod.ClientConfiguration): Self = StObject.set(x, "route53recoverycluster", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoveryclusterUndefined: Self = StObject.set(x, "route53recoverycluster", js.undefined)
    
    inline def setRoute53recoverycontrolconfig(value: typings.awsSdk.clientsRoute53recoverycontrolconfigMod.ClientConfiguration): Self = StObject.set(x, "route53recoverycontrolconfig", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoverycontrolconfigUndefined: Self = StObject.set(x, "route53recoverycontrolconfig", js.undefined)
    
    inline def setRoute53recoveryreadiness(value: typings.awsSdk.clientsRoute53recoveryreadinessMod.ClientConfiguration): Self = StObject.set(x, "route53recoveryreadiness", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoveryreadinessUndefined: Self = StObject.set(x, "route53recoveryreadiness", js.undefined)
    
    inline def setRoute53resolver(value: typings.awsSdk.clientsRoute53resolverMod.ClientConfiguration): Self = StObject.set(x, "route53resolver", value.asInstanceOf[js.Any])
    
    inline def setRoute53resolverUndefined: Self = StObject.set(x, "route53resolver", js.undefined)
    
    inline def setRum(value: typings.awsSdk.clientsRumMod.ClientConfiguration): Self = StObject.set(x, "rum", value.asInstanceOf[js.Any])
    
    inline def setRumUndefined: Self = StObject.set(x, "rum", js.undefined)
    
    inline def setS3(value: typings.awsSdk.clientsS3Mod.ClientConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3BucketEndpoint(value: Boolean): Self = StObject.set(x, "s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    inline def setS3BucketEndpointUndefined: Self = StObject.set(x, "s3BucketEndpoint", js.undefined)
    
    inline def setS3DisableBodySigning(value: Boolean): Self = StObject.set(x, "s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    inline def setS3DisableBodySigningUndefined: Self = StObject.set(x, "s3DisableBodySigning", js.undefined)
    
    inline def setS3ForcePathStyle(value: Boolean): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    inline def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = StObject.set(x, "s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    inline def setS3UsEast1RegionalEndpointUndefined: Self = StObject.set(x, "s3UsEast1RegionalEndpoint", js.undefined)
    
    inline def setS3UseArnRegion(value: Boolean): Self = StObject.set(x, "s3UseArnRegion", value.asInstanceOf[js.Any])
    
    inline def setS3UseArnRegionUndefined: Self = StObject.set(x, "s3UseArnRegion", js.undefined)
    
    inline def setS3control(value: typings.awsSdk.clientsS3controlMod.ClientConfiguration): Self = StObject.set(x, "s3control", value.asInstanceOf[js.Any])
    
    inline def setS3controlUndefined: Self = StObject.set(x, "s3control", js.undefined)
    
    inline def setS3outposts(value: typings.awsSdk.clientsS3outpostsMod.ClientConfiguration): Self = StObject.set(x, "s3outposts", value.asInstanceOf[js.Any])
    
    inline def setS3outpostsUndefined: Self = StObject.set(x, "s3outposts", js.undefined)
    
    inline def setSagemaker(value: typings.awsSdk.clientsSagemakerMod.ClientConfiguration): Self = StObject.set(x, "sagemaker", value.asInstanceOf[js.Any])
    
    inline def setSagemakerUndefined: Self = StObject.set(x, "sagemaker", js.undefined)
    
    inline def setSagemakeredge(value: typings.awsSdk.clientsSagemakeredgeMod.ClientConfiguration): Self = StObject.set(x, "sagemakeredge", value.asInstanceOf[js.Any])
    
    inline def setSagemakeredgeUndefined: Self = StObject.set(x, "sagemakeredge", js.undefined)
    
    inline def setSagemakerfeaturestoreruntime(value: typings.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerfeaturestoreruntime", value.asInstanceOf[js.Any])
    
    inline def setSagemakerfeaturestoreruntimeUndefined: Self = StObject.set(x, "sagemakerfeaturestoreruntime", js.undefined)
    
    inline def setSagemakergeospatial(value: typings.awsSdk.clientsSagemakergeospatialMod.ClientConfiguration): Self = StObject.set(x, "sagemakergeospatial", value.asInstanceOf[js.Any])
    
    inline def setSagemakergeospatialUndefined: Self = StObject.set(x, "sagemakergeospatial", js.undefined)
    
    inline def setSagemakermetrics(value: typings.awsSdk.clientsSagemakermetricsMod.ClientConfiguration): Self = StObject.set(x, "sagemakermetrics", value.asInstanceOf[js.Any])
    
    inline def setSagemakermetricsUndefined: Self = StObject.set(x, "sagemakermetrics", js.undefined)
    
    inline def setSagemakerruntime(value: typings.awsSdk.clientsSagemakerruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerruntime", value.asInstanceOf[js.Any])
    
    inline def setSagemakerruntimeUndefined: Self = StObject.set(x, "sagemakerruntime", js.undefined)
    
    inline def setSavingsplans(value: typings.awsSdk.clientsSavingsplansMod.ClientConfiguration): Self = StObject.set(x, "savingsplans", value.asInstanceOf[js.Any])
    
    inline def setSavingsplansUndefined: Self = StObject.set(x, "savingsplans", js.undefined)
    
    inline def setScheduler(value: typings.awsSdk.clientsSchedulerMod.ClientConfiguration): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setSchemas(value: typings.awsSdk.clientsSchemasMod.ClientConfiguration): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSecretsmanager(value: typings.awsSdk.clientsSecretsmanagerMod.ClientConfiguration): Self = StObject.set(x, "secretsmanager", value.asInstanceOf[js.Any])
    
    inline def setSecretsmanagerUndefined: Self = StObject.set(x, "secretsmanager", js.undefined)
    
    inline def setSecurityhub(value: typings.awsSdk.clientsSecurityhubMod.ClientConfiguration): Self = StObject.set(x, "securityhub", value.asInstanceOf[js.Any])
    
    inline def setSecurityhubUndefined: Self = StObject.set(x, "securityhub", js.undefined)
    
    inline def setSecuritylake(value: typings.awsSdk.clientsSecuritylakeMod.ClientConfiguration): Self = StObject.set(x, "securitylake", value.asInstanceOf[js.Any])
    
    inline def setSecuritylakeUndefined: Self = StObject.set(x, "securitylake", js.undefined)
    
    inline def setServerlessapplicationrepository(value: typings.awsSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration): Self = StObject.set(x, "serverlessapplicationrepository", value.asInstanceOf[js.Any])
    
    inline def setServerlessapplicationrepositoryUndefined: Self = StObject.set(x, "serverlessapplicationrepository", js.undefined)
    
    inline def setServicecatalog(value: typings.awsSdk.clientsServicecatalogMod.ClientConfiguration): Self = StObject.set(x, "servicecatalog", value.asInstanceOf[js.Any])
    
    inline def setServicecatalogUndefined: Self = StObject.set(x, "servicecatalog", js.undefined)
    
    inline def setServicecatalogappregistry(value: typings.awsSdk.clientsServicecatalogappregistryMod.ClientConfiguration): Self = StObject.set(x, "servicecatalogappregistry", value.asInstanceOf[js.Any])
    
    inline def setServicecatalogappregistryUndefined: Self = StObject.set(x, "servicecatalogappregistry", js.undefined)
    
    inline def setServicediscovery(value: typings.awsSdk.clientsServicediscoveryMod.ClientConfiguration): Self = StObject.set(x, "servicediscovery", value.asInstanceOf[js.Any])
    
    inline def setServicediscoveryUndefined: Self = StObject.set(x, "servicediscovery", js.undefined)
    
    inline def setServicequotas(value: typings.awsSdk.clientsServicequotasMod.ClientConfiguration): Self = StObject.set(x, "servicequotas", value.asInstanceOf[js.Any])
    
    inline def setServicequotasUndefined: Self = StObject.set(x, "servicequotas", js.undefined)
    
    inline def setSes(value: typings.awsSdk.clientsSesMod.ClientConfiguration): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    
    inline def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setSesv2(value: typings.awsSdk.clientsSesv2Mod.ClientConfiguration): Self = StObject.set(x, "sesv2", value.asInstanceOf[js.Any])
    
    inline def setSesv2Undefined: Self = StObject.set(x, "sesv2", js.undefined)
    
    inline def setShield(value: typings.awsSdk.clientsShieldMod.ClientConfiguration): Self = StObject.set(x, "shield", value.asInstanceOf[js.Any])
    
    inline def setShieldUndefined: Self = StObject.set(x, "shield", js.undefined)
    
    inline def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    inline def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    inline def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    inline def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    inline def setSigner(value: typings.awsSdk.clientsSignerMod.ClientConfiguration): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSimpledb(value: typings.awsSdk.clientsSimpledbMod.ClientConfiguration): Self = StObject.set(x, "simpledb", value.asInstanceOf[js.Any])
    
    inline def setSimpledbUndefined: Self = StObject.set(x, "simpledb", js.undefined)
    
    inline def setSimspaceweaver(value: typings.awsSdk.clientsSimspaceweaverMod.ClientConfiguration): Self = StObject.set(x, "simspaceweaver", value.asInstanceOf[js.Any])
    
    inline def setSimspaceweaverUndefined: Self = StObject.set(x, "simspaceweaver", js.undefined)
    
    inline def setSms(value: typings.awsSdk.clientsSmsMod.ClientConfiguration): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    inline def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
    
    inline def setSnowball(value: typings.awsSdk.clientsSnowballMod.ClientConfiguration): Self = StObject.set(x, "snowball", value.asInstanceOf[js.Any])
    
    inline def setSnowballUndefined: Self = StObject.set(x, "snowball", js.undefined)
    
    inline def setSnowdevicemanagement(value: typings.awsSdk.clientsSnowdevicemanagementMod.ClientConfiguration): Self = StObject.set(x, "snowdevicemanagement", value.asInstanceOf[js.Any])
    
    inline def setSnowdevicemanagementUndefined: Self = StObject.set(x, "snowdevicemanagement", js.undefined)
    
    inline def setSns(value: typings.awsSdk.clientsSnsMod.ClientConfiguration): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: typings.awsSdk.clientsSqsMod.ClientConfiguration): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    inline def setSsm(value: typings.awsSdk.clientsSsmMod.ClientConfiguration): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
    
    inline def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
    
    inline def setSsmcontacts(value: typings.awsSdk.clientsSsmcontactsMod.ClientConfiguration): Self = StObject.set(x, "ssmcontacts", value.asInstanceOf[js.Any])
    
    inline def setSsmcontactsUndefined: Self = StObject.set(x, "ssmcontacts", js.undefined)
    
    inline def setSsmincidents(value: typings.awsSdk.clientsSsmincidentsMod.ClientConfiguration): Self = StObject.set(x, "ssmincidents", value.asInstanceOf[js.Any])
    
    inline def setSsmincidentsUndefined: Self = StObject.set(x, "ssmincidents", js.undefined)
    
    inline def setSsmsap(value: typings.awsSdk.clientsSsmsapMod.ClientConfiguration): Self = StObject.set(x, "ssmsap", value.asInstanceOf[js.Any])
    
    inline def setSsmsapUndefined: Self = StObject.set(x, "ssmsap", js.undefined)
    
    inline def setSso(value: typings.awsSdk.clientsSsoMod.ClientConfiguration): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    inline def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
    
    inline def setSsoadmin(value: typings.awsSdk.clientsSsoadminMod.ClientConfiguration): Self = StObject.set(x, "ssoadmin", value.asInstanceOf[js.Any])
    
    inline def setSsoadminUndefined: Self = StObject.set(x, "ssoadmin", js.undefined)
    
    inline def setSsooidc(value: typings.awsSdk.clientsSsooidcMod.ClientConfiguration): Self = StObject.set(x, "ssooidc", value.asInstanceOf[js.Any])
    
    inline def setSsooidcUndefined: Self = StObject.set(x, "ssooidc", js.undefined)
    
    inline def setStepfunctions(value: typings.awsSdk.clientsStepfunctionsMod.ClientConfiguration): Self = StObject.set(x, "stepfunctions", value.asInstanceOf[js.Any])
    
    inline def setStepfunctionsUndefined: Self = StObject.set(x, "stepfunctions", js.undefined)
    
    inline def setStoragegateway(value: typings.awsSdk.clientsStoragegatewayMod.ClientConfiguration): Self = StObject.set(x, "storagegateway", value.asInstanceOf[js.Any])
    
    inline def setStoragegatewayUndefined: Self = StObject.set(x, "storagegateway", js.undefined)
    
    inline def setSts(value: typings.awsSdk.clientsStsMod.ClientConfiguration): Self = StObject.set(x, "sts", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    inline def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
    
    inline def setSupport(value: typings.awsSdk.clientsSupportMod.ClientConfiguration): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    inline def setSupportapp(value: typings.awsSdk.clientsSupportappMod.ClientConfiguration): Self = StObject.set(x, "supportapp", value.asInstanceOf[js.Any])
    
    inline def setSupportappUndefined: Self = StObject.set(x, "supportapp", js.undefined)
    
    inline def setSwf(value: typings.awsSdk.clientsSwfMod.ClientConfiguration): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    inline def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    inline def setSynthetics(value: typings.awsSdk.clientsSyntheticsMod.ClientConfiguration): Self = StObject.set(x, "synthetics", value.asInstanceOf[js.Any])
    
    inline def setSyntheticsUndefined: Self = StObject.set(x, "synthetics", js.undefined)
    
    inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    inline def setTextract(value: typings.awsSdk.clientsTextractMod.ClientConfiguration): Self = StObject.set(x, "textract", value.asInstanceOf[js.Any])
    
    inline def setTextractUndefined: Self = StObject.set(x, "textract", js.undefined)
    
    inline def setTimestreamquery(value: typings.awsSdk.clientsTimestreamqueryMod.ClientConfiguration): Self = StObject.set(x, "timestreamquery", value.asInstanceOf[js.Any])
    
    inline def setTimestreamqueryUndefined: Self = StObject.set(x, "timestreamquery", js.undefined)
    
    inline def setTimestreamwrite(value: typings.awsSdk.clientsTimestreamwriteMod.ClientConfiguration): Self = StObject.set(x, "timestreamwrite", value.asInstanceOf[js.Any])
    
    inline def setTimestreamwriteUndefined: Self = StObject.set(x, "timestreamwrite", js.undefined)
    
    inline def setTnb(value: typings.awsSdk.clientsTnbMod.ClientConfiguration): Self = StObject.set(x, "tnb", value.asInstanceOf[js.Any])
    
    inline def setTnbUndefined: Self = StObject.set(x, "tnb", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenProvider(value: TokenProviderChain): Self = StObject.set(x, "tokenProvider", value.asInstanceOf[js.Any])
    
    inline def setTokenProviderUndefined: Self = StObject.set(x, "tokenProvider", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTranscribeservice(value: typings.awsSdk.clientsTranscribeserviceMod.ClientConfiguration): Self = StObject.set(x, "transcribeservice", value.asInstanceOf[js.Any])
    
    inline def setTranscribeserviceUndefined: Self = StObject.set(x, "transcribeservice", js.undefined)
    
    inline def setTransfer(value: typings.awsSdk.clientsTransferMod.ClientConfiguration): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTranslate(value: typings.awsSdk.clientsTranslateMod.ClientConfiguration): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    
    inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    
    inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    
    inline def setVoiceid(value: typings.awsSdk.clientsVoiceidMod.ClientConfiguration): Self = StObject.set(x, "voiceid", value.asInstanceOf[js.Any])
    
    inline def setVoiceidUndefined: Self = StObject.set(x, "voiceid", js.undefined)
    
    inline def setVpclattice(value: typings.awsSdk.clientsVpclatticeMod.ClientConfiguration): Self = StObject.set(x, "vpclattice", value.asInstanceOf[js.Any])
    
    inline def setVpclatticeUndefined: Self = StObject.set(x, "vpclattice", js.undefined)
    
    inline def setWaf(value: typings.awsSdk.clientsWafMod.ClientConfiguration): Self = StObject.set(x, "waf", value.asInstanceOf[js.Any])
    
    inline def setWafUndefined: Self = StObject.set(x, "waf", js.undefined)
    
    inline def setWafregional(value: typings.awsSdk.clientsWafregionalMod.ClientConfiguration): Self = StObject.set(x, "wafregional", value.asInstanceOf[js.Any])
    
    inline def setWafregionalUndefined: Self = StObject.set(x, "wafregional", js.undefined)
    
    inline def setWafv2(value: typings.awsSdk.clientsWafv2Mod.ClientConfiguration): Self = StObject.set(x, "wafv2", value.asInstanceOf[js.Any])
    
    inline def setWafv2Undefined: Self = StObject.set(x, "wafv2", js.undefined)
    
    inline def setWellarchitected(value: typings.awsSdk.clientsWellarchitectedMod.ClientConfiguration): Self = StObject.set(x, "wellarchitected", value.asInstanceOf[js.Any])
    
    inline def setWellarchitectedUndefined: Self = StObject.set(x, "wellarchitected", js.undefined)
    
    inline def setWisdom(value: typings.awsSdk.clientsWisdomMod.ClientConfiguration): Self = StObject.set(x, "wisdom", value.asInstanceOf[js.Any])
    
    inline def setWisdomUndefined: Self = StObject.set(x, "wisdom", js.undefined)
    
    inline def setWorkdocs(value: typings.awsSdk.clientsWorkdocsMod.ClientConfiguration): Self = StObject.set(x, "workdocs", value.asInstanceOf[js.Any])
    
    inline def setWorkdocsUndefined: Self = StObject.set(x, "workdocs", js.undefined)
    
    inline def setWorklink(value: typings.awsSdk.clientsWorklinkMod.ClientConfiguration): Self = StObject.set(x, "worklink", value.asInstanceOf[js.Any])
    
    inline def setWorklinkUndefined: Self = StObject.set(x, "worklink", js.undefined)
    
    inline def setWorkmail(value: typings.awsSdk.clientsWorkmailMod.ClientConfiguration): Self = StObject.set(x, "workmail", value.asInstanceOf[js.Any])
    
    inline def setWorkmailUndefined: Self = StObject.set(x, "workmail", js.undefined)
    
    inline def setWorkmailmessageflow(value: typings.awsSdk.clientsWorkmailmessageflowMod.ClientConfiguration): Self = StObject.set(x, "workmailmessageflow", value.asInstanceOf[js.Any])
    
    inline def setWorkmailmessageflowUndefined: Self = StObject.set(x, "workmailmessageflow", js.undefined)
    
    inline def setWorkspaces(value: typings.awsSdk.clientsWorkspacesMod.ClientConfiguration): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    inline def setWorkspacesweb(value: typings.awsSdk.clientsWorkspaceswebMod.ClientConfiguration): Self = StObject.set(x, "workspacesweb", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceswebUndefined: Self = StObject.set(x, "workspacesweb", js.undefined)
    
    inline def setXray(value: typings.awsSdk.clientsXrayMod.ClientConfiguration): Self = StObject.set(x, "xray", value.asInstanceOf[js.Any])
    
    inline def setXrayUndefined: Self = StObject.set(x, "xray", js.undefined)
  }
}
