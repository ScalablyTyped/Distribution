package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.COMPUTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type AddressLine1 = String

type AddressLine2 = String

type AddressLine3 = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SHIPPING_ADDRESS
  - typings.awsSdk.awsSdkStrings.OPERATING_ADDRESS
  - java.lang.String
*/
type AddressType = _AddressType | String

type Arn = String

type AssetId = String

type AssetListDefinition = js.Array[AssetInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.RETIRING
  - java.lang.String
*/
type AssetState = _AssetState | String

type AssetType = COMPUTE | String

type AvailabilityZone = String

type AvailabilityZoneId = String

type AvailabilityZoneIdList = js.Array[AvailabilityZoneId]

type AvailabilityZoneList = js.Array[AvailabilityZone]

type CIDR = String

type CIDRList = js.Array[CIDR]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RACK
  - typings.awsSdk.awsSdkStrings.SERVER
  - java.lang.String
*/
type CatalogItemClass = _CatalogItemClass | String

type CatalogItemClassList = js.Array[CatalogItemClass]

type CatalogItemListDefinition = js.Array[CatalogItem]

type CatalogItemPowerKva = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DISCONTINUED
  - java.lang.String
*/
type CatalogItemStatus = _CatalogItemStatus | String

type CatalogItemWeightLbs = Double

type City = String

type CityList = js.Array[City]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ISOLATED
  - typings.awsSdk.awsSdkStrings.RETIRING
  - java.lang.String
*/
type ComputeAssetState = _ComputeAssetState | String

type ConnectionId = String

type ContactName = String

type ContactPhoneNumber = String

type CountryCode = String

type CountryCodeList = js.Array[CountryCode]

type DeviceSerialNumber = String

type DistrictOrCounty = String

type EC2CapacityListDefinition = js.Array[EC2Capacity]

type EC2FamilyList = js.Array[Family]

type Family = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE_MODE
  - typings.awsSdk.awsSdkStrings.MULTI_MODE
  - java.lang.String
*/
type FiberOpticCableType = _FiberOpticCableType | String

type HostId = String

type HostIdList = js.Array[HostId]

type ISO8601Timestamp = js.Date

type InstanceType = String

type InstanceTypeListDefinition = js.Array[InstanceTypeItem]

type LifeCycleStatus = String

type LifeCycleStatusList = js.Array[LifeCycleStatus]

type LineItemAssetInformationList = js.Array[LineItemAssetInformation]

type LineItemId = String

type LineItemListDefinition = js.Array[LineItem]

type LineItemQuantity = Double

type LineItemRequestListDefinition = js.Array[LineItemRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PREPARING
  - typings.awsSdk.awsSdkStrings.BUILDING
  - typings.awsSdk.awsSdkStrings.SHIPPED
  - typings.awsSdk.awsSdkStrings.DELIVERED
  - typings.awsSdk.awsSdkStrings.INSTALLING
  - typings.awsSdk.awsSdkStrings.INSTALLED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type LineItemStatus = _LineItemStatus | String

type LineItemStatusCounts = StringDictionary[LineItemQuantity]

type MacAddress = String

type MacAddressList = js.Array[MacAddress]

type MaxResults1000 = Double

type MaxSize = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_LIMIT
  - typings.awsSdk.awsSdkStrings.MAX_1400_LBS
  - typings.awsSdk.awsSdkStrings.MAX_1600_LBS
  - typings.awsSdk.awsSdkStrings.MAX_1800_LBS
  - typings.awsSdk.awsSdkStrings.MAX_2000_LBS
  - java.lang.String
*/
type MaximumSupportedWeightLbs = _MaximumSupportedWeightLbs | String

type Municipality = String

type NetworkInterfaceDeviceIndex = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPTIC_10GBASE_SR
  - typings.awsSdk.awsSdkStrings.OPTIC_10GBASE_IR
  - typings.awsSdk.awsSdkStrings.OPTIC_10GBASE_LR
  - typings.awsSdk.awsSdkStrings.OPTIC_40GBASE_SR
  - typings.awsSdk.awsSdkStrings.OPTIC_40GBASE_ESR
  - typings.awsSdk.awsSdkStrings.OPTIC_40GBASE_IR4_LR4L
  - typings.awsSdk.awsSdkStrings.OPTIC_40GBASE_LR4
  - typings.awsSdk.awsSdkStrings.OPTIC_100GBASE_SR4
  - typings.awsSdk.awsSdkStrings.OPTIC_100GBASE_CWDM4
  - typings.awsSdk.awsSdkStrings.OPTIC_100GBASE_LR4
  - typings.awsSdk.awsSdkStrings.OPTIC_100G_PSM4_MSA
  - typings.awsSdk.awsSdkStrings.OPTIC_1000BASE_LX
  - typings.awsSdk.awsSdkStrings.OPTIC_1000BASE_SX
  - java.lang.String
*/
type OpticalStandard = _OpticalStandard | String

type OrderId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RECEIVED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.INSTALLING
  - typings.awsSdk.awsSdkStrings.FULFILLED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.PREPARING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type OrderStatus = _OrderStatus | String

type OrderSummaryListDefinition = js.Array[OrderSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OUTPOST
  - typings.awsSdk.awsSdkStrings.REPLACEMENT
  - java.lang.String
*/
type OrderType = _OrderType | String

type OutpostArn = String

type OutpostDescription = String

type OutpostId = String

type OutpostIdOnly = String

type OutpostIdentifier = String

type OutpostName = String

type OwnerId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typings.awsSdk.awsSdkStrings.NO_UPFRONT
  - typings.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - java.lang.String
*/
type PaymentOption = _PaymentOption | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.THREE_YEARS
  - typings.awsSdk.awsSdkStrings.ONE_YEAR
  - java.lang.String
*/
type PaymentTerm = _PaymentTerm | String

type PostalCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.L6_30P
  - typings.awsSdk.awsSdkStrings.IEC309
  - typings.awsSdk.awsSdkStrings.AH530P7W
  - typings.awsSdk.awsSdkStrings.AH532P6W
  - java.lang.String
*/
type PowerConnector = _PowerConnector | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POWER_5_KVA
  - typings.awsSdk.awsSdkStrings.POWER_10_KVA
  - typings.awsSdk.awsSdkStrings.POWER_15_KVA
  - java.lang.String
*/
type PowerDrawKva = _PowerDrawKva | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ABOVE_RACK
  - typings.awsSdk.awsSdkStrings.BELOW_RACK
  - java.lang.String
*/
type PowerFeedDrop = _PowerFeedDrop | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE_PHASE
  - typings.awsSdk.awsSdkStrings.THREE_PHASE
  - java.lang.String
*/
type PowerPhase = _PowerPhase | String

type Quantity = String

type RackElevation = Double

type RackId = String

type ServerEndpoint = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DHL
  - typings.awsSdk.awsSdkStrings.DBS
  - typings.awsSdk.awsSdkStrings.FEDEX
  - typings.awsSdk.awsSdkStrings.UPS
  - java.lang.String
*/
type ShipmentCarrier = _ShipmentCarrier | String

type SiteArn = String

type SiteDescription = String

type SiteId = String

type SiteName = String

type SiteNotes = String

type SkuCode = String

type StateOrRegion = String

type StateOrRegionList = js.Array[StateOrRegion]

type StatusList = js.Array[AssetState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RACK
  - typings.awsSdk.awsSdkStrings.SERVER
  - java.lang.String
*/
type SupportedHardwareType = _SupportedHardwareType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EBS
  - typings.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type SupportedStorageEnum = _SupportedStorageEnum | String

type SupportedStorageList = js.Array[SupportedStorageEnum]

type SupportedUplinkGbps = Double

type SupportedUplinkGbpsListDefinition = js.Array[SupportedUplinkGbps]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type Token = String

type TrackingId = String

type UnderlayIpAddress = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_1
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_2
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_3
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_4
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_5
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_6
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_7
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_8
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_12
  - typings.awsSdk.awsSdkStrings.UPLINK_COUNT_16
  - java.lang.String
*/
type UplinkCount = _UplinkCount | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPLINK_1G
  - typings.awsSdk.awsSdkStrings.UPLINK_10G
  - typings.awsSdk.awsSdkStrings.UPLINK_40G
  - typings.awsSdk.awsSdkStrings.UPLINK_100G
  - java.lang.String
*/
type UplinkGbps = _UplinkGbps | String

type WireGuardPublicKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-12-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type outpostListDefinition = js.Array[Outpost]

type siteListDefinition = js.Array[Site]
