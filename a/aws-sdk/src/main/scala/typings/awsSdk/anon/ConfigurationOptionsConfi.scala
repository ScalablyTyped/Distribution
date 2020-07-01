package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.accessanalyzerMod.ClientConfiguration
import typings.awsSdk.awsSdkStrings.latest_
import typings.awsSdk.awsSdkStrings.legacy_
import typings.awsSdk.awsSdkStrings.regional_
import typings.awsSdk.awsSdkStrings.v2_
import typings.awsSdk.awsSdkStrings.v3
import typings.awsSdk.awsSdkStrings.v4
import typings.awsSdk.configMod.HTTPOptions
import typings.awsSdk.configMod.Logger
import typings.awsSdk.configMod.ParamValidation
import typings.awsSdk.configMod.RetryDelayOptions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/lib/config.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
@js.native
trait ConfigurationOptionsConfi
  extends /* key */ StringDictionary[js.Any] {
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.native
  var accessanalyzer: js.UndefOr[ClientConfiguration] = js.native
  var acm: js.UndefOr[typings.awsSdk.acmMod.ClientConfiguration] = js.native
  var acmpca: js.UndefOr[typings.awsSdk.acmpcaMod.ClientConfiguration] = js.native
  var alexaforbusiness: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientConfiguration] = js.native
  var amplify: js.UndefOr[typings.awsSdk.amplifyMod.ClientConfiguration] = js.native
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest_ | String] = js.native
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.native
  var apigateway: js.UndefOr[typings.awsSdk.apigatewayMod.ClientConfiguration] = js.native
  var apigatewaymanagementapi: js.UndefOr[typings.awsSdk.apigatewaymanagementapiMod.ClientConfiguration] = js.native
  var apigatewayv2: js.UndefOr[typings.awsSdk.apigatewayv2Mod.ClientConfiguration] = js.native
  var appconfig: js.UndefOr[typings.awsSdk.appconfigMod.ClientConfiguration] = js.native
  var applicationautoscaling: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ClientConfiguration] = js.native
  var applicationinsights: js.UndefOr[typings.awsSdk.applicationinsightsMod.ClientConfiguration] = js.native
  var appmesh: js.UndefOr[typings.awsSdk.appmeshMod.ClientConfiguration] = js.native
  var appstream: js.UndefOr[typings.awsSdk.appstreamMod.ClientConfiguration] = js.native
  var appsync: js.UndefOr[typings.awsSdk.appsyncMod.ClientConfiguration] = js.native
  var athena: js.UndefOr[typings.awsSdk.athenaMod.ClientConfiguration] = js.native
  var augmentedairuntime: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.ClientConfiguration] = js.native
  var autoscaling: js.UndefOr[typings.awsSdk.autoscalingMod.ClientConfiguration] = js.native
  var autoscalingplans: js.UndefOr[typings.awsSdk.autoscalingplansMod.ClientConfiguration] = js.native
  var backup: js.UndefOr[typings.awsSdk.backupMod.ClientConfiguration] = js.native
  var batch: js.UndefOr[typings.awsSdk.batchMod.ClientConfiguration] = js.native
  var budgets: js.UndefOr[typings.awsSdk.budgetsMod.ClientConfiguration] = js.native
  var chime: js.UndefOr[typings.awsSdk.chimeMod.ClientConfiguration] = js.native
  var cloud9: js.UndefOr[typings.awsSdk.cloud9Mod.ClientConfiguration] = js.native
  var clouddirectory: js.UndefOr[typings.awsSdk.clouddirectoryMod.ClientConfiguration] = js.native
  var cloudformation: js.UndefOr[typings.awsSdk.cloudformationMod.ClientConfiguration] = js.native
  var cloudfront: js.UndefOr[typings.awsSdk.cloudfrontMod.ClientConfiguration] = js.native
  var cloudhsm: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientConfiguration] = js.native
  var cloudhsmv2: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClientConfiguration] = js.native
  var cloudsearch: js.UndefOr[typings.awsSdk.cloudsearchMod.ClientConfiguration] = js.native
  var cloudsearchdomain: js.UndefOr[typings.awsSdk.cloudsearchdomainMod.ClientConfiguration] = js.native
  var cloudtrail: js.UndefOr[typings.awsSdk.cloudtrailMod.ClientConfiguration] = js.native
  var cloudwatch: js.UndefOr[typings.awsSdk.cloudwatchMod.ClientConfiguration] = js.native
  var cloudwatchevents: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ClientConfiguration] = js.native
  var cloudwatchlogs: js.UndefOr[typings.awsSdk.cloudwatchlogsMod.ClientConfiguration] = js.native
  var codeartifact: js.UndefOr[typings.awsSdk.codeartifactMod.ClientConfiguration] = js.native
  var codebuild: js.UndefOr[typings.awsSdk.codebuildMod.ClientConfiguration] = js.native
  var codecommit: js.UndefOr[typings.awsSdk.codecommitMod.ClientConfiguration] = js.native
  var codedeploy: js.UndefOr[typings.awsSdk.codedeployMod.ClientConfiguration] = js.native
  var codeguruprofiler: js.UndefOr[typings.awsSdk.codeguruprofilerMod.ClientConfiguration] = js.native
  var codegurureviewer: js.UndefOr[typings.awsSdk.codegurureviewerMod.ClientConfiguration] = js.native
  var codepipeline: js.UndefOr[typings.awsSdk.codepipelineMod.ClientConfiguration] = js.native
  var codestar: js.UndefOr[typings.awsSdk.codestarMod.ClientConfiguration] = js.native
  var codestarconnections: js.UndefOr[typings.awsSdk.codestarconnectionsMod.ClientConfiguration] = js.native
  var codestarnotifications: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ClientConfiguration] = js.native
  var cognitoidentity: js.UndefOr[typings.awsSdk.cognitoidentityMod.ClientConfiguration] = js.native
  var cognitoidentityserviceprovider: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration] = js.native
  var cognitosync: js.UndefOr[typings.awsSdk.cognitosyncMod.ClientConfiguration] = js.native
  var comprehend: js.UndefOr[typings.awsSdk.comprehendMod.ClientConfiguration] = js.native
  var comprehendmedical: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ClientConfiguration] = js.native
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.native
  var computeoptimizer: js.UndefOr[typings.awsSdk.computeoptimizerMod.ClientConfiguration] = js.native
  var configservice: js.UndefOr[typings.awsSdk.configserviceMod.ClientConfiguration] = js.native
  var connect: js.UndefOr[typings.awsSdk.connectMod.ClientConfiguration] = js.native
  var connectparticipant: js.UndefOr[typings.awsSdk.connectparticipantMod.ClientConfiguration] = js.native
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.native
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.native
  var costexplorer: js.UndefOr[typings.awsSdk.costexplorerMod.ClientConfiguration] = js.native
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.native
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.native
  var cur: js.UndefOr[typings.awsSdk.curMod.ClientConfiguration] = js.native
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.native
  var dataexchange: js.UndefOr[typings.awsSdk.dataexchangeMod.ClientConfiguration] = js.native
  var datapipeline: js.UndefOr[typings.awsSdk.datapipelineMod.ClientConfiguration] = js.native
  var datasync: js.UndefOr[typings.awsSdk.datasyncMod.ClientConfiguration] = js.native
  var dax: js.UndefOr[typings.awsSdk.daxMod.ClientConfiguration] = js.native
  var detective: js.UndefOr[typings.awsSdk.detectiveMod.ClientConfiguration] = js.native
  var devicefarm: js.UndefOr[typings.awsSdk.devicefarmMod.ClientConfiguration] = js.native
  var directconnect: js.UndefOr[typings.awsSdk.directconnectMod.ClientConfiguration] = js.native
  var directoryservice: js.UndefOr[typings.awsSdk.directoryserviceMod.ClientConfiguration] = js.native
  var discovery: js.UndefOr[typings.awsSdk.discoveryMod.ClientConfiguration] = js.native
  var dlm: js.UndefOr[typings.awsSdk.dlmMod.ClientConfiguration] = js.native
  var dms: js.UndefOr[typings.awsSdk.dmsMod.ClientConfiguration] = js.native
  var docdb: js.UndefOr[typings.awsSdk.docdbMod.ClientConfiguration] = js.native
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.native
  var dynamodb: js.UndefOr[typings.awsSdk.dynamodbMod.ClientConfiguration] = js.native
  var dynamodbstreams: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.ClientConfiguration] = js.native
  var ebs: js.UndefOr[typings.awsSdk.ebsMod.ClientConfiguration] = js.native
  var ec2: js.UndefOr[typings.awsSdk.ec2Mod.ClientConfiguration] = js.native
  var ec2instanceconnect: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.ClientConfiguration] = js.native
  var ecr: js.UndefOr[typings.awsSdk.ecrMod.ClientConfiguration] = js.native
  var ecs: js.UndefOr[typings.awsSdk.ecsMod.ClientConfiguration] = js.native
  var efs: js.UndefOr[typings.awsSdk.efsMod.ClientConfiguration] = js.native
  var eks: js.UndefOr[typings.awsSdk.eksMod.ClientConfiguration] = js.native
  var elasticache: js.UndefOr[typings.awsSdk.elasticacheMod.ClientConfiguration] = js.native
  var elasticbeanstalk: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ClientConfiguration] = js.native
  var elasticinference: js.UndefOr[typings.awsSdk.elasticinferenceMod.ClientConfiguration] = js.native
  var elastictranscoder: js.UndefOr[typings.awsSdk.elastictranscoderMod.ClientConfiguration] = js.native
  var elb: js.UndefOr[typings.awsSdk.elbMod.ClientConfiguration] = js.native
  var elbv2: js.UndefOr[typings.awsSdk.elbv2Mod.ClientConfiguration] = js.native
  var emr: js.UndefOr[typings.awsSdk.emrMod.ClientConfiguration] = js.native
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.native
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
  var es: js.UndefOr[typings.awsSdk.esMod.ClientConfiguration] = js.native
  var eventbridge: js.UndefOr[typings.awsSdk.eventbridgeMod.ClientConfiguration] = js.native
  var firehose: js.UndefOr[typings.awsSdk.firehoseMod.ClientConfiguration] = js.native
  var fms: js.UndefOr[typings.awsSdk.fmsMod.ClientConfiguration] = js.native
  var forecastqueryservice: js.UndefOr[typings.awsSdk.forecastqueryserviceMod.ClientConfiguration] = js.native
  var forecastservice: js.UndefOr[typings.awsSdk.forecastserviceMod.ClientConfiguration] = js.native
  var frauddetector: js.UndefOr[typings.awsSdk.frauddetectorMod.ClientConfiguration] = js.native
  var fsx: js.UndefOr[typings.awsSdk.fsxMod.ClientConfiguration] = js.native
  var gamelift: js.UndefOr[typings.awsSdk.gameliftMod.ClientConfiguration] = js.native
  var glacier: js.UndefOr[typings.awsSdk.glacierMod.ClientConfiguration] = js.native
  var globalaccelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.ClientConfiguration] = js.native
  var glue: js.UndefOr[typings.awsSdk.glueMod.ClientConfiguration] = js.native
  var greengrass: js.UndefOr[typings.awsSdk.greengrassMod.ClientConfiguration] = js.native
  var groundstation: js.UndefOr[typings.awsSdk.groundstationMod.ClientConfiguration] = js.native
  var guardduty: js.UndefOr[typings.awsSdk.guarddutyMod.ClientConfiguration] = js.native
  var health: js.UndefOr[typings.awsSdk.healthMod.ClientConfiguration] = js.native
  var honeycode: js.UndefOr[typings.awsSdk.honeycodeMod.ClientConfiguration] = js.native
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  var iam: js.UndefOr[typings.awsSdk.iamMod.ClientConfiguration] = js.native
  var imagebuilder: js.UndefOr[typings.awsSdk.imagebuilderMod.ClientConfiguration] = js.native
  var importexport: js.UndefOr[typings.awsSdk.importexportMod.ClientConfiguration] = js.native
  var inspector: js.UndefOr[typings.awsSdk.inspectorMod.ClientConfiguration] = js.native
  var iot: js.UndefOr[typings.awsSdk.iotMod.ClientConfiguration] = js.native
  var iot1clickdevicesservice: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration] = js.native
  var iot1clickprojects: js.UndefOr[typings.awsSdk.iot1clickprojectsMod.ClientConfiguration] = js.native
  var iotanalytics: js.UndefOr[typings.awsSdk.iotanalyticsMod.ClientConfiguration] = js.native
  var iotdata: js.UndefOr[typings.awsSdk.iotdataMod.ClientConfiguration] = js.native
  var iotevents: js.UndefOr[typings.awsSdk.ioteventsMod.ClientConfiguration] = js.native
  var ioteventsdata: js.UndefOr[typings.awsSdk.ioteventsdataMod.ClientConfiguration] = js.native
  var iotjobsdataplane: js.UndefOr[typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration] = js.native
  var iotsecuretunneling: js.UndefOr[typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration] = js.native
  var iotsitewise: js.UndefOr[typings.awsSdk.iotsitewiseMod.ClientConfiguration] = js.native
  var iotthingsgraph: js.UndefOr[typings.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.native
  var kafka: js.UndefOr[typings.awsSdk.kafkaMod.ClientConfiguration] = js.native
  var kendra: js.UndefOr[typings.awsSdk.kendraMod.ClientConfiguration] = js.native
  var kinesis: js.UndefOr[typings.awsSdk.kinesisMod.ClientConfiguration] = js.native
  var kinesisanalytics: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ClientConfiguration] = js.native
  var kinesisanalyticsv2: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration] = js.native
  var kinesisvideo: js.UndefOr[typings.awsSdk.kinesisvideoMod.ClientConfiguration] = js.native
  var kinesisvideoarchivedmedia: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration] = js.native
  var kinesisvideomedia: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.ClientConfiguration] = js.native
  var kinesisvideosignalingchannels: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration] = js.native
  var kms: js.UndefOr[typings.awsSdk.kmsMod.ClientConfiguration] = js.native
  var lakeformation: js.UndefOr[typings.awsSdk.lakeformationMod.ClientConfiguration] = js.native
  var lambda: js.UndefOr[typings.awsSdk.lambdaMod.ClientConfiguration] = js.native
  var lexmodelbuildingservice: js.UndefOr[typings.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration] = js.native
  var lexruntime: js.UndefOr[typings.awsSdk.lexruntimeMod.ClientConfiguration] = js.native
  var licensemanager: js.UndefOr[typings.awsSdk.licensemanagerMod.ClientConfiguration] = js.native
  var lightsail: js.UndefOr[typings.awsSdk.lightsailMod.ClientConfiguration] = js.native
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.native
  var machinelearning: js.UndefOr[typings.awsSdk.machinelearningMod.ClientConfiguration] = js.native
  var macie: js.UndefOr[typings.awsSdk.macieMod.ClientConfiguration] = js.native
  var macie2: js.UndefOr[typings.awsSdk.macie2Mod.ClientConfiguration] = js.native
  var managedblockchain: js.UndefOr[typings.awsSdk.managedblockchainMod.ClientConfiguration] = js.native
  var marketplacecatalog: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ClientConfiguration] = js.native
  var marketplacecommerceanalytics: js.UndefOr[typings.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration] = js.native
  var marketplaceentitlementservice: js.UndefOr[typings.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration] = js.native
  var marketplacemetering: js.UndefOr[typings.awsSdk.marketplacemeteringMod.ClientConfiguration] = js.native
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  var mediaconnect: js.UndefOr[typings.awsSdk.mediaconnectMod.ClientConfiguration] = js.native
  var mediaconvert: js.UndefOr[typings.awsSdk.mediaconvertMod.ClientConfiguration] = js.native
  var medialive: js.UndefOr[typings.awsSdk.medialiveMod.ClientConfiguration] = js.native
  var mediapackage: js.UndefOr[typings.awsSdk.mediapackageMod.ClientConfiguration] = js.native
  var mediapackagevod: js.UndefOr[typings.awsSdk.mediapackagevodMod.ClientConfiguration] = js.native
  var mediastore: js.UndefOr[typings.awsSdk.mediastoreMod.ClientConfiguration] = js.native
  var mediastoredata: js.UndefOr[typings.awsSdk.mediastoredataMod.ClientConfiguration] = js.native
  var mediatailor: js.UndefOr[typings.awsSdk.mediatailorMod.ClientConfiguration] = js.native
  var migrationhub: js.UndefOr[typings.awsSdk.migrationhubMod.ClientConfiguration] = js.native
  var migrationhubconfig: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ClientConfiguration] = js.native
  var mobile: js.UndefOr[typings.awsSdk.mobileMod.ClientConfiguration] = js.native
  var mobileanalytics: js.UndefOr[typings.awsSdk.mobileanalyticsMod.ClientConfiguration] = js.native
  var mq: js.UndefOr[typings.awsSdk.mqMod.ClientConfiguration] = js.native
  var mturk: js.UndefOr[typings.awsSdk.mturkMod.ClientConfiguration] = js.native
  var neptune: js.UndefOr[typings.awsSdk.neptuneMod.ClientConfiguration] = js.native
  var networkmanager: js.UndefOr[typings.awsSdk.networkmanagerMod.ClientConfiguration] = js.native
  var opsworks: js.UndefOr[typings.awsSdk.opsworksMod.ClientConfiguration] = js.native
  var opsworkscm: js.UndefOr[typings.awsSdk.opsworkscmMod.ClientConfiguration] = js.native
  var organizations: js.UndefOr[typings.awsSdk.organizationsMod.ClientConfiguration] = js.native
  var outposts: js.UndefOr[typings.awsSdk.outpostsMod.ClientConfiguration] = js.native
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.native
  var personalize: js.UndefOr[typings.awsSdk.personalizeMod.ClientConfiguration] = js.native
  var personalizeevents: js.UndefOr[typings.awsSdk.personalizeeventsMod.ClientConfiguration] = js.native
  var personalizeruntime: js.UndefOr[typings.awsSdk.personalizeruntimeMod.ClientConfiguration] = js.native
  var pi: js.UndefOr[typings.awsSdk.piMod.ClientConfiguration] = js.native
  var pinpoint: js.UndefOr[typings.awsSdk.pinpointMod.ClientConfiguration] = js.native
  var pinpointemail: js.UndefOr[typings.awsSdk.pinpointemailMod.ClientConfiguration] = js.native
  var pinpointsmsvoice: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.ClientConfiguration] = js.native
  var polly: js.UndefOr[typings.awsSdk.pollyMod.ClientConfiguration] = js.native
  var pricing: js.UndefOr[typings.awsSdk.pricingMod.ClientConfiguration] = js.native
  var qldb: js.UndefOr[typings.awsSdk.qldbMod.ClientConfiguration] = js.native
  var qldbsession: js.UndefOr[typings.awsSdk.qldbsessionMod.ClientConfiguration] = js.native
  var quicksight: js.UndefOr[typings.awsSdk.quicksightMod.ClientConfiguration] = js.native
  var ram: js.UndefOr[typings.awsSdk.ramMod.ClientConfiguration] = js.native
  var rds: js.UndefOr[typings.awsSdk.rdsMod.ClientConfiguration] = js.native
  var rdsdataservice: js.UndefOr[typings.awsSdk.rdsdataserviceMod.ClientConfiguration] = js.native
  var redshift: js.UndefOr[typings.awsSdk.redshiftMod.ClientConfiguration] = js.native
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.native
  var rekognition: js.UndefOr[typings.awsSdk.rekognitionMod.ClientConfiguration] = js.native
  var resourcegroups: js.UndefOr[typings.awsSdk.resourcegroupsMod.ClientConfiguration] = js.native
  var resourcegroupstaggingapi: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration] = js.native
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
  var robomaker: js.UndefOr[typings.awsSdk.robomakerMod.ClientConfiguration] = js.native
  var route53: js.UndefOr[typings.awsSdk.route53Mod.ClientConfiguration] = js.native
  var route53domains: js.UndefOr[typings.awsSdk.route53domainsMod.ClientConfiguration] = js.native
  var route53resolver: js.UndefOr[typings.awsSdk.route53resolverMod.ClientConfiguration] = js.native
  var s3: js.UndefOr[typings.awsSdk.s3Mod.ClientConfiguration] = js.native
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.native
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  /**
    * When region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
  /**
    * Whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.native
  var s3control: js.UndefOr[typings.awsSdk.s3controlMod.ClientConfiguration] = js.native
  var sagemaker: js.UndefOr[typings.awsSdk.sagemakerMod.ClientConfiguration] = js.native
  var sagemakerruntime: js.UndefOr[typings.awsSdk.sagemakerruntimeMod.ClientConfiguration] = js.native
  var savingsplans: js.UndefOr[typings.awsSdk.savingsplansMod.ClientConfiguration] = js.native
  var schemas: js.UndefOr[typings.awsSdk.schemasMod.ClientConfiguration] = js.native
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.native
  var secretsmanager: js.UndefOr[typings.awsSdk.secretsmanagerMod.ClientConfiguration] = js.native
  var securityhub: js.UndefOr[typings.awsSdk.securityhubMod.ClientConfiguration] = js.native
  var serverlessapplicationrepository: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration] = js.native
  var servicecatalog: js.UndefOr[typings.awsSdk.servicecatalogMod.ClientConfiguration] = js.native
  var servicediscovery: js.UndefOr[typings.awsSdk.servicediscoveryMod.ClientConfiguration] = js.native
  var servicequotas: js.UndefOr[typings.awsSdk.servicequotasMod.ClientConfiguration] = js.native
  var ses: js.UndefOr[typings.awsSdk.sesMod.ClientConfiguration] = js.native
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.native
  var sesv2: js.UndefOr[typings.awsSdk.sesv2Mod.ClientConfiguration] = js.native
  var shield: js.UndefOr[typings.awsSdk.shieldMod.ClientConfiguration] = js.native
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.native
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.native
  var signer: js.UndefOr[typings.awsSdk.signerMod.ClientConfiguration] = js.native
  var simpledb: js.UndefOr[typings.awsSdk.simpledbMod.ClientConfiguration] = js.native
  var sms: js.UndefOr[typings.awsSdk.smsMod.ClientConfiguration] = js.native
  var snowball: js.UndefOr[typings.awsSdk.snowballMod.ClientConfiguration] = js.native
  var sns: js.UndefOr[typings.awsSdk.snsMod.ClientConfiguration] = js.native
  var sqs: js.UndefOr[typings.awsSdk.sqsMod.ClientConfiguration] = js.native
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
  var ssm: js.UndefOr[typings.awsSdk.ssmMod.ClientConfiguration] = js.native
  var sso: js.UndefOr[typings.awsSdk.ssoMod.ClientConfiguration] = js.native
  var ssooidc: js.UndefOr[typings.awsSdk.ssooidcMod.ClientConfiguration] = js.native
  var stepfunctions: js.UndefOr[typings.awsSdk.stepfunctionsMod.ClientConfiguration] = js.native
  var storagegateway: js.UndefOr[typings.awsSdk.storagegatewayMod.ClientConfiguration] = js.native
  var sts: js.UndefOr[typings.awsSdk.stsMod.ClientConfiguration] = js.native
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.native
  var support: js.UndefOr[typings.awsSdk.supportMod.ClientConfiguration] = js.native
  var swf: js.UndefOr[typings.awsSdk.swfMod.ClientConfiguration] = js.native
  var synthetics: js.UndefOr[typings.awsSdk.syntheticsMod.ClientConfiguration] = js.native
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.native
  var textract: js.UndefOr[typings.awsSdk.textractMod.ClientConfiguration] = js.native
  var transcribeservice: js.UndefOr[typings.awsSdk.transcribeserviceMod.ClientConfiguration] = js.native
  var transfer: js.UndefOr[typings.awsSdk.transferMod.ClientConfiguration] = js.native
  var translate: js.UndefOr[typings.awsSdk.translateMod.ClientConfiguration] = js.native
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  var waf: js.UndefOr[typings.awsSdk.wafMod.ClientConfiguration] = js.native
  var wafregional: js.UndefOr[typings.awsSdk.wafregionalMod.ClientConfiguration] = js.native
  var wafv2: js.UndefOr[typings.awsSdk.wafv2Mod.ClientConfiguration] = js.native
  var workdocs: js.UndefOr[typings.awsSdk.workdocsMod.ClientConfiguration] = js.native
  var worklink: js.UndefOr[typings.awsSdk.worklinkMod.ClientConfiguration] = js.native
  var workmail: js.UndefOr[typings.awsSdk.workmailMod.ClientConfiguration] = js.native
  var workmailmessageflow: js.UndefOr[typings.awsSdk.workmailmessageflowMod.ClientConfiguration] = js.native
  var workspaces: js.UndefOr[typings.awsSdk.workspacesMod.ClientConfiguration] = js.native
  var xray: js.UndefOr[typings.awsSdk.xrayMod.ClientConfiguration] = js.native
}

object ConfigurationOptionsConfi {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    accessKeyId: String = null,
    accessanalyzer: ClientConfiguration = null,
    acm: typings.awsSdk.acmMod.ClientConfiguration = null,
    acmpca: typings.awsSdk.acmpcaMod.ClientConfiguration = null,
    alexaforbusiness: typings.awsSdk.alexaforbusinessMod.ClientConfiguration = null,
    amplify: typings.awsSdk.amplifyMod.ClientConfiguration = null,
    apiVersion: latest_ | String = null,
    apiVersions: ConfigurationServiceApiVersions = null,
    apigateway: typings.awsSdk.apigatewayMod.ClientConfiguration = null,
    apigatewaymanagementapi: typings.awsSdk.apigatewaymanagementapiMod.ClientConfiguration = null,
    apigatewayv2: typings.awsSdk.apigatewayv2Mod.ClientConfiguration = null,
    appconfig: typings.awsSdk.appconfigMod.ClientConfiguration = null,
    applicationautoscaling: typings.awsSdk.applicationautoscalingMod.ClientConfiguration = null,
    applicationinsights: typings.awsSdk.applicationinsightsMod.ClientConfiguration = null,
    appmesh: typings.awsSdk.appmeshMod.ClientConfiguration = null,
    appstream: typings.awsSdk.appstreamMod.ClientConfiguration = null,
    appsync: typings.awsSdk.appsyncMod.ClientConfiguration = null,
    athena: typings.awsSdk.athenaMod.ClientConfiguration = null,
    augmentedairuntime: typings.awsSdk.augmentedairuntimeMod.ClientConfiguration = null,
    autoscaling: typings.awsSdk.autoscalingMod.ClientConfiguration = null,
    autoscalingplans: typings.awsSdk.autoscalingplansMod.ClientConfiguration = null,
    backup: typings.awsSdk.backupMod.ClientConfiguration = null,
    batch: typings.awsSdk.batchMod.ClientConfiguration = null,
    budgets: typings.awsSdk.budgetsMod.ClientConfiguration = null,
    chime: typings.awsSdk.chimeMod.ClientConfiguration = null,
    cloud9: typings.awsSdk.cloud9Mod.ClientConfiguration = null,
    clouddirectory: typings.awsSdk.clouddirectoryMod.ClientConfiguration = null,
    cloudformation: typings.awsSdk.cloudformationMod.ClientConfiguration = null,
    cloudfront: typings.awsSdk.cloudfrontMod.ClientConfiguration = null,
    cloudhsm: typings.awsSdk.cloudhsmMod.ClientConfiguration = null,
    cloudhsmv2: typings.awsSdk.cloudhsmv2Mod.ClientConfiguration = null,
    cloudsearch: typings.awsSdk.cloudsearchMod.ClientConfiguration = null,
    cloudsearchdomain: typings.awsSdk.cloudsearchdomainMod.ClientConfiguration = null,
    cloudtrail: typings.awsSdk.cloudtrailMod.ClientConfiguration = null,
    cloudwatch: typings.awsSdk.cloudwatchMod.ClientConfiguration = null,
    cloudwatchevents: typings.awsSdk.cloudwatcheventsMod.ClientConfiguration = null,
    cloudwatchlogs: typings.awsSdk.cloudwatchlogsMod.ClientConfiguration = null,
    codeartifact: typings.awsSdk.codeartifactMod.ClientConfiguration = null,
    codebuild: typings.awsSdk.codebuildMod.ClientConfiguration = null,
    codecommit: typings.awsSdk.codecommitMod.ClientConfiguration = null,
    codedeploy: typings.awsSdk.codedeployMod.ClientConfiguration = null,
    codeguruprofiler: typings.awsSdk.codeguruprofilerMod.ClientConfiguration = null,
    codegurureviewer: typings.awsSdk.codegurureviewerMod.ClientConfiguration = null,
    codepipeline: typings.awsSdk.codepipelineMod.ClientConfiguration = null,
    codestar: typings.awsSdk.codestarMod.ClientConfiguration = null,
    codestarconnections: typings.awsSdk.codestarconnectionsMod.ClientConfiguration = null,
    codestarnotifications: typings.awsSdk.codestarnotificationsMod.ClientConfiguration = null,
    cognitoidentity: typings.awsSdk.cognitoidentityMod.ClientConfiguration = null,
    cognitoidentityserviceprovider: typings.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration = null,
    cognitosync: typings.awsSdk.cognitosyncMod.ClientConfiguration = null,
    comprehend: typings.awsSdk.comprehendMod.ClientConfiguration = null,
    comprehendmedical: typings.awsSdk.comprehendmedicalMod.ClientConfiguration = null,
    computeChecksums: js.UndefOr[Boolean] = js.undefined,
    computeoptimizer: typings.awsSdk.computeoptimizerMod.ClientConfiguration = null,
    configservice: typings.awsSdk.configserviceMod.ClientConfiguration = null,
    connect: typings.awsSdk.connectMod.ClientConfiguration = null,
    connectparticipant: typings.awsSdk.connectparticipantMod.ClientConfiguration = null,
    convertResponseTypes: js.UndefOr[Boolean] = js.undefined,
    correctClockSkew: js.UndefOr[Boolean] = js.undefined,
    costexplorer: typings.awsSdk.costexplorerMod.ClientConfiguration = null,
    credentialProvider: CredentialProviderChain = null,
    credentials: js.UndefOr[Null | Credentials | CredentialsOptions] = js.undefined,
    cur: typings.awsSdk.curMod.ClientConfiguration = null,
    customUserAgent: String = null,
    dataexchange: typings.awsSdk.dataexchangeMod.ClientConfiguration = null,
    datapipeline: typings.awsSdk.datapipelineMod.ClientConfiguration = null,
    datasync: typings.awsSdk.datasyncMod.ClientConfiguration = null,
    dax: typings.awsSdk.daxMod.ClientConfiguration = null,
    detective: typings.awsSdk.detectiveMod.ClientConfiguration = null,
    devicefarm: typings.awsSdk.devicefarmMod.ClientConfiguration = null,
    directconnect: typings.awsSdk.directconnectMod.ClientConfiguration = null,
    directoryservice: typings.awsSdk.directoryserviceMod.ClientConfiguration = null,
    discovery: typings.awsSdk.discoveryMod.ClientConfiguration = null,
    dlm: typings.awsSdk.dlmMod.ClientConfiguration = null,
    dms: typings.awsSdk.dmsMod.ClientConfiguration = null,
    docdb: typings.awsSdk.docdbMod.ClientConfiguration = null,
    dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined,
    dynamodb: typings.awsSdk.dynamodbMod.ClientConfiguration = null,
    dynamodbstreams: typings.awsSdk.dynamodbstreamsMod.ClientConfiguration = null,
    ebs: typings.awsSdk.ebsMod.ClientConfiguration = null,
    ec2: typings.awsSdk.ec2Mod.ClientConfiguration = null,
    ec2instanceconnect: typings.awsSdk.ec2instanceconnectMod.ClientConfiguration = null,
    ecr: typings.awsSdk.ecrMod.ClientConfiguration = null,
    ecs: typings.awsSdk.ecsMod.ClientConfiguration = null,
    efs: typings.awsSdk.efsMod.ClientConfiguration = null,
    eks: typings.awsSdk.eksMod.ClientConfiguration = null,
    elasticache: typings.awsSdk.elasticacheMod.ClientConfiguration = null,
    elasticbeanstalk: typings.awsSdk.elasticbeanstalkMod.ClientConfiguration = null,
    elasticinference: typings.awsSdk.elasticinferenceMod.ClientConfiguration = null,
    elastictranscoder: typings.awsSdk.elastictranscoderMod.ClientConfiguration = null,
    elb: typings.awsSdk.elbMod.ClientConfiguration = null,
    elbv2: typings.awsSdk.elbv2Mod.ClientConfiguration = null,
    emr: typings.awsSdk.emrMod.ClientConfiguration = null,
    endpointCacheSize: js.UndefOr[Double] = js.undefined,
    endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined,
    es: typings.awsSdk.esMod.ClientConfiguration = null,
    eventbridge: typings.awsSdk.eventbridgeMod.ClientConfiguration = null,
    firehose: typings.awsSdk.firehoseMod.ClientConfiguration = null,
    fms: typings.awsSdk.fmsMod.ClientConfiguration = null,
    forecastqueryservice: typings.awsSdk.forecastqueryserviceMod.ClientConfiguration = null,
    forecastservice: typings.awsSdk.forecastserviceMod.ClientConfiguration = null,
    frauddetector: typings.awsSdk.frauddetectorMod.ClientConfiguration = null,
    fsx: typings.awsSdk.fsxMod.ClientConfiguration = null,
    gamelift: typings.awsSdk.gameliftMod.ClientConfiguration = null,
    glacier: typings.awsSdk.glacierMod.ClientConfiguration = null,
    globalaccelerator: typings.awsSdk.globalacceleratorMod.ClientConfiguration = null,
    glue: typings.awsSdk.glueMod.ClientConfiguration = null,
    greengrass: typings.awsSdk.greengrassMod.ClientConfiguration = null,
    groundstation: typings.awsSdk.groundstationMod.ClientConfiguration = null,
    guardduty: typings.awsSdk.guarddutyMod.ClientConfiguration = null,
    health: typings.awsSdk.healthMod.ClientConfiguration = null,
    honeycode: typings.awsSdk.honeycodeMod.ClientConfiguration = null,
    hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
    httpOptions: HTTPOptions = null,
    iam: typings.awsSdk.iamMod.ClientConfiguration = null,
    imagebuilder: typings.awsSdk.imagebuilderMod.ClientConfiguration = null,
    importexport: typings.awsSdk.importexportMod.ClientConfiguration = null,
    inspector: typings.awsSdk.inspectorMod.ClientConfiguration = null,
    iot: typings.awsSdk.iotMod.ClientConfiguration = null,
    iot1clickdevicesservice: typings.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration = null,
    iot1clickprojects: typings.awsSdk.iot1clickprojectsMod.ClientConfiguration = null,
    iotanalytics: typings.awsSdk.iotanalyticsMod.ClientConfiguration = null,
    iotdata: typings.awsSdk.iotdataMod.ClientConfiguration = null,
    iotevents: typings.awsSdk.ioteventsMod.ClientConfiguration = null,
    ioteventsdata: typings.awsSdk.ioteventsdataMod.ClientConfiguration = null,
    iotjobsdataplane: typings.awsSdk.iotjobsdataplaneMod.ClientConfiguration = null,
    iotsecuretunneling: typings.awsSdk.iotsecuretunnelingMod.ClientConfiguration = null,
    iotsitewise: typings.awsSdk.iotsitewiseMod.ClientConfiguration = null,
    iotthingsgraph: typings.awsSdk.iotthingsgraphMod.ClientConfiguration = null,
    kafka: typings.awsSdk.kafkaMod.ClientConfiguration = null,
    kendra: typings.awsSdk.kendraMod.ClientConfiguration = null,
    kinesis: typings.awsSdk.kinesisMod.ClientConfiguration = null,
    kinesisanalytics: typings.awsSdk.kinesisanalyticsMod.ClientConfiguration = null,
    kinesisanalyticsv2: typings.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration = null,
    kinesisvideo: typings.awsSdk.kinesisvideoMod.ClientConfiguration = null,
    kinesisvideoarchivedmedia: typings.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration = null,
    kinesisvideomedia: typings.awsSdk.kinesisvideomediaMod.ClientConfiguration = null,
    kinesisvideosignalingchannels: typings.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration = null,
    kms: typings.awsSdk.kmsMod.ClientConfiguration = null,
    lakeformation: typings.awsSdk.lakeformationMod.ClientConfiguration = null,
    lambda: typings.awsSdk.lambdaMod.ClientConfiguration = null,
    lexmodelbuildingservice: typings.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration = null,
    lexruntime: typings.awsSdk.lexruntimeMod.ClientConfiguration = null,
    licensemanager: typings.awsSdk.licensemanagerMod.ClientConfiguration = null,
    lightsail: typings.awsSdk.lightsailMod.ClientConfiguration = null,
    logger: Logger = null,
    machinelearning: typings.awsSdk.machinelearningMod.ClientConfiguration = null,
    macie: typings.awsSdk.macieMod.ClientConfiguration = null,
    macie2: typings.awsSdk.macie2Mod.ClientConfiguration = null,
    managedblockchain: typings.awsSdk.managedblockchainMod.ClientConfiguration = null,
    marketplacecatalog: typings.awsSdk.marketplacecatalogMod.ClientConfiguration = null,
    marketplacecommerceanalytics: typings.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration = null,
    marketplaceentitlementservice: typings.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration = null,
    marketplacemetering: typings.awsSdk.marketplacemeteringMod.ClientConfiguration = null,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    mediaconnect: typings.awsSdk.mediaconnectMod.ClientConfiguration = null,
    mediaconvert: typings.awsSdk.mediaconvertMod.ClientConfiguration = null,
    medialive: typings.awsSdk.medialiveMod.ClientConfiguration = null,
    mediapackage: typings.awsSdk.mediapackageMod.ClientConfiguration = null,
    mediapackagevod: typings.awsSdk.mediapackagevodMod.ClientConfiguration = null,
    mediastore: typings.awsSdk.mediastoreMod.ClientConfiguration = null,
    mediastoredata: typings.awsSdk.mediastoredataMod.ClientConfiguration = null,
    mediatailor: typings.awsSdk.mediatailorMod.ClientConfiguration = null,
    migrationhub: typings.awsSdk.migrationhubMod.ClientConfiguration = null,
    migrationhubconfig: typings.awsSdk.migrationhubconfigMod.ClientConfiguration = null,
    mobile: typings.awsSdk.mobileMod.ClientConfiguration = null,
    mobileanalytics: typings.awsSdk.mobileanalyticsMod.ClientConfiguration = null,
    mq: typings.awsSdk.mqMod.ClientConfiguration = null,
    mturk: typings.awsSdk.mturkMod.ClientConfiguration = null,
    neptune: typings.awsSdk.neptuneMod.ClientConfiguration = null,
    networkmanager: typings.awsSdk.networkmanagerMod.ClientConfiguration = null,
    opsworks: typings.awsSdk.opsworksMod.ClientConfiguration = null,
    opsworkscm: typings.awsSdk.opsworkscmMod.ClientConfiguration = null,
    organizations: typings.awsSdk.organizationsMod.ClientConfiguration = null,
    outposts: typings.awsSdk.outpostsMod.ClientConfiguration = null,
    paramValidation: ParamValidation | Boolean = null,
    personalize: typings.awsSdk.personalizeMod.ClientConfiguration = null,
    personalizeevents: typings.awsSdk.personalizeeventsMod.ClientConfiguration = null,
    personalizeruntime: typings.awsSdk.personalizeruntimeMod.ClientConfiguration = null,
    pi: typings.awsSdk.piMod.ClientConfiguration = null,
    pinpoint: typings.awsSdk.pinpointMod.ClientConfiguration = null,
    pinpointemail: typings.awsSdk.pinpointemailMod.ClientConfiguration = null,
    pinpointsmsvoice: typings.awsSdk.pinpointsmsvoiceMod.ClientConfiguration = null,
    polly: typings.awsSdk.pollyMod.ClientConfiguration = null,
    pricing: typings.awsSdk.pricingMod.ClientConfiguration = null,
    qldb: typings.awsSdk.qldbMod.ClientConfiguration = null,
    qldbsession: typings.awsSdk.qldbsessionMod.ClientConfiguration = null,
    quicksight: typings.awsSdk.quicksightMod.ClientConfiguration = null,
    ram: typings.awsSdk.ramMod.ClientConfiguration = null,
    rds: typings.awsSdk.rdsMod.ClientConfiguration = null,
    rdsdataservice: typings.awsSdk.rdsdataserviceMod.ClientConfiguration = null,
    redshift: typings.awsSdk.redshiftMod.ClientConfiguration = null,
    region: String = null,
    rekognition: typings.awsSdk.rekognitionMod.ClientConfiguration = null,
    resourcegroups: typings.awsSdk.resourcegroupsMod.ClientConfiguration = null,
    resourcegroupstaggingapi: typings.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration = null,
    retryDelayOptions: RetryDelayOptions = null,
    robomaker: typings.awsSdk.robomakerMod.ClientConfiguration = null,
    route53: typings.awsSdk.route53Mod.ClientConfiguration = null,
    route53domains: typings.awsSdk.route53domainsMod.ClientConfiguration = null,
    route53resolver: typings.awsSdk.route53resolverMod.ClientConfiguration = null,
    s3: typings.awsSdk.s3Mod.ClientConfiguration = null,
    s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined,
    s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
    s3UsEast1RegionalEndpoint: regional_ | legacy_ = null,
    s3UseArnRegion: js.UndefOr[Boolean] = js.undefined,
    s3control: typings.awsSdk.s3controlMod.ClientConfiguration = null,
    sagemaker: typings.awsSdk.sagemakerMod.ClientConfiguration = null,
    sagemakerruntime: typings.awsSdk.sagemakerruntimeMod.ClientConfiguration = null,
    savingsplans: typings.awsSdk.savingsplansMod.ClientConfiguration = null,
    schemas: typings.awsSdk.schemasMod.ClientConfiguration = null,
    secretAccessKey: String = null,
    secretsmanager: typings.awsSdk.secretsmanagerMod.ClientConfiguration = null,
    securityhub: typings.awsSdk.securityhubMod.ClientConfiguration = null,
    serverlessapplicationrepository: typings.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration = null,
    servicecatalog: typings.awsSdk.servicecatalogMod.ClientConfiguration = null,
    servicediscovery: typings.awsSdk.servicediscoveryMod.ClientConfiguration = null,
    servicequotas: typings.awsSdk.servicequotasMod.ClientConfiguration = null,
    ses: typings.awsSdk.sesMod.ClientConfiguration = null,
    sessionToken: String = null,
    sesv2: typings.awsSdk.sesv2Mod.ClientConfiguration = null,
    shield: typings.awsSdk.shieldMod.ClientConfiguration = null,
    signatureCache: js.UndefOr[Boolean] = js.undefined,
    signatureVersion: v2_ | v3 | v4 | String = null,
    signer: typings.awsSdk.signerMod.ClientConfiguration = null,
    simpledb: typings.awsSdk.simpledbMod.ClientConfiguration = null,
    sms: typings.awsSdk.smsMod.ClientConfiguration = null,
    snowball: typings.awsSdk.snowballMod.ClientConfiguration = null,
    sns: typings.awsSdk.snsMod.ClientConfiguration = null,
    sqs: typings.awsSdk.sqsMod.ClientConfiguration = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    ssm: typings.awsSdk.ssmMod.ClientConfiguration = null,
    sso: typings.awsSdk.ssoMod.ClientConfiguration = null,
    ssooidc: typings.awsSdk.ssooidcMod.ClientConfiguration = null,
    stepfunctions: typings.awsSdk.stepfunctionsMod.ClientConfiguration = null,
    storagegateway: typings.awsSdk.storagegatewayMod.ClientConfiguration = null,
    sts: typings.awsSdk.stsMod.ClientConfiguration = null,
    stsRegionalEndpoints: legacy_ | regional_ = null,
    support: typings.awsSdk.supportMod.ClientConfiguration = null,
    swf: typings.awsSdk.swfMod.ClientConfiguration = null,
    synthetics: typings.awsSdk.syntheticsMod.ClientConfiguration = null,
    systemClockOffset: js.UndefOr[Double] = js.undefined,
    textract: typings.awsSdk.textractMod.ClientConfiguration = null,
    transcribeservice: typings.awsSdk.transcribeserviceMod.ClientConfiguration = null,
    transfer: typings.awsSdk.transferMod.ClientConfiguration = null,
    translate: typings.awsSdk.translateMod.ClientConfiguration = null,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    waf: typings.awsSdk.wafMod.ClientConfiguration = null,
    wafregional: typings.awsSdk.wafregionalMod.ClientConfiguration = null,
    wafv2: typings.awsSdk.wafv2Mod.ClientConfiguration = null,
    workdocs: typings.awsSdk.workdocsMod.ClientConfiguration = null
  ): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (accessanalyzer != null) __obj.updateDynamic("accessanalyzer")(accessanalyzer.asInstanceOf[js.Any])
    if (acm != null) __obj.updateDynamic("acm")(acm.asInstanceOf[js.Any])
    if (acmpca != null) __obj.updateDynamic("acmpca")(acmpca.asInstanceOf[js.Any])
    if (alexaforbusiness != null) __obj.updateDynamic("alexaforbusiness")(alexaforbusiness.asInstanceOf[js.Any])
    if (amplify != null) __obj.updateDynamic("amplify")(amplify.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions.asInstanceOf[js.Any])
    if (apigateway != null) __obj.updateDynamic("apigateway")(apigateway.asInstanceOf[js.Any])
    if (apigatewaymanagementapi != null) __obj.updateDynamic("apigatewaymanagementapi")(apigatewaymanagementapi.asInstanceOf[js.Any])
    if (apigatewayv2 != null) __obj.updateDynamic("apigatewayv2")(apigatewayv2.asInstanceOf[js.Any])
    if (appconfig != null) __obj.updateDynamic("appconfig")(appconfig.asInstanceOf[js.Any])
    if (applicationautoscaling != null) __obj.updateDynamic("applicationautoscaling")(applicationautoscaling.asInstanceOf[js.Any])
    if (applicationinsights != null) __obj.updateDynamic("applicationinsights")(applicationinsights.asInstanceOf[js.Any])
    if (appmesh != null) __obj.updateDynamic("appmesh")(appmesh.asInstanceOf[js.Any])
    if (appstream != null) __obj.updateDynamic("appstream")(appstream.asInstanceOf[js.Any])
    if (appsync != null) __obj.updateDynamic("appsync")(appsync.asInstanceOf[js.Any])
    if (athena != null) __obj.updateDynamic("athena")(athena.asInstanceOf[js.Any])
    if (augmentedairuntime != null) __obj.updateDynamic("augmentedairuntime")(augmentedairuntime.asInstanceOf[js.Any])
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    if (autoscalingplans != null) __obj.updateDynamic("autoscalingplans")(autoscalingplans.asInstanceOf[js.Any])
    if (backup != null) __obj.updateDynamic("backup")(backup.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (budgets != null) __obj.updateDynamic("budgets")(budgets.asInstanceOf[js.Any])
    if (chime != null) __obj.updateDynamic("chime")(chime.asInstanceOf[js.Any])
    if (cloud9 != null) __obj.updateDynamic("cloud9")(cloud9.asInstanceOf[js.Any])
    if (clouddirectory != null) __obj.updateDynamic("clouddirectory")(clouddirectory.asInstanceOf[js.Any])
    if (cloudformation != null) __obj.updateDynamic("cloudformation")(cloudformation.asInstanceOf[js.Any])
    if (cloudfront != null) __obj.updateDynamic("cloudfront")(cloudfront.asInstanceOf[js.Any])
    if (cloudhsm != null) __obj.updateDynamic("cloudhsm")(cloudhsm.asInstanceOf[js.Any])
    if (cloudhsmv2 != null) __obj.updateDynamic("cloudhsmv2")(cloudhsmv2.asInstanceOf[js.Any])
    if (cloudsearch != null) __obj.updateDynamic("cloudsearch")(cloudsearch.asInstanceOf[js.Any])
    if (cloudsearchdomain != null) __obj.updateDynamic("cloudsearchdomain")(cloudsearchdomain.asInstanceOf[js.Any])
    if (cloudtrail != null) __obj.updateDynamic("cloudtrail")(cloudtrail.asInstanceOf[js.Any])
    if (cloudwatch != null) __obj.updateDynamic("cloudwatch")(cloudwatch.asInstanceOf[js.Any])
    if (cloudwatchevents != null) __obj.updateDynamic("cloudwatchevents")(cloudwatchevents.asInstanceOf[js.Any])
    if (cloudwatchlogs != null) __obj.updateDynamic("cloudwatchlogs")(cloudwatchlogs.asInstanceOf[js.Any])
    if (codeartifact != null) __obj.updateDynamic("codeartifact")(codeartifact.asInstanceOf[js.Any])
    if (codebuild != null) __obj.updateDynamic("codebuild")(codebuild.asInstanceOf[js.Any])
    if (codecommit != null) __obj.updateDynamic("codecommit")(codecommit.asInstanceOf[js.Any])
    if (codedeploy != null) __obj.updateDynamic("codedeploy")(codedeploy.asInstanceOf[js.Any])
    if (codeguruprofiler != null) __obj.updateDynamic("codeguruprofiler")(codeguruprofiler.asInstanceOf[js.Any])
    if (codegurureviewer != null) __obj.updateDynamic("codegurureviewer")(codegurureviewer.asInstanceOf[js.Any])
    if (codepipeline != null) __obj.updateDynamic("codepipeline")(codepipeline.asInstanceOf[js.Any])
    if (codestar != null) __obj.updateDynamic("codestar")(codestar.asInstanceOf[js.Any])
    if (codestarconnections != null) __obj.updateDynamic("codestarconnections")(codestarconnections.asInstanceOf[js.Any])
    if (codestarnotifications != null) __obj.updateDynamic("codestarnotifications")(codestarnotifications.asInstanceOf[js.Any])
    if (cognitoidentity != null) __obj.updateDynamic("cognitoidentity")(cognitoidentity.asInstanceOf[js.Any])
    if (cognitoidentityserviceprovider != null) __obj.updateDynamic("cognitoidentityserviceprovider")(cognitoidentityserviceprovider.asInstanceOf[js.Any])
    if (cognitosync != null) __obj.updateDynamic("cognitosync")(cognitosync.asInstanceOf[js.Any])
    if (comprehend != null) __obj.updateDynamic("comprehend")(comprehend.asInstanceOf[js.Any])
    if (comprehendmedical != null) __obj.updateDynamic("comprehendmedical")(comprehendmedical.asInstanceOf[js.Any])
    if (!js.isUndefined(computeChecksums)) __obj.updateDynamic("computeChecksums")(computeChecksums.get.asInstanceOf[js.Any])
    if (computeoptimizer != null) __obj.updateDynamic("computeoptimizer")(computeoptimizer.asInstanceOf[js.Any])
    if (configservice != null) __obj.updateDynamic("configservice")(configservice.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (connectparticipant != null) __obj.updateDynamic("connectparticipant")(connectparticipant.asInstanceOf[js.Any])
    if (!js.isUndefined(convertResponseTypes)) __obj.updateDynamic("convertResponseTypes")(convertResponseTypes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(correctClockSkew)) __obj.updateDynamic("correctClockSkew")(correctClockSkew.get.asInstanceOf[js.Any])
    if (costexplorer != null) __obj.updateDynamic("costexplorer")(costexplorer.asInstanceOf[js.Any])
    if (credentialProvider != null) __obj.updateDynamic("credentialProvider")(credentialProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (cur != null) __obj.updateDynamic("cur")(cur.asInstanceOf[js.Any])
    if (customUserAgent != null) __obj.updateDynamic("customUserAgent")(customUserAgent.asInstanceOf[js.Any])
    if (dataexchange != null) __obj.updateDynamic("dataexchange")(dataexchange.asInstanceOf[js.Any])
    if (datapipeline != null) __obj.updateDynamic("datapipeline")(datapipeline.asInstanceOf[js.Any])
    if (datasync != null) __obj.updateDynamic("datasync")(datasync.asInstanceOf[js.Any])
    if (dax != null) __obj.updateDynamic("dax")(dax.asInstanceOf[js.Any])
    if (detective != null) __obj.updateDynamic("detective")(detective.asInstanceOf[js.Any])
    if (devicefarm != null) __obj.updateDynamic("devicefarm")(devicefarm.asInstanceOf[js.Any])
    if (directconnect != null) __obj.updateDynamic("directconnect")(directconnect.asInstanceOf[js.Any])
    if (directoryservice != null) __obj.updateDynamic("directoryservice")(directoryservice.asInstanceOf[js.Any])
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    if (dlm != null) __obj.updateDynamic("dlm")(dlm.asInstanceOf[js.Any])
    if (dms != null) __obj.updateDynamic("dms")(dms.asInstanceOf[js.Any])
    if (docdb != null) __obj.updateDynamic("docdb")(docdb.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamoDbCrc32)) __obj.updateDynamic("dynamoDbCrc32")(dynamoDbCrc32.get.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (dynamodbstreams != null) __obj.updateDynamic("dynamodbstreams")(dynamodbstreams.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (ec2 != null) __obj.updateDynamic("ec2")(ec2.asInstanceOf[js.Any])
    if (ec2instanceconnect != null) __obj.updateDynamic("ec2instanceconnect")(ec2instanceconnect.asInstanceOf[js.Any])
    if (ecr != null) __obj.updateDynamic("ecr")(ecr.asInstanceOf[js.Any])
    if (ecs != null) __obj.updateDynamic("ecs")(ecs.asInstanceOf[js.Any])
    if (efs != null) __obj.updateDynamic("efs")(efs.asInstanceOf[js.Any])
    if (eks != null) __obj.updateDynamic("eks")(eks.asInstanceOf[js.Any])
    if (elasticache != null) __obj.updateDynamic("elasticache")(elasticache.asInstanceOf[js.Any])
    if (elasticbeanstalk != null) __obj.updateDynamic("elasticbeanstalk")(elasticbeanstalk.asInstanceOf[js.Any])
    if (elasticinference != null) __obj.updateDynamic("elasticinference")(elasticinference.asInstanceOf[js.Any])
    if (elastictranscoder != null) __obj.updateDynamic("elastictranscoder")(elastictranscoder.asInstanceOf[js.Any])
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    if (elbv2 != null) __obj.updateDynamic("elbv2")(elbv2.asInstanceOf[js.Any])
    if (emr != null) __obj.updateDynamic("emr")(emr.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointCacheSize)) __obj.updateDynamic("endpointCacheSize")(endpointCacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointDiscoveryEnabled)) __obj.updateDynamic("endpointDiscoveryEnabled")(endpointDiscoveryEnabled.get.asInstanceOf[js.Any])
    if (es != null) __obj.updateDynamic("es")(es.asInstanceOf[js.Any])
    if (eventbridge != null) __obj.updateDynamic("eventbridge")(eventbridge.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (fms != null) __obj.updateDynamic("fms")(fms.asInstanceOf[js.Any])
    if (forecastqueryservice != null) __obj.updateDynamic("forecastqueryservice")(forecastqueryservice.asInstanceOf[js.Any])
    if (forecastservice != null) __obj.updateDynamic("forecastservice")(forecastservice.asInstanceOf[js.Any])
    if (frauddetector != null) __obj.updateDynamic("frauddetector")(frauddetector.asInstanceOf[js.Any])
    if (fsx != null) __obj.updateDynamic("fsx")(fsx.asInstanceOf[js.Any])
    if (gamelift != null) __obj.updateDynamic("gamelift")(gamelift.asInstanceOf[js.Any])
    if (glacier != null) __obj.updateDynamic("glacier")(glacier.asInstanceOf[js.Any])
    if (globalaccelerator != null) __obj.updateDynamic("globalaccelerator")(globalaccelerator.asInstanceOf[js.Any])
    if (glue != null) __obj.updateDynamic("glue")(glue.asInstanceOf[js.Any])
    if (greengrass != null) __obj.updateDynamic("greengrass")(greengrass.asInstanceOf[js.Any])
    if (groundstation != null) __obj.updateDynamic("groundstation")(groundstation.asInstanceOf[js.Any])
    if (guardduty != null) __obj.updateDynamic("guardduty")(guardduty.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (honeycode != null) __obj.updateDynamic("honeycode")(honeycode.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPrefixEnabled)) __obj.updateDynamic("hostPrefixEnabled")(hostPrefixEnabled.get.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (iam != null) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    if (imagebuilder != null) __obj.updateDynamic("imagebuilder")(imagebuilder.asInstanceOf[js.Any])
    if (importexport != null) __obj.updateDynamic("importexport")(importexport.asInstanceOf[js.Any])
    if (inspector != null) __obj.updateDynamic("inspector")(inspector.asInstanceOf[js.Any])
    if (iot != null) __obj.updateDynamic("iot")(iot.asInstanceOf[js.Any])
    if (iot1clickdevicesservice != null) __obj.updateDynamic("iot1clickdevicesservice")(iot1clickdevicesservice.asInstanceOf[js.Any])
    if (iot1clickprojects != null) __obj.updateDynamic("iot1clickprojects")(iot1clickprojects.asInstanceOf[js.Any])
    if (iotanalytics != null) __obj.updateDynamic("iotanalytics")(iotanalytics.asInstanceOf[js.Any])
    if (iotdata != null) __obj.updateDynamic("iotdata")(iotdata.asInstanceOf[js.Any])
    if (iotevents != null) __obj.updateDynamic("iotevents")(iotevents.asInstanceOf[js.Any])
    if (ioteventsdata != null) __obj.updateDynamic("ioteventsdata")(ioteventsdata.asInstanceOf[js.Any])
    if (iotjobsdataplane != null) __obj.updateDynamic("iotjobsdataplane")(iotjobsdataplane.asInstanceOf[js.Any])
    if (iotsecuretunneling != null) __obj.updateDynamic("iotsecuretunneling")(iotsecuretunneling.asInstanceOf[js.Any])
    if (iotsitewise != null) __obj.updateDynamic("iotsitewise")(iotsitewise.asInstanceOf[js.Any])
    if (iotthingsgraph != null) __obj.updateDynamic("iotthingsgraph")(iotthingsgraph.asInstanceOf[js.Any])
    if (kafka != null) __obj.updateDynamic("kafka")(kafka.asInstanceOf[js.Any])
    if (kendra != null) __obj.updateDynamic("kendra")(kendra.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (kinesisanalytics != null) __obj.updateDynamic("kinesisanalytics")(kinesisanalytics.asInstanceOf[js.Any])
    if (kinesisanalyticsv2 != null) __obj.updateDynamic("kinesisanalyticsv2")(kinesisanalyticsv2.asInstanceOf[js.Any])
    if (kinesisvideo != null) __obj.updateDynamic("kinesisvideo")(kinesisvideo.asInstanceOf[js.Any])
    if (kinesisvideoarchivedmedia != null) __obj.updateDynamic("kinesisvideoarchivedmedia")(kinesisvideoarchivedmedia.asInstanceOf[js.Any])
    if (kinesisvideomedia != null) __obj.updateDynamic("kinesisvideomedia")(kinesisvideomedia.asInstanceOf[js.Any])
    if (kinesisvideosignalingchannels != null) __obj.updateDynamic("kinesisvideosignalingchannels")(kinesisvideosignalingchannels.asInstanceOf[js.Any])
    if (kms != null) __obj.updateDynamic("kms")(kms.asInstanceOf[js.Any])
    if (lakeformation != null) __obj.updateDynamic("lakeformation")(lakeformation.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (lexmodelbuildingservice != null) __obj.updateDynamic("lexmodelbuildingservice")(lexmodelbuildingservice.asInstanceOf[js.Any])
    if (lexruntime != null) __obj.updateDynamic("lexruntime")(lexruntime.asInstanceOf[js.Any])
    if (licensemanager != null) __obj.updateDynamic("licensemanager")(licensemanager.asInstanceOf[js.Any])
    if (lightsail != null) __obj.updateDynamic("lightsail")(lightsail.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (machinelearning != null) __obj.updateDynamic("machinelearning")(machinelearning.asInstanceOf[js.Any])
    if (macie != null) __obj.updateDynamic("macie")(macie.asInstanceOf[js.Any])
    if (macie2 != null) __obj.updateDynamic("macie2")(macie2.asInstanceOf[js.Any])
    if (managedblockchain != null) __obj.updateDynamic("managedblockchain")(managedblockchain.asInstanceOf[js.Any])
    if (marketplacecatalog != null) __obj.updateDynamic("marketplacecatalog")(marketplacecatalog.asInstanceOf[js.Any])
    if (marketplacecommerceanalytics != null) __obj.updateDynamic("marketplacecommerceanalytics")(marketplacecommerceanalytics.asInstanceOf[js.Any])
    if (marketplaceentitlementservice != null) __obj.updateDynamic("marketplaceentitlementservice")(marketplaceentitlementservice.asInstanceOf[js.Any])
    if (marketplacemetering != null) __obj.updateDynamic("marketplacemetering")(marketplacemetering.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (mediaconnect != null) __obj.updateDynamic("mediaconnect")(mediaconnect.asInstanceOf[js.Any])
    if (mediaconvert != null) __obj.updateDynamic("mediaconvert")(mediaconvert.asInstanceOf[js.Any])
    if (medialive != null) __obj.updateDynamic("medialive")(medialive.asInstanceOf[js.Any])
    if (mediapackage != null) __obj.updateDynamic("mediapackage")(mediapackage.asInstanceOf[js.Any])
    if (mediapackagevod != null) __obj.updateDynamic("mediapackagevod")(mediapackagevod.asInstanceOf[js.Any])
    if (mediastore != null) __obj.updateDynamic("mediastore")(mediastore.asInstanceOf[js.Any])
    if (mediastoredata != null) __obj.updateDynamic("mediastoredata")(mediastoredata.asInstanceOf[js.Any])
    if (mediatailor != null) __obj.updateDynamic("mediatailor")(mediatailor.asInstanceOf[js.Any])
    if (migrationhub != null) __obj.updateDynamic("migrationhub")(migrationhub.asInstanceOf[js.Any])
    if (migrationhubconfig != null) __obj.updateDynamic("migrationhubconfig")(migrationhubconfig.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (mobileanalytics != null) __obj.updateDynamic("mobileanalytics")(mobileanalytics.asInstanceOf[js.Any])
    if (mq != null) __obj.updateDynamic("mq")(mq.asInstanceOf[js.Any])
    if (mturk != null) __obj.updateDynamic("mturk")(mturk.asInstanceOf[js.Any])
    if (neptune != null) __obj.updateDynamic("neptune")(neptune.asInstanceOf[js.Any])
    if (networkmanager != null) __obj.updateDynamic("networkmanager")(networkmanager.asInstanceOf[js.Any])
    if (opsworks != null) __obj.updateDynamic("opsworks")(opsworks.asInstanceOf[js.Any])
    if (opsworkscm != null) __obj.updateDynamic("opsworkscm")(opsworkscm.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (outposts != null) __obj.updateDynamic("outposts")(outposts.asInstanceOf[js.Any])
    if (paramValidation != null) __obj.updateDynamic("paramValidation")(paramValidation.asInstanceOf[js.Any])
    if (personalize != null) __obj.updateDynamic("personalize")(personalize.asInstanceOf[js.Any])
    if (personalizeevents != null) __obj.updateDynamic("personalizeevents")(personalizeevents.asInstanceOf[js.Any])
    if (personalizeruntime != null) __obj.updateDynamic("personalizeruntime")(personalizeruntime.asInstanceOf[js.Any])
    if (pi != null) __obj.updateDynamic("pi")(pi.asInstanceOf[js.Any])
    if (pinpoint != null) __obj.updateDynamic("pinpoint")(pinpoint.asInstanceOf[js.Any])
    if (pinpointemail != null) __obj.updateDynamic("pinpointemail")(pinpointemail.asInstanceOf[js.Any])
    if (pinpointsmsvoice != null) __obj.updateDynamic("pinpointsmsvoice")(pinpointsmsvoice.asInstanceOf[js.Any])
    if (polly != null) __obj.updateDynamic("polly")(polly.asInstanceOf[js.Any])
    if (pricing != null) __obj.updateDynamic("pricing")(pricing.asInstanceOf[js.Any])
    if (qldb != null) __obj.updateDynamic("qldb")(qldb.asInstanceOf[js.Any])
    if (qldbsession != null) __obj.updateDynamic("qldbsession")(qldbsession.asInstanceOf[js.Any])
    if (quicksight != null) __obj.updateDynamic("quicksight")(quicksight.asInstanceOf[js.Any])
    if (ram != null) __obj.updateDynamic("ram")(ram.asInstanceOf[js.Any])
    if (rds != null) __obj.updateDynamic("rds")(rds.asInstanceOf[js.Any])
    if (rdsdataservice != null) __obj.updateDynamic("rdsdataservice")(rdsdataservice.asInstanceOf[js.Any])
    if (redshift != null) __obj.updateDynamic("redshift")(redshift.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (rekognition != null) __obj.updateDynamic("rekognition")(rekognition.asInstanceOf[js.Any])
    if (resourcegroups != null) __obj.updateDynamic("resourcegroups")(resourcegroups.asInstanceOf[js.Any])
    if (resourcegroupstaggingapi != null) __obj.updateDynamic("resourcegroupstaggingapi")(resourcegroupstaggingapi.asInstanceOf[js.Any])
    if (retryDelayOptions != null) __obj.updateDynamic("retryDelayOptions")(retryDelayOptions.asInstanceOf[js.Any])
    if (robomaker != null) __obj.updateDynamic("robomaker")(robomaker.asInstanceOf[js.Any])
    if (route53 != null) __obj.updateDynamic("route53")(route53.asInstanceOf[js.Any])
    if (route53domains != null) __obj.updateDynamic("route53domains")(route53domains.asInstanceOf[js.Any])
    if (route53resolver != null) __obj.updateDynamic("route53resolver")(route53resolver.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (!js.isUndefined(s3BucketEndpoint)) __obj.updateDynamic("s3BucketEndpoint")(s3BucketEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3DisableBodySigning)) __obj.updateDynamic("s3DisableBodySigning")(s3DisableBodySigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3ForcePathStyle)) __obj.updateDynamic("s3ForcePathStyle")(s3ForcePathStyle.get.asInstanceOf[js.Any])
    if (s3UsEast1RegionalEndpoint != null) __obj.updateDynamic("s3UsEast1RegionalEndpoint")(s3UsEast1RegionalEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(s3UseArnRegion)) __obj.updateDynamic("s3UseArnRegion")(s3UseArnRegion.get.asInstanceOf[js.Any])
    if (s3control != null) __obj.updateDynamic("s3control")(s3control.asInstanceOf[js.Any])
    if (sagemaker != null) __obj.updateDynamic("sagemaker")(sagemaker.asInstanceOf[js.Any])
    if (sagemakerruntime != null) __obj.updateDynamic("sagemakerruntime")(sagemakerruntime.asInstanceOf[js.Any])
    if (savingsplans != null) __obj.updateDynamic("savingsplans")(savingsplans.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (secretsmanager != null) __obj.updateDynamic("secretsmanager")(secretsmanager.asInstanceOf[js.Any])
    if (securityhub != null) __obj.updateDynamic("securityhub")(securityhub.asInstanceOf[js.Any])
    if (serverlessapplicationrepository != null) __obj.updateDynamic("serverlessapplicationrepository")(serverlessapplicationrepository.asInstanceOf[js.Any])
    if (servicecatalog != null) __obj.updateDynamic("servicecatalog")(servicecatalog.asInstanceOf[js.Any])
    if (servicediscovery != null) __obj.updateDynamic("servicediscovery")(servicediscovery.asInstanceOf[js.Any])
    if (servicequotas != null) __obj.updateDynamic("servicequotas")(servicequotas.asInstanceOf[js.Any])
    if (ses != null) __obj.updateDynamic("ses")(ses.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (sesv2 != null) __obj.updateDynamic("sesv2")(sesv2.asInstanceOf[js.Any])
    if (shield != null) __obj.updateDynamic("shield")(shield.asInstanceOf[js.Any])
    if (!js.isUndefined(signatureCache)) __obj.updateDynamic("signatureCache")(signatureCache.get.asInstanceOf[js.Any])
    if (signatureVersion != null) __obj.updateDynamic("signatureVersion")(signatureVersion.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (simpledb != null) __obj.updateDynamic("simpledb")(simpledb.asInstanceOf[js.Any])
    if (sms != null) __obj.updateDynamic("sms")(sms.asInstanceOf[js.Any])
    if (snowball != null) __obj.updateDynamic("snowball")(snowball.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.get.asInstanceOf[js.Any])
    if (ssm != null) __obj.updateDynamic("ssm")(ssm.asInstanceOf[js.Any])
    if (sso != null) __obj.updateDynamic("sso")(sso.asInstanceOf[js.Any])
    if (ssooidc != null) __obj.updateDynamic("ssooidc")(ssooidc.asInstanceOf[js.Any])
    if (stepfunctions != null) __obj.updateDynamic("stepfunctions")(stepfunctions.asInstanceOf[js.Any])
    if (storagegateway != null) __obj.updateDynamic("storagegateway")(storagegateway.asInstanceOf[js.Any])
    if (sts != null) __obj.updateDynamic("sts")(sts.asInstanceOf[js.Any])
    if (stsRegionalEndpoints != null) __obj.updateDynamic("stsRegionalEndpoints")(stsRegionalEndpoints.asInstanceOf[js.Any])
    if (support != null) __obj.updateDynamic("support")(support.asInstanceOf[js.Any])
    if (swf != null) __obj.updateDynamic("swf")(swf.asInstanceOf[js.Any])
    if (synthetics != null) __obj.updateDynamic("synthetics")(synthetics.asInstanceOf[js.Any])
    if (!js.isUndefined(systemClockOffset)) __obj.updateDynamic("systemClockOffset")(systemClockOffset.get.asInstanceOf[js.Any])
    if (textract != null) __obj.updateDynamic("textract")(textract.asInstanceOf[js.Any])
    if (transcribeservice != null) __obj.updateDynamic("transcribeservice")(transcribeservice.asInstanceOf[js.Any])
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint.get.asInstanceOf[js.Any])
    if (waf != null) __obj.updateDynamic("waf")(waf.asInstanceOf[js.Any])
    if (wafregional != null) __obj.updateDynamic("wafregional")(wafregional.asInstanceOf[js.Any])
    if (wafv2 != null) __obj.updateDynamic("wafv2")(wafv2.asInstanceOf[js.Any])
    if (workdocs != null) __obj.updateDynamic("workdocs")(workdocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
}

