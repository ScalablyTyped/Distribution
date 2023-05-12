package typings.awsSdk.clientsIotwirelessMod

import typings.awsSdk.awsSdkStrings.GNSS
import typings.awsSdk.awsSdkStrings.LoRaWAN
import typings.awsSdk.awsSdkStrings.Semtech
import typings.awsSdk.awsSdkStrings.SemtechGeolocation
import typings.awsSdk.awsSdkStrings.Sidewalk
import typings.awsSdk.awsSdkStrings.UPDATE
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountLinked = Boolean

type AckModeRetryDurationSecs = scala.Double

type AddGwMetadata = Boolean

type AmazonId = String

type AmazonResourceName = String

type ApId = String

type AppEui = String

type AppKey = String

type AppSKey = String

type AppServerPrivateKey = String

type ApplicationConfigType = SemtechGeolocation | String

type ApplicationServerPublicKey = String

type Applications = js.Array[ApplicationConfig]

type AssistPosition = js.Array[Coordinate]

type AutoCreateTasks = Boolean

type BCCH = scala.Double

type BSIC = scala.Double

type BaseLat = scala.Double

type BaseLng = scala.Double

type BaseStationId = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.normal_
  - typings.awsSdk.awsSdkStrings.low__
  - typings.awsSdk.awsSdkStrings.critical__
  - java.lang.String
*/
type BatteryLevel = _BatteryLevel | String

type BeaconingDataRate = scala.Double

type BeaconingFrequencies = js.Array[BeaconingFrequency]

type BeaconingFrequency = scala.Double

type CaptureTimeAccuracy = scala.Double

type CdmaChannel = scala.Double

type CdmaList = js.Array[CdmaObj]

type CdmaNmrList = js.Array[CdmaNmrObj]

type CellParams = scala.Double

type CertificatePEM = String

type CertificateValue = String

type ChannelMask = String

type ClassBTimeout = scala.Double

type ClassCTimeout = scala.Double

type ClientRequestToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Connected_
  - typings.awsSdk.awsSdkStrings.Disconnected_
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | String

type Coordinate = scala.Double

type Crc = scala.Double

type CreatedAt = js.Date

type CreationDate = js.Date

type CreationTime = js.Date

type DakCertificateId = String

type DakCertificateMetadataList = js.Array[DakCertificateMetadata]

type Description = String

type DestinationArn = String

type DestinationList = js.Array[Destinations]

type DestinationName = String

type DevAddr = String

type DevEui = String

type DevStatusReqFreq = scala.Double

type DeviceCertificateList = js.Array[CertificateList]

type DeviceCreationFile = String

type DeviceCreationFileList = js.Array[DeviceCreationFile]

type DeviceName = String

type DeviceProfileArn = String

type DeviceProfileId = String

type DeviceProfileList = js.Array[DeviceProfile]

type DeviceProfileName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Sidewalk
  - typings.awsSdk.awsSdkStrings.LoRaWAN
  - java.lang.String
*/
type DeviceProfileType = _DeviceProfileType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Provisioned_
  - typings.awsSdk.awsSdkStrings.RegisteredNotSeen
  - typings.awsSdk.awsSdkStrings.RegisteredReachable
  - typings.awsSdk.awsSdkStrings.RegisteredUnreachable
  - java.lang.String
*/
type DeviceState = _DeviceState | String

type DeviceTypeId = String

type DlBucketSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ClassB
  - typings.awsSdk.awsSdkStrings.ClassC
  - java.lang.String
*/
type DlClass = _DlClass | String

type DlDr = scala.Double

type DlFreq = scala.Double

type DlRate = scala.Double

type DlRatePolicy = String

type Double = scala.Double

type DownlinkFrequency = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEQUENTIAL
  - typings.awsSdk.awsSdkStrings.CONCURRENT
  - typings.awsSdk.awsSdkStrings.USING_UPLINK_GATEWAY
  - java.lang.String
*/
type DownlinkMode = _DownlinkMode | String

type DownlinkQueueMessagesList = js.Array[DownlinkQueueMessage]

type DrMax = scala.Double

type DrMaxBox = scala.Double

type DrMin = scala.Double

type DrMinBox = scala.Double

type EARFCN = scala.Double

type EndPoint = String

type EutranCid = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.discovered__
  - typings.awsSdk.awsSdkStrings.lost
  - typings.awsSdk.awsSdkStrings.ack_
  - typings.awsSdk.awsSdkStrings.nack
  - typings.awsSdk.awsSdkStrings.passthrough___
  - java.lang.String
*/
type Event = _Event | String

type EventConfigurationsList = js.Array[EventConfigurationItem]

type EventNotificationPartnerType = Sidewalk | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SidewalkAccount
  - typings.awsSdk.awsSdkStrings.WirelessDevice
  - typings.awsSdk.awsSdkStrings.WirelessGateway
  - java.lang.String
*/
type EventNotificationResourceType = _EventNotificationResourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type EventNotificationTopicStatus = _EventNotificationTopicStatus | String

type Expression = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RuleName
  - typings.awsSdk.awsSdkStrings.MqttTopic
  - java.lang.String
*/
type ExpressionType = _ExpressionType | String

type FCntStart = scala.Double

type FNwkSIntKey = String

type FPort = scala.Double

type FactoryPresetFreqsList = js.Array[PresetFreq]

type FactorySupport = Boolean

type Fingerprint = String

type FirmwareUpdateImage = String

type FirmwareUpdateRole = String

type FragmentIntervalMS = scala.Double

type FragmentSizeBytes = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initial_
  - typings.awsSdk.awsSdkStrings.Package_Not_Supported
  - typings.awsSdk.awsSdkStrings.FragAlgo_unsupported
  - typings.awsSdk.awsSdkStrings.Not_enough_memory
  - typings.awsSdk.awsSdkStrings.FragIndex_unsupported
  - typings.awsSdk.awsSdkStrings.Wrong_descriptor
  - typings.awsSdk.awsSdkStrings.SessionCnt_replay
  - typings.awsSdk.awsSdkStrings.MissingFrag
  - typings.awsSdk.awsSdkStrings.MemoryError
  - typings.awsSdk.awsSdkStrings.MICError
  - typings.awsSdk.awsSdkStrings.Successful_
  - java.lang.String
*/
type FuotaDeviceStatus = _FuotaDeviceStatus | String

type FuotaTaskArn = String

type FuotaTaskId = String

type FuotaTaskList = js.Array[FuotaTask]

type FuotaTaskName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.FuotaSession_Waiting
  - typings.awsSdk.awsSdkStrings.In_FuotaSession
  - typings.awsSdk.awsSdkStrings.FuotaDone
  - typings.awsSdk.awsSdkStrings.Delete_Waiting
  - java.lang.String
*/
type FuotaTaskStatus = _FuotaTaskStatus | String

type GPST = scala.Double

type GatewayEui = String

type GatewayList = js.Array[GatewayListItem]

type GatewayMaxEirp = scala.Double

type GenAppKey = String

type GeoJsonPayload = Buffer | js.typedarray.Uint8Array | Blob | String

type GeranCid = scala.Double

type GnssNav = String

type GsmList = js.Array[GsmObj]

type GsmNmrList = js.Array[GsmNmrObj]

type GsmTimingAdvance = scala.Double

type HorizontalAccuracy = scala.Double

type HrAllowed = Boolean

type IPAddress = String

type ISODateTimeString = String

type Identifier = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PartnerAccountId
  - typings.awsSdk.awsSdkStrings.DevEui
  - typings.awsSdk.awsSdkStrings.GatewayEui
  - typings.awsSdk.awsSdkStrings.WirelessDeviceId
  - typings.awsSdk.awsSdkStrings.WirelessGatewayId
  - java.lang.String
*/
type IdentifierType = _IdentifierType | String

type ImportTaskArn = String

type ImportTaskId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZING
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ImportTaskStatus = _ImportTaskStatus | String

type ImportedWirelessDeviceCount = scala.Double

type ImportedWirelessDeviceList = js.Array[ImportedWirelessDevice]

type Integer = scala.Double

type IotCertificateId = String

type JoinEui = String

type JoinEuiFilters = js.Array[JoinEuiRange]

type JoinEuiRange = js.Array[JoinEui]

type LAC = scala.Double

type LastUpdateTime = js.Date

type LoRaWANGatewayMetadataList = js.Array[LoRaWANGatewayMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type LteList = js.Array[LteObj]

type LteNmrList = js.Array[LteNmrObj]

type LteTimingAdvance = scala.Double

type MCC = scala.Double

type MNC = scala.Double

type MacAddress = String

type MacVersion = String

type MaxAllowedSignature = scala.Double

type MaxDutyCycle = scala.Double

type MaxEirp = scala.Double

type MaxResults = scala.Double

type McGroupId = scala.Double

type MessageId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_NOTIFY
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_GET
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_SET
  - typings.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_RESP
  - java.lang.String
*/
type MessageType = _MessageType | String

type MinGwDiversity = scala.Double

type Model = String

type MulticastDeviceStatus = String

type MulticastGroupArn = String

type MulticastGroupId = String

type MulticastGroupList = js.Array[MulticastGroup]

type MulticastGroupListByFuotaTask = js.Array[MulticastGroupByFuotaTask]

type MulticastGroupMessageId = String

type MulticastGroupName = String

type MulticastGroupStatus = String

type NRCapable = Boolean

type NetId = String

type NetIdFilters = js.Array[NetId]

type NetworkAnalyzerConfigurationArn = String

type NetworkAnalyzerConfigurationList = js.Array[NetworkAnalyzerConfigurations]

type NetworkAnalyzerConfigurationName = String

type NetworkId = scala.Double

type NextToken = String

type NumberOfDevicesInGroup = scala.Double

type NumberOfDevicesRequested = scala.Double

type NwkGeoLoc = Boolean

type NwkKey = String

type NwkSEncKey = String

type NwkSKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ONBOARDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type OnboardStatus = _OnboardStatus | String

type OnboardStatusReason = String

type PCI = scala.Double

type PSC = scala.Double

type PackageVersion = String

type PartnerAccountArn = String

type PartnerAccountId = String

type PartnerType = Sidewalk | String

type PathLoss = scala.Double

type PayloadData = String

type PilotPower = scala.Double

type PingSlotDr = scala.Double

type PingSlotFreq = scala.Double

type PingSlotPeriod = scala.Double

type PnOffset = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROSE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type PositionConfigurationFec = _PositionConfigurationFec | String

type PositionConfigurationList = js.Array[PositionConfigurationItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type PositionConfigurationStatus = _PositionConfigurationStatus | String

type PositionCoordinate = js.Array[PositionCoordinateValue]

type PositionCoordinateValue = scala.Double

type PositionResourceIdentifier = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WirelessDevice
  - typings.awsSdk.awsSdkStrings.WirelessGateway
  - java.lang.String
*/
type PositionResourceType = _PositionResourceType | String

type PositionSolverProvider = Semtech | String

type PositionSolverType = GNSS | String

type PositionSolverVersion = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type PositioningConfigStatus = _PositioningConfigStatus | String

type PrAllowed = Boolean

type PresetFreq = scala.Double

type PrivateKeysList = js.Array[CertificateList]

type QualificationStatus = Boolean

type QueryString = String

type RSCP = scala.Double

type RSRP = scala.Double

type RSRQ = scala.Double

type RSS = scala.Double

type RaAllowed = Boolean

type RedundancyPercent = scala.Double

type RegParamsRevision = String

type RegistrationZone = scala.Double

type ReportDevStatusBattery = Boolean

type ReportDevStatusMargin = Boolean

type ResourceIdentifier = String

type ResourceType = String

type Result = String

type RfRegion = String

type Role = String

type RoleArn = String

type RxDataRate2 = scala.Double

type RxDelay1 = scala.Double

type RxDrOffset1 = scala.Double

type RxFreq2 = scala.Double

type RxLevel = scala.Double

type SNwkSIntKey = String

type Seq = scala.Double

type ServiceProfileArn = String

type ServiceProfileId = String

type ServiceProfileList = js.Array[ServiceProfile]

type ServiceProfileName = String

type SessionStartTimeTimestamp = js.Date

type SessionTimeout = scala.Double

type SidewalkAccountList = js.Array[SidewalkAccountInfoWithFingerprint]

type SidewalkId = String

type SidewalkManufacturingSn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ed25519
  - typings.awsSdk.awsSdkStrings.P256r1
  - java.lang.String
*/
type SigningAlg = _SigningAlg | String

type StartTime = js.Date

type Station = String

type StatusReason = String

type SubBand = scala.Double

type SubBands = js.Array[SubBand]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EU868
  - typings.awsSdk.awsSdkStrings.US915
  - typings.awsSdk.awsSdkStrings.AU915
  - typings.awsSdk.awsSdkStrings.`AS923-1`
  - typings.awsSdk.awsSdkStrings.`AS923-2`
  - typings.awsSdk.awsSdkStrings.`AS923-3`
  - typings.awsSdk.awsSdkStrings.`AS923-4`
  - typings.awsSdk.awsSdkStrings.EU433
  - typings.awsSdk.awsSdkStrings.CN470
  - typings.awsSdk.awsSdkStrings.CN779
  - typings.awsSdk.awsSdkStrings.RU864
  - typings.awsSdk.awsSdkStrings.KR920
  - typings.awsSdk.awsSdkStrings.IN865
  - java.lang.String
*/
type SupportedRfRegion = _SupportedRfRegion | String

type Supports32BitFCnt = Boolean

type SupportsClassB = Boolean

type SupportsClassC = Boolean

type SupportsJoin = Boolean

type SystemId = scala.Double

type TAC = scala.Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TargetPer = scala.Double

type TdscdmaList = js.Array[TdscdmaObj]

type TdscdmaNmrList = js.Array[TdscdmaNmrObj]

type TdscdmaTimingAdvance = scala.Double

type ThingArn = String

type ThingName = String

type TransmissionInterval = scala.Double

type TransmitMode = scala.Double

type UARFCN = scala.Double

type UARFCNDL = scala.Double

type UlBucketSize = scala.Double

type UlRate = scala.Double

type UlRatePolicy = String

type UpdateDataSource = String

type UpdateSignature = String

type Use2DSolver = Boolean

type UtranCid = scala.Double

type VerticalAccuracy = scala.Double

type WcdmaList = js.Array[WcdmaObj]

type WcdmaNmrList = js.Array[WcdmaNmrObj]

type WiFiAccessPoints = js.Array[WiFiAccessPoint]

type WirelessDeviceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Join
  - typings.awsSdk.awsSdkStrings.Rejoin
  - typings.awsSdk.awsSdkStrings.Uplink_Data
  - typings.awsSdk.awsSdkStrings.Downlink_Data
  - typings.awsSdk.awsSdkStrings.Registration
  - java.lang.String
*/
type WirelessDeviceEvent = _WirelessDeviceEvent | String

type WirelessDeviceEventLogOptionList = js.Array[WirelessDeviceEventLogOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type WirelessDeviceFrameInfo = _WirelessDeviceFrameInfo | String

type WirelessDeviceId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WirelessDeviceId
  - typings.awsSdk.awsSdkStrings.DevEui
  - typings.awsSdk.awsSdkStrings.ThingName
  - typings.awsSdk.awsSdkStrings.SidewalkManufacturingSn
  - java.lang.String
*/
type WirelessDeviceIdType = _WirelessDeviceIdType | String

type WirelessDeviceImportTaskList = js.Array[WirelessDeviceImportTask]

type WirelessDeviceList = js.Array[WirelessDeviceId]

type WirelessDeviceLogOptionList = js.Array[WirelessDeviceLogOption]

type WirelessDeviceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONED
  - typings.awsSdk.awsSdkStrings.REGISTERED
  - typings.awsSdk.awsSdkStrings.ACTIVATED
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type WirelessDeviceSidewalkStatus = _WirelessDeviceSidewalkStatus | String

type WirelessDeviceStatisticsList = js.Array[WirelessDeviceStatistics]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Sidewalk
  - typings.awsSdk.awsSdkStrings.LoRaWAN
  - java.lang.String
*/
type WirelessDeviceType = _WirelessDeviceType | String

type WirelessGatewayArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUPS_Request
  - typings.awsSdk.awsSdkStrings.Certificate_
  - java.lang.String
*/
type WirelessGatewayEvent = _WirelessGatewayEvent | String

type WirelessGatewayEventLogOptionList = js.Array[WirelessGatewayEventLogOption]

type WirelessGatewayId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GatewayEui
  - typings.awsSdk.awsSdkStrings.WirelessGatewayId
  - typings.awsSdk.awsSdkStrings.ThingName
  - java.lang.String
*/
type WirelessGatewayIdType = _WirelessGatewayIdType | String

type WirelessGatewayList = js.Array[WirelessGatewayId]

type WirelessGatewayLogOptionList = js.Array[WirelessGatewayLogOption]

type WirelessGatewayName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUPS
  - typings.awsSdk.awsSdkStrings.LNS
  - java.lang.String
*/
type WirelessGatewayServiceType = _WirelessGatewayServiceType | String

type WirelessGatewayStatisticsList = js.Array[WirelessGatewayStatistics]

type WirelessGatewayTaskDefinitionArn = String

type WirelessGatewayTaskDefinitionId = String

type WirelessGatewayTaskDefinitionList = js.Array[UpdateWirelessGatewayTaskEntry]

type WirelessGatewayTaskDefinitionType = UPDATE | String

type WirelessGatewayTaskName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FIRST_RETRY
  - typings.awsSdk.awsSdkStrings.SECOND_RETRY
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type WirelessGatewayTaskStatus = _WirelessGatewayTaskStatus | String

type WirelessGatewayType = LoRaWAN | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-11-22`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
