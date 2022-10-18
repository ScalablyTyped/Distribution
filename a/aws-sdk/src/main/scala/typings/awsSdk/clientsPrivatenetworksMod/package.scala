package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.FEET
import typings.awsSdk.awsSdkStrings.RADIO_UNIT
import typings.awsSdk.awsSdkStrings.STATUS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACKNOWLEDGING
  - typings.awsSdk.awsSdkStrings.ACKNOWLEDGED
  - typings.awsSdk.awsSdkStrings.UNACKNOWLEDGED
  - java.lang.String
*/
type AcknowledgmentStatus = _AcknowledgmentStatus | java.lang.String

type AddressContent = java.lang.String

type Arn = java.lang.String

type ClientToken = java.lang.String

type ConfigureAccessPointRequestCpiSecretKeyString = java.lang.String

type ConfigureAccessPointRequestCpiUserIdString = java.lang.String

type ConfigureAccessPointRequestCpiUserPasswordString = java.lang.String

type ConfigureAccessPointRequestCpiUsernameString = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.ORDER
  - typings.awsSdk.awsSdkStrings.TRAFFIC_GROUP
  - java.lang.String
*/
type DeviceIdentifierFilterKeys = _DeviceIdentifierFilterKeys | java.lang.String

type DeviceIdentifierFilterValues = js.Array[String]

type DeviceIdentifierFilters = StringDictionary[DeviceIdentifierFilterValues]

type DeviceIdentifierImsiString = java.lang.String

type DeviceIdentifierList = js.Array[DeviceIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type DeviceIdentifierStatus = _DeviceIdentifierStatus | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGL
  - typings.awsSdk.awsSdkStrings.AMSL
  - java.lang.String
*/
type ElevationReference = _ElevationReference | java.lang.String

type ElevationUnit = FEET | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIAL
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type HealthStatus = _HealthStatus | java.lang.String

type ListDeviceIdentifiersRequestMaxResultsInteger = scala.Double

type ListNetworkResourcesRequestMaxResultsInteger = scala.Double

type ListNetworkSitesRequestMaxResultsInteger = scala.Double

type ListNetworksRequestMaxResultsInteger = scala.Double

type ListOrdersRequestMaxResultsInteger = scala.Double

type Name = java.lang.String

type NameValuePairs = js.Array[NameValuePair]

type NetworkFilterKeys = STATUS | java.lang.String

type NetworkFilterValues = js.Array[String]

type NetworkFilters = StringDictionary[NetworkFilterValues]

type NetworkList = js.Array[Network]

type NetworkResourceDefinitionCountInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RADIO_UNIT
  - typings.awsSdk.awsSdkStrings.DEVICE_IDENTIFIER
  - java.lang.String
*/
type NetworkResourceDefinitionType = _NetworkResourceDefinitionType | java.lang.String

type NetworkResourceDefinitions = js.Array[NetworkResourceDefinition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ORDER
  - typings.awsSdk.awsSdkStrings.STATUS
  - java.lang.String
*/
type NetworkResourceFilterKeys = _NetworkResourceFilterKeys | java.lang.String

type NetworkResourceFilterValues = js.Array[String]

type NetworkResourceFilters = StringDictionary[NetworkResourceFilterValues]

type NetworkResourceList = js.Array[NetworkResource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SHIPPED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.PROVISIONED
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.PENDING_RETURN
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type NetworkResourceStatus = _NetworkResourceStatus | java.lang.String

type NetworkResourceType = RADIO_UNIT | java.lang.String

type NetworkSiteFilterKeys = STATUS | java.lang.String

type NetworkSiteFilterValues = js.Array[String]

type NetworkSiteFilters = StringDictionary[NetworkSiteFilterValues]

type NetworkSiteList = js.Array[NetworkSite]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DEPROVISIONING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type NetworkSiteStatus = _NetworkSiteStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DEPROVISIONING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type NetworkStatus = _NetworkStatus | java.lang.String

type Options = js.Array[NameValuePair]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.NETWORK_SITE
  - java.lang.String
*/
type OrderFilterKeys = _OrderFilterKeys | java.lang.String

type OrderFilterValues = js.Array[String]

type OrderFilters = StringDictionary[OrderFilterValues]

type OrderList = js.Array[Order]

type PaginationToken = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type TrackingInformationList = js.Array[TrackingInformation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-12-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
