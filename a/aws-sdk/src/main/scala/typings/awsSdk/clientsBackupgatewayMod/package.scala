package typings.awsSdk.clientsBackupgatewayMod

import typings.awsSdk.awsSdkStrings.BACKUP_VM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivationKey = String

type DayOfMonth = Double

type DayOfWeek = Double

type GatewayArn = String

type GatewayType = BACKUP_VM | String

type Gateways = js.Array[Gateway]

type Host = String

type HourOfDay = Double

type HypervisorId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type HypervisorState = _HypervisorState | String

type Hypervisors = js.Array[Hypervisor]

type KmsKeyArn = String

type MaxResults = Double

type MinuteOfHour = Double

type Name = String

type NextToken = String

type Password = String

type Path = String

type ResourceArn = String

type ServerArn = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type Time = js.Date

type Username = String

type VirtualMachines = js.Array[VirtualMachine]

type VpcEndpoint = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
