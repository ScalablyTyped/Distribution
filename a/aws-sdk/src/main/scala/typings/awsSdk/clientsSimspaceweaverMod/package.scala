package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppPortMappings = js.Array[SimulationAppPortMapping]

type BucketName = String

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type ClockStatus = _ClockStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type ClockTargetStatus = _ClockTargetStatus | String

type Description = String

type DomainList = js.Array[Domain]

type LaunchCommandList = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Unknown_
  - typings.awsSdk.awsSdkStrings.PerWorker
  - typings.awsSdk.awsSdkStrings.BySpatialSubdivision
  - typings.awsSdk.awsSdkStrings.ByRequest
  - java.lang.String
*/
type LifecycleManagementStrategy = _LifecycleManagementStrategy | String

type LogDestinations = js.Array[LogDestination]

type LogGroupArn = String

type NonEmptyString = String

type ObjectKey = String

type ObjectKeyPrefix = String

type OptionalString = String

type PortNumber = Double

type PositiveInteger = Double

type RoleArn = String

type SimSpaceWeaverArn = String

type SimSpaceWeaverLongResourceName = String

type SimSpaceWeaverResourceName = String

type SimulationAppList = js.Array[SimulationAppMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type SimulationAppStatus = _SimulationAppStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type SimulationAppTargetStatus = _SimulationAppTargetStatus | String

type SimulationClockList = js.Array[SimulationClock]

type SimulationList = js.Array[SimulationMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.SNAPSHOT_IN_PROGRESS
  - java.lang.String
*/
type SimulationStatus = _SimulationStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type SimulationTargetStatus = _SimulationTargetStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TimeToLiveString = String

type Timestamp = js.Date

type UUID = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2022-10-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
