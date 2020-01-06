package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConnectMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.LT
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = String
  type AfterContactWorkTimeLimit = Double
  type AgentFirstName = String
  type AgentLastName = String
  type AgentUsername = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = StringDictionary[AttributeValue]
  type AutoAccept = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VOICE
    - typings.awsDashSdk.awsDashSdkStrings.CHAT
    - java.lang.String
  */
  type Channel = _Channel | String
  type Channels = js.Array[Channel]
  type ChatContent = String
  type ChatContentType = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = String
  type Comparison = LT | String
  type ContactFlowId = String
  type ContactFlowName = String
  type ContactFlowSummaryList = js.Array[ContactFlowSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONTACT_FLOW
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_HOLD
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_WHISPER
    - typings.awsDashSdk.awsDashSdkStrings.AGENT_HOLD
    - typings.awsDashSdk.awsDashSdkStrings.AGENT_WHISPER
    - typings.awsDashSdk.awsDashSdkStrings.OUTBOUND_WHISPER
    - typings.awsDashSdk.awsDashSdkStrings.AGENT_TRANSFER
    - typings.awsDashSdk.awsDashSdkStrings.QUEUE_TRANSFER
    - java.lang.String
  */
  type ContactFlowType = _ContactFlowType | String
  type ContactFlowTypes = js.Array[ContactFlowType]
  type ContactId = String
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ONLINE
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ON_CALL
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_NON_PRODUCTIVE
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_AFTER_CONTACT_WORK
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_STAFFED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_IN_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.OLDEST_CONTACT_AGE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_SCHEDULED
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ON_CONTACT
    - typings.awsDashSdk.awsDashSdkStrings.SLOTS_ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.SLOTS_AVAILABLE
    - java.lang.String
  */
  type CurrentMetricName = _CurrentMetricName | String
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type DirectoryUserId = String
  type DisplayName = String
  type Email = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CHANNEL
    - java.lang.String
  */
  type Grouping = _Grouping | String
  type Groupings = js.Array[Grouping]
  type HierarchyGroupId = String
  type HierarchyGroupName = String
  type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId = String
  type HierarchyLevelName = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HANDLED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_ABANDONED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_CONSULTED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HANDLED_INCOMING
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HANDLED_OUTBOUND
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HOLD_ABANDONS
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_IN
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_MISSED
    - typings.awsDashSdk.awsDashSdkStrings.CALLBACK_CONTACTS_HANDLED
    - typings.awsDashSdk.awsDashSdkStrings.API_CONTACTS_HANDLED
    - typings.awsDashSdk.awsDashSdkStrings.OCCUPANCY
    - typings.awsDashSdk.awsDashSdkStrings.HANDLE_TIME
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_CONTACT_WORK_TIME
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED_TIME
    - typings.awsDashSdk.awsDashSdkStrings.ABANDON_TIME
    - typings.awsDashSdk.awsDashSdkStrings.QUEUE_ANSWER_TIME
    - typings.awsDashSdk.awsDashSdkStrings.HOLD_TIME
    - typings.awsDashSdk.awsDashSdkStrings.INTERACTION_TIME
    - typings.awsDashSdk.awsDashSdkStrings.INTERACTION_AND_HOLD_TIME
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_LEVEL
    - java.lang.String
  */
  type HistoricalMetricName = _HistoricalMetricName | String
  type HistoricalMetricResults = js.Array[HistoricalMetricResult]
  type HistoricalMetrics = js.Array[HistoricalMetric]
  type HoursOfOperationId = String
  type HoursOfOperationName = String
  type HoursOfOperationSummaryList = js.Array[HoursOfOperationSummary]
  type InstanceId = String
  type MaxResult100 = Double
  type MaxResult1000 = Double
  type NextToken = String
  type ParticipantId = String
  type ParticipantToken = String
  type Password = String
  type PhoneNumber = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AF
    - typings.awsDashSdk.awsDashSdkStrings.AL
    - typings.awsDashSdk.awsDashSdkStrings.DZ
    - typings.awsDashSdk.awsDashSdkStrings.AS
    - typings.awsDashSdk.awsDashSdkStrings.AD
    - typings.awsDashSdk.awsDashSdkStrings.AO
    - typings.awsDashSdk.awsDashSdkStrings.AI
    - typings.awsDashSdk.awsDashSdkStrings.AQ
    - typings.awsDashSdk.awsDashSdkStrings.AG
    - typings.awsDashSdk.awsDashSdkStrings.AR
    - typings.awsDashSdk.awsDashSdkStrings.AM
    - typings.awsDashSdk.awsDashSdkStrings.AW
    - typings.awsDashSdk.awsDashSdkStrings.AU
    - typings.awsDashSdk.awsDashSdkStrings.AT
    - typings.awsDashSdk.awsDashSdkStrings.AZ
    - typings.awsDashSdk.awsDashSdkStrings.BS
    - typings.awsDashSdk.awsDashSdkStrings.BH
    - typings.awsDashSdk.awsDashSdkStrings.BD
    - typings.awsDashSdk.awsDashSdkStrings.BB
    - typings.awsDashSdk.awsDashSdkStrings.BY
    - typings.awsDashSdk.awsDashSdkStrings.BE
    - typings.awsDashSdk.awsDashSdkStrings.BZ
    - typings.awsDashSdk.awsDashSdkStrings.BJ
    - typings.awsDashSdk.awsDashSdkStrings.BM
    - typings.awsDashSdk.awsDashSdkStrings.BT
    - typings.awsDashSdk.awsDashSdkStrings.BO
    - typings.awsDashSdk.awsDashSdkStrings.BA
    - typings.awsDashSdk.awsDashSdkStrings.BW
    - typings.awsDashSdk.awsDashSdkStrings.BR
    - typings.awsDashSdk.awsDashSdkStrings.IO
    - typings.awsDashSdk.awsDashSdkStrings.VG
    - typings.awsDashSdk.awsDashSdkStrings.BN
    - typings.awsDashSdk.awsDashSdkStrings.BG
    - typings.awsDashSdk.awsDashSdkStrings.BF
    - typings.awsDashSdk.awsDashSdkStrings.BI
    - typings.awsDashSdk.awsDashSdkStrings.KH
    - typings.awsDashSdk.awsDashSdkStrings.CM
    - typings.awsDashSdk.awsDashSdkStrings.CA
    - typings.awsDashSdk.awsDashSdkStrings.CV
    - typings.awsDashSdk.awsDashSdkStrings.KY
    - typings.awsDashSdk.awsDashSdkStrings.CF
    - typings.awsDashSdk.awsDashSdkStrings.TD
    - typings.awsDashSdk.awsDashSdkStrings.CL
    - typings.awsDashSdk.awsDashSdkStrings.CN
    - typings.awsDashSdk.awsDashSdkStrings.CX
    - typings.awsDashSdk.awsDashSdkStrings.CC
    - typings.awsDashSdk.awsDashSdkStrings.CO
    - typings.awsDashSdk.awsDashSdkStrings.KM
    - typings.awsDashSdk.awsDashSdkStrings.CK
    - typings.awsDashSdk.awsDashSdkStrings.CR
    - typings.awsDashSdk.awsDashSdkStrings.HR
    - typings.awsDashSdk.awsDashSdkStrings.CU
    - typings.awsDashSdk.awsDashSdkStrings.CW
    - typings.awsDashSdk.awsDashSdkStrings.CY
    - typings.awsDashSdk.awsDashSdkStrings.CZ
    - typings.awsDashSdk.awsDashSdkStrings.CD
    - typings.awsDashSdk.awsDashSdkStrings.DK
    - typings.awsDashSdk.awsDashSdkStrings.DJ
    - typings.awsDashSdk.awsDashSdkStrings.DM
    - typings.awsDashSdk.awsDashSdkStrings.DO
    - typings.awsDashSdk.awsDashSdkStrings.TL
    - typings.awsDashSdk.awsDashSdkStrings.EC
    - typings.awsDashSdk.awsDashSdkStrings.EG
    - typings.awsDashSdk.awsDashSdkStrings.SV
    - typings.awsDashSdk.awsDashSdkStrings.GQ
    - typings.awsDashSdk.awsDashSdkStrings.ER
    - typings.awsDashSdk.awsDashSdkStrings.EE
    - typings.awsDashSdk.awsDashSdkStrings.ET
    - typings.awsDashSdk.awsDashSdkStrings.FK
    - typings.awsDashSdk.awsDashSdkStrings.FO
    - typings.awsDashSdk.awsDashSdkStrings.FJ
    - typings.awsDashSdk.awsDashSdkStrings.FI
    - typings.awsDashSdk.awsDashSdkStrings.FR
    - typings.awsDashSdk.awsDashSdkStrings.PF
    - typings.awsDashSdk.awsDashSdkStrings.GA
    - typings.awsDashSdk.awsDashSdkStrings.GM
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.DE
    - typings.awsDashSdk.awsDashSdkStrings.GH
    - typings.awsDashSdk.awsDashSdkStrings.GI
    - typings.awsDashSdk.awsDashSdkStrings.GR
    - typings.awsDashSdk.awsDashSdkStrings.GL
    - typings.awsDashSdk.awsDashSdkStrings.GD
    - typings.awsDashSdk.awsDashSdkStrings.GU
    - typings.awsDashSdk.awsDashSdkStrings.GT
    - typings.awsDashSdk.awsDashSdkStrings.GG
    - typings.awsDashSdk.awsDashSdkStrings.GN
    - typings.awsDashSdk.awsDashSdkStrings.GW
    - typings.awsDashSdk.awsDashSdkStrings.GY
    - typings.awsDashSdk.awsDashSdkStrings.HT
    - typings.awsDashSdk.awsDashSdkStrings.HN
    - typings.awsDashSdk.awsDashSdkStrings.HK
    - typings.awsDashSdk.awsDashSdkStrings.HU
    - typings.awsDashSdk.awsDashSdkStrings.IS
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.ID
    - typings.awsDashSdk.awsDashSdkStrings.IR
    - typings.awsDashSdk.awsDashSdkStrings.IQ
    - typings.awsDashSdk.awsDashSdkStrings.IE
    - typings.awsDashSdk.awsDashSdkStrings.IM
    - typings.awsDashSdk.awsDashSdkStrings.IL
    - typings.awsDashSdk.awsDashSdkStrings.IT
    - typings.awsDashSdk.awsDashSdkStrings.CI
    - typings.awsDashSdk.awsDashSdkStrings.JM
    - typings.awsDashSdk.awsDashSdkStrings.JP
    - typings.awsDashSdk.awsDashSdkStrings.JE
    - typings.awsDashSdk.awsDashSdkStrings.JO
    - typings.awsDashSdk.awsDashSdkStrings.KZ
    - typings.awsDashSdk.awsDashSdkStrings.KE
    - typings.awsDashSdk.awsDashSdkStrings.KI
    - typings.awsDashSdk.awsDashSdkStrings.KW
    - typings.awsDashSdk.awsDashSdkStrings.KG
    - typings.awsDashSdk.awsDashSdkStrings.LA
    - typings.awsDashSdk.awsDashSdkStrings.LV
    - typings.awsDashSdk.awsDashSdkStrings.LB
    - typings.awsDashSdk.awsDashSdkStrings.LS
    - typings.awsDashSdk.awsDashSdkStrings.LR
    - typings.awsDashSdk.awsDashSdkStrings.LY
    - typings.awsDashSdk.awsDashSdkStrings.LI
    - typings.awsDashSdk.awsDashSdkStrings.LT
    - typings.awsDashSdk.awsDashSdkStrings.LU
    - typings.awsDashSdk.awsDashSdkStrings.MO
    - typings.awsDashSdk.awsDashSdkStrings.MK
    - typings.awsDashSdk.awsDashSdkStrings.MG
    - typings.awsDashSdk.awsDashSdkStrings.MW
    - typings.awsDashSdk.awsDashSdkStrings.MY
    - typings.awsDashSdk.awsDashSdkStrings.MV
    - typings.awsDashSdk.awsDashSdkStrings.ML
    - typings.awsDashSdk.awsDashSdkStrings.MT
    - typings.awsDashSdk.awsDashSdkStrings.MH
    - typings.awsDashSdk.awsDashSdkStrings.MR
    - typings.awsDashSdk.awsDashSdkStrings.MU
    - typings.awsDashSdk.awsDashSdkStrings.YT
    - typings.awsDashSdk.awsDashSdkStrings.MX
    - typings.awsDashSdk.awsDashSdkStrings.FM
    - typings.awsDashSdk.awsDashSdkStrings.MD
    - typings.awsDashSdk.awsDashSdkStrings.MC
    - typings.awsDashSdk.awsDashSdkStrings.MN
    - typings.awsDashSdk.awsDashSdkStrings.ME
    - typings.awsDashSdk.awsDashSdkStrings.MS
    - typings.awsDashSdk.awsDashSdkStrings.MA
    - typings.awsDashSdk.awsDashSdkStrings.MZ
    - typings.awsDashSdk.awsDashSdkStrings.MM
    - typings.awsDashSdk.awsDashSdkStrings.NA
    - typings.awsDashSdk.awsDashSdkStrings.NR
    - typings.awsDashSdk.awsDashSdkStrings.NP
    - typings.awsDashSdk.awsDashSdkStrings.NL
    - typings.awsDashSdk.awsDashSdkStrings.AN
    - typings.awsDashSdk.awsDashSdkStrings.NC
    - typings.awsDashSdk.awsDashSdkStrings.NZ
    - typings.awsDashSdk.awsDashSdkStrings.NI
    - typings.awsDashSdk.awsDashSdkStrings.NE
    - typings.awsDashSdk.awsDashSdkStrings.NG
    - typings.awsDashSdk.awsDashSdkStrings.NU
    - typings.awsDashSdk.awsDashSdkStrings.KP
    - typings.awsDashSdk.awsDashSdkStrings.MP
    - typings.awsDashSdk.awsDashSdkStrings.NO
    - typings.awsDashSdk.awsDashSdkStrings.OM
    - typings.awsDashSdk.awsDashSdkStrings.PK
    - typings.awsDashSdk.awsDashSdkStrings.PW
    - typings.awsDashSdk.awsDashSdkStrings.PA
    - typings.awsDashSdk.awsDashSdkStrings.PG
    - typings.awsDashSdk.awsDashSdkStrings.PY
    - typings.awsDashSdk.awsDashSdkStrings.PE
    - typings.awsDashSdk.awsDashSdkStrings.PH
    - typings.awsDashSdk.awsDashSdkStrings.PN
    - typings.awsDashSdk.awsDashSdkStrings.PL
    - typings.awsDashSdk.awsDashSdkStrings.PT
    - typings.awsDashSdk.awsDashSdkStrings.PR
    - typings.awsDashSdk.awsDashSdkStrings.QA
    - typings.awsDashSdk.awsDashSdkStrings.CG
    - typings.awsDashSdk.awsDashSdkStrings.RE
    - typings.awsDashSdk.awsDashSdkStrings.RO
    - typings.awsDashSdk.awsDashSdkStrings.RU
    - typings.awsDashSdk.awsDashSdkStrings.RW
    - typings.awsDashSdk.awsDashSdkStrings.BL
    - typings.awsDashSdk.awsDashSdkStrings.SH
    - typings.awsDashSdk.awsDashSdkStrings.KN
    - typings.awsDashSdk.awsDashSdkStrings.LC
    - typings.awsDashSdk.awsDashSdkStrings.MF
    - typings.awsDashSdk.awsDashSdkStrings.PM
    - typings.awsDashSdk.awsDashSdkStrings.VC
    - typings.awsDashSdk.awsDashSdkStrings.WS
    - typings.awsDashSdk.awsDashSdkStrings.SM
    - typings.awsDashSdk.awsDashSdkStrings.ST
    - typings.awsDashSdk.awsDashSdkStrings.SA
    - typings.awsDashSdk.awsDashSdkStrings.SN
    - typings.awsDashSdk.awsDashSdkStrings.RS
    - typings.awsDashSdk.awsDashSdkStrings.SC
    - typings.awsDashSdk.awsDashSdkStrings.SL
    - typings.awsDashSdk.awsDashSdkStrings.SG
    - typings.awsDashSdk.awsDashSdkStrings.SX
    - typings.awsDashSdk.awsDashSdkStrings.SK
    - typings.awsDashSdk.awsDashSdkStrings.SI
    - typings.awsDashSdk.awsDashSdkStrings.SB
    - typings.awsDashSdk.awsDashSdkStrings.SO
    - typings.awsDashSdk.awsDashSdkStrings.ZA
    - typings.awsDashSdk.awsDashSdkStrings.KR
    - typings.awsDashSdk.awsDashSdkStrings.ES
    - typings.awsDashSdk.awsDashSdkStrings.LK
    - typings.awsDashSdk.awsDashSdkStrings.SD
    - typings.awsDashSdk.awsDashSdkStrings.SR
    - typings.awsDashSdk.awsDashSdkStrings.SJ
    - typings.awsDashSdk.awsDashSdkStrings.SZ
    - typings.awsDashSdk.awsDashSdkStrings.SE
    - typings.awsDashSdk.awsDashSdkStrings.CH
    - typings.awsDashSdk.awsDashSdkStrings.SY
    - typings.awsDashSdk.awsDashSdkStrings.TW
    - typings.awsDashSdk.awsDashSdkStrings.TJ
    - typings.awsDashSdk.awsDashSdkStrings.TZ
    - typings.awsDashSdk.awsDashSdkStrings.TH
    - typings.awsDashSdk.awsDashSdkStrings.TG
    - typings.awsDashSdk.awsDashSdkStrings.TK
    - typings.awsDashSdk.awsDashSdkStrings.TO
    - typings.awsDashSdk.awsDashSdkStrings.TT
    - typings.awsDashSdk.awsDashSdkStrings.TN
    - typings.awsDashSdk.awsDashSdkStrings.TR
    - typings.awsDashSdk.awsDashSdkStrings.TM
    - typings.awsDashSdk.awsDashSdkStrings.TC
    - typings.awsDashSdk.awsDashSdkStrings.TV
    - typings.awsDashSdk.awsDashSdkStrings.VI
    - typings.awsDashSdk.awsDashSdkStrings.UG
    - typings.awsDashSdk.awsDashSdkStrings.UA
    - typings.awsDashSdk.awsDashSdkStrings.AE
    - typings.awsDashSdk.awsDashSdkStrings.GB
    - typings.awsDashSdk.awsDashSdkStrings.US
    - typings.awsDashSdk.awsDashSdkStrings.UY
    - typings.awsDashSdk.awsDashSdkStrings.UZ
    - typings.awsDashSdk.awsDashSdkStrings.VU
    - typings.awsDashSdk.awsDashSdkStrings.VA
    - typings.awsDashSdk.awsDashSdkStrings.VE
    - typings.awsDashSdk.awsDashSdkStrings.VN
    - typings.awsDashSdk.awsDashSdkStrings.WF
    - typings.awsDashSdk.awsDashSdkStrings.EH
    - typings.awsDashSdk.awsDashSdkStrings.YE
    - typings.awsDashSdk.awsDashSdkStrings.ZM
    - typings.awsDashSdk.awsDashSdkStrings.ZW
    - java.lang.String
  */
  type PhoneNumberCountryCode = _PhoneNumberCountryCode | String
  type PhoneNumberCountryCodes = js.Array[PhoneNumberCountryCode]
  type PhoneNumberId = String
  type PhoneNumberSummaryList = js.Array[PhoneNumberSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TOLL_FREE
    - typings.awsDashSdk.awsDashSdkStrings.DID
    - java.lang.String
  */
  type PhoneNumberType = _PhoneNumberType | String
  type PhoneNumberTypes = js.Array[PhoneNumberType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SOFT_PHONE
    - typings.awsDashSdk.awsDashSdkStrings.DESK_PHONE
    - java.lang.String
  */
  type PhoneType = _PhoneType | String
  type QueueId = String
  type QueueName = String
  type QueueSummaryList = js.Array[QueueSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.AGENT
    - java.lang.String
  */
  type QueueType = _QueueType | String
  type QueueTypes = js.Array[QueueType]
  type Queues = js.Array[QueueId]
  type RoutingProfileId = String
  type RoutingProfileName = String
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type SecurityProfileId = String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = String
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUM
    - typings.awsDashSdk.awsDashSdkStrings.MAX
    - typings.awsDashSdk.awsDashSdkStrings.AVG
    - java.lang.String
  */
  type Statistic = _Statistic | String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type ThresholdValue = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SECONDS
    - typings.awsDashSdk.awsDashSdkStrings.COUNT
    - typings.awsDashSdk.awsDashSdkStrings.PERCENT
    - java.lang.String
  */
  type Unit = _Unit | String
  type UserId = String
  type UserSummaryList = js.Array[UserSummary]
  type Value = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-08-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type timestamp = Date
}
