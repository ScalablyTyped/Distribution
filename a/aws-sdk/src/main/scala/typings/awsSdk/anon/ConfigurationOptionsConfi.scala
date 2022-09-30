package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.accessanalyzerMod.ClientConfiguration
import typings.awsSdk.awsSdkStrings.latest_
import typings.awsSdk.awsSdkStrings.legacy_
import typings.awsSdk.awsSdkStrings.regional_
import typings.awsSdk.awsSdkStrings.v2_
import typings.awsSdk.awsSdkStrings.v3
import typings.awsSdk.awsSdkStrings.v4
import typings.awsSdk.configBaseMod.HTTPOptions
import typings.awsSdk.configBaseMod.Logger
import typings.awsSdk.configBaseMod.ParamValidation
import typings.awsSdk.configBaseMod.RetryDelayOptions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import typings.awsSdk.tokenMod.Token
import typings.awsSdk.tokenProviderChainMod.TokenProviderChain
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
  
  var account: js.UndefOr[typings.awsSdk.accountMod.ClientConfiguration] = js.undefined
  
  var acm: js.UndefOr[typings.awsSdk.acmMod.ClientConfiguration] = js.undefined
  
  var acmpca: js.UndefOr[typings.awsSdk.acmpcaMod.ClientConfiguration] = js.undefined
  
  var alexaforbusiness: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientConfiguration] = js.undefined
  
  var amp: js.UndefOr[typings.awsSdk.ampMod.ClientConfiguration] = js.undefined
  
  var amplify: js.UndefOr[typings.awsSdk.amplifyMod.ClientConfiguration] = js.undefined
  
  var amplifybackend: js.UndefOr[typings.awsSdk.amplifybackendMod.ClientConfiguration] = js.undefined
  
  var amplifyuibuilder: js.UndefOr[typings.awsSdk.amplifyuibuilderMod.ClientConfiguration] = js.undefined
  
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest_ | String] = js.undefined
  
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  
  var apigateway: js.UndefOr[typings.awsSdk.apigatewayMod.ClientConfiguration] = js.undefined
  
  var apigatewaymanagementapi: js.UndefOr[typings.awsSdk.apigatewaymanagementapiMod.ClientConfiguration] = js.undefined
  
  var apigatewayv2: js.UndefOr[typings.awsSdk.apigatewayv2Mod.ClientConfiguration] = js.undefined
  
  var appconfig: js.UndefOr[typings.awsSdk.appconfigMod.ClientConfiguration] = js.undefined
  
  var appconfigdata: js.UndefOr[typings.awsSdk.appconfigdataMod.ClientConfiguration] = js.undefined
  
  var appflow: js.UndefOr[typings.awsSdk.appflowMod.ClientConfiguration] = js.undefined
  
  var appintegrations: js.UndefOr[typings.awsSdk.appintegrationsMod.ClientConfiguration] = js.undefined
  
  var applicationautoscaling: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ClientConfiguration] = js.undefined
  
  var applicationcostprofiler: js.UndefOr[typings.awsSdk.applicationcostprofilerMod.ClientConfiguration] = js.undefined
  
  var applicationinsights: js.UndefOr[typings.awsSdk.applicationinsightsMod.ClientConfiguration] = js.undefined
  
  var appmesh: js.UndefOr[typings.awsSdk.appmeshMod.ClientConfiguration] = js.undefined
  
  var apprunner: js.UndefOr[typings.awsSdk.apprunnerMod.ClientConfiguration] = js.undefined
  
  var appstream: js.UndefOr[typings.awsSdk.appstreamMod.ClientConfiguration] = js.undefined
  
  var appsync: js.UndefOr[typings.awsSdk.appsyncMod.ClientConfiguration] = js.undefined
  
  var athena: js.UndefOr[typings.awsSdk.athenaMod.ClientConfiguration] = js.undefined
  
  var auditmanager: js.UndefOr[typings.awsSdk.auditmanagerMod.ClientConfiguration] = js.undefined
  
  var augmentedairuntime: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.ClientConfiguration] = js.undefined
  
  var autoscaling: js.UndefOr[typings.awsSdk.autoscalingMod.ClientConfiguration] = js.undefined
  
  var autoscalingplans: js.UndefOr[typings.awsSdk.autoscalingplansMod.ClientConfiguration] = js.undefined
  
  var backup: js.UndefOr[typings.awsSdk.backupMod.ClientConfiguration] = js.undefined
  
  var backupgateway: js.UndefOr[typings.awsSdk.backupgatewayMod.ClientConfiguration] = js.undefined
  
  var backupstorage: js.UndefOr[typings.awsSdk.backupstorageMod.ClientConfiguration] = js.undefined
  
  var batch: js.UndefOr[typings.awsSdk.batchMod.ClientConfiguration] = js.undefined
  
  var billingconductor: js.UndefOr[typings.awsSdk.billingconductorMod.ClientConfiguration] = js.undefined
  
  var braket: js.UndefOr[typings.awsSdk.braketMod.ClientConfiguration] = js.undefined
  
  var budgets: js.UndefOr[typings.awsSdk.budgetsMod.ClientConfiguration] = js.undefined
  
  var chime: js.UndefOr[typings.awsSdk.chimeMod.ClientConfiguration] = js.undefined
  
  var chimesdkidentity: js.UndefOr[typings.awsSdk.chimesdkidentityMod.ClientConfiguration] = js.undefined
  
  var chimesdkmediapipelines: js.UndefOr[typings.awsSdk.chimesdkmediapipelinesMod.ClientConfiguration] = js.undefined
  
  var chimesdkmeetings: js.UndefOr[typings.awsSdk.chimesdkmeetingsMod.ClientConfiguration] = js.undefined
  
  var chimesdkmessaging: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.ClientConfiguration] = js.undefined
  
  var cloud9: js.UndefOr[typings.awsSdk.cloud9Mod.ClientConfiguration] = js.undefined
  
  var cloudcontrol: js.UndefOr[typings.awsSdk.cloudcontrolMod.ClientConfiguration] = js.undefined
  
  var clouddirectory: js.UndefOr[typings.awsSdk.clouddirectoryMod.ClientConfiguration] = js.undefined
  
  var cloudformation: js.UndefOr[typings.awsSdk.cloudformationMod.ClientConfiguration] = js.undefined
  
  var cloudfront: js.UndefOr[typings.awsSdk.cloudfrontMod.ClientConfiguration] = js.undefined
  
  var cloudhsm: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientConfiguration] = js.undefined
  
  var cloudhsmv2: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClientConfiguration] = js.undefined
  
  var cloudsearch: js.UndefOr[typings.awsSdk.cloudsearchMod.ClientConfiguration] = js.undefined
  
  var cloudsearchdomain: js.UndefOr[typings.awsSdk.cloudsearchdomainMod.ClientConfiguration] = js.undefined
  
  var cloudtrail: js.UndefOr[typings.awsSdk.cloudtrailMod.ClientConfiguration] = js.undefined
  
  var cloudwatch: js.UndefOr[typings.awsSdk.cloudwatchMod.ClientConfiguration] = js.undefined
  
  var cloudwatchevents: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ClientConfiguration] = js.undefined
  
  var cloudwatchlogs: js.UndefOr[typings.awsSdk.cloudwatchlogsMod.ClientConfiguration] = js.undefined
  
  var codeartifact: js.UndefOr[typings.awsSdk.codeartifactMod.ClientConfiguration] = js.undefined
  
  var codebuild: js.UndefOr[typings.awsSdk.codebuildMod.ClientConfiguration] = js.undefined
  
  var codecommit: js.UndefOr[typings.awsSdk.codecommitMod.ClientConfiguration] = js.undefined
  
  var codedeploy: js.UndefOr[typings.awsSdk.codedeployMod.ClientConfiguration] = js.undefined
  
  var codeguruprofiler: js.UndefOr[typings.awsSdk.codeguruprofilerMod.ClientConfiguration] = js.undefined
  
  var codegurureviewer: js.UndefOr[typings.awsSdk.codegurureviewerMod.ClientConfiguration] = js.undefined
  
  var codepipeline: js.UndefOr[typings.awsSdk.codepipelineMod.ClientConfiguration] = js.undefined
  
  var codestar: js.UndefOr[typings.awsSdk.codestarMod.ClientConfiguration] = js.undefined
  
  var codestarconnections: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ClientConfiguration] = js.undefined
  
  var codestarnotifications: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ClientConfiguration] = js.undefined
  
  var cognitoidentity: js.UndefOr[typings.awsSdk.cognitoidentityMod.ClientConfiguration] = js.undefined
  
  var cognitoidentityserviceprovider: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration] = js.undefined
  
  var cognitosync: js.UndefOr[typings.awsSdk.cognitosyncMod.ClientConfiguration] = js.undefined
  
  var comprehend: js.UndefOr[typings.awsSdk.comprehendMod.ClientConfiguration] = js.undefined
  
  var comprehendmedical: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.undefined
  
  var computeoptimizer: js.UndefOr[typings.awsSdk.computeoptimizerMod.ClientConfiguration] = js.undefined
  
  var configservice: js.UndefOr[typings.awsSdk.configserviceMod.ClientConfiguration] = js.undefined
  
  var connect: js.UndefOr[typings.awsSdk.connectMod.ClientConfiguration] = js.undefined
  
  var connectcampaigns: js.UndefOr[typings.awsSdk.connectcampaignsMod.ClientConfiguration] = js.undefined
  
  var connectcontactlens: js.UndefOr[typings.awsSdk.connectcontactlensMod.ClientConfiguration] = js.undefined
  
  var connectparticipant: js.UndefOr[typings.awsSdk.connectparticipantMod.ClientConfiguration] = js.undefined
  
  var controltower: js.UndefOr[typings.awsSdk.controltowerMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.undefined
  
  var costexplorer: js.UndefOr[typings.awsSdk.costexplorerMod.ClientConfiguration] = js.undefined
  
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.undefined
  
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.undefined
  
  var cur: js.UndefOr[typings.awsSdk.curMod.ClientConfiguration] = js.undefined
  
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.undefined
  
  var customerprofiles: js.UndefOr[typings.awsSdk.customerprofilesMod.ClientConfiguration] = js.undefined
  
  var databrew: js.UndefOr[typings.awsSdk.databrewMod.ClientConfiguration] = js.undefined
  
  var dataexchange: js.UndefOr[typings.awsSdk.dataexchangeMod.ClientConfiguration] = js.undefined
  
  var datapipeline: js.UndefOr[typings.awsSdk.datapipelineMod.ClientConfiguration] = js.undefined
  
  var datasync: js.UndefOr[typings.awsSdk.datasyncMod.ClientConfiguration] = js.undefined
  
  var dax: js.UndefOr[typings.awsSdk.daxMod.ClientConfiguration] = js.undefined
  
  var detective: js.UndefOr[typings.awsSdk.detectiveMod.ClientConfiguration] = js.undefined
  
  var devicefarm: js.UndefOr[typings.awsSdk.devicefarmMod.ClientConfiguration] = js.undefined
  
  var devopsguru: js.UndefOr[typings.awsSdk.devopsguruMod.ClientConfiguration] = js.undefined
  
  var directconnect: js.UndefOr[typings.awsSdk.directconnectMod.ClientConfiguration] = js.undefined
  
  var directoryservice: js.UndefOr[typings.awsSdk.directoryserviceMod.ClientConfiguration] = js.undefined
  
  var discovery: js.UndefOr[typings.awsSdk.discoveryMod.ClientConfiguration] = js.undefined
  
  var dlm: js.UndefOr[typings.awsSdk.dlmMod.ClientConfiguration] = js.undefined
  
  var dms: js.UndefOr[typings.awsSdk.dmsMod.ClientConfiguration] = js.undefined
  
  var docdb: js.UndefOr[typings.awsSdk.docdbMod.ClientConfiguration] = js.undefined
  
  var drs: js.UndefOr[typings.awsSdk.drsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined
  
  var dynamodb: js.UndefOr[typings.awsSdk.dynamodbMod.ClientConfiguration] = js.undefined
  
  var dynamodbstreams: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.ClientConfiguration] = js.undefined
  
  var ebs: js.UndefOr[typings.awsSdk.ebsMod.ClientConfiguration] = js.undefined
  
  var ec2: js.UndefOr[typings.awsSdk.ec2Mod.ClientConfiguration] = js.undefined
  
  var ec2instanceconnect: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.ClientConfiguration] = js.undefined
  
  var ecr: js.UndefOr[typings.awsSdk.ecrMod.ClientConfiguration] = js.undefined
  
  var ecrpublic: js.UndefOr[typings.awsSdk.ecrpublicMod.ClientConfiguration] = js.undefined
  
  var ecs: js.UndefOr[typings.awsSdk.ecsMod.ClientConfiguration] = js.undefined
  
  var efs: js.UndefOr[typings.awsSdk.efsMod.ClientConfiguration] = js.undefined
  
  var eks: js.UndefOr[typings.awsSdk.eksMod.ClientConfiguration] = js.undefined
  
  var elasticache: js.UndefOr[typings.awsSdk.elasticacheMod.ClientConfiguration] = js.undefined
  
  var elasticbeanstalk: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ClientConfiguration] = js.undefined
  
  var elasticinference: js.UndefOr[typings.awsSdk.elasticinferenceMod.ClientConfiguration] = js.undefined
  
  var elastictranscoder: js.UndefOr[typings.awsSdk.elastictranscoderMod.ClientConfiguration] = js.undefined
  
  var elb: js.UndefOr[typings.awsSdk.elbMod.ClientConfiguration] = js.undefined
  
  var elbv2: js.UndefOr[typings.awsSdk.elbv2Mod.ClientConfiguration] = js.undefined
  
  var emr: js.UndefOr[typings.awsSdk.emrMod.ClientConfiguration] = js.undefined
  
  var emrcontainers: js.UndefOr[typings.awsSdk.emrcontainersMod.ClientConfiguration] = js.undefined
  
  var emrserverless: js.UndefOr[typings.awsSdk.emrserverlessMod.ClientConfiguration] = js.undefined
  
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
  
  var es: js.UndefOr[typings.awsSdk.esMod.ClientConfiguration] = js.undefined
  
  var eventbridge: js.UndefOr[typings.awsSdk.eventbridgeMod.ClientConfiguration] = js.undefined
  
  var evidently: js.UndefOr[typings.awsSdk.evidentlyMod.ClientConfiguration] = js.undefined
  
  var finspace: js.UndefOr[typings.awsSdk.finspaceMod.ClientConfiguration] = js.undefined
  
  var finspacedata: js.UndefOr[typings.awsSdk.finspacedataMod.ClientConfiguration] = js.undefined
  
  var firehose: js.UndefOr[typings.awsSdk.firehoseMod.ClientConfiguration] = js.undefined
  
  var fis: js.UndefOr[typings.awsSdk.fisMod.ClientConfiguration] = js.undefined
  
  var fms: js.UndefOr[typings.awsSdk.fmsMod.ClientConfiguration] = js.undefined
  
  var forecastqueryservice: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.ClientConfiguration] = js.undefined
  
  var forecastservice: js.UndefOr[typings.awsSdk.forecastserviceMod.ClientConfiguration] = js.undefined
  
  var frauddetector: js.UndefOr[typings.awsSdk.frauddetectorMod.ClientConfiguration] = js.undefined
  
  var fsx: js.UndefOr[typings.awsSdk.fsxMod.ClientConfiguration] = js.undefined
  
  var gamelift: js.UndefOr[typings.awsSdk.gameliftMod.ClientConfiguration] = js.undefined
  
  var gamesparks: js.UndefOr[typings.awsSdk.gamesparksMod.ClientConfiguration] = js.undefined
  
  var glacier: js.UndefOr[typings.awsSdk.glacierMod.ClientConfiguration] = js.undefined
  
  var globalaccelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.ClientConfiguration] = js.undefined
  
  var glue: js.UndefOr[typings.awsSdk.glueMod.ClientConfiguration] = js.undefined
  
  var grafana: js.UndefOr[typings.awsSdk.grafanaMod.ClientConfiguration] = js.undefined
  
  var greengrass: js.UndefOr[typings.awsSdk.greengrassMod.ClientConfiguration] = js.undefined
  
  var greengrassv2: js.UndefOr[typings.awsSdk.greengrassv2Mod.ClientConfiguration] = js.undefined
  
  var groundstation: js.UndefOr[typings.awsSdk.groundstationMod.ClientConfiguration] = js.undefined
  
  var guardduty: js.UndefOr[typings.awsSdk.guarddutyMod.ClientConfiguration] = js.undefined
  
  var health: js.UndefOr[typings.awsSdk.healthMod.ClientConfiguration] = js.undefined
  
  var healthlake: js.UndefOr[typings.awsSdk.healthlakeMod.ClientConfiguration] = js.undefined
  
  var honeycode: js.UndefOr[typings.awsSdk.honeycodeMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
  
  var iam: js.UndefOr[typings.awsSdk.iamMod.ClientConfiguration] = js.undefined
  
  var identitystore: js.UndefOr[typings.awsSdk.identitystoreMod.ClientConfiguration] = js.undefined
  
  var imagebuilder: js.UndefOr[typings.awsSdk.imagebuilderMod.ClientConfiguration] = js.undefined
  
  var importexport: js.UndefOr[typings.awsSdk.importexportMod.ClientConfiguration] = js.undefined
  
  var inspector: js.UndefOr[typings.awsSdk.inspectorMod.ClientConfiguration] = js.undefined
  
  var inspector2: js.UndefOr[typings.awsSdk.inspector2Mod.ClientConfiguration] = js.undefined
  
  var iot: js.UndefOr[typings.awsSdk.iotMod.ClientConfiguration] = js.undefined
  
  var iot1clickdevicesservice: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration] = js.undefined
  
  var iot1clickprojects: js.UndefOr[typings.awsSdk.iot1clickprojectsMod.ClientConfiguration] = js.undefined
  
  var iotanalytics: js.UndefOr[typings.awsSdk.iotanalyticsMod.ClientConfiguration] = js.undefined
  
  var iotdata: js.UndefOr[typings.awsSdk.iotdataMod.ClientConfiguration] = js.undefined
  
  var iotdeviceadvisor: js.UndefOr[typings.awsSdk.iotdeviceadvisorMod.ClientConfiguration] = js.undefined
  
  var iotevents: js.UndefOr[typings.awsSdk.ioteventsMod.ClientConfiguration] = js.undefined
  
  var ioteventsdata: js.UndefOr[typings.awsSdk.ioteventsdataMod.ClientConfiguration] = js.undefined
  
  var iotfleethub: js.UndefOr[typings.awsSdk.iotfleethubMod.ClientConfiguration] = js.undefined
  
  var iotfleetwise: js.UndefOr[typings.awsSdk.iotfleetwiseMod.ClientConfiguration] = js.undefined
  
  var iotjobsdataplane: js.UndefOr[typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration] = js.undefined
  
  var iotsecuretunneling: js.UndefOr[typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration] = js.undefined
  
  var iotsitewise: js.UndefOr[typings.awsSdk.iotsitewiseMod.ClientConfiguration] = js.undefined
  
  var iotthingsgraph: js.UndefOr[typings.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.undefined
  
  var iottwinmaker: js.UndefOr[typings.awsSdk.iottwinmakerMod.ClientConfiguration] = js.undefined
  
  var iotwireless: js.UndefOr[typings.awsSdk.iotwirelessMod.ClientConfiguration] = js.undefined
  
  var ivs: js.UndefOr[typings.awsSdk.ivsMod.ClientConfiguration] = js.undefined
  
  var ivschat: js.UndefOr[typings.awsSdk.ivschatMod.ClientConfiguration] = js.undefined
  
  var kafka: js.UndefOr[typings.awsSdk.kafkaMod.ClientConfiguration] = js.undefined
  
  var kafkaconnect: js.UndefOr[typings.awsSdk.kafkaconnectMod.ClientConfiguration] = js.undefined
  
  var kendra: js.UndefOr[typings.awsSdk.kendraMod.ClientConfiguration] = js.undefined
  
  var keyspaces: js.UndefOr[typings.awsSdk.keyspacesMod.ClientConfiguration] = js.undefined
  
  var kinesis: js.UndefOr[typings.awsSdk.kinesisMod.ClientConfiguration] = js.undefined
  
  var kinesisanalytics: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ClientConfiguration] = js.undefined
  
  var kinesisanalyticsv2: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration] = js.undefined
  
  var kinesisvideo: js.UndefOr[typings.awsSdk.kinesisvideoMod.ClientConfiguration] = js.undefined
  
  var kinesisvideoarchivedmedia: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration] = js.undefined
  
  var kinesisvideomedia: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.ClientConfiguration] = js.undefined
  
  var kinesisvideosignalingchannels: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration] = js.undefined
  
  var kms: js.UndefOr[typings.awsSdk.kmsMod.ClientConfiguration] = js.undefined
  
  var lakeformation: js.UndefOr[typings.awsSdk.lakeformationMod.ClientConfiguration] = js.undefined
  
  var lambda: js.UndefOr[typings.awsSdk.lambdaMod.ClientConfiguration] = js.undefined
  
  var lexmodelbuildingservice: js.UndefOr[typings.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration] = js.undefined
  
  var lexmodelsv2: js.UndefOr[typings.awsSdk.lexmodelsv2Mod.ClientConfiguration] = js.undefined
  
  var lexruntime: js.UndefOr[typings.awsSdk.lexruntimeMod.ClientConfiguration] = js.undefined
  
  var lexruntimev2: js.UndefOr[typings.awsSdk.lexruntimev2Mod.ClientConfiguration] = js.undefined
  
  var licensemanager: js.UndefOr[typings.awsSdk.licensemanagerMod.ClientConfiguration] = js.undefined
  
  var licensemanagerusersubscriptions: js.UndefOr[typings.awsSdk.licensemanagerusersubscriptionsMod.ClientConfiguration] = js.undefined
  
  var lightsail: js.UndefOr[typings.awsSdk.lightsailMod.ClientConfiguration] = js.undefined
  
  var location: js.UndefOr[typings.awsSdk.locationMod.ClientConfiguration] = js.undefined
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  var lookoutequipment: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ClientConfiguration] = js.undefined
  
  var lookoutmetrics: js.UndefOr[typings.awsSdk.lookoutmetricsMod.ClientConfiguration] = js.undefined
  
  var lookoutvision: js.UndefOr[typings.awsSdk.lookoutvisionMod.ClientConfiguration] = js.undefined
  
  var m2: js.UndefOr[typings.awsSdk.m2Mod.ClientConfiguration] = js.undefined
  
  var machinelearning: js.UndefOr[typings.awsSdk.machinelearningMod.ClientConfiguration] = js.undefined
  
  var macie: js.UndefOr[typings.awsSdk.macieMod.ClientConfiguration] = js.undefined
  
  var macie2: js.UndefOr[typings.awsSdk.macie2Mod.ClientConfiguration] = js.undefined
  
  var managedblockchain: js.UndefOr[typings.awsSdk.managedblockchainMod.ClientConfiguration] = js.undefined
  
  var marketplacecatalog: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ClientConfiguration] = js.undefined
  
  var marketplacecommerceanalytics: js.UndefOr[typings.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration] = js.undefined
  
  var marketplaceentitlementservice: js.UndefOr[typings.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration] = js.undefined
  
  var marketplacemetering: js.UndefOr[typings.awsSdk.marketplacemeteringMod.ClientConfiguration] = js.undefined
  
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var mediaconnect: js.UndefOr[typings.awsSdk.mediaconnectMod.ClientConfiguration] = js.undefined
  
  var mediaconvert: js.UndefOr[typings.awsSdk.mediaconvertMod.ClientConfiguration] = js.undefined
  
  var medialive: js.UndefOr[typings.awsSdk.medialiveMod.ClientConfiguration] = js.undefined
  
  var mediapackage: js.UndefOr[typings.awsSdk.mediapackageMod.ClientConfiguration] = js.undefined
  
  var mediapackagevod: js.UndefOr[typings.awsSdk.mediapackagevodMod.ClientConfiguration] = js.undefined
  
  var mediastore: js.UndefOr[typings.awsSdk.mediastoreMod.ClientConfiguration] = js.undefined
  
  var mediastoredata: js.UndefOr[typings.awsSdk.mediastoredataMod.ClientConfiguration] = js.undefined
  
  var mediatailor: js.UndefOr[typings.awsSdk.mediatailorMod.ClientConfiguration] = js.undefined
  
  var memorydb: js.UndefOr[typings.awsSdk.memorydbMod.ClientConfiguration] = js.undefined
  
  var mgn: js.UndefOr[typings.awsSdk.mgnMod.ClientConfiguration] = js.undefined
  
  var migrationhub: js.UndefOr[typings.awsSdk.migrationhubMod.ClientConfiguration] = js.undefined
  
  var migrationhubconfig: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ClientConfiguration] = js.undefined
  
  var migrationhuborchestrator: js.UndefOr[typings.awsSdk.migrationhuborchestratorMod.ClientConfiguration] = js.undefined
  
  var migrationhubrefactorspaces: js.UndefOr[typings.awsSdk.migrationhubrefactorspacesMod.ClientConfiguration] = js.undefined
  
  var migrationhubstrategy: js.UndefOr[typings.awsSdk.migrationhubstrategyMod.ClientConfiguration] = js.undefined
  
  var mobile: js.UndefOr[typings.awsSdk.mobileMod.ClientConfiguration] = js.undefined
  
  var mobileanalytics: js.UndefOr[typings.awsSdk.mobileanalyticsMod.ClientConfiguration] = js.undefined
  
  var mq: js.UndefOr[typings.awsSdk.mqMod.ClientConfiguration] = js.undefined
  
  var mturk: js.UndefOr[typings.awsSdk.mturkMod.ClientConfiguration] = js.undefined
  
  var mwaa: js.UndefOr[typings.awsSdk.mwaaMod.ClientConfiguration] = js.undefined
  
  var neptune: js.UndefOr[typings.awsSdk.neptuneMod.ClientConfiguration] = js.undefined
  
  var networkfirewall: js.UndefOr[typings.awsSdk.networkfirewallMod.ClientConfiguration] = js.undefined
  
  var networkmanager: js.UndefOr[typings.awsSdk.networkmanagerMod.ClientConfiguration] = js.undefined
  
  var nimble: js.UndefOr[typings.awsSdk.nimbleMod.ClientConfiguration] = js.undefined
  
  var opensearch: js.UndefOr[typings.awsSdk.opensearchMod.ClientConfiguration] = js.undefined
  
  var opsworks: js.UndefOr[typings.awsSdk.opsworksMod.ClientConfiguration] = js.undefined
  
  var opsworkscm: js.UndefOr[typings.awsSdk.opsworkscmMod.ClientConfiguration] = js.undefined
  
  var organizations: js.UndefOr[typings.awsSdk.organizationsMod.ClientConfiguration] = js.undefined
  
  var outposts: js.UndefOr[typings.awsSdk.outpostsMod.ClientConfiguration] = js.undefined
  
  var panorama: js.UndefOr[typings.awsSdk.panoramaMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.undefined
  
  var personalize: js.UndefOr[typings.awsSdk.personalizeMod.ClientConfiguration] = js.undefined
  
  var personalizeevents: js.UndefOr[typings.awsSdk.personalizeeventsMod.ClientConfiguration] = js.undefined
  
  var personalizeruntime: js.UndefOr[typings.awsSdk.personalizeruntimeMod.ClientConfiguration] = js.undefined
  
  var pi: js.UndefOr[typings.awsSdk.piMod.ClientConfiguration] = js.undefined
  
  var pinpoint: js.UndefOr[typings.awsSdk.pinpointMod.ClientConfiguration] = js.undefined
  
  var pinpointemail: js.UndefOr[typings.awsSdk.pinpointemailMod.ClientConfiguration] = js.undefined
  
  var pinpointsmsvoice: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.ClientConfiguration] = js.undefined
  
  var pinpointsmsvoicev2: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.ClientConfiguration] = js.undefined
  
  var polly: js.UndefOr[typings.awsSdk.pollyMod.ClientConfiguration] = js.undefined
  
  var pricing: js.UndefOr[typings.awsSdk.pricingMod.ClientConfiguration] = js.undefined
  
  var privatenetworks: js.UndefOr[typings.awsSdk.privatenetworksMod.ClientConfiguration] = js.undefined
  
  var proton: js.UndefOr[typings.awsSdk.protonMod.ClientConfiguration] = js.undefined
  
  var qldb: js.UndefOr[typings.awsSdk.qldbMod.ClientConfiguration] = js.undefined
  
  var qldbsession: js.UndefOr[typings.awsSdk.qldbsessionMod.ClientConfiguration] = js.undefined
  
  var quicksight: js.UndefOr[typings.awsSdk.quicksightMod.ClientConfiguration] = js.undefined
  
  var ram: js.UndefOr[typings.awsSdk.ramMod.ClientConfiguration] = js.undefined
  
  var rbin: js.UndefOr[typings.awsSdk.rbinMod.ClientConfiguration] = js.undefined
  
  var rds: js.UndefOr[typings.awsSdk.rdsMod.ClientConfiguration] = js.undefined
  
  var rdsdataservice: js.UndefOr[typings.awsSdk.rdsdataserviceMod.ClientConfiguration] = js.undefined
  
  var redshift: js.UndefOr[typings.awsSdk.redshiftMod.ClientConfiguration] = js.undefined
  
  var redshiftdata: js.UndefOr[typings.awsSdk.redshiftdataMod.ClientConfiguration] = js.undefined
  
  var redshiftserverless: js.UndefOr[typings.awsSdk.redshiftserverlessMod.ClientConfiguration] = js.undefined
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.undefined
  
  var rekognition: js.UndefOr[typings.awsSdk.rekognitionMod.ClientConfiguration] = js.undefined
  
  var resiliencehub: js.UndefOr[typings.awsSdk.resiliencehubMod.ClientConfiguration] = js.undefined
  
  var resourcegroups: js.UndefOr[typings.awsSdk.resourcegroupsMod.ClientConfiguration] = js.undefined
  
  var resourcegroupstaggingapi: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined
  
  var robomaker: js.UndefOr[typings.awsSdk.robomakerMod.ClientConfiguration] = js.undefined
  
  var rolesanywhere: js.UndefOr[typings.awsSdk.rolesanywhereMod.ClientConfiguration] = js.undefined
  
  var route53: js.UndefOr[typings.awsSdk.route53Mod.ClientConfiguration] = js.undefined
  
  var route53domains: js.UndefOr[typings.awsSdk.route53domainsMod.ClientConfiguration] = js.undefined
  
  var route53recoverycluster: js.UndefOr[typings.awsSdk.route53recoveryclusterMod.ClientConfiguration] = js.undefined
  
  var route53recoverycontrolconfig: js.UndefOr[typings.awsSdk.route53recoverycontrolconfigMod.ClientConfiguration] = js.undefined
  
  var route53recoveryreadiness: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.ClientConfiguration] = js.undefined
  
  var route53resolver: js.UndefOr[typings.awsSdk.route53resolverMod.ClientConfiguration] = js.undefined
  
  var rum: js.UndefOr[typings.awsSdk.rumMod.ClientConfiguration] = js.undefined
  
  var s3: js.UndefOr[typings.awsSdk.s3Mod.ClientConfiguration] = js.undefined
  
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
  
  var s3control: js.UndefOr[typings.awsSdk.s3controlMod.ClientConfiguration] = js.undefined
  
  var s3outposts: js.UndefOr[typings.awsSdk.s3outpostsMod.ClientConfiguration] = js.undefined
  
  var sagemaker: js.UndefOr[typings.awsSdk.sagemakerMod.ClientConfiguration] = js.undefined
  
  var sagemakeredge: js.UndefOr[typings.awsSdk.sagemakeredgeMod.ClientConfiguration] = js.undefined
  
  var sagemakerfeaturestoreruntime: js.UndefOr[typings.awsSdk.sagemakerfeaturestoreruntimeMod.ClientConfiguration] = js.undefined
  
  var sagemakerruntime: js.UndefOr[typings.awsSdk.sagemakerruntimeMod.ClientConfiguration] = js.undefined
  
  var savingsplans: js.UndefOr[typings.awsSdk.savingsplansMod.ClientConfiguration] = js.undefined
  
  var schemas: js.UndefOr[typings.awsSdk.schemasMod.ClientConfiguration] = js.undefined
  
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.undefined
  
  var secretsmanager: js.UndefOr[typings.awsSdk.secretsmanagerMod.ClientConfiguration] = js.undefined
  
  var securityhub: js.UndefOr[typings.awsSdk.securityhubMod.ClientConfiguration] = js.undefined
  
  var serverlessapplicationrepository: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration] = js.undefined
  
  var servicecatalog: js.UndefOr[typings.awsSdk.servicecatalogMod.ClientConfiguration] = js.undefined
  
  var servicecatalogappregistry: js.UndefOr[typings.awsSdk.servicecatalogappregistryMod.ClientConfiguration] = js.undefined
  
  var servicediscovery: js.UndefOr[typings.awsSdk.servicediscoveryMod.ClientConfiguration] = js.undefined
  
  var servicequotas: js.UndefOr[typings.awsSdk.servicequotasMod.ClientConfiguration] = js.undefined
  
  var ses: js.UndefOr[typings.awsSdk.sesMod.ClientConfiguration] = js.undefined
  
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.undefined
  
  var sesv2: js.UndefOr[typings.awsSdk.sesv2Mod.ClientConfiguration] = js.undefined
  
  var shield: js.UndefOr[typings.awsSdk.shieldMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.undefined
  
  var signer: js.UndefOr[typings.awsSdk.signerMod.ClientConfiguration] = js.undefined
  
  var simpledb: js.UndefOr[typings.awsSdk.simpledbMod.ClientConfiguration] = js.undefined
  
  var sms: js.UndefOr[typings.awsSdk.smsMod.ClientConfiguration] = js.undefined
  
  var snowball: js.UndefOr[typings.awsSdk.snowballMod.ClientConfiguration] = js.undefined
  
  var snowdevicemanagement: js.UndefOr[typings.awsSdk.snowdevicemanagementMod.ClientConfiguration] = js.undefined
  
  var sns: js.UndefOr[typings.awsSdk.snsMod.ClientConfiguration] = js.undefined
  
  var sqs: js.UndefOr[typings.awsSdk.sqsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ssm: js.UndefOr[typings.awsSdk.ssmMod.ClientConfiguration] = js.undefined
  
  var ssmcontacts: js.UndefOr[typings.awsSdk.ssmcontactsMod.ClientConfiguration] = js.undefined
  
  var ssmincidents: js.UndefOr[typings.awsSdk.ssmincidentsMod.ClientConfiguration] = js.undefined
  
  var sso: js.UndefOr[typings.awsSdk.ssoMod.ClientConfiguration] = js.undefined
  
  var ssoadmin: js.UndefOr[typings.awsSdk.ssoadminMod.ClientConfiguration] = js.undefined
  
  var ssooidc: js.UndefOr[typings.awsSdk.ssooidcMod.ClientConfiguration] = js.undefined
  
  var stepfunctions: js.UndefOr[typings.awsSdk.stepfunctionsMod.ClientConfiguration] = js.undefined
  
  var storagegateway: js.UndefOr[typings.awsSdk.storagegatewayMod.ClientConfiguration] = js.undefined
  
  var sts: js.UndefOr[typings.awsSdk.stsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.undefined
  
  var support: js.UndefOr[typings.awsSdk.supportMod.ClientConfiguration] = js.undefined
  
  var supportapp: js.UndefOr[typings.awsSdk.supportappMod.ClientConfiguration] = js.undefined
  
  var swf: js.UndefOr[typings.awsSdk.swfMod.ClientConfiguration] = js.undefined
  
  var synthetics: js.UndefOr[typings.awsSdk.syntheticsMod.ClientConfiguration] = js.undefined
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.undefined
  
  var textract: js.UndefOr[typings.awsSdk.textractMod.ClientConfiguration] = js.undefined
  
  var timestreamquery: js.UndefOr[typings.awsSdk.timestreamqueryMod.ClientConfiguration] = js.undefined
  
  var timestreamwrite: js.UndefOr[typings.awsSdk.timestreamwriteMod.ClientConfiguration] = js.undefined
  
  /**
    * The Token to authenticate requests with.
    */
  var token: js.UndefOr[Token | Null] = js.undefined
  
  /**
    * The provider chain used to resolve token if no static token property is set.
    */
  var tokenProvider: js.UndefOr[TokenProviderChain] = js.undefined
  
  var transcribeservice: js.UndefOr[typings.awsSdk.transcribeserviceMod.ClientConfiguration] = js.undefined
  
  var transfer: js.UndefOr[typings.awsSdk.transferMod.ClientConfiguration] = js.undefined
  
  var translate: js.UndefOr[typings.awsSdk.translateMod.ClientConfiguration] = js.undefined
  
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
  
  var voiceid: js.UndefOr[typings.awsSdk.voiceidMod.ClientConfiguration] = js.undefined
  
  var waf: js.UndefOr[typings.awsSdk.wafMod.ClientConfiguration] = js.undefined
  
  var wafregional: js.UndefOr[typings.awsSdk.wafregionalMod.ClientConfiguration] = js.undefined
  
  var wafv2: js.UndefOr[typings.awsSdk.wafv2Mod.ClientConfiguration] = js.undefined
  
  var wellarchitected: js.UndefOr[typings.awsSdk.wellarchitectedMod.ClientConfiguration] = js.undefined
  
  var wisdom: js.UndefOr[typings.awsSdk.wisdomMod.ClientConfiguration] = js.undefined
  
  var workdocs: js.UndefOr[typings.awsSdk.workdocsMod.ClientConfiguration] = js.undefined
  
  var worklink: js.UndefOr[typings.awsSdk.worklinkMod.ClientConfiguration] = js.undefined
  
  var workmail: js.UndefOr[typings.awsSdk.workmailMod.ClientConfiguration] = js.undefined
  
  var workmailmessageflow: js.UndefOr[typings.awsSdk.workmailmessageflowMod.ClientConfiguration] = js.undefined
  
  var workspaces: js.UndefOr[typings.awsSdk.workspacesMod.ClientConfiguration] = js.undefined
  
  var workspacesweb: js.UndefOr[typings.awsSdk.workspaceswebMod.ClientConfiguration] = js.undefined
  
  var xray: js.UndefOr[typings.awsSdk.xrayMod.ClientConfiguration] = js.undefined
}
object ConfigurationOptionsConfi {
  
  inline def apply(Object: js.Object): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Object)
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
  
  extension [Self <: ConfigurationOptionsConfi](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setAccessanalyzer(value: ClientConfiguration): Self = StObject.set(x, "accessanalyzer", value.asInstanceOf[js.Any])
    
    inline def setAccessanalyzerUndefined: Self = StObject.set(x, "accessanalyzer", js.undefined)
    
    inline def setAccount(value: typings.awsSdk.accountMod.ClientConfiguration): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAcm(value: typings.awsSdk.acmMod.ClientConfiguration): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setAcmpca(value: typings.awsSdk.acmpcaMod.ClientConfiguration): Self = StObject.set(x, "acmpca", value.asInstanceOf[js.Any])
    
    inline def setAcmpcaUndefined: Self = StObject.set(x, "acmpca", js.undefined)
    
    inline def setAlexaforbusiness(value: typings.awsSdk.alexaforbusinessMod.ClientConfiguration): Self = StObject.set(x, "alexaforbusiness", value.asInstanceOf[js.Any])
    
    inline def setAlexaforbusinessUndefined: Self = StObject.set(x, "alexaforbusiness", js.undefined)
    
    inline def setAmp(value: typings.awsSdk.ampMod.ClientConfiguration): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
    
    inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
    
    inline def setAmplify(value: typings.awsSdk.amplifyMod.ClientConfiguration): Self = StObject.set(x, "amplify", value.asInstanceOf[js.Any])
    
    inline def setAmplifyUndefined: Self = StObject.set(x, "amplify", js.undefined)
    
    inline def setAmplifybackend(value: typings.awsSdk.amplifybackendMod.ClientConfiguration): Self = StObject.set(x, "amplifybackend", value.asInstanceOf[js.Any])
    
    inline def setAmplifybackendUndefined: Self = StObject.set(x, "amplifybackend", js.undefined)
    
    inline def setAmplifyuibuilder(value: typings.awsSdk.amplifyuibuilderMod.ClientConfiguration): Self = StObject.set(x, "amplifyuibuilder", value.asInstanceOf[js.Any])
    
    inline def setAmplifyuibuilderUndefined: Self = StObject.set(x, "amplifyuibuilder", js.undefined)
    
    inline def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    inline def setApigateway(value: typings.awsSdk.apigatewayMod.ClientConfiguration): Self = StObject.set(x, "apigateway", value.asInstanceOf[js.Any])
    
    inline def setApigatewayUndefined: Self = StObject.set(x, "apigateway", js.undefined)
    
    inline def setApigatewaymanagementapi(value: typings.awsSdk.apigatewaymanagementapiMod.ClientConfiguration): Self = StObject.set(x, "apigatewaymanagementapi", value.asInstanceOf[js.Any])
    
    inline def setApigatewaymanagementapiUndefined: Self = StObject.set(x, "apigatewaymanagementapi", js.undefined)
    
    inline def setApigatewayv2(value: typings.awsSdk.apigatewayv2Mod.ClientConfiguration): Self = StObject.set(x, "apigatewayv2", value.asInstanceOf[js.Any])
    
    inline def setApigatewayv2Undefined: Self = StObject.set(x, "apigatewayv2", js.undefined)
    
    inline def setAppconfig(value: typings.awsSdk.appconfigMod.ClientConfiguration): Self = StObject.set(x, "appconfig", value.asInstanceOf[js.Any])
    
    inline def setAppconfigUndefined: Self = StObject.set(x, "appconfig", js.undefined)
    
    inline def setAppconfigdata(value: typings.awsSdk.appconfigdataMod.ClientConfiguration): Self = StObject.set(x, "appconfigdata", value.asInstanceOf[js.Any])
    
    inline def setAppconfigdataUndefined: Self = StObject.set(x, "appconfigdata", js.undefined)
    
    inline def setAppflow(value: typings.awsSdk.appflowMod.ClientConfiguration): Self = StObject.set(x, "appflow", value.asInstanceOf[js.Any])
    
    inline def setAppflowUndefined: Self = StObject.set(x, "appflow", js.undefined)
    
    inline def setAppintegrations(value: typings.awsSdk.appintegrationsMod.ClientConfiguration): Self = StObject.set(x, "appintegrations", value.asInstanceOf[js.Any])
    
    inline def setAppintegrationsUndefined: Self = StObject.set(x, "appintegrations", js.undefined)
    
    inline def setApplicationautoscaling(value: typings.awsSdk.applicationautoscalingMod.ClientConfiguration): Self = StObject.set(x, "applicationautoscaling", value.asInstanceOf[js.Any])
    
    inline def setApplicationautoscalingUndefined: Self = StObject.set(x, "applicationautoscaling", js.undefined)
    
    inline def setApplicationcostprofiler(value: typings.awsSdk.applicationcostprofilerMod.ClientConfiguration): Self = StObject.set(x, "applicationcostprofiler", value.asInstanceOf[js.Any])
    
    inline def setApplicationcostprofilerUndefined: Self = StObject.set(x, "applicationcostprofiler", js.undefined)
    
    inline def setApplicationinsights(value: typings.awsSdk.applicationinsightsMod.ClientConfiguration): Self = StObject.set(x, "applicationinsights", value.asInstanceOf[js.Any])
    
    inline def setApplicationinsightsUndefined: Self = StObject.set(x, "applicationinsights", js.undefined)
    
    inline def setAppmesh(value: typings.awsSdk.appmeshMod.ClientConfiguration): Self = StObject.set(x, "appmesh", value.asInstanceOf[js.Any])
    
    inline def setAppmeshUndefined: Self = StObject.set(x, "appmesh", js.undefined)
    
    inline def setApprunner(value: typings.awsSdk.apprunnerMod.ClientConfiguration): Self = StObject.set(x, "apprunner", value.asInstanceOf[js.Any])
    
    inline def setApprunnerUndefined: Self = StObject.set(x, "apprunner", js.undefined)
    
    inline def setAppstream(value: typings.awsSdk.appstreamMod.ClientConfiguration): Self = StObject.set(x, "appstream", value.asInstanceOf[js.Any])
    
    inline def setAppstreamUndefined: Self = StObject.set(x, "appstream", js.undefined)
    
    inline def setAppsync(value: typings.awsSdk.appsyncMod.ClientConfiguration): Self = StObject.set(x, "appsync", value.asInstanceOf[js.Any])
    
    inline def setAppsyncUndefined: Self = StObject.set(x, "appsync", js.undefined)
    
    inline def setAthena(value: typings.awsSdk.athenaMod.ClientConfiguration): Self = StObject.set(x, "athena", value.asInstanceOf[js.Any])
    
    inline def setAthenaUndefined: Self = StObject.set(x, "athena", js.undefined)
    
    inline def setAuditmanager(value: typings.awsSdk.auditmanagerMod.ClientConfiguration): Self = StObject.set(x, "auditmanager", value.asInstanceOf[js.Any])
    
    inline def setAuditmanagerUndefined: Self = StObject.set(x, "auditmanager", js.undefined)
    
    inline def setAugmentedairuntime(value: typings.awsSdk.augmentedairuntimeMod.ClientConfiguration): Self = StObject.set(x, "augmentedairuntime", value.asInstanceOf[js.Any])
    
    inline def setAugmentedairuntimeUndefined: Self = StObject.set(x, "augmentedairuntime", js.undefined)
    
    inline def setAutoscaling(value: typings.awsSdk.autoscalingMod.ClientConfiguration): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setAutoscalingplans(value: typings.awsSdk.autoscalingplansMod.ClientConfiguration): Self = StObject.set(x, "autoscalingplans", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingplansUndefined: Self = StObject.set(x, "autoscalingplans", js.undefined)
    
    inline def setBackup(value: typings.awsSdk.backupMod.ClientConfiguration): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setBackupgateway(value: typings.awsSdk.backupgatewayMod.ClientConfiguration): Self = StObject.set(x, "backupgateway", value.asInstanceOf[js.Any])
    
    inline def setBackupgatewayUndefined: Self = StObject.set(x, "backupgateway", js.undefined)
    
    inline def setBackupstorage(value: typings.awsSdk.backupstorageMod.ClientConfiguration): Self = StObject.set(x, "backupstorage", value.asInstanceOf[js.Any])
    
    inline def setBackupstorageUndefined: Self = StObject.set(x, "backupstorage", js.undefined)
    
    inline def setBatch(value: typings.awsSdk.batchMod.ClientConfiguration): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setBillingconductor(value: typings.awsSdk.billingconductorMod.ClientConfiguration): Self = StObject.set(x, "billingconductor", value.asInstanceOf[js.Any])
    
    inline def setBillingconductorUndefined: Self = StObject.set(x, "billingconductor", js.undefined)
    
    inline def setBraket(value: typings.awsSdk.braketMod.ClientConfiguration): Self = StObject.set(x, "braket", value.asInstanceOf[js.Any])
    
    inline def setBraketUndefined: Self = StObject.set(x, "braket", js.undefined)
    
    inline def setBudgets(value: typings.awsSdk.budgetsMod.ClientConfiguration): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setChime(value: typings.awsSdk.chimeMod.ClientConfiguration): Self = StObject.set(x, "chime", value.asInstanceOf[js.Any])
    
    inline def setChimeUndefined: Self = StObject.set(x, "chime", js.undefined)
    
    inline def setChimesdkidentity(value: typings.awsSdk.chimesdkidentityMod.ClientConfiguration): Self = StObject.set(x, "chimesdkidentity", value.asInstanceOf[js.Any])
    
    inline def setChimesdkidentityUndefined: Self = StObject.set(x, "chimesdkidentity", js.undefined)
    
    inline def setChimesdkmediapipelines(value: typings.awsSdk.chimesdkmediapipelinesMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmediapipelines", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmediapipelinesUndefined: Self = StObject.set(x, "chimesdkmediapipelines", js.undefined)
    
    inline def setChimesdkmeetings(value: typings.awsSdk.chimesdkmeetingsMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmeetings", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmeetingsUndefined: Self = StObject.set(x, "chimesdkmeetings", js.undefined)
    
    inline def setChimesdkmessaging(value: typings.awsSdk.chimesdkmessagingMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmessaging", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmessagingUndefined: Self = StObject.set(x, "chimesdkmessaging", js.undefined)
    
    inline def setCloud9(value: typings.awsSdk.cloud9Mod.ClientConfiguration): Self = StObject.set(x, "cloud9", value.asInstanceOf[js.Any])
    
    inline def setCloud9Undefined: Self = StObject.set(x, "cloud9", js.undefined)
    
    inline def setCloudcontrol(value: typings.awsSdk.cloudcontrolMod.ClientConfiguration): Self = StObject.set(x, "cloudcontrol", value.asInstanceOf[js.Any])
    
    inline def setCloudcontrolUndefined: Self = StObject.set(x, "cloudcontrol", js.undefined)
    
    inline def setClouddirectory(value: typings.awsSdk.clouddirectoryMod.ClientConfiguration): Self = StObject.set(x, "clouddirectory", value.asInstanceOf[js.Any])
    
    inline def setClouddirectoryUndefined: Self = StObject.set(x, "clouddirectory", js.undefined)
    
    inline def setCloudformation(value: typings.awsSdk.cloudformationMod.ClientConfiguration): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
    
    inline def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
    
    inline def setCloudfront(value: typings.awsSdk.cloudfrontMod.ClientConfiguration): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
    
    inline def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
    
    inline def setCloudhsm(value: typings.awsSdk.cloudhsmMod.ClientConfiguration): Self = StObject.set(x, "cloudhsm", value.asInstanceOf[js.Any])
    
    inline def setCloudhsmUndefined: Self = StObject.set(x, "cloudhsm", js.undefined)
    
    inline def setCloudhsmv2(value: typings.awsSdk.cloudhsmv2Mod.ClientConfiguration): Self = StObject.set(x, "cloudhsmv2", value.asInstanceOf[js.Any])
    
    inline def setCloudhsmv2Undefined: Self = StObject.set(x, "cloudhsmv2", js.undefined)
    
    inline def setCloudsearch(value: typings.awsSdk.cloudsearchMod.ClientConfiguration): Self = StObject.set(x, "cloudsearch", value.asInstanceOf[js.Any])
    
    inline def setCloudsearchUndefined: Self = StObject.set(x, "cloudsearch", js.undefined)
    
    inline def setCloudsearchdomain(value: typings.awsSdk.cloudsearchdomainMod.ClientConfiguration): Self = StObject.set(x, "cloudsearchdomain", value.asInstanceOf[js.Any])
    
    inline def setCloudsearchdomainUndefined: Self = StObject.set(x, "cloudsearchdomain", js.undefined)
    
    inline def setCloudtrail(value: typings.awsSdk.cloudtrailMod.ClientConfiguration): Self = StObject.set(x, "cloudtrail", value.asInstanceOf[js.Any])
    
    inline def setCloudtrailUndefined: Self = StObject.set(x, "cloudtrail", js.undefined)
    
    inline def setCloudwatch(value: typings.awsSdk.cloudwatchMod.ClientConfiguration): Self = StObject.set(x, "cloudwatch", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchUndefined: Self = StObject.set(x, "cloudwatch", js.undefined)
    
    inline def setCloudwatchevents(value: typings.awsSdk.cloudwatcheventsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchevents", value.asInstanceOf[js.Any])
    
    inline def setCloudwatcheventsUndefined: Self = StObject.set(x, "cloudwatchevents", js.undefined)
    
    inline def setCloudwatchlogs(value: typings.awsSdk.cloudwatchlogsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchlogs", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchlogsUndefined: Self = StObject.set(x, "cloudwatchlogs", js.undefined)
    
    inline def setCodeartifact(value: typings.awsSdk.codeartifactMod.ClientConfiguration): Self = StObject.set(x, "codeartifact", value.asInstanceOf[js.Any])
    
    inline def setCodeartifactUndefined: Self = StObject.set(x, "codeartifact", js.undefined)
    
    inline def setCodebuild(value: typings.awsSdk.codebuildMod.ClientConfiguration): Self = StObject.set(x, "codebuild", value.asInstanceOf[js.Any])
    
    inline def setCodebuildUndefined: Self = StObject.set(x, "codebuild", js.undefined)
    
    inline def setCodecommit(value: typings.awsSdk.codecommitMod.ClientConfiguration): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
    
    inline def setCodecommitUndefined: Self = StObject.set(x, "codecommit", js.undefined)
    
    inline def setCodedeploy(value: typings.awsSdk.codedeployMod.ClientConfiguration): Self = StObject.set(x, "codedeploy", value.asInstanceOf[js.Any])
    
    inline def setCodedeployUndefined: Self = StObject.set(x, "codedeploy", js.undefined)
    
    inline def setCodeguruprofiler(value: typings.awsSdk.codeguruprofilerMod.ClientConfiguration): Self = StObject.set(x, "codeguruprofiler", value.asInstanceOf[js.Any])
    
    inline def setCodeguruprofilerUndefined: Self = StObject.set(x, "codeguruprofiler", js.undefined)
    
    inline def setCodegurureviewer(value: typings.awsSdk.codegurureviewerMod.ClientConfiguration): Self = StObject.set(x, "codegurureviewer", value.asInstanceOf[js.Any])
    
    inline def setCodegurureviewerUndefined: Self = StObject.set(x, "codegurureviewer", js.undefined)
    
    inline def setCodepipeline(value: typings.awsSdk.codepipelineMod.ClientConfiguration): Self = StObject.set(x, "codepipeline", value.asInstanceOf[js.Any])
    
    inline def setCodepipelineUndefined: Self = StObject.set(x, "codepipeline", js.undefined)
    
    inline def setCodestar(value: typings.awsSdk.codestarMod.ClientConfiguration): Self = StObject.set(x, "codestar", value.asInstanceOf[js.Any])
    
    inline def setCodestarUndefined: Self = StObject.set(x, "codestar", js.undefined)
    
    inline def setCodestarconnections(value: typings.awsSdk.codestarconnectionsMod.ClientConfiguration): Self = StObject.set(x, "codestarconnections", value.asInstanceOf[js.Any])
    
    inline def setCodestarconnectionsUndefined: Self = StObject.set(x, "codestarconnections", js.undefined)
    
    inline def setCodestarnotifications(value: typings.awsSdk.codestarnotificationsMod.ClientConfiguration): Self = StObject.set(x, "codestarnotifications", value.asInstanceOf[js.Any])
    
    inline def setCodestarnotificationsUndefined: Self = StObject.set(x, "codestarnotifications", js.undefined)
    
    inline def setCognitoidentity(value: typings.awsSdk.cognitoidentityMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentity", value.asInstanceOf[js.Any])
    
    inline def setCognitoidentityUndefined: Self = StObject.set(x, "cognitoidentity", js.undefined)
    
    inline def setCognitoidentityserviceprovider(value: typings.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentityserviceprovider", value.asInstanceOf[js.Any])
    
    inline def setCognitoidentityserviceproviderUndefined: Self = StObject.set(x, "cognitoidentityserviceprovider", js.undefined)
    
    inline def setCognitosync(value: typings.awsSdk.cognitosyncMod.ClientConfiguration): Self = StObject.set(x, "cognitosync", value.asInstanceOf[js.Any])
    
    inline def setCognitosyncUndefined: Self = StObject.set(x, "cognitosync", js.undefined)
    
    inline def setComprehend(value: typings.awsSdk.comprehendMod.ClientConfiguration): Self = StObject.set(x, "comprehend", value.asInstanceOf[js.Any])
    
    inline def setComprehendUndefined: Self = StObject.set(x, "comprehend", js.undefined)
    
    inline def setComprehendmedical(value: typings.awsSdk.comprehendmedicalMod.ClientConfiguration): Self = StObject.set(x, "comprehendmedical", value.asInstanceOf[js.Any])
    
    inline def setComprehendmedicalUndefined: Self = StObject.set(x, "comprehendmedical", js.undefined)
    
    inline def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    inline def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    inline def setComputeoptimizer(value: typings.awsSdk.computeoptimizerMod.ClientConfiguration): Self = StObject.set(x, "computeoptimizer", value.asInstanceOf[js.Any])
    
    inline def setComputeoptimizerUndefined: Self = StObject.set(x, "computeoptimizer", js.undefined)
    
    inline def setConfigservice(value: typings.awsSdk.configserviceMod.ClientConfiguration): Self = StObject.set(x, "configservice", value.asInstanceOf[js.Any])
    
    inline def setConfigserviceUndefined: Self = StObject.set(x, "configservice", js.undefined)
    
    inline def setConnect(value: typings.awsSdk.connectMod.ClientConfiguration): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnectcampaigns(value: typings.awsSdk.connectcampaignsMod.ClientConfiguration): Self = StObject.set(x, "connectcampaigns", value.asInstanceOf[js.Any])
    
    inline def setConnectcampaignsUndefined: Self = StObject.set(x, "connectcampaigns", js.undefined)
    
    inline def setConnectcontactlens(value: typings.awsSdk.connectcontactlensMod.ClientConfiguration): Self = StObject.set(x, "connectcontactlens", value.asInstanceOf[js.Any])
    
    inline def setConnectcontactlensUndefined: Self = StObject.set(x, "connectcontactlens", js.undefined)
    
    inline def setConnectparticipant(value: typings.awsSdk.connectparticipantMod.ClientConfiguration): Self = StObject.set(x, "connectparticipant", value.asInstanceOf[js.Any])
    
    inline def setConnectparticipantUndefined: Self = StObject.set(x, "connectparticipant", js.undefined)
    
    inline def setControltower(value: typings.awsSdk.controltowerMod.ClientConfiguration): Self = StObject.set(x, "controltower", value.asInstanceOf[js.Any])
    
    inline def setControltowerUndefined: Self = StObject.set(x, "controltower", js.undefined)
    
    inline def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    inline def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    inline def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    inline def setCostexplorer(value: typings.awsSdk.costexplorerMod.ClientConfiguration): Self = StObject.set(x, "costexplorer", value.asInstanceOf[js.Any])
    
    inline def setCostexplorerUndefined: Self = StObject.set(x, "costexplorer", js.undefined)
    
    inline def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    inline def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    inline def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCur(value: typings.awsSdk.curMod.ClientConfiguration): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    inline def setCurUndefined: Self = StObject.set(x, "cur", js.undefined)
    
    inline def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    inline def setCustomerprofiles(value: typings.awsSdk.customerprofilesMod.ClientConfiguration): Self = StObject.set(x, "customerprofiles", value.asInstanceOf[js.Any])
    
    inline def setCustomerprofilesUndefined: Self = StObject.set(x, "customerprofiles", js.undefined)
    
    inline def setDatabrew(value: typings.awsSdk.databrewMod.ClientConfiguration): Self = StObject.set(x, "databrew", value.asInstanceOf[js.Any])
    
    inline def setDatabrewUndefined: Self = StObject.set(x, "databrew", js.undefined)
    
    inline def setDataexchange(value: typings.awsSdk.dataexchangeMod.ClientConfiguration): Self = StObject.set(x, "dataexchange", value.asInstanceOf[js.Any])
    
    inline def setDataexchangeUndefined: Self = StObject.set(x, "dataexchange", js.undefined)
    
    inline def setDatapipeline(value: typings.awsSdk.datapipelineMod.ClientConfiguration): Self = StObject.set(x, "datapipeline", value.asInstanceOf[js.Any])
    
    inline def setDatapipelineUndefined: Self = StObject.set(x, "datapipeline", js.undefined)
    
    inline def setDatasync(value: typings.awsSdk.datasyncMod.ClientConfiguration): Self = StObject.set(x, "datasync", value.asInstanceOf[js.Any])
    
    inline def setDatasyncUndefined: Self = StObject.set(x, "datasync", js.undefined)
    
    inline def setDax(value: typings.awsSdk.daxMod.ClientConfiguration): Self = StObject.set(x, "dax", value.asInstanceOf[js.Any])
    
    inline def setDaxUndefined: Self = StObject.set(x, "dax", js.undefined)
    
    inline def setDetective(value: typings.awsSdk.detectiveMod.ClientConfiguration): Self = StObject.set(x, "detective", value.asInstanceOf[js.Any])
    
    inline def setDetectiveUndefined: Self = StObject.set(x, "detective", js.undefined)
    
    inline def setDevicefarm(value: typings.awsSdk.devicefarmMod.ClientConfiguration): Self = StObject.set(x, "devicefarm", value.asInstanceOf[js.Any])
    
    inline def setDevicefarmUndefined: Self = StObject.set(x, "devicefarm", js.undefined)
    
    inline def setDevopsguru(value: typings.awsSdk.devopsguruMod.ClientConfiguration): Self = StObject.set(x, "devopsguru", value.asInstanceOf[js.Any])
    
    inline def setDevopsguruUndefined: Self = StObject.set(x, "devopsguru", js.undefined)
    
    inline def setDirectconnect(value: typings.awsSdk.directconnectMod.ClientConfiguration): Self = StObject.set(x, "directconnect", value.asInstanceOf[js.Any])
    
    inline def setDirectconnectUndefined: Self = StObject.set(x, "directconnect", js.undefined)
    
    inline def setDirectoryservice(value: typings.awsSdk.directoryserviceMod.ClientConfiguration): Self = StObject.set(x, "directoryservice", value.asInstanceOf[js.Any])
    
    inline def setDirectoryserviceUndefined: Self = StObject.set(x, "directoryservice", js.undefined)
    
    inline def setDiscovery(value: typings.awsSdk.discoveryMod.ClientConfiguration): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setDlm(value: typings.awsSdk.dlmMod.ClientConfiguration): Self = StObject.set(x, "dlm", value.asInstanceOf[js.Any])
    
    inline def setDlmUndefined: Self = StObject.set(x, "dlm", js.undefined)
    
    inline def setDms(value: typings.awsSdk.dmsMod.ClientConfiguration): Self = StObject.set(x, "dms", value.asInstanceOf[js.Any])
    
    inline def setDmsUndefined: Self = StObject.set(x, "dms", js.undefined)
    
    inline def setDocdb(value: typings.awsSdk.docdbMod.ClientConfiguration): Self = StObject.set(x, "docdb", value.asInstanceOf[js.Any])
    
    inline def setDocdbUndefined: Self = StObject.set(x, "docdb", js.undefined)
    
    inline def setDrs(value: typings.awsSdk.drsMod.ClientConfiguration): Self = StObject.set(x, "drs", value.asInstanceOf[js.Any])
    
    inline def setDrsUndefined: Self = StObject.set(x, "drs", js.undefined)
    
    inline def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    inline def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    inline def setDynamodb(value: typings.awsSdk.dynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setDynamodbstreams(value: typings.awsSdk.dynamodbstreamsMod.ClientConfiguration): Self = StObject.set(x, "dynamodbstreams", value.asInstanceOf[js.Any])
    
    inline def setDynamodbstreamsUndefined: Self = StObject.set(x, "dynamodbstreams", js.undefined)
    
    inline def setEbs(value: typings.awsSdk.ebsMod.ClientConfiguration): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    inline def setEc2(value: typings.awsSdk.ec2Mod.ClientConfiguration): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
    
    inline def setEc2instanceconnect(value: typings.awsSdk.ec2instanceconnectMod.ClientConfiguration): Self = StObject.set(x, "ec2instanceconnect", value.asInstanceOf[js.Any])
    
    inline def setEc2instanceconnectUndefined: Self = StObject.set(x, "ec2instanceconnect", js.undefined)
    
    inline def setEcr(value: typings.awsSdk.ecrMod.ClientConfiguration): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
    
    inline def setEcrUndefined: Self = StObject.set(x, "ecr", js.undefined)
    
    inline def setEcrpublic(value: typings.awsSdk.ecrpublicMod.ClientConfiguration): Self = StObject.set(x, "ecrpublic", value.asInstanceOf[js.Any])
    
    inline def setEcrpublicUndefined: Self = StObject.set(x, "ecrpublic", js.undefined)
    
    inline def setEcs(value: typings.awsSdk.ecsMod.ClientConfiguration): Self = StObject.set(x, "ecs", value.asInstanceOf[js.Any])
    
    inline def setEcsUndefined: Self = StObject.set(x, "ecs", js.undefined)
    
    inline def setEfs(value: typings.awsSdk.efsMod.ClientConfiguration): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
    
    inline def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
    
    inline def setEks(value: typings.awsSdk.eksMod.ClientConfiguration): Self = StObject.set(x, "eks", value.asInstanceOf[js.Any])
    
    inline def setEksUndefined: Self = StObject.set(x, "eks", js.undefined)
    
    inline def setElasticache(value: typings.awsSdk.elasticacheMod.ClientConfiguration): Self = StObject.set(x, "elasticache", value.asInstanceOf[js.Any])
    
    inline def setElasticacheUndefined: Self = StObject.set(x, "elasticache", js.undefined)
    
    inline def setElasticbeanstalk(value: typings.awsSdk.elasticbeanstalkMod.ClientConfiguration): Self = StObject.set(x, "elasticbeanstalk", value.asInstanceOf[js.Any])
    
    inline def setElasticbeanstalkUndefined: Self = StObject.set(x, "elasticbeanstalk", js.undefined)
    
    inline def setElasticinference(value: typings.awsSdk.elasticinferenceMod.ClientConfiguration): Self = StObject.set(x, "elasticinference", value.asInstanceOf[js.Any])
    
    inline def setElasticinferenceUndefined: Self = StObject.set(x, "elasticinference", js.undefined)
    
    inline def setElastictranscoder(value: typings.awsSdk.elastictranscoderMod.ClientConfiguration): Self = StObject.set(x, "elastictranscoder", value.asInstanceOf[js.Any])
    
    inline def setElastictranscoderUndefined: Self = StObject.set(x, "elastictranscoder", js.undefined)
    
    inline def setElb(value: typings.awsSdk.elbMod.ClientConfiguration): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
    
    inline def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
    
    inline def setElbv2(value: typings.awsSdk.elbv2Mod.ClientConfiguration): Self = StObject.set(x, "elbv2", value.asInstanceOf[js.Any])
    
    inline def setElbv2Undefined: Self = StObject.set(x, "elbv2", js.undefined)
    
    inline def setEmr(value: typings.awsSdk.emrMod.ClientConfiguration): Self = StObject.set(x, "emr", value.asInstanceOf[js.Any])
    
    inline def setEmrUndefined: Self = StObject.set(x, "emr", js.undefined)
    
    inline def setEmrcontainers(value: typings.awsSdk.emrcontainersMod.ClientConfiguration): Self = StObject.set(x, "emrcontainers", value.asInstanceOf[js.Any])
    
    inline def setEmrcontainersUndefined: Self = StObject.set(x, "emrcontainers", js.undefined)
    
    inline def setEmrserverless(value: typings.awsSdk.emrserverlessMod.ClientConfiguration): Self = StObject.set(x, "emrserverless", value.asInstanceOf[js.Any])
    
    inline def setEmrserverlessUndefined: Self = StObject.set(x, "emrserverless", js.undefined)
    
    inline def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    inline def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    inline def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    inline def setEs(value: typings.awsSdk.esMod.ClientConfiguration): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    inline def setEventbridge(value: typings.awsSdk.eventbridgeMod.ClientConfiguration): Self = StObject.set(x, "eventbridge", value.asInstanceOf[js.Any])
    
    inline def setEventbridgeUndefined: Self = StObject.set(x, "eventbridge", js.undefined)
    
    inline def setEvidently(value: typings.awsSdk.evidentlyMod.ClientConfiguration): Self = StObject.set(x, "evidently", value.asInstanceOf[js.Any])
    
    inline def setEvidentlyUndefined: Self = StObject.set(x, "evidently", js.undefined)
    
    inline def setFinspace(value: typings.awsSdk.finspaceMod.ClientConfiguration): Self = StObject.set(x, "finspace", value.asInstanceOf[js.Any])
    
    inline def setFinspaceUndefined: Self = StObject.set(x, "finspace", js.undefined)
    
    inline def setFinspacedata(value: typings.awsSdk.finspacedataMod.ClientConfiguration): Self = StObject.set(x, "finspacedata", value.asInstanceOf[js.Any])
    
    inline def setFinspacedataUndefined: Self = StObject.set(x, "finspacedata", js.undefined)
    
    inline def setFirehose(value: typings.awsSdk.firehoseMod.ClientConfiguration): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setFis(value: typings.awsSdk.fisMod.ClientConfiguration): Self = StObject.set(x, "fis", value.asInstanceOf[js.Any])
    
    inline def setFisUndefined: Self = StObject.set(x, "fis", js.undefined)
    
    inline def setFms(value: typings.awsSdk.fmsMod.ClientConfiguration): Self = StObject.set(x, "fms", value.asInstanceOf[js.Any])
    
    inline def setFmsUndefined: Self = StObject.set(x, "fms", js.undefined)
    
    inline def setForecastqueryservice(value: typings.awsSdk.forecastqueryserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastqueryservice", value.asInstanceOf[js.Any])
    
    inline def setForecastqueryserviceUndefined: Self = StObject.set(x, "forecastqueryservice", js.undefined)
    
    inline def setForecastservice(value: typings.awsSdk.forecastserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastservice", value.asInstanceOf[js.Any])
    
    inline def setForecastserviceUndefined: Self = StObject.set(x, "forecastservice", js.undefined)
    
    inline def setFrauddetector(value: typings.awsSdk.frauddetectorMod.ClientConfiguration): Self = StObject.set(x, "frauddetector", value.asInstanceOf[js.Any])
    
    inline def setFrauddetectorUndefined: Self = StObject.set(x, "frauddetector", js.undefined)
    
    inline def setFsx(value: typings.awsSdk.fsxMod.ClientConfiguration): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
    
    inline def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
    
    inline def setGamelift(value: typings.awsSdk.gameliftMod.ClientConfiguration): Self = StObject.set(x, "gamelift", value.asInstanceOf[js.Any])
    
    inline def setGameliftUndefined: Self = StObject.set(x, "gamelift", js.undefined)
    
    inline def setGamesparks(value: typings.awsSdk.gamesparksMod.ClientConfiguration): Self = StObject.set(x, "gamesparks", value.asInstanceOf[js.Any])
    
    inline def setGamesparksUndefined: Self = StObject.set(x, "gamesparks", js.undefined)
    
    inline def setGlacier(value: typings.awsSdk.glacierMod.ClientConfiguration): Self = StObject.set(x, "glacier", value.asInstanceOf[js.Any])
    
    inline def setGlacierUndefined: Self = StObject.set(x, "glacier", js.undefined)
    
    inline def setGlobalaccelerator(value: typings.awsSdk.globalacceleratorMod.ClientConfiguration): Self = StObject.set(x, "globalaccelerator", value.asInstanceOf[js.Any])
    
    inline def setGlobalacceleratorUndefined: Self = StObject.set(x, "globalaccelerator", js.undefined)
    
    inline def setGlue(value: typings.awsSdk.glueMod.ClientConfiguration): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    inline def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
    
    inline def setGrafana(value: typings.awsSdk.grafanaMod.ClientConfiguration): Self = StObject.set(x, "grafana", value.asInstanceOf[js.Any])
    
    inline def setGrafanaUndefined: Self = StObject.set(x, "grafana", js.undefined)
    
    inline def setGreengrass(value: typings.awsSdk.greengrassMod.ClientConfiguration): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
    
    inline def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
    
    inline def setGreengrassv2(value: typings.awsSdk.greengrassv2Mod.ClientConfiguration): Self = StObject.set(x, "greengrassv2", value.asInstanceOf[js.Any])
    
    inline def setGreengrassv2Undefined: Self = StObject.set(x, "greengrassv2", js.undefined)
    
    inline def setGroundstation(value: typings.awsSdk.groundstationMod.ClientConfiguration): Self = StObject.set(x, "groundstation", value.asInstanceOf[js.Any])
    
    inline def setGroundstationUndefined: Self = StObject.set(x, "groundstation", js.undefined)
    
    inline def setGuardduty(value: typings.awsSdk.guarddutyMod.ClientConfiguration): Self = StObject.set(x, "guardduty", value.asInstanceOf[js.Any])
    
    inline def setGuarddutyUndefined: Self = StObject.set(x, "guardduty", js.undefined)
    
    inline def setHealth(value: typings.awsSdk.healthMod.ClientConfiguration): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setHealthlake(value: typings.awsSdk.healthlakeMod.ClientConfiguration): Self = StObject.set(x, "healthlake", value.asInstanceOf[js.Any])
    
    inline def setHealthlakeUndefined: Self = StObject.set(x, "healthlake", js.undefined)
    
    inline def setHoneycode(value: typings.awsSdk.honeycodeMod.ClientConfiguration): Self = StObject.set(x, "honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "honeycode", js.undefined)
    
    inline def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    inline def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setIam(value: typings.awsSdk.iamMod.ClientConfiguration): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    inline def setIdentitystore(value: typings.awsSdk.identitystoreMod.ClientConfiguration): Self = StObject.set(x, "identitystore", value.asInstanceOf[js.Any])
    
    inline def setIdentitystoreUndefined: Self = StObject.set(x, "identitystore", js.undefined)
    
    inline def setImagebuilder(value: typings.awsSdk.imagebuilderMod.ClientConfiguration): Self = StObject.set(x, "imagebuilder", value.asInstanceOf[js.Any])
    
    inline def setImagebuilderUndefined: Self = StObject.set(x, "imagebuilder", js.undefined)
    
    inline def setImportexport(value: typings.awsSdk.importexportMod.ClientConfiguration): Self = StObject.set(x, "importexport", value.asInstanceOf[js.Any])
    
    inline def setImportexportUndefined: Self = StObject.set(x, "importexport", js.undefined)
    
    inline def setInspector(value: typings.awsSdk.inspectorMod.ClientConfiguration): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    inline def setInspector2(value: typings.awsSdk.inspector2Mod.ClientConfiguration): Self = StObject.set(x, "inspector2", value.asInstanceOf[js.Any])
    
    inline def setInspector2Undefined: Self = StObject.set(x, "inspector2", js.undefined)
    
    inline def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    
    inline def setIot(value: typings.awsSdk.iotMod.ClientConfiguration): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    inline def setIot1clickdevicesservice(value: typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration): Self = StObject.set(x, "iot1clickdevicesservice", value.asInstanceOf[js.Any])
    
    inline def setIot1clickdevicesserviceUndefined: Self = StObject.set(x, "iot1clickdevicesservice", js.undefined)
    
    inline def setIot1clickprojects(value: typings.awsSdk.iot1clickprojectsMod.ClientConfiguration): Self = StObject.set(x, "iot1clickprojects", value.asInstanceOf[js.Any])
    
    inline def setIot1clickprojectsUndefined: Self = StObject.set(x, "iot1clickprojects", js.undefined)
    
    inline def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    inline def setIotanalytics(value: typings.awsSdk.iotanalyticsMod.ClientConfiguration): Self = StObject.set(x, "iotanalytics", value.asInstanceOf[js.Any])
    
    inline def setIotanalyticsUndefined: Self = StObject.set(x, "iotanalytics", js.undefined)
    
    inline def setIotdata(value: typings.awsSdk.iotdataMod.ClientConfiguration): Self = StObject.set(x, "iotdata", value.asInstanceOf[js.Any])
    
    inline def setIotdataUndefined: Self = StObject.set(x, "iotdata", js.undefined)
    
    inline def setIotdeviceadvisor(value: typings.awsSdk.iotdeviceadvisorMod.ClientConfiguration): Self = StObject.set(x, "iotdeviceadvisor", value.asInstanceOf[js.Any])
    
    inline def setIotdeviceadvisorUndefined: Self = StObject.set(x, "iotdeviceadvisor", js.undefined)
    
    inline def setIotevents(value: typings.awsSdk.ioteventsMod.ClientConfiguration): Self = StObject.set(x, "iotevents", value.asInstanceOf[js.Any])
    
    inline def setIoteventsUndefined: Self = StObject.set(x, "iotevents", js.undefined)
    
    inline def setIoteventsdata(value: typings.awsSdk.ioteventsdataMod.ClientConfiguration): Self = StObject.set(x, "ioteventsdata", value.asInstanceOf[js.Any])
    
    inline def setIoteventsdataUndefined: Self = StObject.set(x, "ioteventsdata", js.undefined)
    
    inline def setIotfleethub(value: typings.awsSdk.iotfleethubMod.ClientConfiguration): Self = StObject.set(x, "iotfleethub", value.asInstanceOf[js.Any])
    
    inline def setIotfleethubUndefined: Self = StObject.set(x, "iotfleethub", js.undefined)
    
    inline def setIotfleetwise(value: typings.awsSdk.iotfleetwiseMod.ClientConfiguration): Self = StObject.set(x, "iotfleetwise", value.asInstanceOf[js.Any])
    
    inline def setIotfleetwiseUndefined: Self = StObject.set(x, "iotfleetwise", js.undefined)
    
    inline def setIotjobsdataplane(value: typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration): Self = StObject.set(x, "iotjobsdataplane", value.asInstanceOf[js.Any])
    
    inline def setIotjobsdataplaneUndefined: Self = StObject.set(x, "iotjobsdataplane", js.undefined)
    
    inline def setIotsecuretunneling(value: typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration): Self = StObject.set(x, "iotsecuretunneling", value.asInstanceOf[js.Any])
    
    inline def setIotsecuretunnelingUndefined: Self = StObject.set(x, "iotsecuretunneling", js.undefined)
    
    inline def setIotsitewise(value: typings.awsSdk.iotsitewiseMod.ClientConfiguration): Self = StObject.set(x, "iotsitewise", value.asInstanceOf[js.Any])
    
    inline def setIotsitewiseUndefined: Self = StObject.set(x, "iotsitewise", js.undefined)
    
    inline def setIotthingsgraph(value: typings.awsSdk.iotthingsgraphMod.ClientConfiguration): Self = StObject.set(x, "iotthingsgraph", value.asInstanceOf[js.Any])
    
    inline def setIotthingsgraphUndefined: Self = StObject.set(x, "iotthingsgraph", js.undefined)
    
    inline def setIottwinmaker(value: typings.awsSdk.iottwinmakerMod.ClientConfiguration): Self = StObject.set(x, "iottwinmaker", value.asInstanceOf[js.Any])
    
    inline def setIottwinmakerUndefined: Self = StObject.set(x, "iottwinmaker", js.undefined)
    
    inline def setIotwireless(value: typings.awsSdk.iotwirelessMod.ClientConfiguration): Self = StObject.set(x, "iotwireless", value.asInstanceOf[js.Any])
    
    inline def setIotwirelessUndefined: Self = StObject.set(x, "iotwireless", js.undefined)
    
    inline def setIvs(value: typings.awsSdk.ivsMod.ClientConfiguration): Self = StObject.set(x, "ivs", value.asInstanceOf[js.Any])
    
    inline def setIvsUndefined: Self = StObject.set(x, "ivs", js.undefined)
    
    inline def setIvschat(value: typings.awsSdk.ivschatMod.ClientConfiguration): Self = StObject.set(x, "ivschat", value.asInstanceOf[js.Any])
    
    inline def setIvschatUndefined: Self = StObject.set(x, "ivschat", js.undefined)
    
    inline def setKafka(value: typings.awsSdk.kafkaMod.ClientConfiguration): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    inline def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    inline def setKafkaconnect(value: typings.awsSdk.kafkaconnectMod.ClientConfiguration): Self = StObject.set(x, "kafkaconnect", value.asInstanceOf[js.Any])
    
    inline def setKafkaconnectUndefined: Self = StObject.set(x, "kafkaconnect", js.undefined)
    
    inline def setKendra(value: typings.awsSdk.kendraMod.ClientConfiguration): Self = StObject.set(x, "kendra", value.asInstanceOf[js.Any])
    
    inline def setKendraUndefined: Self = StObject.set(x, "kendra", js.undefined)
    
    inline def setKeyspaces(value: typings.awsSdk.keyspacesMod.ClientConfiguration): Self = StObject.set(x, "keyspaces", value.asInstanceOf[js.Any])
    
    inline def setKeyspacesUndefined: Self = StObject.set(x, "keyspaces", js.undefined)
    
    inline def setKinesis(value: typings.awsSdk.kinesisMod.ClientConfiguration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setKinesisanalytics(value: typings.awsSdk.kinesisanalyticsMod.ClientConfiguration): Self = StObject.set(x, "kinesisanalytics", value.asInstanceOf[js.Any])
    
    inline def setKinesisanalyticsUndefined: Self = StObject.set(x, "kinesisanalytics", js.undefined)
    
    inline def setKinesisanalyticsv2(value: typings.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration): Self = StObject.set(x, "kinesisanalyticsv2", value.asInstanceOf[js.Any])
    
    inline def setKinesisanalyticsv2Undefined: Self = StObject.set(x, "kinesisanalyticsv2", js.undefined)
    
    inline def setKinesisvideo(value: typings.awsSdk.kinesisvideoMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideo", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideoUndefined: Self = StObject.set(x, "kinesisvideo", js.undefined)
    
    inline def setKinesisvideoarchivedmedia(value: typings.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideoarchivedmedia", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideoarchivedmediaUndefined: Self = StObject.set(x, "kinesisvideoarchivedmedia", js.undefined)
    
    inline def setKinesisvideomedia(value: typings.awsSdk.kinesisvideomediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideomedia", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideomediaUndefined: Self = StObject.set(x, "kinesisvideomedia", js.undefined)
    
    inline def setKinesisvideosignalingchannels(value: typings.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideosignalingchannels", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideosignalingchannelsUndefined: Self = StObject.set(x, "kinesisvideosignalingchannels", js.undefined)
    
    inline def setKms(value: typings.awsSdk.kmsMod.ClientConfiguration): Self = StObject.set(x, "kms", value.asInstanceOf[js.Any])
    
    inline def setKmsUndefined: Self = StObject.set(x, "kms", js.undefined)
    
    inline def setLakeformation(value: typings.awsSdk.lakeformationMod.ClientConfiguration): Self = StObject.set(x, "lakeformation", value.asInstanceOf[js.Any])
    
    inline def setLakeformationUndefined: Self = StObject.set(x, "lakeformation", js.undefined)
    
    inline def setLambda(value: typings.awsSdk.lambdaMod.ClientConfiguration): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setLexmodelbuildingservice(value: typings.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration): Self = StObject.set(x, "lexmodelbuildingservice", value.asInstanceOf[js.Any])
    
    inline def setLexmodelbuildingserviceUndefined: Self = StObject.set(x, "lexmodelbuildingservice", js.undefined)
    
    inline def setLexmodelsv2(value: typings.awsSdk.lexmodelsv2Mod.ClientConfiguration): Self = StObject.set(x, "lexmodelsv2", value.asInstanceOf[js.Any])
    
    inline def setLexmodelsv2Undefined: Self = StObject.set(x, "lexmodelsv2", js.undefined)
    
    inline def setLexruntime(value: typings.awsSdk.lexruntimeMod.ClientConfiguration): Self = StObject.set(x, "lexruntime", value.asInstanceOf[js.Any])
    
    inline def setLexruntimeUndefined: Self = StObject.set(x, "lexruntime", js.undefined)
    
    inline def setLexruntimev2(value: typings.awsSdk.lexruntimev2Mod.ClientConfiguration): Self = StObject.set(x, "lexruntimev2", value.asInstanceOf[js.Any])
    
    inline def setLexruntimev2Undefined: Self = StObject.set(x, "lexruntimev2", js.undefined)
    
    inline def setLicensemanager(value: typings.awsSdk.licensemanagerMod.ClientConfiguration): Self = StObject.set(x, "licensemanager", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerUndefined: Self = StObject.set(x, "licensemanager", js.undefined)
    
    inline def setLicensemanagerusersubscriptions(value: typings.awsSdk.licensemanagerusersubscriptionsMod.ClientConfiguration): Self = StObject.set(x, "licensemanagerusersubscriptions", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerusersubscriptionsUndefined: Self = StObject.set(x, "licensemanagerusersubscriptions", js.undefined)
    
    inline def setLightsail(value: typings.awsSdk.lightsailMod.ClientConfiguration): Self = StObject.set(x, "lightsail", value.asInstanceOf[js.Any])
    
    inline def setLightsailUndefined: Self = StObject.set(x, "lightsail", js.undefined)
    
    inline def setLocation(value: typings.awsSdk.locationMod.ClientConfiguration): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setLookoutequipment(value: typings.awsSdk.lookoutequipmentMod.ClientConfiguration): Self = StObject.set(x, "lookoutequipment", value.asInstanceOf[js.Any])
    
    inline def setLookoutequipmentUndefined: Self = StObject.set(x, "lookoutequipment", js.undefined)
    
    inline def setLookoutmetrics(value: typings.awsSdk.lookoutmetricsMod.ClientConfiguration): Self = StObject.set(x, "lookoutmetrics", value.asInstanceOf[js.Any])
    
    inline def setLookoutmetricsUndefined: Self = StObject.set(x, "lookoutmetrics", js.undefined)
    
    inline def setLookoutvision(value: typings.awsSdk.lookoutvisionMod.ClientConfiguration): Self = StObject.set(x, "lookoutvision", value.asInstanceOf[js.Any])
    
    inline def setLookoutvisionUndefined: Self = StObject.set(x, "lookoutvision", js.undefined)
    
    inline def setM2(value: typings.awsSdk.m2Mod.ClientConfiguration): Self = StObject.set(x, "m2", value.asInstanceOf[js.Any])
    
    inline def setM2Undefined: Self = StObject.set(x, "m2", js.undefined)
    
    inline def setMachinelearning(value: typings.awsSdk.machinelearningMod.ClientConfiguration): Self = StObject.set(x, "machinelearning", value.asInstanceOf[js.Any])
    
    inline def setMachinelearningUndefined: Self = StObject.set(x, "machinelearning", js.undefined)
    
    inline def setMacie(value: typings.awsSdk.macieMod.ClientConfiguration): Self = StObject.set(x, "macie", value.asInstanceOf[js.Any])
    
    inline def setMacie2(value: typings.awsSdk.macie2Mod.ClientConfiguration): Self = StObject.set(x, "macie2", value.asInstanceOf[js.Any])
    
    inline def setMacie2Undefined: Self = StObject.set(x, "macie2", js.undefined)
    
    inline def setMacieUndefined: Self = StObject.set(x, "macie", js.undefined)
    
    inline def setManagedblockchain(value: typings.awsSdk.managedblockchainMod.ClientConfiguration): Self = StObject.set(x, "managedblockchain", value.asInstanceOf[js.Any])
    
    inline def setManagedblockchainUndefined: Self = StObject.set(x, "managedblockchain", js.undefined)
    
    inline def setMarketplacecatalog(value: typings.awsSdk.marketplacecatalogMod.ClientConfiguration): Self = StObject.set(x, "marketplacecatalog", value.asInstanceOf[js.Any])
    
    inline def setMarketplacecatalogUndefined: Self = StObject.set(x, "marketplacecatalog", js.undefined)
    
    inline def setMarketplacecommerceanalytics(value: typings.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration): Self = StObject.set(x, "marketplacecommerceanalytics", value.asInstanceOf[js.Any])
    
    inline def setMarketplacecommerceanalyticsUndefined: Self = StObject.set(x, "marketplacecommerceanalytics", js.undefined)
    
    inline def setMarketplaceentitlementservice(value: typings.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration): Self = StObject.set(x, "marketplaceentitlementservice", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceentitlementserviceUndefined: Self = StObject.set(x, "marketplaceentitlementservice", js.undefined)
    
    inline def setMarketplacemetering(value: typings.awsSdk.marketplacemeteringMod.ClientConfiguration): Self = StObject.set(x, "marketplacemetering", value.asInstanceOf[js.Any])
    
    inline def setMarketplacemeteringUndefined: Self = StObject.set(x, "marketplacemetering", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMediaconnect(value: typings.awsSdk.mediaconnectMod.ClientConfiguration): Self = StObject.set(x, "mediaconnect", value.asInstanceOf[js.Any])
    
    inline def setMediaconnectUndefined: Self = StObject.set(x, "mediaconnect", js.undefined)
    
    inline def setMediaconvert(value: typings.awsSdk.mediaconvertMod.ClientConfiguration): Self = StObject.set(x, "mediaconvert", value.asInstanceOf[js.Any])
    
    inline def setMediaconvertUndefined: Self = StObject.set(x, "mediaconvert", js.undefined)
    
    inline def setMedialive(value: typings.awsSdk.medialiveMod.ClientConfiguration): Self = StObject.set(x, "medialive", value.asInstanceOf[js.Any])
    
    inline def setMedialiveUndefined: Self = StObject.set(x, "medialive", js.undefined)
    
    inline def setMediapackage(value: typings.awsSdk.mediapackageMod.ClientConfiguration): Self = StObject.set(x, "mediapackage", value.asInstanceOf[js.Any])
    
    inline def setMediapackageUndefined: Self = StObject.set(x, "mediapackage", js.undefined)
    
    inline def setMediapackagevod(value: typings.awsSdk.mediapackagevodMod.ClientConfiguration): Self = StObject.set(x, "mediapackagevod", value.asInstanceOf[js.Any])
    
    inline def setMediapackagevodUndefined: Self = StObject.set(x, "mediapackagevod", js.undefined)
    
    inline def setMediastore(value: typings.awsSdk.mediastoreMod.ClientConfiguration): Self = StObject.set(x, "mediastore", value.asInstanceOf[js.Any])
    
    inline def setMediastoreUndefined: Self = StObject.set(x, "mediastore", js.undefined)
    
    inline def setMediastoredata(value: typings.awsSdk.mediastoredataMod.ClientConfiguration): Self = StObject.set(x, "mediastoredata", value.asInstanceOf[js.Any])
    
    inline def setMediastoredataUndefined: Self = StObject.set(x, "mediastoredata", js.undefined)
    
    inline def setMediatailor(value: typings.awsSdk.mediatailorMod.ClientConfiguration): Self = StObject.set(x, "mediatailor", value.asInstanceOf[js.Any])
    
    inline def setMediatailorUndefined: Self = StObject.set(x, "mediatailor", js.undefined)
    
    inline def setMemorydb(value: typings.awsSdk.memorydbMod.ClientConfiguration): Self = StObject.set(x, "memorydb", value.asInstanceOf[js.Any])
    
    inline def setMemorydbUndefined: Self = StObject.set(x, "memorydb", js.undefined)
    
    inline def setMgn(value: typings.awsSdk.mgnMod.ClientConfiguration): Self = StObject.set(x, "mgn", value.asInstanceOf[js.Any])
    
    inline def setMgnUndefined: Self = StObject.set(x, "mgn", js.undefined)
    
    inline def setMigrationhub(value: typings.awsSdk.migrationhubMod.ClientConfiguration): Self = StObject.set(x, "migrationhub", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubUndefined: Self = StObject.set(x, "migrationhub", js.undefined)
    
    inline def setMigrationhubconfig(value: typings.awsSdk.migrationhubconfigMod.ClientConfiguration): Self = StObject.set(x, "migrationhubconfig", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubconfigUndefined: Self = StObject.set(x, "migrationhubconfig", js.undefined)
    
    inline def setMigrationhuborchestrator(value: typings.awsSdk.migrationhuborchestratorMod.ClientConfiguration): Self = StObject.set(x, "migrationhuborchestrator", value.asInstanceOf[js.Any])
    
    inline def setMigrationhuborchestratorUndefined: Self = StObject.set(x, "migrationhuborchestrator", js.undefined)
    
    inline def setMigrationhubrefactorspaces(value: typings.awsSdk.migrationhubrefactorspacesMod.ClientConfiguration): Self = StObject.set(x, "migrationhubrefactorspaces", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubrefactorspacesUndefined: Self = StObject.set(x, "migrationhubrefactorspaces", js.undefined)
    
    inline def setMigrationhubstrategy(value: typings.awsSdk.migrationhubstrategyMod.ClientConfiguration): Self = StObject.set(x, "migrationhubstrategy", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubstrategyUndefined: Self = StObject.set(x, "migrationhubstrategy", js.undefined)
    
    inline def setMobile(value: typings.awsSdk.mobileMod.ClientConfiguration): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setMobileanalytics(value: typings.awsSdk.mobileanalyticsMod.ClientConfiguration): Self = StObject.set(x, "mobileanalytics", value.asInstanceOf[js.Any])
    
    inline def setMobileanalyticsUndefined: Self = StObject.set(x, "mobileanalytics", js.undefined)
    
    inline def setMq(value: typings.awsSdk.mqMod.ClientConfiguration): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
    
    inline def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
    
    inline def setMturk(value: typings.awsSdk.mturkMod.ClientConfiguration): Self = StObject.set(x, "mturk", value.asInstanceOf[js.Any])
    
    inline def setMturkUndefined: Self = StObject.set(x, "mturk", js.undefined)
    
    inline def setMwaa(value: typings.awsSdk.mwaaMod.ClientConfiguration): Self = StObject.set(x, "mwaa", value.asInstanceOf[js.Any])
    
    inline def setMwaaUndefined: Self = StObject.set(x, "mwaa", js.undefined)
    
    inline def setNeptune(value: typings.awsSdk.neptuneMod.ClientConfiguration): Self = StObject.set(x, "neptune", value.asInstanceOf[js.Any])
    
    inline def setNeptuneUndefined: Self = StObject.set(x, "neptune", js.undefined)
    
    inline def setNetworkfirewall(value: typings.awsSdk.networkfirewallMod.ClientConfiguration): Self = StObject.set(x, "networkfirewall", value.asInstanceOf[js.Any])
    
    inline def setNetworkfirewallUndefined: Self = StObject.set(x, "networkfirewall", js.undefined)
    
    inline def setNetworkmanager(value: typings.awsSdk.networkmanagerMod.ClientConfiguration): Self = StObject.set(x, "networkmanager", value.asInstanceOf[js.Any])
    
    inline def setNetworkmanagerUndefined: Self = StObject.set(x, "networkmanager", js.undefined)
    
    inline def setNimble(value: typings.awsSdk.nimbleMod.ClientConfiguration): Self = StObject.set(x, "nimble", value.asInstanceOf[js.Any])
    
    inline def setNimbleUndefined: Self = StObject.set(x, "nimble", js.undefined)
    
    inline def setOpensearch(value: typings.awsSdk.opensearchMod.ClientConfiguration): Self = StObject.set(x, "opensearch", value.asInstanceOf[js.Any])
    
    inline def setOpensearchUndefined: Self = StObject.set(x, "opensearch", js.undefined)
    
    inline def setOpsworks(value: typings.awsSdk.opsworksMod.ClientConfiguration): Self = StObject.set(x, "opsworks", value.asInstanceOf[js.Any])
    
    inline def setOpsworksUndefined: Self = StObject.set(x, "opsworks", js.undefined)
    
    inline def setOpsworkscm(value: typings.awsSdk.opsworkscmMod.ClientConfiguration): Self = StObject.set(x, "opsworkscm", value.asInstanceOf[js.Any])
    
    inline def setOpsworkscmUndefined: Self = StObject.set(x, "opsworkscm", js.undefined)
    
    inline def setOrganizations(value: typings.awsSdk.organizationsMod.ClientConfiguration): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOutposts(value: typings.awsSdk.outpostsMod.ClientConfiguration): Self = StObject.set(x, "outposts", value.asInstanceOf[js.Any])
    
    inline def setOutpostsUndefined: Self = StObject.set(x, "outposts", js.undefined)
    
    inline def setPanorama(value: typings.awsSdk.panoramaMod.ClientConfiguration): Self = StObject.set(x, "panorama", value.asInstanceOf[js.Any])
    
    inline def setPanoramaUndefined: Self = StObject.set(x, "panorama", js.undefined)
    
    inline def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    inline def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    inline def setPersonalize(value: typings.awsSdk.personalizeMod.ClientConfiguration): Self = StObject.set(x, "personalize", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeUndefined: Self = StObject.set(x, "personalize", js.undefined)
    
    inline def setPersonalizeevents(value: typings.awsSdk.personalizeeventsMod.ClientConfiguration): Self = StObject.set(x, "personalizeevents", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeeventsUndefined: Self = StObject.set(x, "personalizeevents", js.undefined)
    
    inline def setPersonalizeruntime(value: typings.awsSdk.personalizeruntimeMod.ClientConfiguration): Self = StObject.set(x, "personalizeruntime", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeruntimeUndefined: Self = StObject.set(x, "personalizeruntime", js.undefined)
    
    inline def setPi(value: typings.awsSdk.piMod.ClientConfiguration): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
    
    inline def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
    
    inline def setPinpoint(value: typings.awsSdk.pinpointMod.ClientConfiguration): Self = StObject.set(x, "pinpoint", value.asInstanceOf[js.Any])
    
    inline def setPinpointUndefined: Self = StObject.set(x, "pinpoint", js.undefined)
    
    inline def setPinpointemail(value: typings.awsSdk.pinpointemailMod.ClientConfiguration): Self = StObject.set(x, "pinpointemail", value.asInstanceOf[js.Any])
    
    inline def setPinpointemailUndefined: Self = StObject.set(x, "pinpointemail", js.undefined)
    
    inline def setPinpointsmsvoice(value: typings.awsSdk.pinpointsmsvoiceMod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoice", value.asInstanceOf[js.Any])
    
    inline def setPinpointsmsvoiceUndefined: Self = StObject.set(x, "pinpointsmsvoice", js.undefined)
    
    inline def setPinpointsmsvoicev2(value: typings.awsSdk.pinpointsmsvoicev2Mod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoicev2", value.asInstanceOf[js.Any])
    
    inline def setPinpointsmsvoicev2Undefined: Self = StObject.set(x, "pinpointsmsvoicev2", js.undefined)
    
    inline def setPolly(value: typings.awsSdk.pollyMod.ClientConfiguration): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    
    inline def setPollyUndefined: Self = StObject.set(x, "polly", js.undefined)
    
    inline def setPricing(value: typings.awsSdk.pricingMod.ClientConfiguration): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    inline def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    inline def setPrivatenetworks(value: typings.awsSdk.privatenetworksMod.ClientConfiguration): Self = StObject.set(x, "privatenetworks", value.asInstanceOf[js.Any])
    
    inline def setPrivatenetworksUndefined: Self = StObject.set(x, "privatenetworks", js.undefined)
    
    inline def setProton(value: typings.awsSdk.protonMod.ClientConfiguration): Self = StObject.set(x, "proton", value.asInstanceOf[js.Any])
    
    inline def setProtonUndefined: Self = StObject.set(x, "proton", js.undefined)
    
    inline def setQldb(value: typings.awsSdk.qldbMod.ClientConfiguration): Self = StObject.set(x, "qldb", value.asInstanceOf[js.Any])
    
    inline def setQldbUndefined: Self = StObject.set(x, "qldb", js.undefined)
    
    inline def setQldbsession(value: typings.awsSdk.qldbsessionMod.ClientConfiguration): Self = StObject.set(x, "qldbsession", value.asInstanceOf[js.Any])
    
    inline def setQldbsessionUndefined: Self = StObject.set(x, "qldbsession", js.undefined)
    
    inline def setQuicksight(value: typings.awsSdk.quicksightMod.ClientConfiguration): Self = StObject.set(x, "quicksight", value.asInstanceOf[js.Any])
    
    inline def setQuicksightUndefined: Self = StObject.set(x, "quicksight", js.undefined)
    
    inline def setRam(value: typings.awsSdk.ramMod.ClientConfiguration): Self = StObject.set(x, "ram", value.asInstanceOf[js.Any])
    
    inline def setRamUndefined: Self = StObject.set(x, "ram", js.undefined)
    
    inline def setRbin(value: typings.awsSdk.rbinMod.ClientConfiguration): Self = StObject.set(x, "rbin", value.asInstanceOf[js.Any])
    
    inline def setRbinUndefined: Self = StObject.set(x, "rbin", js.undefined)
    
    inline def setRds(value: typings.awsSdk.rdsMod.ClientConfiguration): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    inline def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    inline def setRdsdataservice(value: typings.awsSdk.rdsdataserviceMod.ClientConfiguration): Self = StObject.set(x, "rdsdataservice", value.asInstanceOf[js.Any])
    
    inline def setRdsdataserviceUndefined: Self = StObject.set(x, "rdsdataservice", js.undefined)
    
    inline def setRedshift(value: typings.awsSdk.redshiftMod.ClientConfiguration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    inline def setRedshiftdata(value: typings.awsSdk.redshiftdataMod.ClientConfiguration): Self = StObject.set(x, "redshiftdata", value.asInstanceOf[js.Any])
    
    inline def setRedshiftdataUndefined: Self = StObject.set(x, "redshiftdata", js.undefined)
    
    inline def setRedshiftserverless(value: typings.awsSdk.redshiftserverlessMod.ClientConfiguration): Self = StObject.set(x, "redshiftserverless", value.asInstanceOf[js.Any])
    
    inline def setRedshiftserverlessUndefined: Self = StObject.set(x, "redshiftserverless", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRekognition(value: typings.awsSdk.rekognitionMod.ClientConfiguration): Self = StObject.set(x, "rekognition", value.asInstanceOf[js.Any])
    
    inline def setRekognitionUndefined: Self = StObject.set(x, "rekognition", js.undefined)
    
    inline def setResiliencehub(value: typings.awsSdk.resiliencehubMod.ClientConfiguration): Self = StObject.set(x, "resiliencehub", value.asInstanceOf[js.Any])
    
    inline def setResiliencehubUndefined: Self = StObject.set(x, "resiliencehub", js.undefined)
    
    inline def setResourcegroups(value: typings.awsSdk.resourcegroupsMod.ClientConfiguration): Self = StObject.set(x, "resourcegroups", value.asInstanceOf[js.Any])
    
    inline def setResourcegroupsUndefined: Self = StObject.set(x, "resourcegroups", js.undefined)
    
    inline def setResourcegroupstaggingapi(value: typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration): Self = StObject.set(x, "resourcegroupstaggingapi", value.asInstanceOf[js.Any])
    
    inline def setResourcegroupstaggingapiUndefined: Self = StObject.set(x, "resourcegroupstaggingapi", js.undefined)
    
    inline def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    inline def setRobomaker(value: typings.awsSdk.robomakerMod.ClientConfiguration): Self = StObject.set(x, "robomaker", value.asInstanceOf[js.Any])
    
    inline def setRobomakerUndefined: Self = StObject.set(x, "robomaker", js.undefined)
    
    inline def setRolesanywhere(value: typings.awsSdk.rolesanywhereMod.ClientConfiguration): Self = StObject.set(x, "rolesanywhere", value.asInstanceOf[js.Any])
    
    inline def setRolesanywhereUndefined: Self = StObject.set(x, "rolesanywhere", js.undefined)
    
    inline def setRoute53(value: typings.awsSdk.route53Mod.ClientConfiguration): Self = StObject.set(x, "route53", value.asInstanceOf[js.Any])
    
    inline def setRoute53Undefined: Self = StObject.set(x, "route53", js.undefined)
    
    inline def setRoute53domains(value: typings.awsSdk.route53domainsMod.ClientConfiguration): Self = StObject.set(x, "route53domains", value.asInstanceOf[js.Any])
    
    inline def setRoute53domainsUndefined: Self = StObject.set(x, "route53domains", js.undefined)
    
    inline def setRoute53recoverycluster(value: typings.awsSdk.route53recoveryclusterMod.ClientConfiguration): Self = StObject.set(x, "route53recoverycluster", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoveryclusterUndefined: Self = StObject.set(x, "route53recoverycluster", js.undefined)
    
    inline def setRoute53recoverycontrolconfig(value: typings.awsSdk.route53recoverycontrolconfigMod.ClientConfiguration): Self = StObject.set(x, "route53recoverycontrolconfig", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoverycontrolconfigUndefined: Self = StObject.set(x, "route53recoverycontrolconfig", js.undefined)
    
    inline def setRoute53recoveryreadiness(value: typings.awsSdk.route53recoveryreadinessMod.ClientConfiguration): Self = StObject.set(x, "route53recoveryreadiness", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoveryreadinessUndefined: Self = StObject.set(x, "route53recoveryreadiness", js.undefined)
    
    inline def setRoute53resolver(value: typings.awsSdk.route53resolverMod.ClientConfiguration): Self = StObject.set(x, "route53resolver", value.asInstanceOf[js.Any])
    
    inline def setRoute53resolverUndefined: Self = StObject.set(x, "route53resolver", js.undefined)
    
    inline def setRum(value: typings.awsSdk.rumMod.ClientConfiguration): Self = StObject.set(x, "rum", value.asInstanceOf[js.Any])
    
    inline def setRumUndefined: Self = StObject.set(x, "rum", js.undefined)
    
    inline def setS3(value: typings.awsSdk.s3Mod.ClientConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
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
    
    inline def setS3control(value: typings.awsSdk.s3controlMod.ClientConfiguration): Self = StObject.set(x, "s3control", value.asInstanceOf[js.Any])
    
    inline def setS3controlUndefined: Self = StObject.set(x, "s3control", js.undefined)
    
    inline def setS3outposts(value: typings.awsSdk.s3outpostsMod.ClientConfiguration): Self = StObject.set(x, "s3outposts", value.asInstanceOf[js.Any])
    
    inline def setS3outpostsUndefined: Self = StObject.set(x, "s3outposts", js.undefined)
    
    inline def setSagemaker(value: typings.awsSdk.sagemakerMod.ClientConfiguration): Self = StObject.set(x, "sagemaker", value.asInstanceOf[js.Any])
    
    inline def setSagemakerUndefined: Self = StObject.set(x, "sagemaker", js.undefined)
    
    inline def setSagemakeredge(value: typings.awsSdk.sagemakeredgeMod.ClientConfiguration): Self = StObject.set(x, "sagemakeredge", value.asInstanceOf[js.Any])
    
    inline def setSagemakeredgeUndefined: Self = StObject.set(x, "sagemakeredge", js.undefined)
    
    inline def setSagemakerfeaturestoreruntime(value: typings.awsSdk.sagemakerfeaturestoreruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerfeaturestoreruntime", value.asInstanceOf[js.Any])
    
    inline def setSagemakerfeaturestoreruntimeUndefined: Self = StObject.set(x, "sagemakerfeaturestoreruntime", js.undefined)
    
    inline def setSagemakerruntime(value: typings.awsSdk.sagemakerruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerruntime", value.asInstanceOf[js.Any])
    
    inline def setSagemakerruntimeUndefined: Self = StObject.set(x, "sagemakerruntime", js.undefined)
    
    inline def setSavingsplans(value: typings.awsSdk.savingsplansMod.ClientConfiguration): Self = StObject.set(x, "savingsplans", value.asInstanceOf[js.Any])
    
    inline def setSavingsplansUndefined: Self = StObject.set(x, "savingsplans", js.undefined)
    
    inline def setSchemas(value: typings.awsSdk.schemasMod.ClientConfiguration): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSecretsmanager(value: typings.awsSdk.secretsmanagerMod.ClientConfiguration): Self = StObject.set(x, "secretsmanager", value.asInstanceOf[js.Any])
    
    inline def setSecretsmanagerUndefined: Self = StObject.set(x, "secretsmanager", js.undefined)
    
    inline def setSecurityhub(value: typings.awsSdk.securityhubMod.ClientConfiguration): Self = StObject.set(x, "securityhub", value.asInstanceOf[js.Any])
    
    inline def setSecurityhubUndefined: Self = StObject.set(x, "securityhub", js.undefined)
    
    inline def setServerlessapplicationrepository(value: typings.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration): Self = StObject.set(x, "serverlessapplicationrepository", value.asInstanceOf[js.Any])
    
    inline def setServerlessapplicationrepositoryUndefined: Self = StObject.set(x, "serverlessapplicationrepository", js.undefined)
    
    inline def setServicecatalog(value: typings.awsSdk.servicecatalogMod.ClientConfiguration): Self = StObject.set(x, "servicecatalog", value.asInstanceOf[js.Any])
    
    inline def setServicecatalogUndefined: Self = StObject.set(x, "servicecatalog", js.undefined)
    
    inline def setServicecatalogappregistry(value: typings.awsSdk.servicecatalogappregistryMod.ClientConfiguration): Self = StObject.set(x, "servicecatalogappregistry", value.asInstanceOf[js.Any])
    
    inline def setServicecatalogappregistryUndefined: Self = StObject.set(x, "servicecatalogappregistry", js.undefined)
    
    inline def setServicediscovery(value: typings.awsSdk.servicediscoveryMod.ClientConfiguration): Self = StObject.set(x, "servicediscovery", value.asInstanceOf[js.Any])
    
    inline def setServicediscoveryUndefined: Self = StObject.set(x, "servicediscovery", js.undefined)
    
    inline def setServicequotas(value: typings.awsSdk.servicequotasMod.ClientConfiguration): Self = StObject.set(x, "servicequotas", value.asInstanceOf[js.Any])
    
    inline def setServicequotasUndefined: Self = StObject.set(x, "servicequotas", js.undefined)
    
    inline def setSes(value: typings.awsSdk.sesMod.ClientConfiguration): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    
    inline def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setSesv2(value: typings.awsSdk.sesv2Mod.ClientConfiguration): Self = StObject.set(x, "sesv2", value.asInstanceOf[js.Any])
    
    inline def setSesv2Undefined: Self = StObject.set(x, "sesv2", js.undefined)
    
    inline def setShield(value: typings.awsSdk.shieldMod.ClientConfiguration): Self = StObject.set(x, "shield", value.asInstanceOf[js.Any])
    
    inline def setShieldUndefined: Self = StObject.set(x, "shield", js.undefined)
    
    inline def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    inline def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    inline def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    inline def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    inline def setSigner(value: typings.awsSdk.signerMod.ClientConfiguration): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSimpledb(value: typings.awsSdk.simpledbMod.ClientConfiguration): Self = StObject.set(x, "simpledb", value.asInstanceOf[js.Any])
    
    inline def setSimpledbUndefined: Self = StObject.set(x, "simpledb", js.undefined)
    
    inline def setSms(value: typings.awsSdk.smsMod.ClientConfiguration): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    inline def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
    
    inline def setSnowball(value: typings.awsSdk.snowballMod.ClientConfiguration): Self = StObject.set(x, "snowball", value.asInstanceOf[js.Any])
    
    inline def setSnowballUndefined: Self = StObject.set(x, "snowball", js.undefined)
    
    inline def setSnowdevicemanagement(value: typings.awsSdk.snowdevicemanagementMod.ClientConfiguration): Self = StObject.set(x, "snowdevicemanagement", value.asInstanceOf[js.Any])
    
    inline def setSnowdevicemanagementUndefined: Self = StObject.set(x, "snowdevicemanagement", js.undefined)
    
    inline def setSns(value: typings.awsSdk.snsMod.ClientConfiguration): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: typings.awsSdk.sqsMod.ClientConfiguration): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    inline def setSsm(value: typings.awsSdk.ssmMod.ClientConfiguration): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
    
    inline def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
    
    inline def setSsmcontacts(value: typings.awsSdk.ssmcontactsMod.ClientConfiguration): Self = StObject.set(x, "ssmcontacts", value.asInstanceOf[js.Any])
    
    inline def setSsmcontactsUndefined: Self = StObject.set(x, "ssmcontacts", js.undefined)
    
    inline def setSsmincidents(value: typings.awsSdk.ssmincidentsMod.ClientConfiguration): Self = StObject.set(x, "ssmincidents", value.asInstanceOf[js.Any])
    
    inline def setSsmincidentsUndefined: Self = StObject.set(x, "ssmincidents", js.undefined)
    
    inline def setSso(value: typings.awsSdk.ssoMod.ClientConfiguration): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    inline def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
    
    inline def setSsoadmin(value: typings.awsSdk.ssoadminMod.ClientConfiguration): Self = StObject.set(x, "ssoadmin", value.asInstanceOf[js.Any])
    
    inline def setSsoadminUndefined: Self = StObject.set(x, "ssoadmin", js.undefined)
    
    inline def setSsooidc(value: typings.awsSdk.ssooidcMod.ClientConfiguration): Self = StObject.set(x, "ssooidc", value.asInstanceOf[js.Any])
    
    inline def setSsooidcUndefined: Self = StObject.set(x, "ssooidc", js.undefined)
    
    inline def setStepfunctions(value: typings.awsSdk.stepfunctionsMod.ClientConfiguration): Self = StObject.set(x, "stepfunctions", value.asInstanceOf[js.Any])
    
    inline def setStepfunctionsUndefined: Self = StObject.set(x, "stepfunctions", js.undefined)
    
    inline def setStoragegateway(value: typings.awsSdk.storagegatewayMod.ClientConfiguration): Self = StObject.set(x, "storagegateway", value.asInstanceOf[js.Any])
    
    inline def setStoragegatewayUndefined: Self = StObject.set(x, "storagegateway", js.undefined)
    
    inline def setSts(value: typings.awsSdk.stsMod.ClientConfiguration): Self = StObject.set(x, "sts", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    inline def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
    
    inline def setSupport(value: typings.awsSdk.supportMod.ClientConfiguration): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    inline def setSupportapp(value: typings.awsSdk.supportappMod.ClientConfiguration): Self = StObject.set(x, "supportapp", value.asInstanceOf[js.Any])
    
    inline def setSupportappUndefined: Self = StObject.set(x, "supportapp", js.undefined)
    
    inline def setSwf(value: typings.awsSdk.swfMod.ClientConfiguration): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    inline def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    inline def setSynthetics(value: typings.awsSdk.syntheticsMod.ClientConfiguration): Self = StObject.set(x, "synthetics", value.asInstanceOf[js.Any])
    
    inline def setSyntheticsUndefined: Self = StObject.set(x, "synthetics", js.undefined)
    
    inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    inline def setTextract(value: typings.awsSdk.textractMod.ClientConfiguration): Self = StObject.set(x, "textract", value.asInstanceOf[js.Any])
    
    inline def setTextractUndefined: Self = StObject.set(x, "textract", js.undefined)
    
    inline def setTimestreamquery(value: typings.awsSdk.timestreamqueryMod.ClientConfiguration): Self = StObject.set(x, "timestreamquery", value.asInstanceOf[js.Any])
    
    inline def setTimestreamqueryUndefined: Self = StObject.set(x, "timestreamquery", js.undefined)
    
    inline def setTimestreamwrite(value: typings.awsSdk.timestreamwriteMod.ClientConfiguration): Self = StObject.set(x, "timestreamwrite", value.asInstanceOf[js.Any])
    
    inline def setTimestreamwriteUndefined: Self = StObject.set(x, "timestreamwrite", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenProvider(value: TokenProviderChain): Self = StObject.set(x, "tokenProvider", value.asInstanceOf[js.Any])
    
    inline def setTokenProviderUndefined: Self = StObject.set(x, "tokenProvider", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTranscribeservice(value: typings.awsSdk.transcribeserviceMod.ClientConfiguration): Self = StObject.set(x, "transcribeservice", value.asInstanceOf[js.Any])
    
    inline def setTranscribeserviceUndefined: Self = StObject.set(x, "transcribeservice", js.undefined)
    
    inline def setTransfer(value: typings.awsSdk.transferMod.ClientConfiguration): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTranslate(value: typings.awsSdk.translateMod.ClientConfiguration): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    
    inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    
    inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    
    inline def setVoiceid(value: typings.awsSdk.voiceidMod.ClientConfiguration): Self = StObject.set(x, "voiceid", value.asInstanceOf[js.Any])
    
    inline def setVoiceidUndefined: Self = StObject.set(x, "voiceid", js.undefined)
    
    inline def setWaf(value: typings.awsSdk.wafMod.ClientConfiguration): Self = StObject.set(x, "waf", value.asInstanceOf[js.Any])
    
    inline def setWafUndefined: Self = StObject.set(x, "waf", js.undefined)
    
    inline def setWafregional(value: typings.awsSdk.wafregionalMod.ClientConfiguration): Self = StObject.set(x, "wafregional", value.asInstanceOf[js.Any])
    
    inline def setWafregionalUndefined: Self = StObject.set(x, "wafregional", js.undefined)
    
    inline def setWafv2(value: typings.awsSdk.wafv2Mod.ClientConfiguration): Self = StObject.set(x, "wafv2", value.asInstanceOf[js.Any])
    
    inline def setWafv2Undefined: Self = StObject.set(x, "wafv2", js.undefined)
    
    inline def setWellarchitected(value: typings.awsSdk.wellarchitectedMod.ClientConfiguration): Self = StObject.set(x, "wellarchitected", value.asInstanceOf[js.Any])
    
    inline def setWellarchitectedUndefined: Self = StObject.set(x, "wellarchitected", js.undefined)
    
    inline def setWisdom(value: typings.awsSdk.wisdomMod.ClientConfiguration): Self = StObject.set(x, "wisdom", value.asInstanceOf[js.Any])
    
    inline def setWisdomUndefined: Self = StObject.set(x, "wisdom", js.undefined)
    
    inline def setWorkdocs(value: typings.awsSdk.workdocsMod.ClientConfiguration): Self = StObject.set(x, "workdocs", value.asInstanceOf[js.Any])
    
    inline def setWorkdocsUndefined: Self = StObject.set(x, "workdocs", js.undefined)
    
    inline def setWorklink(value: typings.awsSdk.worklinkMod.ClientConfiguration): Self = StObject.set(x, "worklink", value.asInstanceOf[js.Any])
    
    inline def setWorklinkUndefined: Self = StObject.set(x, "worklink", js.undefined)
    
    inline def setWorkmail(value: typings.awsSdk.workmailMod.ClientConfiguration): Self = StObject.set(x, "workmail", value.asInstanceOf[js.Any])
    
    inline def setWorkmailUndefined: Self = StObject.set(x, "workmail", js.undefined)
    
    inline def setWorkmailmessageflow(value: typings.awsSdk.workmailmessageflowMod.ClientConfiguration): Self = StObject.set(x, "workmailmessageflow", value.asInstanceOf[js.Any])
    
    inline def setWorkmailmessageflowUndefined: Self = StObject.set(x, "workmailmessageflow", js.undefined)
    
    inline def setWorkspaces(value: typings.awsSdk.workspacesMod.ClientConfiguration): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    inline def setWorkspacesweb(value: typings.awsSdk.workspaceswebMod.ClientConfiguration): Self = StObject.set(x, "workspacesweb", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceswebUndefined: Self = StObject.set(x, "workspacesweb", js.undefined)
    
    inline def setXray(value: typings.awsSdk.xrayMod.ClientConfiguration): Self = StObject.set(x, "xray", value.asInstanceOf[js.Any])
    
    inline def setXrayUndefined: Self = StObject.set(x, "xray", js.undefined)
  }
}
