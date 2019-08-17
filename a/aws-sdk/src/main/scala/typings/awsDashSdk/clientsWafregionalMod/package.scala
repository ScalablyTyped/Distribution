package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWafregionalMod {
  import typings.awsDashSdk.awsDashSdkStrings.IP
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Action = String
  type ActivatedRules = js.Array[ActivatedRule]
  type ByteMatchSetSummaries = js.Array[ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[ByteMatchSetUpdate]
  type ByteMatchTargetString = Buffer | Uint8Array | Blob | String
  type ByteMatchTuples = js.Array[ByteMatchTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INSERT
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | String
  type ChangeToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PROVISIONED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.INSYNC
    - java.lang.String
  */
  type ChangeTokenStatus = _ChangeTokenStatus | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQ
    - typings.awsDashSdk.awsDashSdkStrings.NE
    - typings.awsDashSdk.awsDashSdkStrings.LE
    - typings.awsDashSdk.awsDashSdkStrings.LT
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | String
  type Country = String
  type ExcludedRules = js.Array[ExcludedRule]
  type GeoMatchConstraintType = typings.awsDashSdk.awsDashSdkStrings.Country | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AF
    - typings.awsDashSdk.awsDashSdkStrings.AX
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
    - typings.awsDashSdk.awsDashSdkStrings.BQ
    - typings.awsDashSdk.awsDashSdkStrings.BA
    - typings.awsDashSdk.awsDashSdkStrings.BW
    - typings.awsDashSdk.awsDashSdkStrings.BV
    - typings.awsDashSdk.awsDashSdkStrings.BR
    - typings.awsDashSdk.awsDashSdkStrings.IO
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
    - typings.awsDashSdk.awsDashSdkStrings.CG
    - typings.awsDashSdk.awsDashSdkStrings.CD
    - typings.awsDashSdk.awsDashSdkStrings.CK
    - typings.awsDashSdk.awsDashSdkStrings.CR
    - typings.awsDashSdk.awsDashSdkStrings.CI
    - typings.awsDashSdk.awsDashSdkStrings.HR
    - typings.awsDashSdk.awsDashSdkStrings.CU
    - typings.awsDashSdk.awsDashSdkStrings.CW
    - typings.awsDashSdk.awsDashSdkStrings.CY
    - typings.awsDashSdk.awsDashSdkStrings.CZ
    - typings.awsDashSdk.awsDashSdkStrings.DK
    - typings.awsDashSdk.awsDashSdkStrings.DJ
    - typings.awsDashSdk.awsDashSdkStrings.DM
    - typings.awsDashSdk.awsDashSdkStrings.DO
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
    - typings.awsDashSdk.awsDashSdkStrings.GF
    - typings.awsDashSdk.awsDashSdkStrings.PF
    - typings.awsDashSdk.awsDashSdkStrings.TF
    - typings.awsDashSdk.awsDashSdkStrings.GA
    - typings.awsDashSdk.awsDashSdkStrings.GM
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.DE
    - typings.awsDashSdk.awsDashSdkStrings.GH
    - typings.awsDashSdk.awsDashSdkStrings.GI
    - typings.awsDashSdk.awsDashSdkStrings.GR
    - typings.awsDashSdk.awsDashSdkStrings.GL
    - typings.awsDashSdk.awsDashSdkStrings.GD
    - typings.awsDashSdk.awsDashSdkStrings.GP
    - typings.awsDashSdk.awsDashSdkStrings.GU
    - typings.awsDashSdk.awsDashSdkStrings.GT
    - typings.awsDashSdk.awsDashSdkStrings.GG
    - typings.awsDashSdk.awsDashSdkStrings.GN
    - typings.awsDashSdk.awsDashSdkStrings.GW
    - typings.awsDashSdk.awsDashSdkStrings.GY
    - typings.awsDashSdk.awsDashSdkStrings.HT
    - typings.awsDashSdk.awsDashSdkStrings.HM
    - typings.awsDashSdk.awsDashSdkStrings.VA
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
    - typings.awsDashSdk.awsDashSdkStrings.JM
    - typings.awsDashSdk.awsDashSdkStrings.JP
    - typings.awsDashSdk.awsDashSdkStrings.JE
    - typings.awsDashSdk.awsDashSdkStrings.JO
    - typings.awsDashSdk.awsDashSdkStrings.KZ
    - typings.awsDashSdk.awsDashSdkStrings.KE
    - typings.awsDashSdk.awsDashSdkStrings.KI
    - typings.awsDashSdk.awsDashSdkStrings.KP
    - typings.awsDashSdk.awsDashSdkStrings.KR
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
    - typings.awsDashSdk.awsDashSdkStrings.MQ
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
    - typings.awsDashSdk.awsDashSdkStrings.NC
    - typings.awsDashSdk.awsDashSdkStrings.NZ
    - typings.awsDashSdk.awsDashSdkStrings.NI
    - typings.awsDashSdk.awsDashSdkStrings.NE
    - typings.awsDashSdk.awsDashSdkStrings.NG
    - typings.awsDashSdk.awsDashSdkStrings.NU
    - typings.awsDashSdk.awsDashSdkStrings.NF
    - typings.awsDashSdk.awsDashSdkStrings.MP
    - typings.awsDashSdk.awsDashSdkStrings.NO
    - typings.awsDashSdk.awsDashSdkStrings.OM
    - typings.awsDashSdk.awsDashSdkStrings.PK
    - typings.awsDashSdk.awsDashSdkStrings.PW
    - typings.awsDashSdk.awsDashSdkStrings.PS
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
    - typings.awsDashSdk.awsDashSdkStrings.GS
    - typings.awsDashSdk.awsDashSdkStrings.SS
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
    - typings.awsDashSdk.awsDashSdkStrings.TL
    - typings.awsDashSdk.awsDashSdkStrings.TG
    - typings.awsDashSdk.awsDashSdkStrings.TK
    - typings.awsDashSdk.awsDashSdkStrings.TO
    - typings.awsDashSdk.awsDashSdkStrings.TT
    - typings.awsDashSdk.awsDashSdkStrings.TN
    - typings.awsDashSdk.awsDashSdkStrings.TR
    - typings.awsDashSdk.awsDashSdkStrings.TM
    - typings.awsDashSdk.awsDashSdkStrings.TC
    - typings.awsDashSdk.awsDashSdkStrings.TV
    - typings.awsDashSdk.awsDashSdkStrings.UG
    - typings.awsDashSdk.awsDashSdkStrings.UA
    - typings.awsDashSdk.awsDashSdkStrings.AE
    - typings.awsDashSdk.awsDashSdkStrings.GB
    - typings.awsDashSdk.awsDashSdkStrings.US
    - typings.awsDashSdk.awsDashSdkStrings.UM
    - typings.awsDashSdk.awsDashSdkStrings.UY
    - typings.awsDashSdk.awsDashSdkStrings.UZ
    - typings.awsDashSdk.awsDashSdkStrings.VU
    - typings.awsDashSdk.awsDashSdkStrings.VE
    - typings.awsDashSdk.awsDashSdkStrings.VN
    - typings.awsDashSdk.awsDashSdkStrings.VG
    - typings.awsDashSdk.awsDashSdkStrings.VI
    - typings.awsDashSdk.awsDashSdkStrings.WF
    - typings.awsDashSdk.awsDashSdkStrings.EH
    - typings.awsDashSdk.awsDashSdkStrings.YE
    - typings.awsDashSdk.awsDashSdkStrings.ZM
    - typings.awsDashSdk.awsDashSdkStrings.ZW
    - java.lang.String
  */
  type GeoMatchConstraintValue = _GeoMatchConstraintValue | String
  type GeoMatchConstraints = js.Array[GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = Double
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = String
  type HTTPVersion = String
  type HeaderName = String
  type HeaderValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IPV4
    - typings.awsDashSdk.awsDashSdkStrings.IPV6
    - java.lang.String
  */
  type IPSetDescriptorType = _IPSetDescriptorType | String
  type IPSetDescriptorValue = String
  type IPSetDescriptors = js.Array[IPSetDescriptor]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPSetUpdates = js.Array[IPSetUpdate]
  type IPString = String
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type ManagedKey = String
  type ManagedKeys = js.Array[ManagedKey]
  type MatchFieldData = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.URI
    - typings.awsDashSdk.awsDashSdkStrings.QUERY_STRING
    - typings.awsDashSdk.awsDashSdkStrings.HEADER
    - typings.awsDashSdk.awsDashSdkStrings.METHOD
    - typings.awsDashSdk.awsDashSdkStrings.BODY
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_QUERY_ARG
    - typings.awsDashSdk.awsDashSdkStrings.ALL_QUERY_ARGS
    - java.lang.String
  */
  type MatchFieldType = _MatchFieldType | String
  type MetricName = String
  type Negated = Boolean
  type NextMarker = String
  type PaginationLimit = Double
  type PolicyString = String
  type PopulationSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXACTLY
    - typings.awsDashSdk.awsDashSdkStrings.STARTS_WITH
    - typings.awsDashSdk.awsDashSdkStrings.ENDS_WITH
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINS
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINS_WORD
    - java.lang.String
  */
  type PositionalConstraint = _PositionalConstraint | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IPMatch
    - typings.awsDashSdk.awsDashSdkStrings.ByteMatch
    - typings.awsDashSdk.awsDashSdkStrings.SqlInjectionMatch
    - typings.awsDashSdk.awsDashSdkStrings.GeoMatch
    - typings.awsDashSdk.awsDashSdkStrings.SizeConstraint
    - typings.awsDashSdk.awsDashSdkStrings.XssMatch
    - typings.awsDashSdk.awsDashSdkStrings.RegexMatch
    - java.lang.String
  */
  type PredicateType = _PredicateType | String
  type Predicates = js.Array[Predicate]
  type RateKey = IP | String
  type RateLimit = Double
  type RedactedFields = js.Array[FieldToMatch]
  type RegexMatchSetSummaries = js.Array[RegexMatchSetSummary]
  type RegexMatchSetUpdates = js.Array[RegexMatchSetUpdate]
  type RegexMatchTuples = js.Array[RegexMatchTuple]
  type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]
  type RegexPatternSetUpdates = js.Array[RegexPatternSetUpdate]
  type RegexPatternString = String
  type RegexPatternStrings = js.Array[RegexPatternString]
  type ResourceArn = String
  type ResourceArns = js.Array[ResourceArn]
  type ResourceId = String
  type ResourceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION_LOAD_BALANCER
    - typings.awsDashSdk.awsDashSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type ResourceType = _ResourceType | String
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RuleGroupUpdates = js.Array[RuleGroupUpdate]
  type RulePriority = Double
  type RuleSummaries = js.Array[RuleSummary]
  type RuleUpdates = js.Array[RuleUpdate]
  type SampleWeight = Double
  type SampledHTTPRequests = js.Array[SampledHTTPRequest]
  type Size = Double
  type SizeConstraintSetSummaries = js.Array[SizeConstraintSetSummary]
  type SizeConstraintSetUpdates = js.Array[SizeConstraintSetUpdate]
  type SizeConstraints = js.Array[SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates = js.Array[SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples = js.Array[SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries = js.Array[SubscribedRuleGroupSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.COMPRESS_WHITE_SPACE
    - typings.awsDashSdk.awsDashSdkStrings.HTML_ENTITY_DECODE
    - typings.awsDashSdk.awsDashSdkStrings.LOWERCASE
    - typings.awsDashSdk.awsDashSdkStrings.CMD_LINE
    - typings.awsDashSdk.awsDashSdkStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformation = _TextTransformation | String
  type Timestamp = Date
  type URIString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLOCK
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW
    - typings.awsDashSdk.awsDashSdkStrings.COUNT
    - java.lang.String
  */
  type WafActionType = _WafActionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.COUNT
    - java.lang.String
  */
  type WafOverrideActionType = _WafOverrideActionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGULAR
    - typings.awsDashSdk.awsDashSdkStrings.RATE_BASED
    - typings.awsDashSdk.awsDashSdkStrings.GROUP
    - java.lang.String
  */
  type WafRuleType = _WafRuleType | String
  type WebACLSummaries = js.Array[WebACLSummary]
  type WebACLUpdates = js.Array[WebACLUpdate]
  type XssMatchSetSummaries = js.Array[XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[XssMatchSetUpdate]
  type XssMatchTuples = js.Array[XssMatchTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
