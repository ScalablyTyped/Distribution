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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config-base.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
trait ConfigurationOptionsConfi
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  var accessanalyzer: js.UndefOr[ClientConfiguration] = js.undefined
  
  var acm: js.UndefOr[typings.awsSdk.acmMod.ClientConfiguration] = js.undefined
  
  var acmpca: js.UndefOr[typings.awsSdk.acmpcaMod.ClientConfiguration] = js.undefined
  
  var alexaforbusiness: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientConfiguration] = js.undefined
  
  var amplify: js.UndefOr[typings.awsSdk.amplifyMod.ClientConfiguration] = js.undefined
  
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
  
  var appflow: js.UndefOr[typings.awsSdk.appflowMod.ClientConfiguration] = js.undefined
  
  var applicationautoscaling: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ClientConfiguration] = js.undefined
  
  var applicationinsights: js.UndefOr[typings.awsSdk.applicationinsightsMod.ClientConfiguration] = js.undefined
  
  var appmesh: js.UndefOr[typings.awsSdk.appmeshMod.ClientConfiguration] = js.undefined
  
  var appstream: js.UndefOr[typings.awsSdk.appstreamMod.ClientConfiguration] = js.undefined
  
  var appsync: js.UndefOr[typings.awsSdk.appsyncMod.ClientConfiguration] = js.undefined
  
  var athena: js.UndefOr[typings.awsSdk.athenaMod.ClientConfiguration] = js.undefined
  
  var augmentedairuntime: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.ClientConfiguration] = js.undefined
  
  var autoscaling: js.UndefOr[typings.awsSdk.autoscalingMod.ClientConfiguration] = js.undefined
  
  var autoscalingplans: js.UndefOr[typings.awsSdk.autoscalingplansMod.ClientConfiguration] = js.undefined
  
  var backup: js.UndefOr[typings.awsSdk.backupMod.ClientConfiguration] = js.undefined
  
  var batch: js.UndefOr[typings.awsSdk.batchMod.ClientConfiguration] = js.undefined
  
  var braket: js.UndefOr[typings.awsSdk.braketMod.ClientConfiguration] = js.undefined
  
  var budgets: js.UndefOr[typings.awsSdk.budgetsMod.ClientConfiguration] = js.undefined
  
  var chime: js.UndefOr[typings.awsSdk.chimeMod.ClientConfiguration] = js.undefined
  
  var cloud9: js.UndefOr[typings.awsSdk.cloud9Mod.ClientConfiguration] = js.undefined
  
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
  
  var connectparticipant: js.UndefOr[typings.awsSdk.connectparticipantMod.ClientConfiguration] = js.undefined
  
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
  
  var databrew: js.UndefOr[typings.awsSdk.databrewMod.ClientConfiguration] = js.undefined
  
  var dataexchange: js.UndefOr[typings.awsSdk.dataexchangeMod.ClientConfiguration] = js.undefined
  
  var datapipeline: js.UndefOr[typings.awsSdk.datapipelineMod.ClientConfiguration] = js.undefined
  
  var datasync: js.UndefOr[typings.awsSdk.datasyncMod.ClientConfiguration] = js.undefined
  
  var dax: js.UndefOr[typings.awsSdk.daxMod.ClientConfiguration] = js.undefined
  
  var detective: js.UndefOr[typings.awsSdk.detectiveMod.ClientConfiguration] = js.undefined
  
  var devicefarm: js.UndefOr[typings.awsSdk.devicefarmMod.ClientConfiguration] = js.undefined
  
  var directconnect: js.UndefOr[typings.awsSdk.directconnectMod.ClientConfiguration] = js.undefined
  
  var directoryservice: js.UndefOr[typings.awsSdk.directoryserviceMod.ClientConfiguration] = js.undefined
  
  var discovery: js.UndefOr[typings.awsSdk.discoveryMod.ClientConfiguration] = js.undefined
  
  var dlm: js.UndefOr[typings.awsSdk.dlmMod.ClientConfiguration] = js.undefined
  
  var dms: js.UndefOr[typings.awsSdk.dmsMod.ClientConfiguration] = js.undefined
  
  var docdb: js.UndefOr[typings.awsSdk.docdbMod.ClientConfiguration] = js.undefined
  
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
  
  var firehose: js.UndefOr[typings.awsSdk.firehoseMod.ClientConfiguration] = js.undefined
  
  var fms: js.UndefOr[typings.awsSdk.fmsMod.ClientConfiguration] = js.undefined
  
  var forecastqueryservice: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.ClientConfiguration] = js.undefined
  
  var forecastservice: js.UndefOr[typings.awsSdk.forecastserviceMod.ClientConfiguration] = js.undefined
  
  var frauddetector: js.UndefOr[typings.awsSdk.frauddetectorMod.ClientConfiguration] = js.undefined
  
  var fsx: js.UndefOr[typings.awsSdk.fsxMod.ClientConfiguration] = js.undefined
  
  var gamelift: js.UndefOr[typings.awsSdk.gameliftMod.ClientConfiguration] = js.undefined
  
  var glacier: js.UndefOr[typings.awsSdk.glacierMod.ClientConfiguration] = js.undefined
  
  var globalaccelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.ClientConfiguration] = js.undefined
  
  var glue: js.UndefOr[typings.awsSdk.glueMod.ClientConfiguration] = js.undefined
  
  var greengrass: js.UndefOr[typings.awsSdk.greengrassMod.ClientConfiguration] = js.undefined
  
  var groundstation: js.UndefOr[typings.awsSdk.groundstationMod.ClientConfiguration] = js.undefined
  
  var guardduty: js.UndefOr[typings.awsSdk.guarddutyMod.ClientConfiguration] = js.undefined
  
  var health: js.UndefOr[typings.awsSdk.healthMod.ClientConfiguration] = js.undefined
  
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
  
  var iot: js.UndefOr[typings.awsSdk.iotMod.ClientConfiguration] = js.undefined
  
  var iot1clickdevicesservice: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration] = js.undefined
  
  var iot1clickprojects: js.UndefOr[typings.awsSdk.iot1clickprojectsMod.ClientConfiguration] = js.undefined
  
  var iotanalytics: js.UndefOr[typings.awsSdk.iotanalyticsMod.ClientConfiguration] = js.undefined
  
  var iotdata: js.UndefOr[typings.awsSdk.iotdataMod.ClientConfiguration] = js.undefined
  
  var iotevents: js.UndefOr[typings.awsSdk.ioteventsMod.ClientConfiguration] = js.undefined
  
  var ioteventsdata: js.UndefOr[typings.awsSdk.ioteventsdataMod.ClientConfiguration] = js.undefined
  
  var iotjobsdataplane: js.UndefOr[typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration] = js.undefined
  
  var iotsecuretunneling: js.UndefOr[typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration] = js.undefined
  
  var iotsitewise: js.UndefOr[typings.awsSdk.iotsitewiseMod.ClientConfiguration] = js.undefined
  
  var iotthingsgraph: js.UndefOr[typings.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.undefined
  
  var ivs: js.UndefOr[typings.awsSdk.ivsMod.ClientConfiguration] = js.undefined
  
  var kafka: js.UndefOr[typings.awsSdk.kafkaMod.ClientConfiguration] = js.undefined
  
  var kendra: js.UndefOr[typings.awsSdk.kendraMod.ClientConfiguration] = js.undefined
  
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
  
  var lexruntime: js.UndefOr[typings.awsSdk.lexruntimeMod.ClientConfiguration] = js.undefined
  
  var licensemanager: js.UndefOr[typings.awsSdk.licensemanagerMod.ClientConfiguration] = js.undefined
  
  var lightsail: js.UndefOr[typings.awsSdk.lightsailMod.ClientConfiguration] = js.undefined
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
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
  
  var migrationhub: js.UndefOr[typings.awsSdk.migrationhubMod.ClientConfiguration] = js.undefined
  
  var migrationhubconfig: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ClientConfiguration] = js.undefined
  
  var mobile: js.UndefOr[typings.awsSdk.mobileMod.ClientConfiguration] = js.undefined
  
  var mobileanalytics: js.UndefOr[typings.awsSdk.mobileanalyticsMod.ClientConfiguration] = js.undefined
  
  var mq: js.UndefOr[typings.awsSdk.mqMod.ClientConfiguration] = js.undefined
  
  var mturk: js.UndefOr[typings.awsSdk.mturkMod.ClientConfiguration] = js.undefined
  
  var neptune: js.UndefOr[typings.awsSdk.neptuneMod.ClientConfiguration] = js.undefined
  
  var networkfirewall: js.UndefOr[typings.awsSdk.networkfirewallMod.ClientConfiguration] = js.undefined
  
  var networkmanager: js.UndefOr[typings.awsSdk.networkmanagerMod.ClientConfiguration] = js.undefined
  
  var opsworks: js.UndefOr[typings.awsSdk.opsworksMod.ClientConfiguration] = js.undefined
  
  var opsworkscm: js.UndefOr[typings.awsSdk.opsworkscmMod.ClientConfiguration] = js.undefined
  
  var organizations: js.UndefOr[typings.awsSdk.organizationsMod.ClientConfiguration] = js.undefined
  
  var outposts: js.UndefOr[typings.awsSdk.outpostsMod.ClientConfiguration] = js.undefined
  
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
  
  var polly: js.UndefOr[typings.awsSdk.pollyMod.ClientConfiguration] = js.undefined
  
  var pricing: js.UndefOr[typings.awsSdk.pricingMod.ClientConfiguration] = js.undefined
  
  var qldb: js.UndefOr[typings.awsSdk.qldbMod.ClientConfiguration] = js.undefined
  
  var qldbsession: js.UndefOr[typings.awsSdk.qldbsessionMod.ClientConfiguration] = js.undefined
  
  var quicksight: js.UndefOr[typings.awsSdk.quicksightMod.ClientConfiguration] = js.undefined
  
  var ram: js.UndefOr[typings.awsSdk.ramMod.ClientConfiguration] = js.undefined
  
  var rds: js.UndefOr[typings.awsSdk.rdsMod.ClientConfiguration] = js.undefined
  
  var rdsdataservice: js.UndefOr[typings.awsSdk.rdsdataserviceMod.ClientConfiguration] = js.undefined
  
  var redshift: js.UndefOr[typings.awsSdk.redshiftMod.ClientConfiguration] = js.undefined
  
  var redshiftdata: js.UndefOr[typings.awsSdk.redshiftdataMod.ClientConfiguration] = js.undefined
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.undefined
  
  var rekognition: js.UndefOr[typings.awsSdk.rekognitionMod.ClientConfiguration] = js.undefined
  
  var resourcegroups: js.UndefOr[typings.awsSdk.resourcegroupsMod.ClientConfiguration] = js.undefined
  
  var resourcegroupstaggingapi: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined
  
  var robomaker: js.UndefOr[typings.awsSdk.robomakerMod.ClientConfiguration] = js.undefined
  
  var route53: js.UndefOr[typings.awsSdk.route53Mod.ClientConfiguration] = js.undefined
  
  var route53domains: js.UndefOr[typings.awsSdk.route53domainsMod.ClientConfiguration] = js.undefined
  
  var route53resolver: js.UndefOr[typings.awsSdk.route53resolverMod.ClientConfiguration] = js.undefined
  
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
  
  var sns: js.UndefOr[typings.awsSdk.snsMod.ClientConfiguration] = js.undefined
  
  var sqs: js.UndefOr[typings.awsSdk.sqsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ssm: js.UndefOr[typings.awsSdk.ssmMod.ClientConfiguration] = js.undefined
  
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
  
  var swf: js.UndefOr[typings.awsSdk.swfMod.ClientConfiguration] = js.undefined
  
  var synthetics: js.UndefOr[typings.awsSdk.syntheticsMod.ClientConfiguration] = js.undefined
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.undefined
  
  var textract: js.UndefOr[typings.awsSdk.textractMod.ClientConfiguration] = js.undefined
  
  var timestreamquery: js.UndefOr[typings.awsSdk.timestreamqueryMod.ClientConfiguration] = js.undefined
  
  var timestreamwrite: js.UndefOr[typings.awsSdk.timestreamwriteMod.ClientConfiguration] = js.undefined
  
  var transcribeservice: js.UndefOr[typings.awsSdk.transcribeserviceMod.ClientConfiguration] = js.undefined
  
  var transfer: js.UndefOr[typings.awsSdk.transferMod.ClientConfiguration] = js.undefined
  
  var translate: js.UndefOr[typings.awsSdk.translateMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  
  var waf: js.UndefOr[typings.awsSdk.wafMod.ClientConfiguration] = js.undefined
  
  var wafregional: js.UndefOr[typings.awsSdk.wafregionalMod.ClientConfiguration] = js.undefined
  
  var wafv2: js.UndefOr[typings.awsSdk.wafv2Mod.ClientConfiguration] = js.undefined
  
  var workdocs: js.UndefOr[typings.awsSdk.workdocsMod.ClientConfiguration] = js.undefined
  
  var worklink: js.UndefOr[typings.awsSdk.worklinkMod.ClientConfiguration] = js.undefined
  
  var workmail: js.UndefOr[typings.awsSdk.workmailMod.ClientConfiguration] = js.undefined
  
  var workmailmessageflow: js.UndefOr[typings.awsSdk.workmailmessageflowMod.ClientConfiguration] = js.undefined
  
  var workspaces: js.UndefOr[typings.awsSdk.workspacesMod.ClientConfiguration] = js.undefined
  
  var xray: js.UndefOr[typings.awsSdk.xrayMod.ClientConfiguration] = js.undefined
}
object ConfigurationOptionsConfi {
  
  @scala.inline
  def apply(Object: js.Object): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Object)
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsConfiMutableBuilder[Self <: ConfigurationOptionsConfi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    @scala.inline
    def setAccessanalyzer(value: ClientConfiguration): Self = StObject.set(x, "accessanalyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessanalyzerUndefined: Self = StObject.set(x, "accessanalyzer", js.undefined)
    
    @scala.inline
    def setAcm(value: typings.awsSdk.acmMod.ClientConfiguration): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setAcmpca(value: typings.awsSdk.acmpcaMod.ClientConfiguration): Self = StObject.set(x, "acmpca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmpcaUndefined: Self = StObject.set(x, "acmpca", js.undefined)
    
    @scala.inline
    def setAlexaforbusiness(value: typings.awsSdk.alexaforbusinessMod.ClientConfiguration): Self = StObject.set(x, "alexaforbusiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaforbusinessUndefined: Self = StObject.set(x, "alexaforbusiness", js.undefined)
    
    @scala.inline
    def setAmplify(value: typings.awsSdk.amplifyMod.ClientConfiguration): Self = StObject.set(x, "amplify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplifyUndefined: Self = StObject.set(x, "amplify", js.undefined)
    
    @scala.inline
    def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    @scala.inline
    def setApigateway(value: typings.awsSdk.apigatewayMod.ClientConfiguration): Self = StObject.set(x, "apigateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApigatewayUndefined: Self = StObject.set(x, "apigateway", js.undefined)
    
    @scala.inline
    def setApigatewaymanagementapi(value: typings.awsSdk.apigatewaymanagementapiMod.ClientConfiguration): Self = StObject.set(x, "apigatewaymanagementapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApigatewaymanagementapiUndefined: Self = StObject.set(x, "apigatewaymanagementapi", js.undefined)
    
    @scala.inline
    def setApigatewayv2(value: typings.awsSdk.apigatewayv2Mod.ClientConfiguration): Self = StObject.set(x, "apigatewayv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApigatewayv2Undefined: Self = StObject.set(x, "apigatewayv2", js.undefined)
    
    @scala.inline
    def setAppconfig(value: typings.awsSdk.appconfigMod.ClientConfiguration): Self = StObject.set(x, "appconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppconfigUndefined: Self = StObject.set(x, "appconfig", js.undefined)
    
    @scala.inline
    def setAppflow(value: typings.awsSdk.appflowMod.ClientConfiguration): Self = StObject.set(x, "appflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppflowUndefined: Self = StObject.set(x, "appflow", js.undefined)
    
    @scala.inline
    def setApplicationautoscaling(value: typings.awsSdk.applicationautoscalingMod.ClientConfiguration): Self = StObject.set(x, "applicationautoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationautoscalingUndefined: Self = StObject.set(x, "applicationautoscaling", js.undefined)
    
    @scala.inline
    def setApplicationinsights(value: typings.awsSdk.applicationinsightsMod.ClientConfiguration): Self = StObject.set(x, "applicationinsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationinsightsUndefined: Self = StObject.set(x, "applicationinsights", js.undefined)
    
    @scala.inline
    def setAppmesh(value: typings.awsSdk.appmeshMod.ClientConfiguration): Self = StObject.set(x, "appmesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppmeshUndefined: Self = StObject.set(x, "appmesh", js.undefined)
    
    @scala.inline
    def setAppstream(value: typings.awsSdk.appstreamMod.ClientConfiguration): Self = StObject.set(x, "appstream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppstreamUndefined: Self = StObject.set(x, "appstream", js.undefined)
    
    @scala.inline
    def setAppsync(value: typings.awsSdk.appsyncMod.ClientConfiguration): Self = StObject.set(x, "appsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsyncUndefined: Self = StObject.set(x, "appsync", js.undefined)
    
    @scala.inline
    def setAthena(value: typings.awsSdk.athenaMod.ClientConfiguration): Self = StObject.set(x, "athena", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAthenaUndefined: Self = StObject.set(x, "athena", js.undefined)
    
    @scala.inline
    def setAugmentedairuntime(value: typings.awsSdk.augmentedairuntimeMod.ClientConfiguration): Self = StObject.set(x, "augmentedairuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAugmentedairuntimeUndefined: Self = StObject.set(x, "augmentedairuntime", js.undefined)
    
    @scala.inline
    def setAutoscaling(value: typings.awsSdk.autoscalingMod.ClientConfiguration): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    @scala.inline
    def setAutoscalingplans(value: typings.awsSdk.autoscalingplansMod.ClientConfiguration): Self = StObject.set(x, "autoscalingplans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingplansUndefined: Self = StObject.set(x, "autoscalingplans", js.undefined)
    
    @scala.inline
    def setBackup(value: typings.awsSdk.backupMod.ClientConfiguration): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    @scala.inline
    def setBatch(value: typings.awsSdk.batchMod.ClientConfiguration): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setBraket(value: typings.awsSdk.braketMod.ClientConfiguration): Self = StObject.set(x, "braket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBraketUndefined: Self = StObject.set(x, "braket", js.undefined)
    
    @scala.inline
    def setBudgets(value: typings.awsSdk.budgetsMod.ClientConfiguration): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    @scala.inline
    def setChime(value: typings.awsSdk.chimeMod.ClientConfiguration): Self = StObject.set(x, "chime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChimeUndefined: Self = StObject.set(x, "chime", js.undefined)
    
    @scala.inline
    def setCloud9(value: typings.awsSdk.cloud9Mod.ClientConfiguration): Self = StObject.set(x, "cloud9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloud9Undefined: Self = StObject.set(x, "cloud9", js.undefined)
    
    @scala.inline
    def setClouddirectory(value: typings.awsSdk.clouddirectoryMod.ClientConfiguration): Self = StObject.set(x, "clouddirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClouddirectoryUndefined: Self = StObject.set(x, "clouddirectory", js.undefined)
    
    @scala.inline
    def setCloudformation(value: typings.awsSdk.cloudformationMod.ClientConfiguration): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
    
    @scala.inline
    def setCloudfront(value: typings.awsSdk.cloudfrontMod.ClientConfiguration): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
    
    @scala.inline
    def setCloudhsm(value: typings.awsSdk.cloudhsmMod.ClientConfiguration): Self = StObject.set(x, "cloudhsm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudhsmUndefined: Self = StObject.set(x, "cloudhsm", js.undefined)
    
    @scala.inline
    def setCloudhsmv2(value: typings.awsSdk.cloudhsmv2Mod.ClientConfiguration): Self = StObject.set(x, "cloudhsmv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudhsmv2Undefined: Self = StObject.set(x, "cloudhsmv2", js.undefined)
    
    @scala.inline
    def setCloudsearch(value: typings.awsSdk.cloudsearchMod.ClientConfiguration): Self = StObject.set(x, "cloudsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudsearchUndefined: Self = StObject.set(x, "cloudsearch", js.undefined)
    
    @scala.inline
    def setCloudsearchdomain(value: typings.awsSdk.cloudsearchdomainMod.ClientConfiguration): Self = StObject.set(x, "cloudsearchdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudsearchdomainUndefined: Self = StObject.set(x, "cloudsearchdomain", js.undefined)
    
    @scala.inline
    def setCloudtrail(value: typings.awsSdk.cloudtrailMod.ClientConfiguration): Self = StObject.set(x, "cloudtrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudtrailUndefined: Self = StObject.set(x, "cloudtrail", js.undefined)
    
    @scala.inline
    def setCloudwatch(value: typings.awsSdk.cloudwatchMod.ClientConfiguration): Self = StObject.set(x, "cloudwatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchUndefined: Self = StObject.set(x, "cloudwatch", js.undefined)
    
    @scala.inline
    def setCloudwatchevents(value: typings.awsSdk.cloudwatcheventsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatcheventsUndefined: Self = StObject.set(x, "cloudwatchevents", js.undefined)
    
    @scala.inline
    def setCloudwatchlogs(value: typings.awsSdk.cloudwatchlogsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchlogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchlogsUndefined: Self = StObject.set(x, "cloudwatchlogs", js.undefined)
    
    @scala.inline
    def setCodeartifact(value: typings.awsSdk.codeartifactMod.ClientConfiguration): Self = StObject.set(x, "codeartifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeartifactUndefined: Self = StObject.set(x, "codeartifact", js.undefined)
    
    @scala.inline
    def setCodebuild(value: typings.awsSdk.codebuildMod.ClientConfiguration): Self = StObject.set(x, "codebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodebuildUndefined: Self = StObject.set(x, "codebuild", js.undefined)
    
    @scala.inline
    def setCodecommit(value: typings.awsSdk.codecommitMod.ClientConfiguration): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecommitUndefined: Self = StObject.set(x, "codecommit", js.undefined)
    
    @scala.inline
    def setCodedeploy(value: typings.awsSdk.codedeployMod.ClientConfiguration): Self = StObject.set(x, "codedeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodedeployUndefined: Self = StObject.set(x, "codedeploy", js.undefined)
    
    @scala.inline
    def setCodeguruprofiler(value: typings.awsSdk.codeguruprofilerMod.ClientConfiguration): Self = StObject.set(x, "codeguruprofiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeguruprofilerUndefined: Self = StObject.set(x, "codeguruprofiler", js.undefined)
    
    @scala.inline
    def setCodegurureviewer(value: typings.awsSdk.codegurureviewerMod.ClientConfiguration): Self = StObject.set(x, "codegurureviewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegurureviewerUndefined: Self = StObject.set(x, "codegurureviewer", js.undefined)
    
    @scala.inline
    def setCodepipeline(value: typings.awsSdk.codepipelineMod.ClientConfiguration): Self = StObject.set(x, "codepipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepipelineUndefined: Self = StObject.set(x, "codepipeline", js.undefined)
    
    @scala.inline
    def setCodestar(value: typings.awsSdk.codestarMod.ClientConfiguration): Self = StObject.set(x, "codestar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodestarUndefined: Self = StObject.set(x, "codestar", js.undefined)
    
    @scala.inline
    def setCodestarconnections(value: typings.awsSdk.codestarconnectionsMod.ClientConfiguration): Self = StObject.set(x, "codestarconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodestarconnectionsUndefined: Self = StObject.set(x, "codestarconnections", js.undefined)
    
    @scala.inline
    def setCodestarnotifications(value: typings.awsSdk.codestarnotificationsMod.ClientConfiguration): Self = StObject.set(x, "codestarnotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodestarnotificationsUndefined: Self = StObject.set(x, "codestarnotifications", js.undefined)
    
    @scala.inline
    def setCognitoidentity(value: typings.awsSdk.cognitoidentityMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoidentityUndefined: Self = StObject.set(x, "cognitoidentity", js.undefined)
    
    @scala.inline
    def setCognitoidentityserviceprovider(value: typings.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentityserviceprovider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoidentityserviceproviderUndefined: Self = StObject.set(x, "cognitoidentityserviceprovider", js.undefined)
    
    @scala.inline
    def setCognitosync(value: typings.awsSdk.cognitosyncMod.ClientConfiguration): Self = StObject.set(x, "cognitosync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitosyncUndefined: Self = StObject.set(x, "cognitosync", js.undefined)
    
    @scala.inline
    def setComprehend(value: typings.awsSdk.comprehendMod.ClientConfiguration): Self = StObject.set(x, "comprehend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendUndefined: Self = StObject.set(x, "comprehend", js.undefined)
    
    @scala.inline
    def setComprehendmedical(value: typings.awsSdk.comprehendmedicalMod.ClientConfiguration): Self = StObject.set(x, "comprehendmedical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendmedicalUndefined: Self = StObject.set(x, "comprehendmedical", js.undefined)
    
    @scala.inline
    def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    @scala.inline
    def setComputeoptimizer(value: typings.awsSdk.computeoptimizerMod.ClientConfiguration): Self = StObject.set(x, "computeoptimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeoptimizerUndefined: Self = StObject.set(x, "computeoptimizer", js.undefined)
    
    @scala.inline
    def setConfigservice(value: typings.awsSdk.configserviceMod.ClientConfiguration): Self = StObject.set(x, "configservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigserviceUndefined: Self = StObject.set(x, "configservice", js.undefined)
    
    @scala.inline
    def setConnect(value: typings.awsSdk.connectMod.ClientConfiguration): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setConnectparticipant(value: typings.awsSdk.connectparticipantMod.ClientConfiguration): Self = StObject.set(x, "connectparticipant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectparticipantUndefined: Self = StObject.set(x, "connectparticipant", js.undefined)
    
    @scala.inline
    def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    @scala.inline
    def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    @scala.inline
    def setCostexplorer(value: typings.awsSdk.costexplorerMod.ClientConfiguration): Self = StObject.set(x, "costexplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostexplorerUndefined: Self = StObject.set(x, "costexplorer", js.undefined)
    
    @scala.inline
    def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setCur(value: typings.awsSdk.curMod.ClientConfiguration): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurUndefined: Self = StObject.set(x, "cur", js.undefined)
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    @scala.inline
    def setDatabrew(value: typings.awsSdk.databrewMod.ClientConfiguration): Self = StObject.set(x, "databrew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabrewUndefined: Self = StObject.set(x, "databrew", js.undefined)
    
    @scala.inline
    def setDataexchange(value: typings.awsSdk.dataexchangeMod.ClientConfiguration): Self = StObject.set(x, "dataexchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataexchangeUndefined: Self = StObject.set(x, "dataexchange", js.undefined)
    
    @scala.inline
    def setDatapipeline(value: typings.awsSdk.datapipelineMod.ClientConfiguration): Self = StObject.set(x, "datapipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapipelineUndefined: Self = StObject.set(x, "datapipeline", js.undefined)
    
    @scala.inline
    def setDatasync(value: typings.awsSdk.datasyncMod.ClientConfiguration): Self = StObject.set(x, "datasync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasyncUndefined: Self = StObject.set(x, "datasync", js.undefined)
    
    @scala.inline
    def setDax(value: typings.awsSdk.daxMod.ClientConfiguration): Self = StObject.set(x, "dax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaxUndefined: Self = StObject.set(x, "dax", js.undefined)
    
    @scala.inline
    def setDetective(value: typings.awsSdk.detectiveMod.ClientConfiguration): Self = StObject.set(x, "detective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectiveUndefined: Self = StObject.set(x, "detective", js.undefined)
    
    @scala.inline
    def setDevicefarm(value: typings.awsSdk.devicefarmMod.ClientConfiguration): Self = StObject.set(x, "devicefarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicefarmUndefined: Self = StObject.set(x, "devicefarm", js.undefined)
    
    @scala.inline
    def setDirectconnect(value: typings.awsSdk.directconnectMod.ClientConfiguration): Self = StObject.set(x, "directconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectconnectUndefined: Self = StObject.set(x, "directconnect", js.undefined)
    
    @scala.inline
    def setDirectoryservice(value: typings.awsSdk.directoryserviceMod.ClientConfiguration): Self = StObject.set(x, "directoryservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryserviceUndefined: Self = StObject.set(x, "directoryservice", js.undefined)
    
    @scala.inline
    def setDiscovery(value: typings.awsSdk.discoveryMod.ClientConfiguration): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    @scala.inline
    def setDlm(value: typings.awsSdk.dlmMod.ClientConfiguration): Self = StObject.set(x, "dlm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlmUndefined: Self = StObject.set(x, "dlm", js.undefined)
    
    @scala.inline
    def setDms(value: typings.awsSdk.dmsMod.ClientConfiguration): Self = StObject.set(x, "dms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmsUndefined: Self = StObject.set(x, "dms", js.undefined)
    
    @scala.inline
    def setDocdb(value: typings.awsSdk.docdbMod.ClientConfiguration): Self = StObject.set(x, "docdb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocdbUndefined: Self = StObject.set(x, "docdb", js.undefined)
    
    @scala.inline
    def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    @scala.inline
    def setDynamodb(value: typings.awsSdk.dynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setDynamodbstreams(value: typings.awsSdk.dynamodbstreamsMod.ClientConfiguration): Self = StObject.set(x, "dynamodbstreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbstreamsUndefined: Self = StObject.set(x, "dynamodbstreams", js.undefined)
    
    @scala.inline
    def setEbs(value: typings.awsSdk.ebsMod.ClientConfiguration): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    @scala.inline
    def setEc2(value: typings.awsSdk.ec2Mod.ClientConfiguration): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
    
    @scala.inline
    def setEc2instanceconnect(value: typings.awsSdk.ec2instanceconnectMod.ClientConfiguration): Self = StObject.set(x, "ec2instanceconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2instanceconnectUndefined: Self = StObject.set(x, "ec2instanceconnect", js.undefined)
    
    @scala.inline
    def setEcr(value: typings.awsSdk.ecrMod.ClientConfiguration): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcrUndefined: Self = StObject.set(x, "ecr", js.undefined)
    
    @scala.inline
    def setEcs(value: typings.awsSdk.ecsMod.ClientConfiguration): Self = StObject.set(x, "ecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsUndefined: Self = StObject.set(x, "ecs", js.undefined)
    
    @scala.inline
    def setEfs(value: typings.awsSdk.efsMod.ClientConfiguration): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
    
    @scala.inline
    def setEks(value: typings.awsSdk.eksMod.ClientConfiguration): Self = StObject.set(x, "eks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEksUndefined: Self = StObject.set(x, "eks", js.undefined)
    
    @scala.inline
    def setElasticache(value: typings.awsSdk.elasticacheMod.ClientConfiguration): Self = StObject.set(x, "elasticache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticacheUndefined: Self = StObject.set(x, "elasticache", js.undefined)
    
    @scala.inline
    def setElasticbeanstalk(value: typings.awsSdk.elasticbeanstalkMod.ClientConfiguration): Self = StObject.set(x, "elasticbeanstalk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticbeanstalkUndefined: Self = StObject.set(x, "elasticbeanstalk", js.undefined)
    
    @scala.inline
    def setElasticinference(value: typings.awsSdk.elasticinferenceMod.ClientConfiguration): Self = StObject.set(x, "elasticinference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticinferenceUndefined: Self = StObject.set(x, "elasticinference", js.undefined)
    
    @scala.inline
    def setElastictranscoder(value: typings.awsSdk.elastictranscoderMod.ClientConfiguration): Self = StObject.set(x, "elastictranscoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElastictranscoderUndefined: Self = StObject.set(x, "elastictranscoder", js.undefined)
    
    @scala.inline
    def setElb(value: typings.awsSdk.elbMod.ClientConfiguration): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
    
    @scala.inline
    def setElbv2(value: typings.awsSdk.elbv2Mod.ClientConfiguration): Self = StObject.set(x, "elbv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbv2Undefined: Self = StObject.set(x, "elbv2", js.undefined)
    
    @scala.inline
    def setEmr(value: typings.awsSdk.emrMod.ClientConfiguration): Self = StObject.set(x, "emr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmrUndefined: Self = StObject.set(x, "emr", js.undefined)
    
    @scala.inline
    def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    @scala.inline
    def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    @scala.inline
    def setEs(value: typings.awsSdk.esMod.ClientConfiguration): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    @scala.inline
    def setEventbridge(value: typings.awsSdk.eventbridgeMod.ClientConfiguration): Self = StObject.set(x, "eventbridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventbridgeUndefined: Self = StObject.set(x, "eventbridge", js.undefined)
    
    @scala.inline
    def setFirehose(value: typings.awsSdk.firehoseMod.ClientConfiguration): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setFms(value: typings.awsSdk.fmsMod.ClientConfiguration): Self = StObject.set(x, "fms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmsUndefined: Self = StObject.set(x, "fms", js.undefined)
    
    @scala.inline
    def setForecastqueryservice(value: typings.awsSdk.forecastqueryserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastqueryservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastqueryserviceUndefined: Self = StObject.set(x, "forecastqueryservice", js.undefined)
    
    @scala.inline
    def setForecastservice(value: typings.awsSdk.forecastserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastserviceUndefined: Self = StObject.set(x, "forecastservice", js.undefined)
    
    @scala.inline
    def setFrauddetector(value: typings.awsSdk.frauddetectorMod.ClientConfiguration): Self = StObject.set(x, "frauddetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrauddetectorUndefined: Self = StObject.set(x, "frauddetector", js.undefined)
    
    @scala.inline
    def setFsx(value: typings.awsSdk.fsxMod.ClientConfiguration): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
    
    @scala.inline
    def setGamelift(value: typings.awsSdk.gameliftMod.ClientConfiguration): Self = StObject.set(x, "gamelift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameliftUndefined: Self = StObject.set(x, "gamelift", js.undefined)
    
    @scala.inline
    def setGlacier(value: typings.awsSdk.glacierMod.ClientConfiguration): Self = StObject.set(x, "glacier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlacierUndefined: Self = StObject.set(x, "glacier", js.undefined)
    
    @scala.inline
    def setGlobalaccelerator(value: typings.awsSdk.globalacceleratorMod.ClientConfiguration): Self = StObject.set(x, "globalaccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalacceleratorUndefined: Self = StObject.set(x, "globalaccelerator", js.undefined)
    
    @scala.inline
    def setGlue(value: typings.awsSdk.glueMod.ClientConfiguration): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
    
    @scala.inline
    def setGreengrass(value: typings.awsSdk.greengrassMod.ClientConfiguration): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
    
    @scala.inline
    def setGroundstation(value: typings.awsSdk.groundstationMod.ClientConfiguration): Self = StObject.set(x, "groundstation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundstationUndefined: Self = StObject.set(x, "groundstation", js.undefined)
    
    @scala.inline
    def setGuardduty(value: typings.awsSdk.guarddutyMod.ClientConfiguration): Self = StObject.set(x, "guardduty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuarddutyUndefined: Self = StObject.set(x, "guardduty", js.undefined)
    
    @scala.inline
    def setHealth(value: typings.awsSdk.healthMod.ClientConfiguration): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    @scala.inline
    def setHoneycode(value: typings.awsSdk.honeycodeMod.ClientConfiguration): Self = StObject.set(x, "honeycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoneycodeUndefined: Self = StObject.set(x, "honeycode", js.undefined)
    
    @scala.inline
    def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    @scala.inline
    def setIam(value: typings.awsSdk.iamMod.ClientConfiguration): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    @scala.inline
    def setIdentitystore(value: typings.awsSdk.identitystoreMod.ClientConfiguration): Self = StObject.set(x, "identitystore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitystoreUndefined: Self = StObject.set(x, "identitystore", js.undefined)
    
    @scala.inline
    def setImagebuilder(value: typings.awsSdk.imagebuilderMod.ClientConfiguration): Self = StObject.set(x, "imagebuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagebuilderUndefined: Self = StObject.set(x, "imagebuilder", js.undefined)
    
    @scala.inline
    def setImportexport(value: typings.awsSdk.importexportMod.ClientConfiguration): Self = StObject.set(x, "importexport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportexportUndefined: Self = StObject.set(x, "importexport", js.undefined)
    
    @scala.inline
    def setInspector(value: typings.awsSdk.inspectorMod.ClientConfiguration): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    
    @scala.inline
    def setIot(value: typings.awsSdk.iotMod.ClientConfiguration): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIot1clickdevicesservice(value: typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration): Self = StObject.set(x, "iot1clickdevicesservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIot1clickdevicesserviceUndefined: Self = StObject.set(x, "iot1clickdevicesservice", js.undefined)
    
    @scala.inline
    def setIot1clickprojects(value: typings.awsSdk.iot1clickprojectsMod.ClientConfiguration): Self = StObject.set(x, "iot1clickprojects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIot1clickprojectsUndefined: Self = StObject.set(x, "iot1clickprojects", js.undefined)
    
    @scala.inline
    def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    @scala.inline
    def setIotanalytics(value: typings.awsSdk.iotanalyticsMod.ClientConfiguration): Self = StObject.set(x, "iotanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotanalyticsUndefined: Self = StObject.set(x, "iotanalytics", js.undefined)
    
    @scala.inline
    def setIotdata(value: typings.awsSdk.iotdataMod.ClientConfiguration): Self = StObject.set(x, "iotdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotdataUndefined: Self = StObject.set(x, "iotdata", js.undefined)
    
    @scala.inline
    def setIotevents(value: typings.awsSdk.ioteventsMod.ClientConfiguration): Self = StObject.set(x, "iotevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoteventsUndefined: Self = StObject.set(x, "iotevents", js.undefined)
    
    @scala.inline
    def setIoteventsdata(value: typings.awsSdk.ioteventsdataMod.ClientConfiguration): Self = StObject.set(x, "ioteventsdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoteventsdataUndefined: Self = StObject.set(x, "ioteventsdata", js.undefined)
    
    @scala.inline
    def setIotjobsdataplane(value: typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration): Self = StObject.set(x, "iotjobsdataplane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotjobsdataplaneUndefined: Self = StObject.set(x, "iotjobsdataplane", js.undefined)
    
    @scala.inline
    def setIotsecuretunneling(value: typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration): Self = StObject.set(x, "iotsecuretunneling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotsecuretunnelingUndefined: Self = StObject.set(x, "iotsecuretunneling", js.undefined)
    
    @scala.inline
    def setIotsitewise(value: typings.awsSdk.iotsitewiseMod.ClientConfiguration): Self = StObject.set(x, "iotsitewise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotsitewiseUndefined: Self = StObject.set(x, "iotsitewise", js.undefined)
    
    @scala.inline
    def setIotthingsgraph(value: typings.awsSdk.iotthingsgraphMod.ClientConfiguration): Self = StObject.set(x, "iotthingsgraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotthingsgraphUndefined: Self = StObject.set(x, "iotthingsgraph", js.undefined)
    
    @scala.inline
    def setIvs(value: typings.awsSdk.ivsMod.ClientConfiguration): Self = StObject.set(x, "ivs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvsUndefined: Self = StObject.set(x, "ivs", js.undefined)
    
    @scala.inline
    def setKafka(value: typings.awsSdk.kafkaMod.ClientConfiguration): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    @scala.inline
    def setKendra(value: typings.awsSdk.kendraMod.ClientConfiguration): Self = StObject.set(x, "kendra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKendraUndefined: Self = StObject.set(x, "kendra", js.undefined)
    
    @scala.inline
    def setKinesis(value: typings.awsSdk.kinesisMod.ClientConfiguration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setKinesisanalytics(value: typings.awsSdk.kinesisanalyticsMod.ClientConfiguration): Self = StObject.set(x, "kinesisanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisanalyticsUndefined: Self = StObject.set(x, "kinesisanalytics", js.undefined)
    
    @scala.inline
    def setKinesisanalyticsv2(value: typings.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration): Self = StObject.set(x, "kinesisanalyticsv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisanalyticsv2Undefined: Self = StObject.set(x, "kinesisanalyticsv2", js.undefined)
    
    @scala.inline
    def setKinesisvideo(value: typings.awsSdk.kinesisvideoMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideoUndefined: Self = StObject.set(x, "kinesisvideo", js.undefined)
    
    @scala.inline
    def setKinesisvideoarchivedmedia(value: typings.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideoarchivedmedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideoarchivedmediaUndefined: Self = StObject.set(x, "kinesisvideoarchivedmedia", js.undefined)
    
    @scala.inline
    def setKinesisvideomedia(value: typings.awsSdk.kinesisvideomediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideomedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideomediaUndefined: Self = StObject.set(x, "kinesisvideomedia", js.undefined)
    
    @scala.inline
    def setKinesisvideosignalingchannels(value: typings.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideosignalingchannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisvideosignalingchannelsUndefined: Self = StObject.set(x, "kinesisvideosignalingchannels", js.undefined)
    
    @scala.inline
    def setKms(value: typings.awsSdk.kmsMod.ClientConfiguration): Self = StObject.set(x, "kms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsUndefined: Self = StObject.set(x, "kms", js.undefined)
    
    @scala.inline
    def setLakeformation(value: typings.awsSdk.lakeformationMod.ClientConfiguration): Self = StObject.set(x, "lakeformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLakeformationUndefined: Self = StObject.set(x, "lakeformation", js.undefined)
    
    @scala.inline
    def setLambda(value: typings.awsSdk.lambdaMod.ClientConfiguration): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setLexmodelbuildingservice(value: typings.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration): Self = StObject.set(x, "lexmodelbuildingservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexmodelbuildingserviceUndefined: Self = StObject.set(x, "lexmodelbuildingservice", js.undefined)
    
    @scala.inline
    def setLexruntime(value: typings.awsSdk.lexruntimeMod.ClientConfiguration): Self = StObject.set(x, "lexruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexruntimeUndefined: Self = StObject.set(x, "lexruntime", js.undefined)
    
    @scala.inline
    def setLicensemanager(value: typings.awsSdk.licensemanagerMod.ClientConfiguration): Self = StObject.set(x, "licensemanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensemanagerUndefined: Self = StObject.set(x, "licensemanager", js.undefined)
    
    @scala.inline
    def setLightsail(value: typings.awsSdk.lightsailMod.ClientConfiguration): Self = StObject.set(x, "lightsail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsailUndefined: Self = StObject.set(x, "lightsail", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMachinelearning(value: typings.awsSdk.machinelearningMod.ClientConfiguration): Self = StObject.set(x, "machinelearning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachinelearningUndefined: Self = StObject.set(x, "machinelearning", js.undefined)
    
    @scala.inline
    def setMacie(value: typings.awsSdk.macieMod.ClientConfiguration): Self = StObject.set(x, "macie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacie2(value: typings.awsSdk.macie2Mod.ClientConfiguration): Self = StObject.set(x, "macie2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacie2Undefined: Self = StObject.set(x, "macie2", js.undefined)
    
    @scala.inline
    def setMacieUndefined: Self = StObject.set(x, "macie", js.undefined)
    
    @scala.inline
    def setManagedblockchain(value: typings.awsSdk.managedblockchainMod.ClientConfiguration): Self = StObject.set(x, "managedblockchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedblockchainUndefined: Self = StObject.set(x, "managedblockchain", js.undefined)
    
    @scala.inline
    def setMarketplacecatalog(value: typings.awsSdk.marketplacecatalogMod.ClientConfiguration): Self = StObject.set(x, "marketplacecatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacecatalogUndefined: Self = StObject.set(x, "marketplacecatalog", js.undefined)
    
    @scala.inline
    def setMarketplacecommerceanalytics(value: typings.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration): Self = StObject.set(x, "marketplacecommerceanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacecommerceanalyticsUndefined: Self = StObject.set(x, "marketplacecommerceanalytics", js.undefined)
    
    @scala.inline
    def setMarketplaceentitlementservice(value: typings.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration): Self = StObject.set(x, "marketplaceentitlementservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplaceentitlementserviceUndefined: Self = StObject.set(x, "marketplaceentitlementservice", js.undefined)
    
    @scala.inline
    def setMarketplacemetering(value: typings.awsSdk.marketplacemeteringMod.ClientConfiguration): Self = StObject.set(x, "marketplacemetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacemeteringUndefined: Self = StObject.set(x, "marketplacemetering", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setMediaconnect(value: typings.awsSdk.mediaconnectMod.ClientConfiguration): Self = StObject.set(x, "mediaconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaconnectUndefined: Self = StObject.set(x, "mediaconnect", js.undefined)
    
    @scala.inline
    def setMediaconvert(value: typings.awsSdk.mediaconvertMod.ClientConfiguration): Self = StObject.set(x, "mediaconvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaconvertUndefined: Self = StObject.set(x, "mediaconvert", js.undefined)
    
    @scala.inline
    def setMedialive(value: typings.awsSdk.medialiveMod.ClientConfiguration): Self = StObject.set(x, "medialive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedialiveUndefined: Self = StObject.set(x, "medialive", js.undefined)
    
    @scala.inline
    def setMediapackage(value: typings.awsSdk.mediapackageMod.ClientConfiguration): Self = StObject.set(x, "mediapackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediapackageUndefined: Self = StObject.set(x, "mediapackage", js.undefined)
    
    @scala.inline
    def setMediapackagevod(value: typings.awsSdk.mediapackagevodMod.ClientConfiguration): Self = StObject.set(x, "mediapackagevod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediapackagevodUndefined: Self = StObject.set(x, "mediapackagevod", js.undefined)
    
    @scala.inline
    def setMediastore(value: typings.awsSdk.mediastoreMod.ClientConfiguration): Self = StObject.set(x, "mediastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediastoreUndefined: Self = StObject.set(x, "mediastore", js.undefined)
    
    @scala.inline
    def setMediastoredata(value: typings.awsSdk.mediastoredataMod.ClientConfiguration): Self = StObject.set(x, "mediastoredata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediastoredataUndefined: Self = StObject.set(x, "mediastoredata", js.undefined)
    
    @scala.inline
    def setMediatailor(value: typings.awsSdk.mediatailorMod.ClientConfiguration): Self = StObject.set(x, "mediatailor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediatailorUndefined: Self = StObject.set(x, "mediatailor", js.undefined)
    
    @scala.inline
    def setMigrationhub(value: typings.awsSdk.migrationhubMod.ClientConfiguration): Self = StObject.set(x, "migrationhub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationhubUndefined: Self = StObject.set(x, "migrationhub", js.undefined)
    
    @scala.inline
    def setMigrationhubconfig(value: typings.awsSdk.migrationhubconfigMod.ClientConfiguration): Self = StObject.set(x, "migrationhubconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationhubconfigUndefined: Self = StObject.set(x, "migrationhubconfig", js.undefined)
    
    @scala.inline
    def setMobile(value: typings.awsSdk.mobileMod.ClientConfiguration): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setMobileanalytics(value: typings.awsSdk.mobileanalyticsMod.ClientConfiguration): Self = StObject.set(x, "mobileanalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileanalyticsUndefined: Self = StObject.set(x, "mobileanalytics", js.undefined)
    
    @scala.inline
    def setMq(value: typings.awsSdk.mqMod.ClientConfiguration): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
    
    @scala.inline
    def setMturk(value: typings.awsSdk.mturkMod.ClientConfiguration): Self = StObject.set(x, "mturk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMturkUndefined: Self = StObject.set(x, "mturk", js.undefined)
    
    @scala.inline
    def setNeptune(value: typings.awsSdk.neptuneMod.ClientConfiguration): Self = StObject.set(x, "neptune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeptuneUndefined: Self = StObject.set(x, "neptune", js.undefined)
    
    @scala.inline
    def setNetworkfirewall(value: typings.awsSdk.networkfirewallMod.ClientConfiguration): Self = StObject.set(x, "networkfirewall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkfirewallUndefined: Self = StObject.set(x, "networkfirewall", js.undefined)
    
    @scala.inline
    def setNetworkmanager(value: typings.awsSdk.networkmanagerMod.ClientConfiguration): Self = StObject.set(x, "networkmanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkmanagerUndefined: Self = StObject.set(x, "networkmanager", js.undefined)
    
    @scala.inline
    def setOpsworks(value: typings.awsSdk.opsworksMod.ClientConfiguration): Self = StObject.set(x, "opsworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsworksUndefined: Self = StObject.set(x, "opsworks", js.undefined)
    
    @scala.inline
    def setOpsworkscm(value: typings.awsSdk.opsworkscmMod.ClientConfiguration): Self = StObject.set(x, "opsworkscm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsworkscmUndefined: Self = StObject.set(x, "opsworkscm", js.undefined)
    
    @scala.inline
    def setOrganizations(value: typings.awsSdk.organizationsMod.ClientConfiguration): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setOutposts(value: typings.awsSdk.outpostsMod.ClientConfiguration): Self = StObject.set(x, "outposts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostsUndefined: Self = StObject.set(x, "outposts", js.undefined)
    
    @scala.inline
    def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    @scala.inline
    def setPersonalize(value: typings.awsSdk.personalizeMod.ClientConfiguration): Self = StObject.set(x, "personalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizeUndefined: Self = StObject.set(x, "personalize", js.undefined)
    
    @scala.inline
    def setPersonalizeevents(value: typings.awsSdk.personalizeeventsMod.ClientConfiguration): Self = StObject.set(x, "personalizeevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizeeventsUndefined: Self = StObject.set(x, "personalizeevents", js.undefined)
    
    @scala.inline
    def setPersonalizeruntime(value: typings.awsSdk.personalizeruntimeMod.ClientConfiguration): Self = StObject.set(x, "personalizeruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizeruntimeUndefined: Self = StObject.set(x, "personalizeruntime", js.undefined)
    
    @scala.inline
    def setPi(value: typings.awsSdk.piMod.ClientConfiguration): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
    
    @scala.inline
    def setPinpoint(value: typings.awsSdk.pinpointMod.ClientConfiguration): Self = StObject.set(x, "pinpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointUndefined: Self = StObject.set(x, "pinpoint", js.undefined)
    
    @scala.inline
    def setPinpointemail(value: typings.awsSdk.pinpointemailMod.ClientConfiguration): Self = StObject.set(x, "pinpointemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointemailUndefined: Self = StObject.set(x, "pinpointemail", js.undefined)
    
    @scala.inline
    def setPinpointsmsvoice(value: typings.awsSdk.pinpointsmsvoiceMod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinpointsmsvoiceUndefined: Self = StObject.set(x, "pinpointsmsvoice", js.undefined)
    
    @scala.inline
    def setPolly(value: typings.awsSdk.pollyMod.ClientConfiguration): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollyUndefined: Self = StObject.set(x, "polly", js.undefined)
    
    @scala.inline
    def setPricing(value: typings.awsSdk.pricingMod.ClientConfiguration): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    @scala.inline
    def setQldb(value: typings.awsSdk.qldbMod.ClientConfiguration): Self = StObject.set(x, "qldb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQldbUndefined: Self = StObject.set(x, "qldb", js.undefined)
    
    @scala.inline
    def setQldbsession(value: typings.awsSdk.qldbsessionMod.ClientConfiguration): Self = StObject.set(x, "qldbsession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQldbsessionUndefined: Self = StObject.set(x, "qldbsession", js.undefined)
    
    @scala.inline
    def setQuicksight(value: typings.awsSdk.quicksightMod.ClientConfiguration): Self = StObject.set(x, "quicksight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicksightUndefined: Self = StObject.set(x, "quicksight", js.undefined)
    
    @scala.inline
    def setRam(value: typings.awsSdk.ramMod.ClientConfiguration): Self = StObject.set(x, "ram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamUndefined: Self = StObject.set(x, "ram", js.undefined)
    
    @scala.inline
    def setRds(value: typings.awsSdk.rdsMod.ClientConfiguration): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    @scala.inline
    def setRdsdataservice(value: typings.awsSdk.rdsdataserviceMod.ClientConfiguration): Self = StObject.set(x, "rdsdataservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsdataserviceUndefined: Self = StObject.set(x, "rdsdataservice", js.undefined)
    
    @scala.inline
    def setRedshift(value: typings.awsSdk.redshiftMod.ClientConfiguration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    @scala.inline
    def setRedshiftdata(value: typings.awsSdk.redshiftdataMod.ClientConfiguration): Self = StObject.set(x, "redshiftdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftdataUndefined: Self = StObject.set(x, "redshiftdata", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRekognition(value: typings.awsSdk.rekognitionMod.ClientConfiguration): Self = StObject.set(x, "rekognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRekognitionUndefined: Self = StObject.set(x, "rekognition", js.undefined)
    
    @scala.inline
    def setResourcegroups(value: typings.awsSdk.resourcegroupsMod.ClientConfiguration): Self = StObject.set(x, "resourcegroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcegroupsUndefined: Self = StObject.set(x, "resourcegroups", js.undefined)
    
    @scala.inline
    def setResourcegroupstaggingapi(value: typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration): Self = StObject.set(x, "resourcegroupstaggingapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcegroupstaggingapiUndefined: Self = StObject.set(x, "resourcegroupstaggingapi", js.undefined)
    
    @scala.inline
    def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    @scala.inline
    def setRobomaker(value: typings.awsSdk.robomakerMod.ClientConfiguration): Self = StObject.set(x, "robomaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobomakerUndefined: Self = StObject.set(x, "robomaker", js.undefined)
    
    @scala.inline
    def setRoute53(value: typings.awsSdk.route53Mod.ClientConfiguration): Self = StObject.set(x, "route53", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute53Undefined: Self = StObject.set(x, "route53", js.undefined)
    
    @scala.inline
    def setRoute53domains(value: typings.awsSdk.route53domainsMod.ClientConfiguration): Self = StObject.set(x, "route53domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute53domainsUndefined: Self = StObject.set(x, "route53domains", js.undefined)
    
    @scala.inline
    def setRoute53resolver(value: typings.awsSdk.route53resolverMod.ClientConfiguration): Self = StObject.set(x, "route53resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute53resolverUndefined: Self = StObject.set(x, "route53resolver", js.undefined)
    
    @scala.inline
    def setS3(value: typings.awsSdk.s3Mod.ClientConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketEndpoint(value: Boolean): Self = StObject.set(x, "s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketEndpointUndefined: Self = StObject.set(x, "s3BucketEndpoint", js.undefined)
    
    @scala.inline
    def setS3DisableBodySigning(value: Boolean): Self = StObject.set(x, "s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DisableBodySigningUndefined: Self = StObject.set(x, "s3DisableBodySigning", js.undefined)
    
    @scala.inline
    def setS3ForcePathStyle(value: Boolean): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = StObject.set(x, "s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UsEast1RegionalEndpointUndefined: Self = StObject.set(x, "s3UsEast1RegionalEndpoint", js.undefined)
    
    @scala.inline
    def setS3UseArnRegion(value: Boolean): Self = StObject.set(x, "s3UseArnRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UseArnRegionUndefined: Self = StObject.set(x, "s3UseArnRegion", js.undefined)
    
    @scala.inline
    def setS3control(value: typings.awsSdk.s3controlMod.ClientConfiguration): Self = StObject.set(x, "s3control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3controlUndefined: Self = StObject.set(x, "s3control", js.undefined)
    
    @scala.inline
    def setS3outposts(value: typings.awsSdk.s3outpostsMod.ClientConfiguration): Self = StObject.set(x, "s3outposts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3outpostsUndefined: Self = StObject.set(x, "s3outposts", js.undefined)
    
    @scala.inline
    def setSagemaker(value: typings.awsSdk.sagemakerMod.ClientConfiguration): Self = StObject.set(x, "sagemaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSagemakerUndefined: Self = StObject.set(x, "sagemaker", js.undefined)
    
    @scala.inline
    def setSagemakerruntime(value: typings.awsSdk.sagemakerruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerruntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSagemakerruntimeUndefined: Self = StObject.set(x, "sagemakerruntime", js.undefined)
    
    @scala.inline
    def setSavingsplans(value: typings.awsSdk.savingsplansMod.ClientConfiguration): Self = StObject.set(x, "savingsplans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsplansUndefined: Self = StObject.set(x, "savingsplans", js.undefined)
    
    @scala.inline
    def setSchemas(value: typings.awsSdk.schemasMod.ClientConfiguration): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    @scala.inline
    def setSecretsmanager(value: typings.awsSdk.secretsmanagerMod.ClientConfiguration): Self = StObject.set(x, "secretsmanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsmanagerUndefined: Self = StObject.set(x, "secretsmanager", js.undefined)
    
    @scala.inline
    def setSecurityhub(value: typings.awsSdk.securityhubMod.ClientConfiguration): Self = StObject.set(x, "securityhub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityhubUndefined: Self = StObject.set(x, "securityhub", js.undefined)
    
    @scala.inline
    def setServerlessapplicationrepository(value: typings.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration): Self = StObject.set(x, "serverlessapplicationrepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerlessapplicationrepositoryUndefined: Self = StObject.set(x, "serverlessapplicationrepository", js.undefined)
    
    @scala.inline
    def setServicecatalog(value: typings.awsSdk.servicecatalogMod.ClientConfiguration): Self = StObject.set(x, "servicecatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicecatalogUndefined: Self = StObject.set(x, "servicecatalog", js.undefined)
    
    @scala.inline
    def setServicecatalogappregistry(value: typings.awsSdk.servicecatalogappregistryMod.ClientConfiguration): Self = StObject.set(x, "servicecatalogappregistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicecatalogappregistryUndefined: Self = StObject.set(x, "servicecatalogappregistry", js.undefined)
    
    @scala.inline
    def setServicediscovery(value: typings.awsSdk.servicediscoveryMod.ClientConfiguration): Self = StObject.set(x, "servicediscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicediscoveryUndefined: Self = StObject.set(x, "servicediscovery", js.undefined)
    
    @scala.inline
    def setServicequotas(value: typings.awsSdk.servicequotasMod.ClientConfiguration): Self = StObject.set(x, "servicequotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicequotasUndefined: Self = StObject.set(x, "servicequotas", js.undefined)
    
    @scala.inline
    def setSes(value: typings.awsSdk.sesMod.ClientConfiguration): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    @scala.inline
    def setSesv2(value: typings.awsSdk.sesv2Mod.ClientConfiguration): Self = StObject.set(x, "sesv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSesv2Undefined: Self = StObject.set(x, "sesv2", js.undefined)
    
    @scala.inline
    def setShield(value: typings.awsSdk.shieldMod.ClientConfiguration): Self = StObject.set(x, "shield", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldUndefined: Self = StObject.set(x, "shield", js.undefined)
    
    @scala.inline
    def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    @scala.inline
    def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    @scala.inline
    def setSigner(value: typings.awsSdk.signerMod.ClientConfiguration): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    @scala.inline
    def setSimpledb(value: typings.awsSdk.simpledbMod.ClientConfiguration): Self = StObject.set(x, "simpledb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpledbUndefined: Self = StObject.set(x, "simpledb", js.undefined)
    
    @scala.inline
    def setSms(value: typings.awsSdk.smsMod.ClientConfiguration): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
    
    @scala.inline
    def setSnowball(value: typings.awsSdk.snowballMod.ClientConfiguration): Self = StObject.set(x, "snowball", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballUndefined: Self = StObject.set(x, "snowball", js.undefined)
    
    @scala.inline
    def setSns(value: typings.awsSdk.snsMod.ClientConfiguration): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: typings.awsSdk.sqsMod.ClientConfiguration): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    @scala.inline
    def setSsm(value: typings.awsSdk.ssmMod.ClientConfiguration): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
    
    @scala.inline
    def setSso(value: typings.awsSdk.ssoMod.ClientConfiguration): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
    
    @scala.inline
    def setSsoadmin(value: typings.awsSdk.ssoadminMod.ClientConfiguration): Self = StObject.set(x, "ssoadmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoadminUndefined: Self = StObject.set(x, "ssoadmin", js.undefined)
    
    @scala.inline
    def setSsooidc(value: typings.awsSdk.ssooidcMod.ClientConfiguration): Self = StObject.set(x, "ssooidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsooidcUndefined: Self = StObject.set(x, "ssooidc", js.undefined)
    
    @scala.inline
    def setStepfunctions(value: typings.awsSdk.stepfunctionsMod.ClientConfiguration): Self = StObject.set(x, "stepfunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepfunctionsUndefined: Self = StObject.set(x, "stepfunctions", js.undefined)
    
    @scala.inline
    def setStoragegateway(value: typings.awsSdk.storagegatewayMod.ClientConfiguration): Self = StObject.set(x, "storagegateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragegatewayUndefined: Self = StObject.set(x, "storagegateway", js.undefined)
    
    @scala.inline
    def setSts(value: typings.awsSdk.stsMod.ClientConfiguration): Self = StObject.set(x, "sts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    @scala.inline
    def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
    
    @scala.inline
    def setSupport(value: typings.awsSdk.supportMod.ClientConfiguration): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    @scala.inline
    def setSwf(value: typings.awsSdk.swfMod.ClientConfiguration): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    @scala.inline
    def setSynthetics(value: typings.awsSdk.syntheticsMod.ClientConfiguration): Self = StObject.set(x, "synthetics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticsUndefined: Self = StObject.set(x, "synthetics", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    @scala.inline
    def setTextract(value: typings.awsSdk.textractMod.ClientConfiguration): Self = StObject.set(x, "textract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextractUndefined: Self = StObject.set(x, "textract", js.undefined)
    
    @scala.inline
    def setTimestreamquery(value: typings.awsSdk.timestreamqueryMod.ClientConfiguration): Self = StObject.set(x, "timestreamquery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestreamqueryUndefined: Self = StObject.set(x, "timestreamquery", js.undefined)
    
    @scala.inline
    def setTimestreamwrite(value: typings.awsSdk.timestreamwriteMod.ClientConfiguration): Self = StObject.set(x, "timestreamwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestreamwriteUndefined: Self = StObject.set(x, "timestreamwrite", js.undefined)
    
    @scala.inline
    def setTranscribeservice(value: typings.awsSdk.transcribeserviceMod.ClientConfiguration): Self = StObject.set(x, "transcribeservice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscribeserviceUndefined: Self = StObject.set(x, "transcribeservice", js.undefined)
    
    @scala.inline
    def setTransfer(value: typings.awsSdk.transferMod.ClientConfiguration): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    @scala.inline
    def setTranslate(value: typings.awsSdk.translateMod.ClientConfiguration): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    
    @scala.inline
    def setWaf(value: typings.awsSdk.wafMod.ClientConfiguration): Self = StObject.set(x, "waf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafUndefined: Self = StObject.set(x, "waf", js.undefined)
    
    @scala.inline
    def setWafregional(value: typings.awsSdk.wafregionalMod.ClientConfiguration): Self = StObject.set(x, "wafregional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafregionalUndefined: Self = StObject.set(x, "wafregional", js.undefined)
    
    @scala.inline
    def setWafv2(value: typings.awsSdk.wafv2Mod.ClientConfiguration): Self = StObject.set(x, "wafv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafv2Undefined: Self = StObject.set(x, "wafv2", js.undefined)
    
    @scala.inline
    def setWorkdocs(value: typings.awsSdk.workdocsMod.ClientConfiguration): Self = StObject.set(x, "workdocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkdocsUndefined: Self = StObject.set(x, "workdocs", js.undefined)
    
    @scala.inline
    def setWorklink(value: typings.awsSdk.worklinkMod.ClientConfiguration): Self = StObject.set(x, "worklink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorklinkUndefined: Self = StObject.set(x, "worklink", js.undefined)
    
    @scala.inline
    def setWorkmail(value: typings.awsSdk.workmailMod.ClientConfiguration): Self = StObject.set(x, "workmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkmailUndefined: Self = StObject.set(x, "workmail", js.undefined)
    
    @scala.inline
    def setWorkmailmessageflow(value: typings.awsSdk.workmailmessageflowMod.ClientConfiguration): Self = StObject.set(x, "workmailmessageflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkmailmessageflowUndefined: Self = StObject.set(x, "workmailmessageflow", js.undefined)
    
    @scala.inline
    def setWorkspaces(value: typings.awsSdk.workspacesMod.ClientConfiguration): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    @scala.inline
    def setXray(value: typings.awsSdk.xrayMod.ClientConfiguration): Self = StObject.set(x, "xray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrayUndefined: Self = StObject.set(x, "xray", js.undefined)
  }
}
