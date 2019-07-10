package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWafregionalMod {
  type Action = java.lang.String
  type ActivatedRules = js.Array[ActivatedRule]
  type ByteMatchSetSummaries = js.Array[ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[ByteMatchSetUpdate]
  type ByteMatchTargetString = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ByteMatchTuples = js.Array[ByteMatchTuple]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INSERT
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type ChangeAction = _ChangeAction | java.lang.String
  type ChangeToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PROVISIONED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.INSYNC
    - java.lang.String
  */
  type ChangeTokenStatus = _ChangeTokenStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQ
    - awsDashSdkLib.awsDashSdkLibStrings.NE
    - awsDashSdkLib.awsDashSdkLibStrings.LE
    - awsDashSdkLib.awsDashSdkLibStrings.LT
    - awsDashSdkLib.awsDashSdkLibStrings.GE
    - awsDashSdkLib.awsDashSdkLibStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type Country = java.lang.String
  type ExcludedRules = js.Array[ExcludedRule]
  type GeoMatchConstraintType = awsDashSdkLib.awsDashSdkLibStrings.Country | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AF
    - awsDashSdkLib.awsDashSdkLibStrings.AX
    - awsDashSdkLib.awsDashSdkLibStrings.AL
    - awsDashSdkLib.awsDashSdkLibStrings.DZ
    - awsDashSdkLib.awsDashSdkLibStrings.AS
    - awsDashSdkLib.awsDashSdkLibStrings.AD
    - awsDashSdkLib.awsDashSdkLibStrings.AO
    - awsDashSdkLib.awsDashSdkLibStrings.AI
    - awsDashSdkLib.awsDashSdkLibStrings.AQ
    - awsDashSdkLib.awsDashSdkLibStrings.AG
    - awsDashSdkLib.awsDashSdkLibStrings.AR
    - awsDashSdkLib.awsDashSdkLibStrings.AM
    - awsDashSdkLib.awsDashSdkLibStrings.AW
    - awsDashSdkLib.awsDashSdkLibStrings.AU
    - awsDashSdkLib.awsDashSdkLibStrings.AT
    - awsDashSdkLib.awsDashSdkLibStrings.AZ
    - awsDashSdkLib.awsDashSdkLibStrings.BS
    - awsDashSdkLib.awsDashSdkLibStrings.BH
    - awsDashSdkLib.awsDashSdkLibStrings.BD
    - awsDashSdkLib.awsDashSdkLibStrings.BB
    - awsDashSdkLib.awsDashSdkLibStrings.BY
    - awsDashSdkLib.awsDashSdkLibStrings.BE
    - awsDashSdkLib.awsDashSdkLibStrings.BZ
    - awsDashSdkLib.awsDashSdkLibStrings.BJ
    - awsDashSdkLib.awsDashSdkLibStrings.BM
    - awsDashSdkLib.awsDashSdkLibStrings.BT
    - awsDashSdkLib.awsDashSdkLibStrings.BO
    - awsDashSdkLib.awsDashSdkLibStrings.BQ
    - awsDashSdkLib.awsDashSdkLibStrings.BA
    - awsDashSdkLib.awsDashSdkLibStrings.BW
    - awsDashSdkLib.awsDashSdkLibStrings.BV
    - awsDashSdkLib.awsDashSdkLibStrings.BR
    - awsDashSdkLib.awsDashSdkLibStrings.IO
    - awsDashSdkLib.awsDashSdkLibStrings.BN
    - awsDashSdkLib.awsDashSdkLibStrings.BG
    - awsDashSdkLib.awsDashSdkLibStrings.BF
    - awsDashSdkLib.awsDashSdkLibStrings.BI
    - awsDashSdkLib.awsDashSdkLibStrings.KH
    - awsDashSdkLib.awsDashSdkLibStrings.CM
    - awsDashSdkLib.awsDashSdkLibStrings.CA
    - awsDashSdkLib.awsDashSdkLibStrings.CV
    - awsDashSdkLib.awsDashSdkLibStrings.KY
    - awsDashSdkLib.awsDashSdkLibStrings.CF
    - awsDashSdkLib.awsDashSdkLibStrings.TD
    - awsDashSdkLib.awsDashSdkLibStrings.CL
    - awsDashSdkLib.awsDashSdkLibStrings.CN
    - awsDashSdkLib.awsDashSdkLibStrings.CX
    - awsDashSdkLib.awsDashSdkLibStrings.CC
    - awsDashSdkLib.awsDashSdkLibStrings.CO
    - awsDashSdkLib.awsDashSdkLibStrings.KM
    - awsDashSdkLib.awsDashSdkLibStrings.CG
    - awsDashSdkLib.awsDashSdkLibStrings.CD
    - awsDashSdkLib.awsDashSdkLibStrings.CK
    - awsDashSdkLib.awsDashSdkLibStrings.CR
    - awsDashSdkLib.awsDashSdkLibStrings.CI
    - awsDashSdkLib.awsDashSdkLibStrings.HR
    - awsDashSdkLib.awsDashSdkLibStrings.CU
    - awsDashSdkLib.awsDashSdkLibStrings.CW
    - awsDashSdkLib.awsDashSdkLibStrings.CY
    - awsDashSdkLib.awsDashSdkLibStrings.CZ
    - awsDashSdkLib.awsDashSdkLibStrings.DK
    - awsDashSdkLib.awsDashSdkLibStrings.DJ
    - awsDashSdkLib.awsDashSdkLibStrings.DM
    - awsDashSdkLib.awsDashSdkLibStrings.DO
    - awsDashSdkLib.awsDashSdkLibStrings.EC
    - awsDashSdkLib.awsDashSdkLibStrings.EG
    - awsDashSdkLib.awsDashSdkLibStrings.SV
    - awsDashSdkLib.awsDashSdkLibStrings.GQ
    - awsDashSdkLib.awsDashSdkLibStrings.ER
    - awsDashSdkLib.awsDashSdkLibStrings.EE
    - awsDashSdkLib.awsDashSdkLibStrings.ET
    - awsDashSdkLib.awsDashSdkLibStrings.FK
    - awsDashSdkLib.awsDashSdkLibStrings.FO
    - awsDashSdkLib.awsDashSdkLibStrings.FJ
    - awsDashSdkLib.awsDashSdkLibStrings.FI
    - awsDashSdkLib.awsDashSdkLibStrings.FR
    - awsDashSdkLib.awsDashSdkLibStrings.GF
    - awsDashSdkLib.awsDashSdkLibStrings.PF
    - awsDashSdkLib.awsDashSdkLibStrings.TF
    - awsDashSdkLib.awsDashSdkLibStrings.GA
    - awsDashSdkLib.awsDashSdkLibStrings.GM
    - awsDashSdkLib.awsDashSdkLibStrings.GE
    - awsDashSdkLib.awsDashSdkLibStrings.DE
    - awsDashSdkLib.awsDashSdkLibStrings.GH
    - awsDashSdkLib.awsDashSdkLibStrings.GI
    - awsDashSdkLib.awsDashSdkLibStrings.GR
    - awsDashSdkLib.awsDashSdkLibStrings.GL
    - awsDashSdkLib.awsDashSdkLibStrings.GD
    - awsDashSdkLib.awsDashSdkLibStrings.GP
    - awsDashSdkLib.awsDashSdkLibStrings.GU
    - awsDashSdkLib.awsDashSdkLibStrings.GT
    - awsDashSdkLib.awsDashSdkLibStrings.GG
    - awsDashSdkLib.awsDashSdkLibStrings.GN
    - awsDashSdkLib.awsDashSdkLibStrings.GW
    - awsDashSdkLib.awsDashSdkLibStrings.GY
    - awsDashSdkLib.awsDashSdkLibStrings.HT
    - awsDashSdkLib.awsDashSdkLibStrings.HM
    - awsDashSdkLib.awsDashSdkLibStrings.VA
    - awsDashSdkLib.awsDashSdkLibStrings.HN
    - awsDashSdkLib.awsDashSdkLibStrings.HK
    - awsDashSdkLib.awsDashSdkLibStrings.HU
    - awsDashSdkLib.awsDashSdkLibStrings.IS
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.ID
    - awsDashSdkLib.awsDashSdkLibStrings.IR
    - awsDashSdkLib.awsDashSdkLibStrings.IQ
    - awsDashSdkLib.awsDashSdkLibStrings.IE
    - awsDashSdkLib.awsDashSdkLibStrings.IM
    - awsDashSdkLib.awsDashSdkLibStrings.IL
    - awsDashSdkLib.awsDashSdkLibStrings.IT
    - awsDashSdkLib.awsDashSdkLibStrings.JM
    - awsDashSdkLib.awsDashSdkLibStrings.JP
    - awsDashSdkLib.awsDashSdkLibStrings.JE
    - awsDashSdkLib.awsDashSdkLibStrings.JO
    - awsDashSdkLib.awsDashSdkLibStrings.KZ
    - awsDashSdkLib.awsDashSdkLibStrings.KE
    - awsDashSdkLib.awsDashSdkLibStrings.KI
    - awsDashSdkLib.awsDashSdkLibStrings.KP
    - awsDashSdkLib.awsDashSdkLibStrings.KR
    - awsDashSdkLib.awsDashSdkLibStrings.KW
    - awsDashSdkLib.awsDashSdkLibStrings.KG
    - awsDashSdkLib.awsDashSdkLibStrings.LA
    - awsDashSdkLib.awsDashSdkLibStrings.LV
    - awsDashSdkLib.awsDashSdkLibStrings.LB
    - awsDashSdkLib.awsDashSdkLibStrings.LS
    - awsDashSdkLib.awsDashSdkLibStrings.LR
    - awsDashSdkLib.awsDashSdkLibStrings.LY
    - awsDashSdkLib.awsDashSdkLibStrings.LI
    - awsDashSdkLib.awsDashSdkLibStrings.LT
    - awsDashSdkLib.awsDashSdkLibStrings.LU
    - awsDashSdkLib.awsDashSdkLibStrings.MO
    - awsDashSdkLib.awsDashSdkLibStrings.MK
    - awsDashSdkLib.awsDashSdkLibStrings.MG
    - awsDashSdkLib.awsDashSdkLibStrings.MW
    - awsDashSdkLib.awsDashSdkLibStrings.MY
    - awsDashSdkLib.awsDashSdkLibStrings.MV
    - awsDashSdkLib.awsDashSdkLibStrings.ML
    - awsDashSdkLib.awsDashSdkLibStrings.MT
    - awsDashSdkLib.awsDashSdkLibStrings.MH
    - awsDashSdkLib.awsDashSdkLibStrings.MQ
    - awsDashSdkLib.awsDashSdkLibStrings.MR
    - awsDashSdkLib.awsDashSdkLibStrings.MU
    - awsDashSdkLib.awsDashSdkLibStrings.YT
    - awsDashSdkLib.awsDashSdkLibStrings.MX
    - awsDashSdkLib.awsDashSdkLibStrings.FM
    - awsDashSdkLib.awsDashSdkLibStrings.MD
    - awsDashSdkLib.awsDashSdkLibStrings.MC
    - awsDashSdkLib.awsDashSdkLibStrings.MN
    - awsDashSdkLib.awsDashSdkLibStrings.ME
    - awsDashSdkLib.awsDashSdkLibStrings.MS
    - awsDashSdkLib.awsDashSdkLibStrings.MA
    - awsDashSdkLib.awsDashSdkLibStrings.MZ
    - awsDashSdkLib.awsDashSdkLibStrings.MM
    - awsDashSdkLib.awsDashSdkLibStrings.NA
    - awsDashSdkLib.awsDashSdkLibStrings.NR
    - awsDashSdkLib.awsDashSdkLibStrings.NP
    - awsDashSdkLib.awsDashSdkLibStrings.NL
    - awsDashSdkLib.awsDashSdkLibStrings.NC
    - awsDashSdkLib.awsDashSdkLibStrings.NZ
    - awsDashSdkLib.awsDashSdkLibStrings.NI
    - awsDashSdkLib.awsDashSdkLibStrings.NE
    - awsDashSdkLib.awsDashSdkLibStrings.NG
    - awsDashSdkLib.awsDashSdkLibStrings.NU
    - awsDashSdkLib.awsDashSdkLibStrings.NF
    - awsDashSdkLib.awsDashSdkLibStrings.MP
    - awsDashSdkLib.awsDashSdkLibStrings.NO
    - awsDashSdkLib.awsDashSdkLibStrings.OM
    - awsDashSdkLib.awsDashSdkLibStrings.PK
    - awsDashSdkLib.awsDashSdkLibStrings.PW
    - awsDashSdkLib.awsDashSdkLibStrings.PS
    - awsDashSdkLib.awsDashSdkLibStrings.PA
    - awsDashSdkLib.awsDashSdkLibStrings.PG
    - awsDashSdkLib.awsDashSdkLibStrings.PY
    - awsDashSdkLib.awsDashSdkLibStrings.PE
    - awsDashSdkLib.awsDashSdkLibStrings.PH
    - awsDashSdkLib.awsDashSdkLibStrings.PN
    - awsDashSdkLib.awsDashSdkLibStrings.PL
    - awsDashSdkLib.awsDashSdkLibStrings.PT
    - awsDashSdkLib.awsDashSdkLibStrings.PR
    - awsDashSdkLib.awsDashSdkLibStrings.QA
    - awsDashSdkLib.awsDashSdkLibStrings.RE
    - awsDashSdkLib.awsDashSdkLibStrings.RO
    - awsDashSdkLib.awsDashSdkLibStrings.RU
    - awsDashSdkLib.awsDashSdkLibStrings.RW
    - awsDashSdkLib.awsDashSdkLibStrings.BL
    - awsDashSdkLib.awsDashSdkLibStrings.SH
    - awsDashSdkLib.awsDashSdkLibStrings.KN
    - awsDashSdkLib.awsDashSdkLibStrings.LC
    - awsDashSdkLib.awsDashSdkLibStrings.MF
    - awsDashSdkLib.awsDashSdkLibStrings.PM
    - awsDashSdkLib.awsDashSdkLibStrings.VC
    - awsDashSdkLib.awsDashSdkLibStrings.WS
    - awsDashSdkLib.awsDashSdkLibStrings.SM
    - awsDashSdkLib.awsDashSdkLibStrings.ST
    - awsDashSdkLib.awsDashSdkLibStrings.SA
    - awsDashSdkLib.awsDashSdkLibStrings.SN
    - awsDashSdkLib.awsDashSdkLibStrings.RS
    - awsDashSdkLib.awsDashSdkLibStrings.SC
    - awsDashSdkLib.awsDashSdkLibStrings.SL
    - awsDashSdkLib.awsDashSdkLibStrings.SG
    - awsDashSdkLib.awsDashSdkLibStrings.SX
    - awsDashSdkLib.awsDashSdkLibStrings.SK
    - awsDashSdkLib.awsDashSdkLibStrings.SI
    - awsDashSdkLib.awsDashSdkLibStrings.SB
    - awsDashSdkLib.awsDashSdkLibStrings.SO
    - awsDashSdkLib.awsDashSdkLibStrings.ZA
    - awsDashSdkLib.awsDashSdkLibStrings.GS
    - awsDashSdkLib.awsDashSdkLibStrings.SS
    - awsDashSdkLib.awsDashSdkLibStrings.ES
    - awsDashSdkLib.awsDashSdkLibStrings.LK
    - awsDashSdkLib.awsDashSdkLibStrings.SD
    - awsDashSdkLib.awsDashSdkLibStrings.SR
    - awsDashSdkLib.awsDashSdkLibStrings.SJ
    - awsDashSdkLib.awsDashSdkLibStrings.SZ
    - awsDashSdkLib.awsDashSdkLibStrings.SE
    - awsDashSdkLib.awsDashSdkLibStrings.CH
    - awsDashSdkLib.awsDashSdkLibStrings.SY
    - awsDashSdkLib.awsDashSdkLibStrings.TW
    - awsDashSdkLib.awsDashSdkLibStrings.TJ
    - awsDashSdkLib.awsDashSdkLibStrings.TZ
    - awsDashSdkLib.awsDashSdkLibStrings.TH
    - awsDashSdkLib.awsDashSdkLibStrings.TL
    - awsDashSdkLib.awsDashSdkLibStrings.TG
    - awsDashSdkLib.awsDashSdkLibStrings.TK
    - awsDashSdkLib.awsDashSdkLibStrings.TO
    - awsDashSdkLib.awsDashSdkLibStrings.TT
    - awsDashSdkLib.awsDashSdkLibStrings.TN
    - awsDashSdkLib.awsDashSdkLibStrings.TR
    - awsDashSdkLib.awsDashSdkLibStrings.TM
    - awsDashSdkLib.awsDashSdkLibStrings.TC
    - awsDashSdkLib.awsDashSdkLibStrings.TV
    - awsDashSdkLib.awsDashSdkLibStrings.UG
    - awsDashSdkLib.awsDashSdkLibStrings.UA
    - awsDashSdkLib.awsDashSdkLibStrings.AE
    - awsDashSdkLib.awsDashSdkLibStrings.GB
    - awsDashSdkLib.awsDashSdkLibStrings.US
    - awsDashSdkLib.awsDashSdkLibStrings.UM
    - awsDashSdkLib.awsDashSdkLibStrings.UY
    - awsDashSdkLib.awsDashSdkLibStrings.UZ
    - awsDashSdkLib.awsDashSdkLibStrings.VU
    - awsDashSdkLib.awsDashSdkLibStrings.VE
    - awsDashSdkLib.awsDashSdkLibStrings.VN
    - awsDashSdkLib.awsDashSdkLibStrings.VG
    - awsDashSdkLib.awsDashSdkLibStrings.VI
    - awsDashSdkLib.awsDashSdkLibStrings.WF
    - awsDashSdkLib.awsDashSdkLibStrings.EH
    - awsDashSdkLib.awsDashSdkLibStrings.YE
    - awsDashSdkLib.awsDashSdkLibStrings.ZM
    - awsDashSdkLib.awsDashSdkLibStrings.ZW
    - java.lang.String
  */
  type GeoMatchConstraintValue = _GeoMatchConstraintValue | java.lang.String
  type GeoMatchConstraints = js.Array[GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = scala.Double
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IPV4
    - awsDashSdkLib.awsDashSdkLibStrings.IPV6
    - java.lang.String
  */
  type IPSetDescriptorType = _IPSetDescriptorType | java.lang.String
  type IPSetDescriptorValue = java.lang.String
  type IPSetDescriptors = js.Array[IPSetDescriptor]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPSetUpdates = js.Array[IPSetUpdate]
  type IPString = java.lang.String
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type ManagedKey = java.lang.String
  type ManagedKeys = js.Array[ManagedKey]
  type MatchFieldData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.URI
    - awsDashSdkLib.awsDashSdkLibStrings.QUERY_STRING
    - awsDashSdkLib.awsDashSdkLibStrings.HEADER
    - awsDashSdkLib.awsDashSdkLibStrings.METHOD
    - awsDashSdkLib.awsDashSdkLibStrings.BODY
    - awsDashSdkLib.awsDashSdkLibStrings.SINGLE_QUERY_ARG
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_QUERY_ARGS
    - java.lang.String
  */
  type MatchFieldType = _MatchFieldType | java.lang.String
  type MetricName = java.lang.String
  type Negated = scala.Boolean
  type NextMarker = java.lang.String
  type PaginationLimit = scala.Double
  type PolicyString = java.lang.String
  type PopulationSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EXACTLY
    - awsDashSdkLib.awsDashSdkLibStrings.STARTS_WITH
    - awsDashSdkLib.awsDashSdkLibStrings.ENDS_WITH
    - awsDashSdkLib.awsDashSdkLibStrings.CONTAINS
    - awsDashSdkLib.awsDashSdkLibStrings.CONTAINS_WORD
    - java.lang.String
  */
  type PositionalConstraint = _PositionalConstraint | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IPMatch
    - awsDashSdkLib.awsDashSdkLibStrings.ByteMatch
    - awsDashSdkLib.awsDashSdkLibStrings.SqlInjectionMatch
    - awsDashSdkLib.awsDashSdkLibStrings.GeoMatch
    - awsDashSdkLib.awsDashSdkLibStrings.SizeConstraint
    - awsDashSdkLib.awsDashSdkLibStrings.XssMatch
    - awsDashSdkLib.awsDashSdkLibStrings.RegexMatch
    - java.lang.String
  */
  type PredicateType = _PredicateType | java.lang.String
  type Predicates = js.Array[Predicate]
  type RateKey = awsDashSdkLib.awsDashSdkLibStrings.IP | java.lang.String
  type RateLimit = scala.Double
  type RedactedFields = js.Array[FieldToMatch]
  type RegexMatchSetSummaries = js.Array[RegexMatchSetSummary]
  type RegexMatchSetUpdates = js.Array[RegexMatchSetUpdate]
  type RegexMatchTuples = js.Array[RegexMatchTuple]
  type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]
  type RegexPatternSetUpdates = js.Array[RegexPatternSetUpdate]
  type RegexPatternString = java.lang.String
  type RegexPatternStrings = js.Array[RegexPatternString]
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[ResourceArn]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION_LOAD_BALANCER
    - awsDashSdkLib.awsDashSdkLibStrings.API_GATEWAY
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RuleGroupUpdates = js.Array[RuleGroupUpdate]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[RuleSummary]
  type RuleUpdates = js.Array[RuleUpdate]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[SampledHTTPRequest]
  type Size = scala.Double
  type SizeConstraintSetSummaries = js.Array[SizeConstraintSetSummary]
  type SizeConstraintSetUpdates = js.Array[SizeConstraintSetUpdate]
  type SizeConstraints = js.Array[SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates = js.Array[SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples = js.Array[SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries = js.Array[SubscribedRuleGroupSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.COMPRESS_WHITE_SPACE
    - awsDashSdkLib.awsDashSdkLibStrings.HTML_ENTITY_DECODE
    - awsDashSdkLib.awsDashSdkLibStrings.LOWERCASE
    - awsDashSdkLib.awsDashSdkLibStrings.CMD_LINE
    - awsDashSdkLib.awsDashSdkLibStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformation = _TextTransformation | java.lang.String
  type Timestamp = stdLib.Date
  type URIString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BLOCK
    - awsDashSdkLib.awsDashSdkLibStrings.ALLOW
    - awsDashSdkLib.awsDashSdkLibStrings.COUNT
    - java.lang.String
  */
  type WafActionType = _WafActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.COUNT
    - java.lang.String
  */
  type WafOverrideActionType = _WafOverrideActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGULAR
    - awsDashSdkLib.awsDashSdkLibStrings.RATE_BASED
    - awsDashSdkLib.awsDashSdkLibStrings.GROUP
    - java.lang.String
  */
  type WafRuleType = _WafRuleType | java.lang.String
  type WebACLSummaries = js.Array[WebACLSummary]
  type WebACLUpdates = js.Array[WebACLUpdate]
  type XssMatchSetSummaries = js.Array[XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[XssMatchSetUpdate]
  type XssMatchTuples = js.Array[XssMatchTuple]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
